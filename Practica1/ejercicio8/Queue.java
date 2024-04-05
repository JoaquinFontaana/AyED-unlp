package ejercicio8;
import java.util.*;
public class Queue<T> extends Sequence{
	
	private List<T> data;
	
	public void Queue() {
		data = new LinkedList<T>();
	}
	public int size() {
		return data.size();
	}
	public void enqueue(T dato) {
		data.add(0, dato);
	}
	public T dequeue() {
		return data.remove(data.size()-1);
	}
	public T head() {
		return data.get(data.size()-1);
	}
	public boolean isEmpty() {
		return data.isEmpty();
	}
	public String toString() {
		String elementos = "Cola:";
		for(int i = 0; i < data.size(); i++) {
			elementos += ""
					+ i + ": "+ data.get(i);
		}
		return elementos;
	}
	
}
