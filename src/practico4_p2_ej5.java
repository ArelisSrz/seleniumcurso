import java.util.Scanner;

public class practico4_p2_ej5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = input.nextInt();

        System.out.println("El factorial es " + factorial(num));

    }

    public static int factorial (int num){
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        return num;
    }
}