package ejercicios.basicos.E009.V01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EB009_V01 {

    public static void main(String[] args) throws IOException {
        long num;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Ingrese un número: ");
        num = Long.parseLong(br.readLine());

        if (num > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (num < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es igual a cero.");
        }
    }
}
