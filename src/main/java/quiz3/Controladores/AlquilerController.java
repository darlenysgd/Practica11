package quiz3.Controladores;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import quiz3.Entidades.Alquiler;
import quiz3.Entidades.Cliente;
import quiz3.Entidades.Equipos;
import quiz3.Entidades.EquiposAlquiler;
import quiz3.Servicios.AlquilerServices;
import quiz3.Servicios.ClienteServices;
import quiz3.Servicios.EquipoServices;
import quiz3.Servicios.EquiposAlquilerServices;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by darle on 10/14/2017.
 */
@Controller
@RequestMapping("/RegistroAlquiler")
public class AlquilerController {

    @Autowired
    AlquilerServices alquilerServices;

    @Autowired
    EquipoServices equipoServices;

    @Autowired
    ClienteServices clienteServices;

    @Autowired
    EquiposAlquilerServices equiposAlquilerServices;

    public Equipos findEquipo(String nombre){

        Equipos equipo = new Equipos();
        for(Equipos eq : equipoServices.findAllEquipos()){
            if(nombre.equals(eq.getNombre())){
                equipo = eq;
            }

        }
        return equipo;
    }

    @ModelAttribute("equipos")
    public List<Equipos> equipos()  {



        return equipoServices.findAllEquipos();
    }

    @ModelAttribute("clientes")
    public List<Cliente> clientes(){

            return clienteServices.findAllClientes();

    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewAlquiler(@ModelAttribute Alquiler alquiler, Model model)  {


        return "/AlquilerEquipos";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(Model model, @ModelAttribute Alquiler alquiler, HttpServletRequest request, @RequestParam String equipoObject) throws JSONException, ParseException {


        String clienteID = request.getParameter("clienteID");

        Cliente cliente =   clienteServices.findCliente(Long.parseLong(clienteID));

        alquiler.setCliente(cliente.getId());

        Date fecha = new Date();



            JSONObject jsonobject = new JSONObject(equipoObject);


            String target = jsonobject.getString("fechaEntrega");
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date result =  df.parse(target);

            alquiler.setCantidad(Integer.parseInt(jsonobject.getString("cantidad")));
            alquiler.setFechaEntrega(result);

            Equipos eq =  findEquipo(jsonobject.getString("equipo"));
            eq.setCantidad(eq.getCantidad() - Integer.parseInt(jsonobject.getString("cantidad")));



        alquiler.setEquipoId(eq.getId());

        alquiler.setFechaAlquiler(fecha);

        alquilerServices.crearAlquiler(alquiler);

        return "/AlquilerEquipos";
    }

}
