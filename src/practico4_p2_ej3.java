import java.util.Scanner;

public class practico4_p2_ej3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = input.nextInt();

        System.out.println("La suma de los números pares entre 1 y el número ingresado es de " + sumaNumPares(num));

    }

    public static int sumaNumPares (int num){
        int suma = 0;
        for (int i=1; i<=num; i++){
            if (i%2==0){
                suma = suma + i;
            }
        }
        return suma;
    }
}





