import java.io.*;
public class Fichiers13 {

    public static void main (String[] args) throws IOException{
        question1();
        question2();
    }

    public static void question1() throws IOException{
        String nomFichierEntree;
        String nomFichierSortie;
        String ligne;
        String precedent = "";
        boolean fini = false;

        System.out.println("Nom fichier entree: ");
        nomFichierEntree = Clavier.lireString();
        System.out.println("Nom fichier sortie: ");
        nomFichierSortie = Clavier.lireString();

        FileReader fr = new FileReader(nomFichierEntree);
        BufferedReader lunette = new BufferedReader(fr);

        FileWriter fw = new FileWriter(nomFichierSortie);
        PrintWriter crayon = new PrintWriter(fw);

        while (!fini){
            ligne = lunette.readLine();
            fini = (ligne == null);
            if (!fini){
                ligne.trim();
                if (!ligne.equals(precedent)){
                    crayon.println(ligne);
                }
                precedent = ligne;
            }
        }

        lunette.close();
        crayon.close();
    }

    public static void question2() throws IOException{
        String nomF1;
        String nomF2;
        String nomFSortie;
        String ligne1;
        String ligne2;
        boolean fini;

        System.out.println("Nom fichier 1 entree: ");
        nomF1 = Clavier.lireString();
        System.out.println("Nom fichier 2 entree: ");
        nomF2 = Clavier.lireString();
        System.out.println("Nom fichier sortie: ");
        nomFSortie = Clavier.lireString();

        FileReader fr1 = new FileReader(nomF1);
        BufferedReader lunette1 = new BufferedReader(fr1);

        FileReader fr2 = new FileReader(nomF2);
        BufferedReader lunette2 = new BufferedReader(fr2);

        FileWriter fw = new FileWriter(nomFSortie);
        PrintWriter crayon = new PrintWriter(fw);

        ligne1 = lunette1.readLine();
        ligne2 = lunette2.readLine();

        fini = ((ligne1 == null) || (ligne2 == null));

        while (!fini){
            if (ligne1.compareTo(ligne2) < 0) {
                crayon.println(ligne1);
                ligne1 = lunette1.readLine();
            } else {
                if (ligne1.compareTo(ligne2) > 0) {
                    crayon.println(ligne2);
                    ligne2 = lunette2.readLine();
                } else {
                    crayon.println(ligne1);
                    ligne1 = lunette1.readLine();
                    ligne2 = lunette2.readLine();
                }
            }
            fini = ((ligne1 == null) || (ligne2 == null));
        }

        // les 2 boucles while sont pour parcourir le restant d'un des 2 fichiers s'il reste des lignes.
        while (!(ligne1 == null)) {
            crayon.println(ligne1);
            ligne1 = lunette1.readLine();
        }

        while (!(ligne2 == null)) {
            crayon.println(ligne2);
            ligne2 = lunette2.readLine();
        }

        lunette1.close();
        lunette2.close();
        crayon.close();
    }
}
