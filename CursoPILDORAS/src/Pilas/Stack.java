package Pilas;

public class Stack {
	public NodeStack head;
	private int size;
	
	public Stack(){
		this.head = null;
		this.size = 0;
	}
	
	public void push(int element){
		NodeStack node = new NodeStack();
		node.value = element;
		if(size==0){
			head = node;
			this.size++;
		}else{
			node.next = head;
			head = node;
			size++;
		}
	}
	
	public int peek(){
		return head.value;
	}
	
	public int size(){
		return size;
	}
	
	public int delete(NodeStack node){
		int aux = node.value;
		if(node==head){
			head = head.next;
		}else{
			NodeStack aux2 = head;
			while(aux2.next != node){
				aux2 = aux2.next;
			}
			aux2.next = node.next;
		}
		System.gc();
		size--;
		return aux;
	}
	
	public static void main(String[] args) {
		Stack pila = new Stack();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		System.out.println(pila.peek());
		System.out.println(pila.size());
		System.out.println("POST");
		pila.delete(new NodeStack());
		
	}
	
}
