import java.util.Scanner;

public class practico4_ej2 {

    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = input.nextInt();

        if (esMayor(numero) == true){
            System.out.println("El numero ingresado es mayor a 20");
        } else{
            System.out.println("El numero ingresado es menor a 20");
        }

    }

    public static boolean esMayor (int numero){
        if (numero > 20){
            return true;
        }else {
            return false;

        }
    }
}