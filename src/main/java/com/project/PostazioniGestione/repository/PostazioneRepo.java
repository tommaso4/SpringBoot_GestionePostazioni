package com.project.PostazioniGestione.repository;

import com.project.PostazioniGestione.entities.Postazione;
import com.project.PostazioniGestione.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepo extends JpaRepository<Postazione,Integer> {
    @Query("SELECT p FROM Postazione p WHERE p.tipoPostazione = :tipoPostazione AND p.edificio.citta = :citta")
    List<Postazione> findByTipoAndCitta(@Param("tipoPostazione") TipoPostazione tipoPostazione, @Param("citta") String citta);

}
