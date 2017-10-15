package quiz3.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Entidades.Alquiler;
import quiz3.Entidades.Cliente;
import quiz3.Servicios.ClienteServices;

import java.util.List;

/**
 * Created by darle on 10/14/2017.
 */
@Controller
@RequestMapping("/RegistroAlquiler")
public class AlquilerController {

    @Autowired
    ClienteServices clienteServices;

    @ModelAttribute("clientes")
    public List<Cliente> clientes(){
        return clienteServices.findAllClientes();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String GuardarForm(@ModelAttribute Alquiler alquiler)   {

        return "/AlquilerEquipos";
    }

}
