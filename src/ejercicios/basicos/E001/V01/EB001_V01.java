package ejercicios.basicos.E001.V01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EB001_V01 {

    public static void main(String[] args) throws IOException {
        
        final double PI = 3.141592;
        double area, radio;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("El radio del círculo es: ");
        radio = Double.parseDouble(br.readLine());

        area = PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}
