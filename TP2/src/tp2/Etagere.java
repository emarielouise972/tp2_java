package tp2;

import java.util.ArrayList;
import java.util.Comparator;

public class Etagere {
    private static int countCode = 1;
    private int code;
    private String domaine;
    private int capaciteMax;
    private ArrayList<Livre> livres;

    public Etagere(String domaineLivre, int capMax) {
        this.domaine = domaineLivre;
        this.capaciteMax = capMax;
        this.code = countCode++;
        this.livres = new ArrayList<>();
    }

    public Etagere(String domaineLivre, int capMax, int codeL) {
        this.domaine = domaineLivre;
        this.capaciteMax = capMax;
        this.code = codeL;
        this.livres = new ArrayList<>();
        if (countCode < codeL) countCode = codeL + 1;
    }

    // Ajouter / Supprimer un livre
    public void ajouterLivre(Livre livre) {
        if (livres.size() < capaciteMax) {
            livres.add(livre);
        } else {
            System.out.println("L'étagère est pleine !");
        }
    }

    public void supprimerLivre(int code) {
        boolean trouve = false;
        for (Livre l : livres) {
            if (l.getCode() == code) {
                livres.remove(l);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Le livre avec le code " + code + " n’a pas été trouvé.");
        }
    }


    // Q5. chercherPetitsLivres
    public void chercherPetitsLivres(int seuil) {
        boolean trouve = false;
        for (Livre l : livres) {
            if (l.getNbPages() < seuil) {
                System.out.println(l);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun livre avec moins de " + seuil + " pages.");
        }
    }

    // Q6. afficherNouveauxLivres
    public void afficherNouveauxLivres(int anneeActuelle) {
        boolean trouve = false;
        for (Livre l : livres) {
            if (l.getAnneeEdition() == anneeActuelle) {
                System.out.println("Titre : " + l.getTitre() + " | Code : " + l.getCode());
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun livre édité en " + anneeActuelle + ".");
        }
    }

    // Q7. changerNbPages
    public boolean changerNbPages(int codeLivre, int nbPages) {
        if (nbPages <= 0) return false;
        for (Livre l : livres) {
            if (l.getCode() == codeLivre) {
                l.setNbPages(nbPages);
                return true;
            }
        }
        return false;
    }

    // Q8. afficherLivres
    public void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println("Aucun livre sur l'étagère.");
            return;
        }
        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    // Q9. trierParNbPages
    public void trierParNbPages() {
        livres.sort(Comparator.comparingInt(Livre::getNbPages));
    }

    // Q10. chercherTitresParAuteur
    public String[] chercherTitresParAuteur(String auteur) {
        ArrayList<String> titres = new ArrayList<>();
        for (Livre l : livres) {
            if (l.getAuteur().equalsIgnoreCase(auteur)) {
                titres.add(l.getTitre());
            }
        }
        if (titres.isEmpty()) {
            System.out.println("Aucun livre trouvé pour l'auteur " + auteur + ".");
        }
        return titres.toArray(new String[0]);
    }

    // Méthodes utilitaires
    public int sommePages() {
        int somme = 0;
        for (Livre l : livres) {
            somme += l.getNbPages();
        }
        return somme;
    }

    public String chercherLivreParTitre(String titre) {
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titre)) {
                return String.valueOf(l.getCode());
            }
        }
        return "Le livre recherché n’a pas été trouvé.";
    }
}
