package ejercicios.ayudantia.U01.E003.V01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EA003_V01 {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String nombre;
        byte edad;

        System.out.print("Ingrese nombre: ");
        nombre = br.readLine();

        System.out.print("Ingrese edad: ");
        edad = Byte.parseByte(br.readLine());

        System.out.printf("Hola %s, tu edad es %s.\n", nombre, edad);
    }
}
