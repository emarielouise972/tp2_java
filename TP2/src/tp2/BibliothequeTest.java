/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author matis
 */
public class BibliothequeTest {
    public static void main(String[] args) {
        // 1) Créer une étagère (on suppose un constructeur Etagere(String domaine, int capacite))
        Etagere etagere = new Etagere("Littérature", 10);

        // 2) Ajouter plusieurs livres (Livre(String titre, int code, String auteur, int nbPages, int anneeEdition))
        etagere.ajouterLivre(new Livre("L'Étranger", 101, "Albert Camus", 185, 1942));
        etagere.ajouterLivre(new Livre("Le Petit Prince", 102, "Antoine de Saint-Exupéry", 96, 1943));
        etagere.ajouterLivre(new Livre("Madame Bovary", 103, "Gustave Flaubert", 432, 1857));
        etagere.ajouterLivre(new Livre("La Peste",104, "Albert Camus", 320, 1947));
        etagere.ajouterLivre(new Livre("Le Consentement", 105, "Vanessa Springora", 208, 2020));
        etagere.ajouterLivre(new Livre("Nouveauté 2025", 106, "Auteur Moderne", 250, 2025));

        // 8) Affichage des livres
        System.out.println("== Livres présents sur l'étagère ==");
        etagere.afficherLivres();
        System.out.println();

        // 3) Somme des pages
        int totalPages = etagere.sommePages();
        System.out.println("Somme totale des pages : " + totalPages);
        System.out.println();

        // 4) Recherche d'un livre par titre
        String codeTrouve = etagere.chercherLivreParTitre("Le Petit Prince");
        System.out.println("Recherche par titre \"Le Petit Prince\" → code : " + codeTrouve);
        System.out.println();

        // 5) Recherche des petits livres (nb pages < seuil)
        int seuil = 200;
        System.out.println("== Livres avec moins de " + seuil + " pages ==");
        etagere.chercherPetitsLivres(seuil);
        System.out.println();

        // 6) Affichage des nouveaux livres (année en cours)
        int anneeActuelle = 2025;
        System.out.println("== Livres édités en " + anneeActuelle + " ==");
        etagere.afficherNouveauxLivres(anneeActuelle);
        System.out.println();

        // 7) Changer le nombre de pages d'un livre par code
        System.out.println("== Modification du nombre de pages (code 104 → 350) ==");
        etagere.changerNbPages(104, 350);
        etagere.afficherLivres();
        System.out.println();

        // 9) Tri : trier les livres par nombre de pages (on suppose la méthode trierParNbPages())
        System.out.println("== Tri par nombre de pages ==");
        etagere.trierParNbPages();
        etagere.afficherLivres();
        System.out.println();

        // 10) Recherche : titres par auteur
        System.out.println("== Titres d'Albert Camus ==");
        String[] titresCamus = etagere.chercherTitresParAuteur("Albert Camus");
        if (titresCamus != null && titresCamus.length > 0) {
            for (String t : titresCamus) {
                System.out.println("• " + t);
            }
        } else {
            System.out.println("(Aucun titre trouvé pour cet auteur)");
        }
        System.out.println();

        // 2) Suppression d'un livre par code
        System.out.println("== Suppression du livre code 103 ==");
        etagere.supprimerLivre(103);

        // Ré-affichage après suppression
        System.out.println("== Après suppression ==");
        etagere.afficherLivres();
    }
}