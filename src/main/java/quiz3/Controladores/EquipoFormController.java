package quiz3.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Entidades.Cliente;
import quiz3.Entidades.Equipo;
import quiz3.Servicios.ClienteServices;
import quiz3.Servicios.EquipoServices;

/**
 * Created by darle on 10/12/2017.
 */
@Controller
@RequestMapping("/RegistroEquipos")
public class EquipoFormController {

    @Autowired
    EquipoServices equipoServices;


    @ModelAttribute("equipo")
    public Equipo equipo()
    {
        return new Equipo();
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String RegistroEquipo(){

        return "/RegistrarEquipos";
    }



    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(@ModelAttribute Equipo equipo)   {

        equipoServices.crearEquipo(equipo);

        return "/RegistrarEquipos";
    }

}
