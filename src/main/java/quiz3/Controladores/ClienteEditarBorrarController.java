package quiz3.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring4.context.SpringWebContext;
import quiz3.Entidades.Cliente;
import quiz3.Servicios.ClienteServices;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Created by darle on 10/8/2017.
 */
@Controller
@RequestMapping("/listaClientes")
public class ClienteEditarBorrarController {

    @Autowired
    ClienteServices clienteServices;

    @ModelAttribute("clientes")
    public List<Cliente> clientes()
    {
        return clienteServices.findAllClientes();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String RegistroCliente( ){

        return "/AdministrarClientes";
    }
}
