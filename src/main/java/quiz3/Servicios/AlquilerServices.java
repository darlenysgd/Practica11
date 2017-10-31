package quiz3.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quiz3.Entidades.Alquiler;
import quiz3.repositorio.AlquilerRepository;

import java.util.List;

/**
 * Created by darle on 10/14/2017.
 */
@Service
public class AlquilerServices {

    @Autowired
    AlquilerRepository alquilerRepository;

    @Transactional
    public Alquiler crearAlquiler(Alquiler alquiler){
        alquilerRepository.save(alquiler);
        return alquiler;
    }

    public void deleteAlquiler(long id){

        alquilerRepository.delete(id);
    }

    public List<Alquiler> findAllAlquileres(){
        return alquilerRepository.findAll();
    }
}
