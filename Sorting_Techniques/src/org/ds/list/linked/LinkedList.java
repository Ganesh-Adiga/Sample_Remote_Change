package org.ds.list.linked;

public class LinkedList<T> {
	
	Node<T> head = null;
	
	
	public void add(T t){
		
		Node<T> newNode = new Node<T>(t);
		
		if(head == null){
			head = newNode;
		}
		else{			
			newNode.setNext(head);
			head = newNode;
		}
		
	}
	
	
	public void printList() {
		Node<T> node = this.head;
		
		while(node!= null){
			System.out.println(node.getValue());
			node= node.getNext();
		}
	
	}
	class Node<T>{
		T value;
		Node<T> next;
		public Node(T value){
			this.value = value;			
		}
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		
	}

}
