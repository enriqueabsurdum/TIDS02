package ejercicios.basicos.E002.V01;

public class EB002_V01 {

    public static void main(String[] args) {

        int suma, producto, a = 2, b = 5, c = 8, d = 12;
        float media;

        suma = a + b + c + d;
        producto = a * b * c * d;
        media = (float) suma / 4;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado del producto es: " + producto);
        System.out.println("El resultado de la media es: " + media);
    }
}
