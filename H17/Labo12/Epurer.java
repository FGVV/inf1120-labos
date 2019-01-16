/*
 * Ce programme permet d'epurer un fichier dont chaque ligne contient
 * une chaine de caracteres. Apres l'execution du programme, un fichier
 * de sortie contient une occurrence et une seule de chaque chaine du
 * fichier d'entree.
 */

import java.io.*;
public class Epurer {

    public static void main(String[] args) throws IOException {
        String nomFichEntree;
        String nomFichSortie;
        String chainePrec;
        String ligneLue;
        boolean fini;
        
        System.out.println("Veuillez fournir le nom du fichier "
                                                        + "d'entree.");
        nomFichEntree = Clavier.lireString();
        System.out.println("Veuillez fournir le nom du fichier "
                                                        + "de sortie.");
        nomFichSortie = Clavier.lireString();

        FileReader entreeTemp = new FileReader(nomFichEntree);
        BufferedReader entree = new BufferedReader(entreeTemp);

        FileWriter sortieTemp = new FileWriter(nomFichSortie);
        PrintWriter sortie = new PrintWriter(sortieTemp);

        fini = false;
        chainePrec = "";

        do {
            ligneLue = entree.readLine();
            fini = (ligneLue == null);
            if (!fini) {
                ligneLue.trim();
                if (!ligneLue.equals(chainePrec)) {
                    sortie.println(ligneLue);
                }
                chainePrec = ligneLue;
            }
        } while (!fini);   
    
        entree.close();
        sortie.close();        
    }
}
    