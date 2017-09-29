public class Labo2_3 {
    public static void main (String[] params){
        int nbSecondes = 0;
        int nbMinutes = 0;
        int nbHeures = 0;
        int nbJours = 0;
        System.out.print("Entrez un nombre de secondes: ");
        nbSecondes = Clavier.lireInt();

        while(nbSecondes < 0){
            System.out.println("Erreur: Nombre negatif");
            System.out.print("Entrez un nombre de secondes: ");
            nbSecondes = Clavier.lireInt();
        }

        while(nbSecondes != 0){
            nbMinutes = nbSecondes / 60;
            nbSecondes = nbSecondes % 60;
            nbHeures = nbMinutes / 60;
            nbMinutes = nbMinutes % 60;
            nbJours = nbHeures / 24;
            nbHeures = nbHeures % 24;
            System.out.println("nbJours = " + nbJours);
            System.out.println("nbHeures = " + nbHeures);
            System.out.println("nbMinutes = " + nbMinutes);
            System.out.println("nbSecondes = " + nbSecondes);
            nbSecondes = Clavier.lireInt();
            while(nbSecondes < 0){
                System.out.println("Erreur: Nombre negatif");
                System.out.print("Entrez un nombre de secondes: ");
                nbSecondes = Clavier.lireInt();
            }
        }
        //System.out.print("FIN DE PROGRAMME");
    }//main
}//class
