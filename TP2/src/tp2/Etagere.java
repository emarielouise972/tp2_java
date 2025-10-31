package tp2;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jerem
 */
public class Etagere {
    private static int CountCode=1;
    private int Code;
    private String Domaine;
    private int CapaciteMax;
    ArrayList<Livre> Livres;
    
    Etagere(String domaineLivre, int capMax) {
        Domaine = domaineLivre;
        CapaciteMax = capMax;
    }
    
    Etagere(String domaineLivre, int capMax, int codeL){
        Domaine = domaineLivre;
        CapaciteMax = capMax;
        // il est supossé que l'utilisateur ne rentre pas de code déjà existant
        Code = codeL;
        if(CountCode < codeL){
            CountCode = codeL+1;
        }
    }
    
    public void ajouterLivre(Livre livre){
        Livres.add(livre);
    }
    
    public void supprimerLivre(int code) {
        boolean trouver = false;
        int cpt = 0;
        while(cpt < Livres.size() && !trouver){
            if(Livres.get(cpt).getCode() == code){
                Livres.remove(cpt);
                trouver = true;
            }
            else {
                cpt++;
            }
        }
        if(!trouver){
            System.out.println("Le livre avec le code d'identification "+code+" n'a pas était trouvé");
        }
    }
    
    public int sommePages() {
        int somme = 0;
        
        for(Livre livre : Livres){
            somme = somme+livre.getnbPage();
        }
        
        return somme;
    }
    
    public String chercherLivreParTitre(String titre){
        boolean trouver = false;
        int cpt = 0;
        String code = "Le livre recherché n'a pas était trouvé";
        
        while(cpt < Livres.size() && !trouver){
            if(Livres.get(cpt).getTire() == titre){
                trouver = true;
                code = ""+Livres.get(cpt).getCode();
            }
            else{
                cpt++;
            }
        }
        return code;
    }
}
