package quiz3.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quiz3.Entidades.Cliente;
import quiz3.Entidades.EquiposAlquiler;
import quiz3.repositorio.EquiposAlquilerRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by darle on 10/27/2017.
 */
@Service
public class EquiposAlquilerServices {

    @Autowired
    EquiposAlquilerRepository equiposAlquilerRepository;

    @Transactional
    public EquiposAlquiler crearEquiposAlquiler(EquiposAlquiler equiposAlquiler){
        equiposAlquilerRepository.save(equiposAlquiler);
        return equiposAlquiler;
    }

    public List<EquiposAlquiler> findAllEquiposAlquiler(){

        return equiposAlquilerRepository.findAll();
    }


}
