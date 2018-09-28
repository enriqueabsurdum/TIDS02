package ejercicios.basicos.E003.V01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EB003_V01 {

    public static void main(String[] args) throws IOException {
        long num1, num2;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Ingrese el primer número: ");
        num1 = Long.parseLong(br.readLine());
        System.out.print("Ingrese el segundo número: ");
        num2 = Long.parseLong(br.readLine());

        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
        }
    }
}
