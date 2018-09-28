package ejercicios.basicos.E006.V01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EB006_V01 {

    public static void main(String[] args) throws IOException {
        double num, resultado;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Ingrese un número: ");
        num = Double.parseDouble(br.readLine());

        if (num > 0) {
            resultado = Math.sqrt(num);
            System.out.println("La raíz cudrada de " + num + " es: " + resultado);
        } else {
            System.out.println("El número ingresado es igual o menor a cero.");
        }
    }
}
