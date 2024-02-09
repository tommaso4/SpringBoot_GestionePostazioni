package com.project.PostazioniGestione.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String indirizzo;
    private String citta;
    @OneToOne(mappedBy = "edificio")
    private Postazione postazione;


}
