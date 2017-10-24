package quiz3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz3.Entidades.Usuario;

/**
 * Created by darle on 10/24/2017.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
