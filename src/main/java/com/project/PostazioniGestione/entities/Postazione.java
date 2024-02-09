package com.project.PostazioniGestione.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String descrizione;
    private TipoPostazione tipoPostazione;
    private int nrMassimo;

    @OneToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione", fetch = FetchType.EAGER)
    private List<Prenotazione> prenotazioni;

    @Override
    public String toString() {
        return "Postazione{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", nrMassimo=" + nrMassimo +
                ", edificio=" + edificio.getCitta() +
                '}';
    }
}
