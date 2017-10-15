package quiz3.Servicios;

import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quiz3.Entidades.FamiliaEquipos;
import quiz3.repositorio.FamiliaEquiposRepository;

import java.util.List;

/**
 * Created by darle on 10/13/2017.
 */
@Service
public class FamiliaEquipoServices {

    @Autowired
    FamiliaEquiposRepository familiaEquiposRepository;

    @Transactional
    public FamiliaEquipos CrearFamilia(FamiliaEquipos familiaEquipos){

        familiaEquiposRepository.save(familiaEquipos);

        return familiaEquipos;

    }

    public List<FamiliaEquipos> findAllFamiliasEquipos(){
        return familiaEquiposRepository.findAll();
    }

    public FamiliaEquipos findFamilia(long id){

        return familiaEquiposRepository.findOne(id);

    }
}
