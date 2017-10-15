package quiz3.Controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.context.WebContext;
import quiz3.Entidades.Cliente;
import quiz3.Servicios.ClienteServices;
import quiz3.repositorio.ClienteRepository;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.nio.file.Files;


/**
 * Created by darle on 10/4/2017.
 */
@Controller
@RequestMapping("/RegistroCliente")
public class ClienteFormController {

    @Autowired
    ClienteServices clienteServices;


    @ModelAttribute("cliente")
    public Cliente cliente()
    {
        return new Cliente();
    }

       @RequestMapping(value = "", method = RequestMethod.GET)
       public String RegistroCliente(){

               return "/RegistroCliente";
           }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(@ModelAttribute Cliente cliente)   {

        clienteServices.crearCliente(cliente);

        return "/RegistroCliente";
        }


}
