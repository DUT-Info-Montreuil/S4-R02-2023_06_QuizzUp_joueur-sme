package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entites.dto;

import java.util.ArrayList;

public class JoueurDTO {

    private String prenom;
    private String pseudo;
    private int anneeNaissance;
    private ArrayList<String> centresInterets;
    private Langue langue;
    private int nbPartie;
    private int moyenne;

    public JoueurDTO(String prenom, String pseudo, int anneeNaissance, ArrayList<String> centresInterets, Langue langue) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.anneeNaissance = anneeNaissance;
        this.centresInterets = centresInterets;
        this.langue = langue;
        this.nbPartie = 0;
        this.moyenne = 0;
    }


    public String getPrenom() {
        return prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public ArrayList<String> getCentresInterets() {
        return centresInterets;
    }

    public Langue getLangue() {
        return langue;
    }

    public int getNbPartie() {
        return nbPartie;
    }

    public int getMoyenne() {
        return moyenne;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

}
