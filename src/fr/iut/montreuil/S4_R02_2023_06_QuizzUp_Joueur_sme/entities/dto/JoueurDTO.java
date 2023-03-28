package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto;


import java.util.ArrayList;

public class JoueurDTO {

    private String prenom;
    private String pseudo;
    private int anneeNaissance;
    private String centresInterets;
    private LangueDTO langue;
    private ArrayList<PartieDTO> parties;

    public JoueurDTO(String prenom, String pseudo, int anneeNaissance, String centresInterets, LangueDTO langue) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.anneeNaissance = anneeNaissance;
        this.centresInterets = centresInterets;
        this.langue = langue;
        this.parties = new ArrayList<>();
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

    public String getCentresInterets() {
        return centresInterets;
    }

    public LangueDTO getLangue() {
        return langue;
    }


    public ArrayList<PartieDTO> getParties() {
        return parties;
    }

    public void addParties(PartieDTO partie) {
        this.parties.add(partie);
    }

    public void setCentresInterets(String centresInterets) {
        this.centresInterets = centresInterets;
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

    public void setLangue(LangueDTO langue) {
        this.langue = langue;
    }


    @Override
    public String toString() {
        return "JoueurDTO{" +
                "prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", centresInterets='" + centresInterets + '\'' +
                ", langue=" + langue +
                '}';
    }
}
