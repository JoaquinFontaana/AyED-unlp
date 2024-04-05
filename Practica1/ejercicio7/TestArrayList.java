package ejercicio7;
import java.util.*;

public class TestArrayList {
	public static void imprimirArray(ArrayList<Integer> numeros) {
		for(Integer numero: numeros) {
			System.out.println(numero);
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (String arg: args) {
			numeros.add(Integer.parseInt(arg));
		}
		TestArrayList.imprimirArray(numeros);
	}
}
