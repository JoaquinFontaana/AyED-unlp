package ejercicio2;

/*
 * Escriba un método de clase que dado un número n devuelva un nuevo arreglo de tamaño n
con los n primeros múltiplos enteros de n mayores o iguales que 1.
Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {n*k donde k : 1..k}
Agregue al programa la posibilidad de probar con distintos valores de n ingresandolos por
teclado, mediante el uso de System.in. La clase Scanner permite leer de forma sencilla
valores de entrada.
Ayuda: Como ejemplo de uso, para contar la cantidad de números leídos hasta el
primer 42 se puede hacer:
import java.util.Scanner;
public class Contador {
public static int contar42 ( ) {
Scanner s = new Scanner(System.in) ;
int cantidad = 1 ;
while (s.nextInt() != 42) {
cantidad++;
}
return cantidad;
}
}
 */
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 42) {
            ArrayList<Integer> multiplos = operaciones.numberMultiplosArray(n);
            System.out.println("Múltiplos de " + n + ": " + multiplos);
            n = scanner.nextInt();
        }
        scanner.close();
    }
}
