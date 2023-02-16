package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto;


public class JoueurDTO {

    private String prenom;
    private String pseudo;
    private int anneeNaissance;
    private String centresInterets;
    private String langue;
    private int nbPartie;
    private int nbBonnesRep;
    private int moyenne;

    public JoueurDTO(String prenom, String pseudo, int anneeNaissance, String centresInterets, String langue) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.anneeNaissance = anneeNaissance;
        this.centresInterets = centresInterets;
        this.langue = langue;
        this.nbBonnesRep = 0;
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

    public String getCentresInterets() {
        return centresInterets;
    }

    public String getLangue() {
        return langue;
    }

    public int getNbPartie() {
        return nbPartie;
    }

    public int getMoyenne() {
        return moyenne;
    }

    public int getNbBonnesRep() {
        return nbBonnesRep;
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

    public void setLangue(String langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "JoueurDTO{" +
                "prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", centresInterets='" + centresInterets + '\'' +
                ", langue='" + langue + '\'' +
                ", nbPartie=" + nbPartie +
                ", nbBonnesRep=" + nbBonnesRep +
                ", moyenne=" + moyenne +
                '}';
    }
}
