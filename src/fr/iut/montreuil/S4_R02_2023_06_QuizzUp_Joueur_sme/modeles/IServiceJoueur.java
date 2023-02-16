package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entites.dto.JoueurDTO;

import java.util.ArrayList;

public interface IServiceJoueur {

    JoueurDTO ajouterJoueur(String prenom, String pseudo, int anneeNaissance, ArrayList<String> centresInterets, String langue);
    JoueurDTO supprimerJoueur(JoueurDTO joueur);
    ArrayList<JoueurDTO> listerJoueur();

}
