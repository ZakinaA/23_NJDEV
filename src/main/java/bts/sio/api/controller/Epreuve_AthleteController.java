package bts.sio.api.controller;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Epreuve;
import bts.sio.api.model.Epreuve_Athlete;
import bts.sio.api.service.Epreuve_AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@RestController
public class Epreuve_AthleteController {

    @Autowired
    private Epreuve_AthleteService epreuveAthleteService;

    @PostMapping("/epreuve_athlete")
    public Epreuve_Athlete createEpreuve_Athlete(@RequestBody Epreuve_Athlete epreuveAthlete) { return epreuveAthleteService.saveEpreuve_Athlete(epreuveAthlete);}


    @GetMapping("/epreuve_athlete/{id}")
    public ResponseEntity<List<Epreuve_Athlete>> getEpreuve_Athlete(@PathVariable("id") final Long id) {
        List<Epreuve_Athlete> epreuveAthletes = epreuveAthleteService.getEpreuve_Athlete(id);
        if (!epreuveAthletes.isEmpty()) {
            return ResponseEntity.ok(epreuveAthletes);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/epreuves_athletes")
    public Iterable<Epreuve_Athlete> getEpreuves_Athletes() { return epreuveAthleteService.getEpreuves_Athletes();}

    @PutMapping("/epreuve_athlete/{id}")
    public ResponseEntity<Epreuve_Athlete> updateEpreuve_Athlete(@PathVariable("id") final Long id, @RequestBody Epreuve_Athlete epreuveAthlete) {
        List<Epreuve_Athlete> epreuveAthletes = epreuveAthleteService.getEpreuve_Athlete(id);

        if (!epreuveAthletes.isEmpty()) {
            // Vous pouvez choisir de prendre le premier résultat ou mettre en œuvre une logique de gestion des multiples résultats.
            // Ici, nous prenons simplement le premier résultat.
            Epreuve_Athlete currentEpreuve_Athlete = epreuveAthletes.get(0);

            // Mettez à jour les propriétés de l'objet actuel avec les nouvelles valeurs.
            Athlete athlete_id = epreuveAthlete.getAthlete();
            if (athlete_id != null) {
                currentEpreuve_Athlete.setAthlete(athlete_id);
            }

            Epreuve epreuve_id = epreuveAthlete.getEpreuve();
            if (epreuve_id != null) {
                currentEpreuve_Athlete.setEpreuve(epreuve_id);
            }

            Long place = epreuveAthlete.getPlace();
            if (place != null) {
                currentEpreuve_Athlete.setPlace(place);
            }

            LocalDate dateResultat = epreuveAthlete.getDateResultat();
            if (dateResultat != null) {
                currentEpreuve_Athlete.setDateResultat(dateResultat);
            }

            Epreuve_Athlete updatedEpreuve_Athlete = epreuveAthleteService.saveEpreuve_Athlete(currentEpreuve_Athlete);

            return ResponseEntity.ok(updatedEpreuve_Athlete);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/epreuve_Athlete/{id}")
    public void deleteEpreuve_Athlete(@PathVariable("id") final Long id) {
        epreuveAthleteService.deleteEpreuve_Athlete(id);
    }



}
