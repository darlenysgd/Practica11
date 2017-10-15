package quiz3.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Entidades.FamiliaEquipos;
import quiz3.Entidades.SubFamiliaEquipos;
import quiz3.Servicios.FamiliaEquipoServices;
import quiz3.Servicios.SubFamiliaServices;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by darle on 10/14/2017.
 */
@Controller
    @RequestMapping("/subfamiliaEquipos")
public class SubFamiliaEquiposController {


    @Autowired
    SubFamiliaServices subFamiliaServices;

    @Autowired
    FamiliaEquipoServices familiaEquipoServices;

    @ModelAttribute("subfamilia")
    public SubFamiliaEquipos subFamiliaEquipos()
    {
        return new SubFamiliaEquipos();
    }

    @ModelAttribute("familias")
    public List<FamiliaEquipos> familiaEquipos()
    {
        return familiaEquipoServices.findAllFamiliasEquipos();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String RegistroSubFamilia(){

        return "/SubFamiliasEquipos";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(@ModelAttribute SubFamiliaEquipos subfamilia, HttpServletRequest request)   {

        String FamID = request.getParameter("familiaSelect");

        FamiliaEquipos famAux = familiaEquipoServices.findFamilia(Long.parseLong(FamID));
        subfamilia.setFamiliaEquipos(famAux);
        famAux.getSubFamiliaEquipos().add(subfamilia);
        subFamiliaServices.crearSubfamilia(subfamilia);

        return "/SubFamiliasEquipos";
    }
}
