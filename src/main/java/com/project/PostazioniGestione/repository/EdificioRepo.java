package com.project.PostazioniGestione.repository;

import com.project.PostazioniGestione.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepo extends JpaRepository<Edificio,Integer> {}
