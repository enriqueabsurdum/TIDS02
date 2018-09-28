package ejercicios.ayudantia.U01.E002.V01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EA002_V01 {
    
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int numero, sucesor;

        System.out.print("Ingrese un número: ");
        numero = Integer.parseInt(br.readLine());
        sucesor = numero + 1;

        System.out.println("El sucesor del número " + numero + " es " + sucesor);
    }
}
