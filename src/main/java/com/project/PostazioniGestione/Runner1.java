package com.project.PostazioniGestione;

import com.project.PostazioniGestione.entities.*;
import com.project.PostazioniGestione.service.EdificioSvc;
import com.project.PostazioniGestione.service.PostazioneSvc;
import com.project.PostazioniGestione.service.PrenotazioneSvc;
import com.project.PostazioniGestione.service.UtenteSvc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;


@Component
public class Runner1 implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger("postazioni");
    @Autowired
    EdificioSvc edificioSvc;
    @Autowired
    PostazioneSvc postazioneSvc;
    @Autowired
    UtenteSvc utenteSvc;
    @Autowired
    PrenotazioneSvc prenotazioneSvc;

    @Override
    public void run(String... args) throws Exception {
        logger.info("----------------------------------------------------------------------------------------------");
        Edificio edificio1 = edificioSvc.find(1);
        Edificio edificio2 = edificioSvc.find(2);
        Edificio edificio3 = edificioSvc.find(3);
        Postazione postazione1 = postazioneSvc.find(1);
        Postazione postazione2 = postazioneSvc.find(2);
        Postazione postazione3 = postazioneSvc.find(3);
        Utente mario = utenteSvc.find(1);
        Utente luisa = utenteSvc.find(2);
        Prenotazione prenotazione1 = prenotazioneSvc.find(1);
        Prenotazione prenotazione2 = prenotazioneSvc.find(2);

        List<Postazione> postazioni = postazioneSvc.findPostazionePerTipoECitta(TipoPostazione.SALA, "Bologna");
        postazioni.forEach(System.out::println);




    }
}






//        Edificio edificio1 = new Edificio();
//        edificio1.setCitta("Bologna");
//        edificio1.setIndirizzo("Via Remo,3");
//        edificioSvc.save(edificio1);
//        Edificio edificio2 = new Edificio();
//        edificio2.setCitta("Ancona");
//        edificio2.setIndirizzo("Via Cardeto,3");
//        edificioSvc.save(edificio2);
//        Edificio edificio3 = new Edificio();
//        edificio3.setCitta("Bologna");
//        edificio3.setIndirizzo("Via Risomnfo,3");
//        edificioSvc.save(edificio3);

//Postazione postazione1 = new Postazione();
//        postazione1.setDescrizione("Alto Livello");
//        postazione1.setTipoPostazione(TipoPostazione.SALA);
//        postazione1.setNrMassimo(20);
//        postazione1.setEdificio(edificio1);
//        postazioneSvc.save(postazione1);
//Postazione postazione2 = new Postazione();
//        postazione2.setDescrizione("Alto Livello");
//        postazione2.setTipoPostazione(TipoPostazione.PRIVATO);
//        postazione2.setNrMassimo(10);
//        postazione2.setEdificio(edificio2);
//        postazioneSvc.save(postazione2);
//Postazione postazione3 = new Postazione();
//        postazione3.setDescrizione("Alto Livello");
//        postazione3.setTipoPostazione(TipoPostazione.OPENSPACE);
//        postazione3.setNrMassimo(30);
//        postazione3.setEdificio(edificio3);
//        postazioneSvc.save(postazione3);
//Postazione postazione4 = new Postazione();
//        postazione4.setDescrizione("Alto Livello");
//        postazione4.setTipoPostazione(TipoPostazione.SALA);
//        postazione4.setNrMassimo(20);
//        postazione4.setEdificio(edificio4);
//        postazioneSvc.save(postazione4);

//Utente utente1 = new Utente();
//        utente1.setUserName("mario2");
//        utente1.setNome("mario");
//        utente1.setCognome("Rossi");
//        utente1.setEmail("mario@gmil.com");
//        utenteSvc.save(utente1);
//Utente utente2 = new Utente();
//        utente2.setUserName("luisa2");
//        utente2.setNome("Luisa");
//        utente2.setCognome("Bianchi");
//        utente2.setEmail("luisa@gmil.com");
//        utenteSvc.save(utente2);