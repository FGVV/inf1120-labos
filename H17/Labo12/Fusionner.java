/*
 * Ce programme permet de fusionner deux suites de chaines de caracteres
 * stockees dans des fichiers differents. On suppose que chaque suite a
 * ete epuree, c'est-a-dire qu'elle ne contient qu'une occurrence d'une
 * chaine donnee. Par contre, une chaine peut apparaitre dans les deux
 * suites.
 */

import java.io.*;
public class Fusionner {

    public static void main(String[] args) throws IOException {
        String nomFich1;
        String nomFich2;
        String nomFichSortie;
        String ligne1;
        String ligne2;
        boolean fini;
        
        System.out.println("Veuillez fournir le nom du premier fichier "
                                                        + "d'entree.");
        nomFich1 = Clavier.lireString();
        System.out.println("Veuillez fournir le nom du deuxieme fichier"
                                                        + " d'entree.");
        nomFich2 = Clavier.lireString();
        System.out.println("Veuillez fournir le nom du fichier "
                                                        + "de sortie.");
        nomFichSortie = Clavier.lireString();

        FileReader entreeTemp1 = new FileReader(nomFich1);
        BufferedReader entree1 = new BufferedReader(entreeTemp1);
        FileReader entreeTemp2 = new FileReader(nomFich2);
        BufferedReader entree2 = new BufferedReader(entreeTemp2);

        FileWriter sortieTemp = new FileWriter(nomFichSortie);
        PrintWriter sortie = new PrintWriter(sortieTemp);

        ligne1 = entree1.readLine();
        ligne2 = entree2.readLine();
        fini = ((ligne1 == null) || (ligne2 == null));

        while (!fini) {
            if (ligne1.compareTo(ligne2) < 0) {
                sortie.println(ligne1);
                ligne1 = entree1.readLine();
            } else {
                if (ligne1.compareTo(ligne2) > 0) {
                    sortie.println(ligne2);
                    ligne2 = entree2.readLine();
                } else {
                    sortie.println(ligne1);
                    ligne1 = entree1.readLine();
                    ligne2 = entree2.readLine();
                }
            }
            fini = ((ligne1 == null) || (ligne2 == null));
        }

        while (!(ligne1 == null)) {
            sortie.println(ligne1);
            ligne1 = entree1.readLine();
        }   
    
        while (!(ligne2 == null)) {
            sortie.println(ligne2);
            ligne2 = entree2.readLine();
        }
   
        entree1.close();
        entree2.close();
        sortie.close();        
    }
}
    