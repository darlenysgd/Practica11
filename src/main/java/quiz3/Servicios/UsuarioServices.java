package quiz3.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quiz3.Entidades.Usuario;
import quiz3.repositorio.UsuarioRepository;

import java.util.List;

/**
 * Created by darle on 10/24/2017.
 */
@Service
public class UsuarioServices {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario crearUsuario(Usuario usuario){
        usuarioRepository.save(usuario);

        return usuario;
    }

    public List<Usuario> findAllUsuarios(){
        return usuarioRepository.findAll();
    }
}
