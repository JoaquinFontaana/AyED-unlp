package ejParciales;

import java.util.ArrayList;

import ejercicio1y2.BinaryTree;
/*
 1. No puede agregar más variables de instancia ni de clase a la clase ParcialArboles.
2. Debe respetar la clase y la firma del método indicado.
3. Puede definir todos los métodos y variables locales que considere necesarios.
4. Todo método que no esté definido en la sinopsis de clases debe ser implementado.
5. Debe recorrer la estructura solo 1 vez para resolverlo.
6. Si corresponde, complete en la firma del método el tipo de datos indicado con signo de “?”

Escribir en una clase ParcialArboles que contenga UNA ÚNICA variable de instancia de tipo
BinaryTree de valores enteros NO repetidos y el método público con la siguiente firma:
public boolean isLeftTree (int num)
El método devuelve true si el subárbol cuya raíz es “num”, tiene en su subárbol izquierdo una
cantidad mayor estricta de árboles con un único hijo que en su subárbol derecho. Y false en caso
contrario. Consideraciones:
● Si “num” no se encuentra en el árbol, devuelve false.
● Si el árbol con raíz “num” no cuenta con una de sus ramas, considere que en esa rama hay
-1 árboles con único hijo.
 */

public class ParcialArboles {
	private BinaryTree<Integer> arbol;

	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public boolean isLeftTree(int num) {
		BinaryTree<Integer> arbolRecorrer = buscarElemento(num, this.arbol);
		if (arbolRecorrer == null || arbolRecorrer.isLeaf()) {
			return false;
		}
		ArrayList<Integer> cantidadLados = new ArrayList<>();
		cantidadLados.add(0);// izquierda
		cantidadLados.add(0);// derecha
		contarHijos(num, cantidadLados, "", arbolRecorrer);
		return (cantidadLados.get(0) > cantidadLados.get(1));
	}

	private static BinaryTree<Integer> buscarElemento(int num, BinaryTree<Integer> arbol) {
		BinaryTree<Integer> arbolBuscado = null;
		if (arbol.getData() == num) {
			return arbol;
		} else if (!arbol.isLeaf()) {
			if (arbol.hasLeftChild()) {
				arbolBuscado = buscarElemento(num, arbol.getLeftChild());
				if (arbolBuscado != null) {
					return arbolBuscado;
				}
			}
			if (arbol.hasRightChild()) {
				arbolBuscado = buscarElemento(num, arbol.getRightChild());
				if (arbolBuscado != null) {
					return arbolBuscado;
				}
			}
		}
		return null;
	}

	private static void contarHijos(int num, ArrayList<Integer> cantidadLados, String lado, BinaryTree<Integer> arbol) {
		if (arbol.getData() == num) {
			if (arbol.hasRightChild())
				contarHijos(num, cantidadLados, "derecha", arbol.getRightChild());
			else
				cantidadLados.set(1, -1);

			if (arbol.hasLeftChild())
				contarHijos(num, cantidadLados, "izquierda", arbol.getLeftChild());
			else
				cantidadLados.set(0, -1);
		} else {
			if (!arbol.isLeaf()) {
				if (arbol.hasRightChild()) {
					contarHijos(num, cantidadLados, lado, arbol.getRightChild());
				}
				if (arbol.hasLeftChild()) {
					contarHijos(num, cantidadLados, lado, arbol.getLeftChild());
				}
			} else {
				if (lado.equals("derecha")) {
					cantidadLados.set(1, cantidadLados.get(1) + 1);
				} else {
					cantidadLados.set(0, cantidadLados.get(0) + 1);
				}
			}
		}
	}

	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		boolean iguales = false;
		if (arbol1.getData().equals(arbol2.getData())) {
			iguales = true;
		} else
			return iguales;
		if (!arbol1.isLeaf()) {
			if (arbol1.hasLeftChild()) {
				if (!arbol2.hasLeftChild()) {
					return false;
				} else {
					iguales = esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild());
				}
			}
			if (arbol1.hasRightChild()) {
				if (!arbol2.hasRightChild()) {
					return false;
				} else {
					iguales = esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
				}
			}
			return iguales;
		} else {
			return iguales;
		}
	}

	public BinaryTree<ArrayList<Integer>> sumAndDif(BinaryTree<Integer> arbol) {

	}
}
