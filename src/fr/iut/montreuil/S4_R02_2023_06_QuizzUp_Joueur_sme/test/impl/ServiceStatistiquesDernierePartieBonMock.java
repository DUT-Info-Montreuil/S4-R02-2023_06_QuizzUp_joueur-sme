package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.test.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.PartieDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.modeles.IServiceStatistiques;

import java.util.ArrayList;

public class ServiceStatistiquesDernierePartieBonMock implements IServiceStatistiques {
    @Override
    public int partiesJoueur(JoueurDTO j) {
        return 0;
    }

    @Override
    public int bonneReponse(JoueurDTO j) {
        return 0;
    }

    @Override
    public int nbTotalReponse(JoueurDTO j) {
        return 0;
    }

    @Override
    public int moyenne(JoueurDTO j) {
        return 0;
    }

    @Override
    public ArrayList<PartieDTO> dernieresPartie(JoueurDTO j) {
        PartieDTO p1 = new PartieDTO();
        PartieDTO p2 = new PartieDTO();
        p1.setNbQuestion(10);
        p1.setNbBonneReponse(3);
        p1.setTemps(60);
        p2.setNbQuestion(10);
        p2.setNbBonneReponse(5);
        p2.setTemps(80);
        ArrayList<PartieDTO> parties = new ArrayList<>();
        parties.add(p1);
        parties.add(p2);
        return parties;
    }
}
