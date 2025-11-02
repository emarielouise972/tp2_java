package tp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Groupe{
    private ArrayList<Etudiant> groupeEtudiant;

    public Groupe() {
        this.groupeEtudiant = new ArrayList<>();
    }

    public ArrayList<Etudiant> getGroupeEtudiant() {
        return groupeEtudiant;
    }

    public void setGroupeEtudiant(ArrayList<Etudiant> groupeEtudiant) {
        this.groupeEtudiant = groupeEtudiant;
    }
    public void ajouterEtudiant(Etudiant e){
        this.groupeEtudiant.add(e);
    }
    public void afficherGroupeEtudiant(){
        for(Etudiant e : groupeEtudiant){
            System.out.println(e);
        }
    }
    public void trierParAge(){
        Collections.sort(this.groupeEtudiant, Comparator.comparingInt(Etudiant::getAge));
    }

    public List<String> afficherPrenomsParAge(int age) {
        List<String> prenomsCorrespondants = new ArrayList<>();

        for (Etudiant e : groupeEtudiant) {
            if (e.getAge() == age) {
                prenomsCorrespondants.add(e.getPrenom());
            }
        }
        return prenomsCorrespondants;
    }
}