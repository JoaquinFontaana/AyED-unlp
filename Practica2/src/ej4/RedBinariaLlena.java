package ej4;
import ejercicio1y2.BinaryTree;
import Queue.Queue;
public class RedBinariaLlena {
	private BinaryTree<Integer> arbol;
	
	public RedBinariaLlena(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int retardoReenvio() {
		int retardo = 0;
		int mayor = -9999;
		Queue<BinaryTree<Integer>> cola = new Queue<>();
		if(!this.arbol.isLeaf()) {
			cola.enqueue(this.arbol);
			cola.enqueue(null);
			while(!cola.isEmpty()) {
				BinaryTree<Integer> nodoActual = cola.dequeue();
				if(nodoActual != null) {
					if(mayor <= nodoActual.getData()) {
						mayor=nodoActual.getData();
					}
					if(nodoActual.hasLeftChild()) {
						cola.enqueue(nodoActual.getLeftChild());
					}
					if(nodoActual.hasRightChild()) {
						cola.enqueue(nodoActual.getRightChild());
					}
				}
				else if(!cola.isEmpty()) {
					retardo+=mayor;
					mayor=0;
					cola.enqueue(null);
				}
			}
		}
		return retardo;
	}
}
