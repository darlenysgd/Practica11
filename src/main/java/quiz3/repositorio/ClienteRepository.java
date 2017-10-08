package quiz3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz3.Entidades.Cliente;

/**
 * Created by darle on 10/8/2017.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
