package Th2;

public class Proceso extends Thread{
	
	private int num_limit;
	
	@Override
	public void run(){
		for (int i = 0; i <= num_limit; i++) {
			System.out.println(i);
		}
	}
	
	public void setLimit(int num){
		num_limit = num;
	}
}
