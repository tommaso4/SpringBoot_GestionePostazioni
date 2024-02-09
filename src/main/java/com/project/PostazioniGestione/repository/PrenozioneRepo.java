package com.project.PostazioniGestione.repository;

import com.project.PostazioniGestione.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenozioneRepo extends JpaRepository<Prenotazione,Integer> {}
