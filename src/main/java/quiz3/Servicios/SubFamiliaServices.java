package quiz3.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quiz3.Entidades.SubFamiliaEquipos;
import quiz3.repositorio.SubFamiliaEquiposRepository;

import java.util.List;

/**
 * Created by darle on 10/14/2017.
 */
@Service
public class SubFamiliaServices {
    @Autowired
    SubFamiliaEquiposRepository subFamiliaEquiposRepository;

    @Transactional
    public SubFamiliaEquipos crearSubfamilia(SubFamiliaEquipos subFamiliaEquipos){

        subFamiliaEquiposRepository.save(subFamiliaEquipos);

        return subFamiliaEquipos;
    }

    public List<SubFamiliaEquipos> findallSubfamilias(){
        return subFamiliaEquiposRepository.findAll();
    }

    public SubFamiliaEquipos findSubFamilia(long id){
        return subFamiliaEquiposRepository.findOne(id);
    }
}
