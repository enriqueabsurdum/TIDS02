package ejercicios.basicos.E001.V02;

import java.util.Scanner;

public class EB001_V02 {

    public static void main(String[] args) {

        final double PI = 3.141592;
        double area, radio;

        Scanner sc = new Scanner(System.in);

        System.out.print("El radio del círculo es: ");
        radio = sc.nextDouble();

        area = PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
        sc.close();
    }
}
