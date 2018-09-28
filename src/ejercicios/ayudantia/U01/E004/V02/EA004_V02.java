package ejercicios.ayudantia.U01.E004.V02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EA004_V02 {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        long numero;
        byte antecesor, sucesor;

        do {
            System.out.print("Ingrese un número (entre -100 y 100): ");
            numero = Long.parseLong(br.readLine());
            if (numero >= -100 && numero <= 100) {
                antecesor = (byte) (numero - 1);
                sucesor = (byte) (numero + 1);
                System.out.println("El antecesor del número " + numero + " es " + antecesor);
                System.out.println("El sucesor del número " + numero + " es " + sucesor);
            } else {
                System.out.println("Número no válido.");
            }
        } while (!(numero >= -100 && numero <= 100));
    }
}
