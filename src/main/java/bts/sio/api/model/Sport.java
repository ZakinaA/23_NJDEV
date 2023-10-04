package bts.sio.api.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "sport")
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;

    @Column(name="descriptif")
    private String descriptif;

    @Column(name="nom_image")
    private String nom_image;

    @ManyToOne
    @JoinColumn(name = "olympiade_id")
    private Olympiade olympiade_id;


}
