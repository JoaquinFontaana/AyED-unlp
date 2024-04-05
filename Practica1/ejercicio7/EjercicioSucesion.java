package ejercicio7;
import java.util.*;
/*
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
public class EjercicioSucesion {
	
	public static LinkedList<Integer> calcularSucesion(int n){
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(n);
		if(n != 1) {
			if ((n % 2 ) == 0) {
				LinkedList<Integer> listaActualizada = calcularSucesion(n/2);
				lista.addAll(listaActualizada);
			}
			else {
				LinkedList<Integer> listaActualizada = calcularSucesion((n*3)+1 );
				lista.addAll(listaActualizada);
			}
			return lista;
		}
		else {
			return lista;
		}
	}
	public static void imprimirLista(LinkedList<Integer> lista) {
		for(int i= 0; i< lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}	
	public static void imprimirArrayList(ArrayList<Integer> lista) {
		for(int i= 0; i< lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	public static void invertirArray (ArrayList<Integer> lista,int der,int izq) {
			if(der != izq) {
				int numDer = lista.get(der);
				int numIzq = lista.get(izq);
				lista.set(izq, numDer);
				lista.set(der, numIzq);
				invertirArray(lista,der+1,izq-1);
			}
	}
	public static int sumarLinkedList(LinkedList<Integer> lista,int i,int total) {
		total += lista.get(i);
		if(i != lista.size()-1) {
			total = sumarLinkedList(lista,i+1,total);
			return total;
		}
		else {
			return total;
		}
	}
	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        int a = 0;
        int b = 0;
        ArrayList<Integer> listaCombinada = new ArrayList<Integer>();
        
        while (a < lista1.size() && b < lista2.size()) {
            int num = lista1.get(a);
            int num2 = lista2.get(b);
            
            if (num < num2) {
                listaCombinada.add(num);
                a++;
            } else {
                listaCombinada.add(num2);
                b++;
            }
        }

        // Agregar los elementos restantes de lista1 si los hay
        while (a < lista1.size()) {
            listaCombinada.add(lista1.get(a));
            a++;
        }

        // Agregar los elementos restantes de lista2 si los hay
        while (b < lista2.size()) {
            listaCombinada.add(lista2.get(b));
            b++;
        }

        return listaCombinada;
    }

    public static void main(String[] args) {
        LinkedList<Integer> lista = calcularSucesion(6);
        imprimirLista(lista);
        System.out.println(sumarLinkedList(lista, 0, 0));

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(7);
        lista1.add(9);
        lista1.add(20);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(4);
        lista2.add(6);
        lista2.add(8);
        lista2.add(10);
        lista2.add(12);
        lista2.add(14);

        ArrayList<Integer> listaCombinada = combinarOrdenado(lista1, lista2);
        System.out.println("Lista combinada:");
        imprimirArrayList(listaCombinada);
    }
}