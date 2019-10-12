package Listas;

public class List<T> {
	private Node<T> head;
	
	public List(){
		this.head = null;
	}
	
	public void push(T element){
		Node<T> aux = new Node<T>();
		aux.person=element;
		if(head==null){
			head=aux;
		}else{
			Node<T> aux2 = head;
			while(aux2.next!=null){
				aux2=aux2.next;
			}
			aux2.next = aux;
		}
	}
	
	public T pop(){
		return head.person;
	}
	
	public static void main(String[] args) {
		List<Person> lista = new List<>();
		lista.push(new Person("Jose", 12, "1232"));
		lista.push(new Person("Angel", 12, "1233"));
		lista.push(new Person("Charris", 12, "1234"));
		System.out.println(lista.pop().getName());
	}
}
