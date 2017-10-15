package quiz3.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Entidades.Equipos;
import quiz3.Entidades.FamiliaEquipos;
import quiz3.Entidades.SubFamiliaEquipos;
import quiz3.Servicios.EquipoServices;
import quiz3.Servicios.FamiliaEquipoServices;
import quiz3.Servicios.SubFamiliaServices;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by darle on 10/12/2017.
 */
@Controller
@RequestMapping("/RegistroEquipos")
public class EquipoFormController {

    @Autowired
    EquipoServices equipoServices;

    @Autowired
    SubFamiliaServices subFamiliaServices;

    @ModelAttribute("equipo")
    public Equipos equipo()
    {
        return new Equipos();
    }

    @ModelAttribute("subfamilias")
    public List<SubFamiliaEquipos> subFamiliaEquipos(){
        return subFamiliaServices.findallSubfamilias();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String RegistroEquipo(){

        return "/RegistrarEquipos";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(@ModelAttribute Equipos equipo,  HttpServletRequest request)   {

        String subFamID = request.getParameter("subFamiliaID");
        SubFamiliaEquipos auxSubFamilia = subFamiliaServices.findSubFamilia(Long.parseLong(subFamID));
        equipo.setSubFamiliaEquipos(auxSubFamilia);
        auxSubFamilia.getEquipos().add(equipo);
        equipoServices.crearEquipo(equipo);

        return "/RegistrarEquipos";
    }

}
