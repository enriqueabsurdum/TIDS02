package ejercicios.basicos.E002.V02;

public class EB002_V02 {

    public static void main(String[] args) {

        int suma, producto, a = 2, b = 5, c = 8, d = 12;
        float media;

        suma = a + b + c + d;
        producto = a * b * c * d;
        media = (float) suma / 4;

        System.out.printf("El resultado de la suma es: %s\n", suma);
        System.out.printf("El resultado del producto es: %s\n", producto);
        System.out.printf("El resultado de la media es: %s\n", media);
    }
}
