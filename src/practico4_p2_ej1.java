import java.util.Scanner;

public class practico4_p2_ej1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese el máximo: ");
        int max = input.nextInt();
        System.out.println("Ingrese el mínimo: ");
        int min = input.nextInt();
        System.out.println("Ingrese un número: ");
        int num = input.nextInt();


        if (numValido(num,max,min) == true){
            System.out.println("El número es válido");
        }else{
            System.out.println("El número está fuera de rango");
        }
    }

    public static boolean numValido (int num, int max, int min){
        if (num > min && num < max){
            return true;
        }else {
            return false;
        }
    }
}



