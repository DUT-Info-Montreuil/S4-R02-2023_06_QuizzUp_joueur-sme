package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;

import java.util.ArrayList;

public interface IServiceJoueur {

    JoueurDTO ajouterJoueur(String prenom, String pseudo, int anneeNaissance, String centresInterets, String langue);
    JoueurDTO supprimerJoueur(String pseudo);
    ArrayList<JoueurDTO> listerJoueur();

}
