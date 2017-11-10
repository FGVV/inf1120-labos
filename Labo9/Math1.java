public class Math1 {
    public static double mathQ1 ( double a, double b, double c ) {
        double discriminant = (b * b) - (4 * a * c);
        return ( -b + Math.sqrt ( discriminant ) ) / (2 * a);
    }

    public static void main (String[] params) {
    } // main
} // Math1
