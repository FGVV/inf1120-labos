
/**
 *  INF1120 - Labo 3 - Question #4
 *
 *  @name Vincent Lirette
 */

import java.text.*; // pour utiliser DecimalFormat pour l'affichage de nombres reels

public class Q4Taxes {

    final static double TPS = 0.06;
    final static double TVQ = 0.075;

    public static DecimalFormat dec2 = new DecimalFormat ( "0.00" );  // pour l'affichage de reels avec deux decimales

    public static void main (String[] params) {
        double montant;
        double tps = 0;
        double tvq = 0;
        char repOuiNon;

        System.out.print("Entrez un montant (0 pour terminer) : ");
        montant = Clavier.lireDouble();

        while (montant != 0){

            System.out.print("Est-ce que la TPS s'applique ('O', 'o', 'N', 'n') ? ");
            repOuiNon = Character.toUpperCase(Clavier.lireCharLn());

            if(repOuiNon == 'O'){
                tps = montant * TPS;
                System.out.println("TPS = " + dec2.format(tps));
            }

            System.out.print("Est-ce que la TVQ s'applique ('O', 'o', 'N', 'n') ? ");
            repOuiNon = Character.toUpperCase(Clavier.lireCharLn());

            if(repOuiNon == 'O'){
                tvq = (montant + tps) * TVQ;
                System.out.println("TVQ = " + dec2.format(tvq));
            }

            System.out.println("Montant total (avec taxe(s) si applicable) = " + dec2.format((montant + tps + tvq)));

            System.out.print("Entrez un montant (0 pour terminer) : ");
            montant = Clavier.lireDouble();

        }//end while

    } // main
} // Q4Taxes
