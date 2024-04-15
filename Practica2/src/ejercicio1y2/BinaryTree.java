package ejercicio1y2;

import Queue.Queue;

public class BinaryTree <T> {
	private T data = null;
	private BinaryTree<T> leftChild = null;
	private BinaryTree<T> rightChild = null;
	
	public BinaryTree(T data) {
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public BinaryTree<T> getLeftChild(){
		return this.leftChild;
	}
	public BinaryTree<T> getRightChild(){
		return this.rightChild;
	}
	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}
	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}
	public void removeLeftChild() {
		this.leftChild = null;
	}
	public void removeRightChild() {
		this.rightChild = null;
	}
	public boolean isEmpty() {
	 	if(data == null) {
			return true;
		}
	 	else return false;
	}
	public boolean hasLeftChild() {
		if(leftChild == null) {
			return false;
		}
		else return true;
	}
	public boolean hasRightChild() {
		if(rightChild == null) {
			return false;
		}
		else return true;
	}
	public boolean isLeaf() {
		if(!this.hasLeftChild() && !this.hasRightChild()) {
			return true;
		}
		else return false;
	}
	public String toString() {
		return ""+data;
	}
	public int contarHojas() {
		if(!this.isLeaf()) {
			int hojas = 0;
			if(this.hasLeftChild()) {
				hojas += this.leftChild.contarHojas();
			}
			if(this.hasRightChild()) {
				hojas += this.rightChild.contarHojas();
			}
			return hojas;
		}
		else return 1;
	}
	public BinaryTree<T> espejo(){
		if(!this.isLeaf()) {
			BinaryTree<T> nuevoArbol = new BinaryTree<T>(this.data);
			if(this.hasRightChild()) {
				BinaryTree<T> izquierdo = this.rightChild.espejo(); 
				nuevoArbol.addLeftChild(izquierdo);
			}
			if(this.hasLeftChild()) {
				BinaryTree<T> derecho = this.leftChild.espejo(); 
				nuevoArbol.addRightChild(derecho);
			}
			return nuevoArbol;
		}
		else{
			return new BinaryTree<T>(this.data);
		}
	}
	public void entreNiveles(int n,int m) {
		Queue<BinaryTree<T>> cola = new Queue<>();
		if(!this.isEmpty()) {
			cola.enqueue(this);
			cola.enqueue(null);
			int nivelActual=0;
			while(!cola.isEmpty()) {
				BinaryTree<T> currentNode = cola.dequeue();
				if(currentNode != null) {
					if(nivelActual >= n && nivelActual <= m) {
						System.out.println(currentNode.data);
					}
					if(currentNode.hasLeftChild()) {
						cola.enqueue(currentNode.leftChild);
					}
					if(currentNode.hasRightChild()) {
						cola.enqueue(currentNode.rightChild);
					}
				}
				else {
					nivelActual++;
					if(!cola.isEmpty())
						cola.enqueue(null);
				}
			}
		}
	}
}
