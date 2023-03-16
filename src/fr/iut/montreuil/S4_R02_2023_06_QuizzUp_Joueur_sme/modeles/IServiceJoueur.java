package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.LangueDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.impl.JoueurUniqueException;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.impl.PseudoInconnuException;

import java.util.ArrayList;

public interface IServiceJoueur {

    JoueurDTO ajouterJoueur(String prenom, String pseudo, int anneeNaissance, String centresInterets, LangueDTO langue) throws JoueurUniqueException;
    JoueurDTO supprimerJoueur(String pseudo) throws PseudoInconnuException;
    ArrayList<JoueurDTO> listerJoueur();

}
