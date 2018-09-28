package ejercicios.basicos.E007.V01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EB007_V01 {

    public static void main(String[] args) throws IOException {
        long a, b, c;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Ingrese el primer número: ");
        a = Long.parseLong(br.readLine());
        System.out.print("Ingrese el segundo número: ");
        b = Long.parseLong(br.readLine());
        System.out.print("Ingrese el tercer número: ");
        c = Long.parseLong(br.readLine());

        if (a > b && a > c) {
            System.out.println("El número mayor es: " + a);
        } else if (b > a && b > c) {
            System.out.println("El número mayor es: " + b);
        } else if (c > a && c > b) {
            System.out.println("El número mayor es: " + c);
        } else {
            System.out.println("Ninǵun número es mayor.");
        }
    }
}
