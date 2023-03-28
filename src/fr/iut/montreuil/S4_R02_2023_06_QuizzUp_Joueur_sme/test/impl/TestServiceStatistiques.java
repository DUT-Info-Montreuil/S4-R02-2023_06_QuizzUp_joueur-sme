package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.test.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.LangueDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.PartieDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class IServiceStatistiquesTest {


    JoueurDTO j = new JoueurDTO("merwan","mer",2003,"dodo", LangueDTO.Francais);
    PartieDTO p1 = new PartieDTO();
    PartieDTO p2 = new PartieDTO();

    @BeforeEach
    public void setup(){
        p1.setNbQuestion(10);
        p1.setNbBonneReponse(3);
        p1.setTemps(60);
        p2.setNbQuestion(10);
        p2.setNbBonneReponse(5);
        p2.setTemps(80);
        j.addParties(p1);
        j.addParties(p2);

    }

    @Test
    public void NbPartieBon(){
        ServiceStatistiquesNbPartieBonMock service = new ServiceStatistiquesNbPartieBonMock();
        assertEquals(2,service.partiesJoueur(j));
    }

    @Test
    public void BonneRepBon(){
        ServiceStatistiquesBonneRepBonMock service = new ServiceStatistiquesBonneRepBonMock();
        assertEquals(8,service.bonneReponse(j));

    }

    @Test
    public void TotalRepBon(){
        ServiceStatistiquesTotalRepMock service = new ServiceStatistiquesTotalRepMock();
        assertEquals(20,service.nbTotalReponse(j));
    }

    @Test
    public void MoyenneBon(){
        ServiceStatistiquesMoyenneBonMock service = new ServiceStatistiquesMoyenneBonMock();
        assertEquals(4,service.moyenne(j));
    }

    @Test
    public void DernierePartieBon(){
        ServiceStatistiquesDernierePartieBonMock service = new ServiceStatistiquesDernierePartieBonMock();
        ArrayList<PartieDTO> parties = new ArrayList<>();
        parties.add(p1);
        parties.add(p2);
        assertEquals(parties,service.dernieresPartie(j));
    }

}