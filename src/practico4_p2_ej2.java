import java.util.Scanner;
public class practico4_p2_ej2 {
    private static final float MILLAS = (float) 1.6;
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número en kilómetros: ");
        int km = input.nextInt();

        System.out.println("El equivalente a millas es " + convertirAMillas(km));
    }

    public static float convertirAMillas (int km){
        double millas = MILLAS * km;
        return (float) millas;
    }
}