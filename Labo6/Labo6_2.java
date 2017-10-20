public class Labo6_2 {

    public static void afficherNfois (int nbFois, char carac) {
        for(int i = 1; i <= nbFois; i++) {
            System.out.print (carac + " ");
        }
    }

    public static void afficherRectangle (int largeur, int hauteur) {
        if(largeur <= 0 || hauteur <= 0) {
            System.out.println("*Erreur: largeur et/ou hauteur invalide(s).");
        } else {
            // Afficher la ligne du haut
            afficherNfois(largeur, '*');
            System.out.print("\n");

            // Afficher le milieu
            for(int ligne = 1; ligne <= hauteur - 2; ligne++) {
                afficherVide(largeur);
                System.out.print("\n");
            }

            // Afficher la ligne du bas s'il y a lieu ( hauteur > 1 )
            if(hauteur > 1) {
                afficherNfois(largeur, '*');
                System.out.print("\n");
            }
        }
    }

    public static void afficherCarre  (int cote) {
        if(cote <= 0) {
            System.out.println("*Erreur: cote invalide.");
        } else {
            afficherRectangle(cote, cote);
        }
    }    

    public static void afficherTriangleIsoGauche (int hauteur){
        if(hauteur <= 0) {
            System.out.println("*Erreur: hauteur invalide.");
        } else {
            System.out.println("*");

            for(int i = 2; i < hauteur; i++) {
                afficherVide(i);
                System.out.print("\n");
            }

            if(hauteur > 1) {
                afficherNfois(hauteur, '*');
                System.out.print("\n");
            }
        }
    }

    public static void afficherVide (int largeur) {
        afficherNfois(1, '*');
        afficherNfois(largeur - 2, ' ');
        if(largeur > 1) {
            afficherNfois(1, '*');
        }
    }
    
    public static void afficherTriangleIsoDroit (int hauteur){
        if(hauteur <= 0) {
            System.out.println("*Erreur: hauteur invalide.");
        } else {
            afficherNfois(hauteur - 1, ' ');
            System.out.println("*");

            for(int i = 2; i < hauteur; i++) {
                afficherNfois(hauteur - i, ' ' );
                afficherVide(i);
                System.out.print("\n");
            }

            if(hauteur > 1) {
                afficherNfois(hauteur, '*');
                System.out.print("\n");
            }
        }
    }

    public static void afficherTriangleEqui (int hauteur) {
        if(hauteur <= 0) {
            System.out.println("*Erreur: hauteur invalide.");
        } else {
            afficherNfois(hauteur - 1, ' ');
            System.out.println("*");

            for(int i = 2; i < hauteur; i++) {
                afficherNfois(hauteur - i, ' ');
                afficherVide(2 * i - 1);
                System.out.print("\n");
            }

            if(hauteur > 1) {
                afficherNfois(2 * hauteur - 1, '*');
                System.out.print("\n");
            }
        }
    }
}
