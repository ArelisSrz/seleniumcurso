import java.util.Scanner;

public class practico4_p2_ej4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el lado1");
        int lado1 = input.nextInt();

        System.out.println("Ingrese el lado2");
        int lado2 = input.nextInt();

        System.out.println("Ingrese el lado3");
        int lado3 = input.nextInt();

        tipoTriangulo(lado1, lado2, lado3);
    }

    public static void tipoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es Equilatero");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado2) {
            System.out.println("Es Escaleno");
        } else{
            System.out.println("Es Isosceles");
        }

    }
}