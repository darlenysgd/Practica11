package quiz3.Controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Servicios.ClienteServices;
import quiz3.repositorio.ClienteRepository;


/**
 * Created by darle on 10/4/2017.
 */
@Controller
@RequestMapping("/clientes")
public class ClienteFormController {

    @Autowired
    ClienteServices clienteServices;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String RegistroCliente(Model model) {
        return "/RegistroCliente";
    }

}
