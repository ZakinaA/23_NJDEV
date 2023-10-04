package bts.sio.api.service;

import bts.sio.api.model.Epreuve_Pays;
import bts.sio.api.repository.EpreuveRepository;
import bts.sio.api.repository.Epreuve_PaysRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class Epreuve_PaysService {
    @Autowired
    private Epreuve_PaysRepository epreuvePaysRepository;

    public Optional<Epreuve_Pays> getEpreuve_Pays(final Long id){return epreuvePaysRepository.findById(id);}

    public Iterable<Epreuve_Pays> getEpreuves_Pays(){return epreuvePaysRepository.findAll();}

    public void deleteEpreuve_Pays(final Long id){epreuvePaysRepository.deleteById(id);}

    public Epreuve_Pays saveEpreuve_Pays(Epreuve_Pays epreuvePays){
        Epreuve_Pays savedEpreuvePays = epreuvePaysRepository.save(epreuvePays);
        return savedEpreuvePays;
    }
}
