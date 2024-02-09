package com.project.PostazioniGestione.service;

import com.project.PostazioniGestione.entities.Prenotazione;
import com.project.PostazioniGestione.repository.PrenozioneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneSvc {
    @Autowired
    private PrenozioneRepo prenotazioneRepo;

    public void save(Prenotazione p) {
        prenotazioneRepo.save(p);
    }

    public Prenotazione find(int id) {
        return prenotazioneRepo.findById(id).get();
    }

    public void remove (Prenotazione p) {
        prenotazioneRepo.delete(p);
    }
}
