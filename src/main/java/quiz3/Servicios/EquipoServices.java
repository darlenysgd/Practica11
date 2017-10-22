package quiz3.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quiz3.Entidades.Equipos;
import quiz3.repositorio.EquipoRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by darle on 10/12/2017.
 */
@Service
public class EquipoServices {

    @Autowired
    EquipoRepository equipoRepository;

    @Transactional
    public Equipos crearEquipo(Equipos equipo){
        equipoRepository.save(equipo);
        return equipo;
    }

    public List<Equipos> findAllEquipos(){

        return equipoRepository.findAll();
    }

}
