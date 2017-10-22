package quiz3.Controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.context.WebContext;
import quiz3.Entidades.Cliente;
import quiz3.Servicios.ClienteServices;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.io.IOException;


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
        public String GuardarForm(@ModelAttribute Cliente cliente, @RequestParam("file") MultipartFile uploadFile) throws IOException {


            cliente.setImagen(Base64.encode(uploadFile.getBytes()));
            clienteServices.crearCliente(cliente);

            return "/RegistroCliente";
            }


}
