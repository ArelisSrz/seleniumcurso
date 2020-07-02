import java.util.Scanner;

public class practico4_ej2_1 {


        public static void main (String args []) {
            //Pedir el ingreso del nombre y el año de nacimiento. Mostrar el nombre y la edad de la persona.

            Scanner input = new Scanner(System.in); //TECLADO
            int año = 0;

            System.out.println("Ingrese su nombre");
            String nombre = input.nextLine();

            System.out.println("Ingrese su año de nacimiento");
            año = input.nextInt();

            int edad = 2020 - año;
            System.out.println("Su nombre es " + nombre + " y su edad es " + edad);

            System.out.println("El programa ha finalizado...");

        }

}
