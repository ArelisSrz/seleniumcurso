import java.util.Scanner;

public class practico4_ej4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = input.nextInt();

        System.out.println("Ingrese el otro número: ");
        int num2 = input.nextInt();

        System.out.println("La suma es " + sumar(num1, num2));
    }

    public static int sumar (int num1, int num2){
        return num1 + num2;
    }
}
