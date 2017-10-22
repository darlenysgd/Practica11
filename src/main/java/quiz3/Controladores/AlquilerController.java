package quiz3.Controladores;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import quiz3.Entidades.Alquiler;
import quiz3.Entidades.Cliente;
import quiz3.Entidades.Equipos;
import quiz3.Servicios.AlquilerServices;
import quiz3.Servicios.ClienteServices;
import quiz3.Servicios.EquipoServices;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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
    public List<Equipos> equipos() {
        return equipoServices.findAllEquipos();
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewAlquiler(@ModelAttribute Alquiler alquiler, Model model)   {

        return "/AlquilerEquipos";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(Model model, @ModelAttribute Alquiler alquiler)   {


        return "/AlquilerEquipos";
    }

}
