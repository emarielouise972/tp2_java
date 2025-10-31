/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author jerem & yoann
 */

public class Livre {
    private String titre;
    private int code;
    private String auteur;
    private int nbPages;
    private int anneeEdition;

    public Livre(String titre, int code, String auteur, int nbPages, int anneeEdition) {
        this.titre = titre;
        this.code = code;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.anneeEdition = anneeEdition;
    }

    public String getTitre() {
        return titre;
    }

    public int getCode() {
        return code;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public int getAnneeEdition() {
        return anneeEdition;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public void setAnneeEdition(int anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    @Override
    public String toString() {
        return "Livre [Titre = " + titre
                + ", Code = " + code
                + ", Auteur = " + auteur
                + ", NbPages = " + nbPages
                + ", Année = " + anneeEdition + "]";
    }
}
