import package2;

public class EtudiantTest{
    public static void main() {
        Etudiant e1 = new Etudiant("Dupont", "Alice", 21, "maths", 14.5f);
        Etudiant e2 = new Etudiant("Martin", "Bob", 20, "physique", 12.0f);
        Etudiant e3 = new Etudiant(); // Par défaut

        Groupe g = new Groupe();
        g.ajouterEtudiant(e1);
        g.ajouterEtudiant(e2);
        g.ajouterEtudiant(e3);

        System.out.println("Affichage des étudiants du groupe:");
        g.afficherGroupeEtudiant();

        System.out.println("Après tri par agae:");
        g.trierParAge();
        g.afficherGroupeEtudiant();

        int ageRecherche = 20;
        List<String> prenoms = g.afficherPrenomsParAge(ageRecherche);
        System.out.println("Prenoms des étudiants ayant " + ageRecherche + " ans : " + prenoms);
    }
}