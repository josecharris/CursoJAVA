package Colas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*COLAS
 * 3 METODOS
 * Añadir : push
 * peek : devuelve el primer valor
 * pop: devuelve y borra
 * FIFO : Firs in first out
 * */
public class Queue{
	public NodeQueue head;
	public int size;
	
	public Queue(){
		head = null;
		size = 0;
	}
	
	public void push(int element){
		NodeQueue node = new NodeQueue();
		node.value = element;
		if(size==0){
			this.head = node;
			this.size++;
		}else{
			NodeQueue aux = head;
			while(aux.next!=null){
				aux=aux.next;
			}
			aux.next=node;
			size++;
		}
	}
	public int pop(){
		int value = head.value;
		head = head.next;
		System.gc();
		size--;
		return value;
	}
	
	public ArrayList<Integer> getRegistros(){
		ArrayList<Integer> values = new ArrayList<>();
		NodeQueue auxiliar = head;
		while(auxiliar.next!=null){
			values.add(auxiliar.value);
			auxiliar = auxiliar.next;
		}
		values.add(auxiliar.value);
		return values;
	}
	
	public int peek(){
		return head.value;
	}
	
	public static void main(String[] args) {
		Queue cola = new Queue();
		cola.push(1);
		cola.push(2);
		cola.push(3);
		cola.push(4);
		for(int element : cola.getRegistros()){
			System.out.println(element);
		}
		System.out.println(cola.peek());
		cola.pop();
		System.out.println(cola.peek());
		System.out.println("Comienzo");System.out.println();
		for (int reg : cola.getRegistros()) {
			System.out.println(reg);
		}
	}
	
	
}