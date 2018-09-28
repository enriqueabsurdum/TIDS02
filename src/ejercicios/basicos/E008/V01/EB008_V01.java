package ejercicios.basicos.E008.V01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EB008_V01 {

    public static void main(String[] args) throws IOException {
        long num;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Ingrese un número: ");
        num = Long.parseLong(br.readLine());

        if (num == 0) {
            System.out.println("El número ingresado es igual a cero.");
        } else if (num > 0) {
            System.out.println("El número ingresado es mayor a cero.");
        } else {
            System.out.println("El número ingresado es menor a cero.");
        }
    }
}
