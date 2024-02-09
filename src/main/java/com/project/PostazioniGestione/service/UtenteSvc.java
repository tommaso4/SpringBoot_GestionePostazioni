package com.project.PostazioniGestione.service;

import com.project.PostazioniGestione.entities.Utente;
import com.project.PostazioniGestione.repository.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteSvc {
    @Autowired
    private UtenteRepo utenteRepo;

    public void save(Utente p) {
        utenteRepo.save(p);
    }

    public Utente find(int id) {
        return utenteRepo.findById(id).get();
    }

    public void remove (Utente p) {
        utenteRepo.delete(p);
    }
}
