package Th2;

public class ClasePrincipal {
	public static void main(String[] args) {
		Proceso hilo = new Proceso();
		Proceso hilo2 = new Proceso();
		hilo.setLimit(4);
		hilo2.setLimit(10);
		hilo.start();
		hilo2.start();
	}
}