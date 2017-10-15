package quiz3.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Entidades.Equipos;
import quiz3.Entidades.FamiliaEquipos;
import quiz3.Servicios.FamiliaEquipoServices;

/**
 * Created by darle on 10/14/2017.
 */
@Controller
@RequestMapping("/familiaEquipos")
public class FamiliaEquiposController {

    @Autowired
    FamiliaEquipoServices familiaEquipoServices;

    @ModelAttribute("familia")
    public FamiliaEquipos Familiaequipos()
    {
        return new FamiliaEquipos();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String RegistroFamilia(){

        return "/FamiliasEquipos";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(@ModelAttribute FamiliaEquipos familia)   {

        familiaEquipoServices.CrearFamilia(familia);

        return "/FamiliasEquipos";
    }

}
