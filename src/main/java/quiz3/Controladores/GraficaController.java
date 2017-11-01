package quiz3.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Entidades.Equipos;
import quiz3.Entidades.FamiliaEquipos;
import quiz3.Entidades.classAux;
import quiz3.Servicios.AlquilerServices;
import quiz3.Servicios.EquipoServices;
import quiz3.Servicios.FamiliaEquipoServices;
import quiz3.Servicios.SubFamiliaServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by darle on 10/31/2017.
 */
@Controller
@RequestMapping("/PromedioAlquiler")
public class GraficaController {

    @Autowired
    AlquilerServices alquilerServices;

    @Autowired
    EquipoServices equipoServices;

    @Autowired
    FamiliaEquipoServices familiaEquipoServices;

    @Autowired
    SubFamiliaServices subFamiliaServices;

    @ModelAttribute("promedios")
    public List<Float> prom(){

        List<Float> promedios = new ArrayList<>();

        for(FamiliaEquipos fam: familiaEquipoServices.findAllFamiliasEquipos()){
            int cantDias = fam.getDiasTotalAlquiler();
            int cantAlquileres = fam.getDiasTotalAlquiler();
        }
        return promedios;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewGraph(Model model)  {


        return "/Graficas";
    }



}
