package quiz3.Controladores;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jdk.nashorn.internal.parser.JSONParser;
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
import quiz3.Entidades.claseMonti;
import quiz3.Servicios.AlquilerServices;
import quiz3.Servicios.ClienteServices;
import quiz3.Servicios.EquipoServices;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

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

    @ModelAttribute("equipos")
    public List<Equipos> equipos()  {



        return equipoServices.findAllEquipos();
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewAlquiler(@ModelAttribute Alquiler alquiler, Model model)  {


        return "/AlquilerEquipos";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(Model model, @ModelAttribute Alquiler alquiler, HttpServletRequest request, @RequestParam String equiposArray) throws JSONException {


        String aarray = equiposArray;
        JSONArray jsonarray = new JSONArray(aarray);
        ArrayList<claseMonti> claseMontiArrayList = new ArrayList<>();
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);

            claseMontiArrayList.add(new claseMonti(jsonobject.getString("equipo"), jsonobject.getString("cantidad"), jsonobject.getString("fechaEntrega")));

        }



        return "/AlquilerEquipos";
    }


    public Equipos findEquipo(String nombre){

        Equipos equipo = new Equipos();
        for(Equipos eq : equipoServices.findAllEquipos()){
            if(nombre.equals(eq.getNombre())){
                equipo = eq;
            }

        }
        return equipo;
    }

}
