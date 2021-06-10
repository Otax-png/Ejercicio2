import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Number;

        System.out.println("Ingrese un numero entero");
        Number = entrada.nextInt();

        for (int i = Number; i >= 1; i--) {
            System.out.println("");
            System.out.println(i);
        }

    }
}