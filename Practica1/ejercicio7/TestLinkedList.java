package ejercicio7;
import java.util.*;
/*
 * e. A la lista del punto 7d, agregue un nuevo estudiante. Antes de agregar, verifique que el
estudiante no estaba incluido en la lista.

f. Escriba un método que devuelva verdadero o falso si la secuencia almacenada en la
lista es o no capicúa:

public boolean esCapicua(ArrayList<Integer> lista)
Ejemplo:
3
Algoritmos y Estructuras de Datos
	● El método devuelve verdadero si la secuencia ingresada es: 2 5 2
	● El método devuelve falso si la secuencia ingresada es: 4 5 6 3 4




g. Considere que se aplica la siguiente función de forma recursiva. A partir de un número
n positivo se obtiene una sucesión que termina en 1:
Por ejemplo, para n= 6, se obtiene la siguiente sucesión:
f(6) = 6/2 = 3
f(3) = 3*3 + 1 = 10
f(10) = 10/2 = 5
Es decir, la sucesión 6, 3, 10, 5, 16, 8, 4, 2, 1. Para cualquier n con el que se arranque
siempre se llegará al 1.

■ Escriba un programa recursivo que, a partir de un número n, devuelva una lista
con cada miembro de la sucesión.
public class EjercicioSucesion {
public List<Integer> calcularSucesion (int n) {
//código
}
}

h. Implemente un método recursivo que invierta el orden de los elementos en un
ArrayList.
public void invertirArrayList(ArrayList<Integer> lista)

i. Implemente un método recursivo que calcule la suma de los elementos en un
LinkedList.
public int sumarLinkedList(LinkedList<Integer> lista)

j. Implemente el método “combinarOrdenado” que reciba 2 listas de números ordenados
y devuelva una nueva lista también ordenada conteniendo los elementos de las 2 listas.
public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,
ArrayList<Integer> lista2);
 */



 */
public class TestLinkedList {
	public static void
	public static LinkedList<Estudiante> copiarLista() {
		LinkedList<Estudiante> listaOriginal = new LinkedList<Estudiante>();
		 agregarEstudiante(listaOriginal, "Gomez", "Joaquin");
		 agregarEstudiante(listaOriginal, "Laucha", "Rodrigo");
		 agregarEstudiante(listaOriginal, "Boludo", "Peron");
		 LinkedList<Estudiante> copiaLista = new LinkedList<Estudiante> (listaOriginal);
		 copiaLista.get(0).setApellido("Tonto");
		 imprimirLista(listaOriginal);
		 imprimirLista(copiaLista);
		 return listaOriginal;
	}
	public static void agregarEstudiante(LinkedList<Estudiante> lista, String apellido, String nombre) {
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido(apellido);
		estudiante.setNombre(nombre);
		lista.add(estudiante);
	}
	public static void imprimirLista(LinkedList<Estudiante> lista) {
		for(int i = 0; i < lista.size(); i++) {
			Estudiante estudiante = lista.get(i);
			String apellido = estudiante.getApellido();
			String nombre= estudiante.getNombre();
			System.out.println(nombre + apellido);
		}
	}
	public static void main2 (String[] args) {
		LinkedList<Estudiante> lista = copiarLista();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del estudiante a agregar");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el apellido del estudiante a agregar");
		String apellido = scanner.nextLine();
		Estudiante nuevoEstudiante = new Estudiante();
		nuevoEstudiante.setApellido(apellido);
		nuevoEstudiante.setNombre(nombre);
		if(lista.contains(nuevoEstudiante)) {
			System.out.println("el Estudiante ya esta en la lista");
		}
		else {
			lista.add(nuevoEstudiante);
			System.out.println("Estudiante agregado con exito");
		}
	}
}

