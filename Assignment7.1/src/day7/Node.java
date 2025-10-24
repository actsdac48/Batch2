package day7;

public class Node<T> {
	Node<T> previous;
	
	Node<T> next;
	
	T data;

	public Node(T data) {
		this.data=data;
	}
}
