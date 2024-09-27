package java_mack;
import java.util.*;
public class ejemplacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precio, total;
        int cantidad;

        System.out.println("Ingrese la cantidad de el producto que va a llevar");
        cantidad = teclado.nextInt();

        System.out.println("Ingrese el precio del producto a llevar");
        precio = teclado.nextDouble();

        total = precio * cantidad;
        System.out.println("El total a pagar es: "+total);
    }
}
