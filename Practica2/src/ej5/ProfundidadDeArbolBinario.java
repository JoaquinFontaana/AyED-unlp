package ej5;
import ejercicio1y2.BinaryTree;
import Queue.Queue;
public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> arbol;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer> arbol){
		this.arbol = arbol;
	}
	
	public int sumaElementosProfundidad(int p) {
		Queue<BinaryTree<Integer>> cola = new Queue<>();
		int profundidad = -1;
		cola.enqueue(null);
		cola.enqueue(this.arbol);
		int suma = 0;
		while(!cola.isEmpty() && profundidad <= p) {
			BinaryTree<Integer> nodoActual = cola.dequeue();
			if(nodoActual != null) {
				if(profundidad == p) {
					suma+=nodoActual.getData();
				}
				if(nodoActual.hasLeftChild()) {
					cola.enqueue(nodoActual.getLeftChild());
				}
				if(nodoActual.hasRightChild()) {
					cola.enqueue(nodoActual.getRightChild());
				}
			}
			else if(!cola.isEmpty()) {
				profundidad++;
				cola.enqueue(null);
			}
		}
		return suma;
	}
}
