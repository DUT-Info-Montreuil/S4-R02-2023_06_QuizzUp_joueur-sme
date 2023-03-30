package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.impl;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.PartieDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.modeles.IServiceStatistiques;

public class ServiceStatistiques implements IServiceStatistiques {

    @Override
    public int partiesJoueur(JoueurDTO j) {
        return j.getParties().size();
    }

    @Override
    public int bonneReponse(JoueurDTO j) {
        int nbBonneRep = 0;
        for (PartieDTO p : j.getParties()) {
            nbBonneRep += p.getNbBonneReponse();
        }
        return nbBonneRep;
    }

    @Override
    public int nbTotalReponse(JoueurDTO j) {
        int nbQuestion = 0;
        for (PartieDTO p : j.getParties()) {
            nbQuestion += p.getNbQuestion();
        }
        return nbQuestion;
    }

    @Override
    public int moyenne(JoueurDTO j) {
        return (int) (bonneReponse(j) / nbTotalReponse(j));
    }

    @Override
    public ArrayList<PartieDTO> dernieresPartie(JoueurDTO j) {
        ArrayList<PartieDTO> parties = j.getParties();
        ArrayList<PartieDTO> dernieresParties = new ArrayList<PartieDTO>();
        int nbPartie = parties.size();
        if (nbPartie > 5) {
            for (int i = nbPartie - 5; i < nbPartie; i++) {
                dernieresParties.add(parties.get(i));
            }
        } else {
            dernieresParties = parties;
        }
        return dernieresParties;
    }
    
}
