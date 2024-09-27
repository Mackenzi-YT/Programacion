package java_mack;
import java.util.*;
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int lado, resultado;

        System.out.println("Ingrese la medida del lado");
        lado = teclado.nextInt();

        resultado = lado * 4;

        System.out.println("EL perimetro de este cuadrado es de: "+resultado);

        teclado.close();
    }
}
