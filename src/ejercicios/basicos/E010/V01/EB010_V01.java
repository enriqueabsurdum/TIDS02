package ejercicios.basicos.E010.V01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EB010_V01 {

    public static void main(String[] args) throws IOException {
        long a, b, c, menor, medio, mayor;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Ingrese el primer número: ");
        a = Long.parseLong(br.readLine());
        System.out.print("Ingrese el segundo número: ");
        b = Long.parseLong(br.readLine());
        System.out.print("Ingrese el tercer número: ");
        c = Long.parseLong(br.readLine());

        if (a > b && a > c) {
            mayor = a;
            if (b > c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            mayor = b;
            if (a > c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            mayor = c;
            if (a > b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        System.out.println("Número menor: " + menor);
        System.out.println("Número medio: " + medio);
        System.out.println("Número mayor: " + mayor);
    }
}
