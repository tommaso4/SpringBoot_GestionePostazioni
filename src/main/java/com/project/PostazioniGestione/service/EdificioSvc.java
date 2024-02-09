package com.project.PostazioniGestione.service;

import com.project.PostazioniGestione.entities.Edificio;
import com.project.PostazioniGestione.repository.EdificioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioSvc {
    @Autowired
    private EdificioRepo edificoRepo;

    public void save(Edificio p) {
        edificoRepo.save(p);
    }

    public Edificio find(int id) {
        return edificoRepo.findById(id).get();
    }

    public void remove(Edificio p) {
        edificoRepo.delete(p);
    }
}
