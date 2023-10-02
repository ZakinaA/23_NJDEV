package bts.sio.api.controller;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Epreuve;
import bts.sio.api.model.Epreuve_Pays;
import bts.sio.api.model.Pays;
import bts.sio.api.service.Epreuve_PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
public class Epreuve_PaysController {

    @Autowired
    private Epreuve_PaysService epreuvePaysService;

    @PostMapping("/epreuve_pays")
    public Epreuve_Pays createEpreuve_Pays(@RequestBody Epreuve_Pays epreuvePays){ return epreuvePaysService.saveEpreuve_Pays(epreuvePays);}

    @GetMapping("/epreuve_pays/{id}")
    public Epreuve_Pays getEpreuve_Pays(@PathVariable("id") final Long id){
        Optional<Epreuve_Pays> epreuvePays = epreuvePaysService.getEpreuve_Pays(id);
        if(epreuvePays.isPresent()){
            return epreuvePays.get();
        } else {
            return null;
        }
    }

    @GetMapping("/epreuves_pays")
    public Iterable<Epreuve_Pays> getEpreuves_Pays(){ return epreuvePaysService.getEpreuves_Pays();}

    @PutMapping("/epreuve_pays/{id}")
    public Epreuve_Pays updateEpreuve_Pays(@PathVariable("id") final Long id, @RequestBody Epreuve_Pays epreuvePays){
        Optional<Epreuve_Pays> e = epreuvePaysService.getEpreuve_Pays(id);
        if(e.isPresent()){
            Epreuve_Pays currentEpreuve_Pays = e.get();

            Pays pays_id = epreuvePays.getPays();
            if(pays_id != null){
                currentEpreuve_Pays.setPays(pays_id);
            }

            Epreuve epreuve_id = epreuvePays.getEpreuve();
            if(epreuve_id != null){
                currentEpreuve_Pays.setEpreuve(epreuve_id);
            }

            Long place = epreuvePays.getPlace();
            if(place != null){
                currentEpreuve_Pays.setPlace(place);
            }

            Date DateResultat = epreuvePays.getDateResult();
            if(DateResultat != null){
                currentEpreuve_Pays.setDateResult(DateResultat);
            }

            epreuvePaysService.saveEpreuve_Pays(currentEpreuve_Pays);
            return currentEpreuve_Pays;
        } else {
            return null;
        }
    }

    @DeleteMapping("/epreuve_pays/{id}")
    public void deleteEpreuve_Pays(@PathVariable("id") final Long id){epreuvePaysService.deleteEpreuve_Pays(id);}
    
}
