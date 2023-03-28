package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.PartieDTO;

import java.util.ArrayList;

public interface IServiceStatistiques {

    int partiesJoueur(JoueurDTO j);
    int bonneReponse(JoueurDTO j);
    int nbTotalReponse(JoueurDTO j);
    int moyenne(JoueurDTO j);
    ArrayList<PartieDTO> dernieresPartie(JoueurDTO j);



}
