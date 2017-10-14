package quiz3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz3.Entidades.Equipo;


/**
 * Created by darle on 10/12/2017.
 */
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}
