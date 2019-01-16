/**
 *  INF1120 - Labo 2 
 *  
 *  @name Vincent Lirette
 */
public class Labo2_3V2 {

    public static void main (String[] params) {
        int nbSecondes = 0;      // nombre de secondes apres calculs
        int nbMinutes = 0;       // nombre de minutes apres calculs
        int nbHeures = 0;        // nombre de heures apres calculs
        int nbJours = 0;         // nombre de jours apres calculs

        System.out.print ( "Entrez un nombre de secondes (0 pour terminer) : " );
        nbSecondes = Clavier.lireInt();

        while (nbSecondes < 0){
            System.out.println("Erreur: le nombre de secondes doit etre positif!\n");
            System.out.print ( "Entrez un nombre de secondes (0 pour terminer) : " );
            nbSecondes = Clavier.lireInt();
        }

        while (nbSecondes != 0) {
            nbMinutes = nbSecondes / 60;
            nbSecondes = nbSecondes % 60;
            nbHeures = nbMinutes / 60;
            nbMinutes = nbMinutes % 60;
            nbJours = nbHeures / 24;
            nbHeures = nbHeures % 24;

            System.out.println("\nnbJours: " + nbJours 
                                + "\tnbHeures: " + nbHeures 
                                + "\tnbMinutes: " + nbMinutes 
                                + "\tnbSecondes: " + nbSecondes + "\n");

            System.out.print ( "Entrez un nombre de secondes (0 pour terminer) : " );
            nbSecondes = Clavier.lireInt();

            while (nbSecondes < 0){
                System.out.println("Erreur: le nombre de secondes doit etre positif!");
                System.out.print ( "Entrez un nombre de secondes (0 pour terminer) : " );
                nbSecondes = Clavier.lireInt();
            }
        }

    } // main
} // Labo2_3V2
