package com.project.PostazioniGestione.repository;

import com.project.PostazioniGestione.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepo extends JpaRepository<Utente,Integer> {}
