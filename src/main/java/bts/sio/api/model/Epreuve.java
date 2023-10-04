package bts.sio.api.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
    @Entity
    @Table(name = "epreuve")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public class Epreuve {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @Column(name = "libelle")
        private String libelle ;

        @Column(name = "date_debut")
        private Date dateDebut;

        @Column(name = "date_fin")
        private Date dateFin;


        @ManyToOne
        @JoinColumn(name = "sport_id")
        private Sport sport;

    }


