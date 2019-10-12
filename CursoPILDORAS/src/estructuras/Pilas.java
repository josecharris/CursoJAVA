package estructuras;

import java.util.Stack;

/*
 * Pilas
 * push
 * pop
 * peek
 * empty
 * */
public class Pilas {
	public static void main(String[] args) {
		Stack pila = new Stack();
		pila.push(50);
		pila.push("Cadena");
		pila.push(49);
		pila.push("Caden");
		pila.push(48);
		pila.push("Cade");
		System.out.println(pila.pop());
		System.out.println(pila.peek());
		System.out.println(pila.search("Cadena"));
	}
}
