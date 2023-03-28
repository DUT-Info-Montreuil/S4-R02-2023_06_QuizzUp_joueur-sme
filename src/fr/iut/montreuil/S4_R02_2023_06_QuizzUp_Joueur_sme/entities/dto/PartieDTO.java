package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Joueur_sme.entities.dto;

import java.util.Objects;

public class PartieDTO {

    private int nbBonneReponse;
    private int nbQuestion;
    private int temps;


    public int getNbBonneReponse() {
        return nbBonneReponse;
    }

    public void setNbBonneReponse(int nbBonneReponse) {
        this.nbBonneReponse = nbBonneReponse;
    }

    public int getNbQuestion() {
        return nbQuestion;
    }

    public void setNbQuestion(int nbQuestion) {
        this.nbQuestion = nbQuestion;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartieDTO partieDTO = (PartieDTO) o;
        return nbBonneReponse == partieDTO.nbBonneReponse && nbQuestion == partieDTO.nbQuestion && temps == partieDTO.temps;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nbBonneReponse, nbQuestion, temps);
    }
}
