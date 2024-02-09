package com.project.PostazioniGestione.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    public Prenotazione() {
    }

    public Prenotazione(LocalDate data, Utente utente, Postazione postazione) throws Exception {
        this.data = data;
        this.utente = controllaDataInListUtente(data,utente);
        this.postazione = controllaDataInPostazione(data,postazione);
    }

    private Utente controllaDataInListUtente(LocalDate myData, Utente utente) throws Exception {

        List<Prenotazione> prenotazioni = utente.getPrenotazioni();
        if (prenotazioni.isEmpty()) {
            return utente;
        }
        for (Prenotazione prenotazione : utente.getPrenotazioni()) {
            if (myData.equals(prenotazione.getData())) {
                throw new Exception("Utente impegnato per questa data");
            }
        }
        return utente;
    }

    private Postazione controllaDataInPostazione(LocalDate myData, Postazione postazione) throws Exception {
        List<Prenotazione> prenotazioniPostazione = postazione.getPrenotazioni();
        if (prenotazioniPostazione.isEmpty()) {
            return postazione;
        }
        for (Prenotazione prenotazione : postazione.getPrenotazioni()) {
            if (myData.equals(prenotazione.getData())) {
                throw new Exception("Data non disponibile in questa postazione");
            }
        }
        return postazione;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", data=" + data +
                ", utente=" + utente.getUserName() +
                ", postazione=" + postazione.getEdificio() +
                '}';
    }
}
