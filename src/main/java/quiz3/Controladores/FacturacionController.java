package quiz3.Controladores;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Entidades.Alquiler;
import quiz3.Entidades.Cliente;
import quiz3.Entidades.Equipos;
import quiz3.Entidades.classAux;
import quiz3.Servicios.AlquilerServices;
import quiz3.Servicios.ClienteServices;
import quiz3.Servicios.EquipoServices;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by darle on 10/28/2017.
 */
@Controller
@RequestMapping("/Devolucion")
public class FacturacionController {

    @Autowired
    ClienteServices clienteServices;

    @Autowired
    AlquilerServices alquilerServices;

    @Autowired
    EquipoServices equipoServices;

    @ModelAttribute("clientes")
    public List<Cliente> clientes(){

        return clienteServices.findAllClientes();

    }

    @ModelAttribute("alquileres")
    public List<Alquiler> alquileres(){
        return alquilerServices.findAllAlquileres();
    }


    @ModelAttribute("equipos")
    public List<classAux> equipos(){

        List<classAux> listaAux = new ArrayList<>();

        for(Equipos eq : equipoServices.findAllEquipos()){
            classAux cl = new classAux(eq.getId(), eq.getNombre(), eq.getCantidad(), eq.getCostoAlquilerDia());

            listaAux.add(cl);
        }

        return listaAux;
    }

    public Equipos findEquipo(long id){

        Equipos equipo = new Equipos();
        for(Equipos eq : equipoServices.findAllEquipos()){
            if(id == eq.getId()){
                equipo = eq;
            }

        }
        return equipo;
    }



    public Alquiler findAlquiler(long id){

        Alquiler alq = new Alquiler();
        for(Alquiler all : alquilerServices.findAllAlquileres()){
            if(id == all.getId()){
                alq = all;
            }

        }
        return alq;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewFacturacion(Model model)  {


        return "/Facturacion";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String doFacturacion( HttpServletRequest request)  {

        String aux = request.getParameter("cantEntregada");
        int cantidadDevuelta = Integer.parseInt(aux);
        String auxeq = request.getParameter("eqname");

        Equipos equipos = findEquipo(Long.parseLong(auxeq));

        equipos.setCantidad(equipos.getCantidad() + cantidadDevuelta);

        equipoServices.crearEquipo(equipos);
        String alqAux = request.getParameter("alqID");

        String cantAlquilada = request.getParameter("cantAlquilada");

        int cantAlq = Integer.parseInt(cantAlquilada);

        if (cantidadDevuelta == cantAlq){

            alquilerServices.deleteAlquiler(Long.parseLong(alqAux));
        }
        else{

            Alquiler alq = findAlquiler(Long.parseLong(alqAux));

            alq.setCantidad(alq.getCantidad() - cantidadDevuelta);

            alquilerServices.crearAlquiler(alq);
        }


        return "/Facturacion";
    }


}
