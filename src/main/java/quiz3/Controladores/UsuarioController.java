package quiz3.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz3.Entidades.FamiliaEquipos;
import quiz3.Entidades.SubFamiliaEquipos;
import quiz3.Entidades.Usuario;
import quiz3.Servicios.UsuarioServices;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by darle on 10/24/2017.
 */
@Controller
@RequestMapping("/nuevoUsuario")
public class UsuarioController {

    @Autowired
    UsuarioServices usuarioServices;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String RegistroUsuario(){

        return "/RegistroUsuario";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String GuardarForm(@ModelAttribute Usuario usuario, HttpServletRequest request)   {

        String rol = request.getParameter("rolSelect");

        if (rol.equals("Administrador")) {
            usuario.setAdmin(true);
        }
        else {
            usuario.setAdmin(false);
        }

       usuarioServices.crearUsuario(usuario);

        return "/SubFamiliasEquipos";
    }


}
