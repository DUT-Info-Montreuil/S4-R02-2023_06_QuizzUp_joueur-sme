package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.test.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.PartieDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.modeles.IServiceStatistiques;

import java.util.ArrayList;

public class ServiceStatistiquesBonneRepBonMock implements IServiceStatistiques {
    @Override
    public int partiesJoueur(JoueurDTO j) {
        return 0;
    }

    @Override
    public int bonneReponse(JoueurDTO j) {
        return 8;
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
        return null;
    }
}
