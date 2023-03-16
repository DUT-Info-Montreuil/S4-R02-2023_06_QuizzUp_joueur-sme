package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.test.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.LangueDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.impl.JoueurUniqueException;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.impl.PseudoInconnuException;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.impl.ServiceJoueur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestServiceJoueur {


    ServiceJoueur service = ServiceJoueur.getInstance();
    JoueurDTO joueur = new JoueurDTO("Bilel", "Bilel94z", 2004, "foot", LangueDTO.Francais);


    @Test
    public void testAjouterJoueur() throws JoueurUniqueException{
        service.ajouterJoueur("Bilel", "Bilel94z", 2004, "foot", LangueDTO.Francais);
        assertEquals(1, service.listerJoueur().size());
        assertEquals(2004,service.listerJoueur().get(0).getAnneeNaissance());
        assertEquals("Bilel",service.listerJoueur().get(0).getPrenom());
        assertEquals("Bilel94z",service.listerJoueur().get(0).getPseudo());
        assertEquals("francais",service.listerJoueur().get(0).getLangue());
        assertEquals("foot",service.listerJoueur().get(0).getCentresInterets());
    }

    @Test
    public void testSupprimerJoueur() throws JoueurUniqueException, PseudoInconnuException {
        service.ajouterJoueur("Bilel", "Bilel94z", 2004, "foot", LangueDTO.Francais);
        assertEquals(1,service.listerJoueur().size());
        service.supprimerJoueur("Bilel94z");
        assertEquals(0,service.listerJoueur().size());
        service.ajouterJoueur("Ismail", "Ismail942", 2003, "sucre", LangueDTO.Francais);
        service.ajouterJoueur("Adil", "Adil7723z", 2003, "maes", LangueDTO.Francais);
        service.supprimerJoueur("Ismail942");
        assertEquals("Adil7723z", service.listerJoueur().get(0).getPseudo());
    }

    @Test
    public void testListerJoueur() throws JoueurUniqueException{
        service.ajouterJoueur("Bilel", "Bilel94z", 2004, "foot", LangueDTO.Francais);
        service.ajouterJoueur("Ismail", "Ismail942", 2003, "sucre", LangueDTO.Francais);
        assertEquals("Bilel94z",service.listerJoueur().get(0).getPseudo());
        assertEquals("Ismail942",service.listerJoueur().get(1).getPseudo());
    }

}