package java_mack;
import java.util.*;
public class ejemplar {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3, num4, resultado1, resultado2;
    System.out.println("Ingrese el 1er numero");
    num1 = teclado.nextInt();
    System.out.println("Ingrese el 1er numero");
    num2 = teclado.nextInt();
    System.out.println("Ingrese el 1er numero");
    num3 = teclado.nextInt();
    System.out.println("Ingrese el 1er numero");
    num4 = teclado.nextInt();

    resultado1 = num1 + num2;
    resultado2 = num3 * num4;

    System.out.println("La suma de los 2 primeros numeros es: "+resultado1);
    System.out.println("El producto de los ultimos 2 numeros es: "+resultado2);
   }
    
}
