package quiz3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz3.Entidades.Alquiler;

/**
 * Created by darle on 10/14/2017.
 */
public interface AlquilerRepository extends JpaRepository<Alquiler, Long> {
}
