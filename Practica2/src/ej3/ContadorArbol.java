package ej3;
import ejercicio1y2.BinaryTree;
import java.util.*;
public class ContadorArbol<T> {
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	public LinkedList<Integer> numerosParesInOrden(){
		LinkedList<Integer> lista = new LinkedList<>();
		numerosParesInOrdenRec(this.arbol,lista);
		return lista;
	}
	
	private static void numerosParesInOrdenRec(BinaryTree<Integer> arbolRecorrer,LinkedList<Integer> listaPares){
		if(!arbolRecorrer.isLeaf()) {
			if(arbolRecorrer.hasLeftChild()) {
				numerosParesInOrdenRec(arbolRecorrer.getLeftChild(), listaPares);
			}
			if(arbolRecorrer.getData() % 2 == 0) {
				listaPares.add(arbolRecorrer.getData());
			}
			if(arbolRecorrer.hasRightChild()) {
				numerosParesInOrdenRec(arbolRecorrer.getRightChild(), listaPares);;
		}
	}
		else {
			if(arbolRecorrer.getData() % 2 == 0) {
				listaPares.add(arbolRecorrer.getData());
			}
		}
	}
	
	public LinkedList<Integer> numerosParesPostOrden(){
		LinkedList<Integer> lista = new LinkedList<>();
		numerosParesPostOrdenRec(this.arbol,lista);
		return lista;
	}
	
	private static void numerosParesPostOrdenRec(BinaryTree<Integer> arbolRecorrer, LinkedList<Integer> lista) {
		if(!arbolRecorrer.isLeaf()) {
			if(arbolRecorrer.hasLeftChild()) {
				numerosParesPostOrdenRec(arbolRecorrer.getLeftChild(),lista);
			}
			if(arbolRecorrer.hasRightChild()) {
				numerosParesPostOrdenRec(arbolRecorrer.getRightChild(),lista);
			}
			if(arbolRecorrer.getData() % 2 == 0) {
				lista.add(arbolRecorrer.getData());
			}
		}
		else if(arbolRecorrer.getData() % 2 == 0) {
			lista.add(arbolRecorrer.getData());
		}
	}
	
}
