package ej6;

import ejercicio1y2.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol;

	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public BinaryTree<Integer> suma() {
		return sumaRec(this.arbol);
	}

	private static BinaryTree<Integer> sumaRec(BinaryTree<Integer> arbol) {
		int sumaHijos = 0;
		BinaryTree<Integer> arbolCopia = new BinaryTree<>(arbol.getData());
		if (!arbol.isLeaf()) {
			if (arbol.hasLeftChild()) {
				arbolCopia.addLeftChild(sumaRec(arbol.getLeftChild()));
				if (arbol.getLeftChild().isLeaf())
					sumaHijos += arbol.getLeftChild().getData();
				else
					sumaHijos += arbolCopia.getLeftChild().getData();
			}
			if (arbol.hasRightChild()) {
				arbolCopia.addRightChild(sumaRec(arbol.getRightChild()));
				if (arbol.getRightChild().isLeaf())
					sumaHijos += arbol.getRightChild().getData();
				else
					sumaHijos += arbolCopia.getRightChild().getData();
			}
			arbolCopia.setData(sumaHijos);
			return arbolCopia;
		} else {
			arbolCopia.setData(0);
			return arbolCopia;
		}
	}
}
