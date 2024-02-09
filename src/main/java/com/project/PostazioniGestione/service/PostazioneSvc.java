package com.project.PostazioniGestione.service;

import com.project.PostazioniGestione.entities.Postazione;
import com.project.PostazioniGestione.entities.TipoPostazione;
import com.project.PostazioniGestione.repository.PostazioneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneSvc {
    @Autowired
    private PostazioneRepo postazioneRepo;
    public void save(Postazione p) {
        postazioneRepo.save(p);
    }
    public Postazione find(int id) {
        return postazioneRepo.findById(id).get();
    }
    public void remove (Postazione p) {
        postazioneRepo.delete(p);
    }

    public List<Postazione> findPostazionePerTipoECitta(TipoPostazione tipo, String citta){
        return postazioneRepo.findByTipoAndCitta(tipo,citta);
    }
}
