package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.modeles.IServiceJoueur;

import java.util.ArrayList;
import java.util.Optional;

public class ServiceJoueur implements IServiceJoueur {

    private static ServiceJoueur uniqueInstance=null;
    private ArrayList<JoueurDTO> joueurs;


    private ServiceJoueur(){
        joueurs = new ArrayList<>();
    }

    public static ServiceJoueur getInstance(){
        if(uniqueInstance==null)
            uniqueInstance = new ServiceJoueur();
        return uniqueInstance;
    }


    @Override
    public JoueurDTO ajouterJoueur(String prenom, String pseudo, int anneeNaissance, String centresInterets, String langue) {
        JoueurDTO newJoueur = new JoueurDTO(prenom,pseudo,anneeNaissance,centresInterets,langue);
        joueurs.add(newJoueur);
        return newJoueur;
    }

    @Override
    public JoueurDTO supprimerJoueur(JoueurDTO joueur) {
        Optional<JoueurDTO> j =joueurs.stream().filter(joueurDTO -> joueurDTO==joueur).findFirst();
        if(j.isPresent()) {
            joueurs.remove(j.get());
            return j.get();
        }
        return null;
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueur() {
        return joueurs;
    }





}
