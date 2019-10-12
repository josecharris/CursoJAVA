package Th;

public class FirstProcess extends Thread{
	
	private boolean state=true;
	private static int segundos = 0;
	
	@Override
	public void run(){
		while(getEstado()){
			try {
				System.out.println("Corriendo ...");
				Thread.sleep(1000);
				segundos++;
				if(segundos>=10){
					System.out.println("Seg : "+segundos);
					state=false;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean getEstado(){
		return state;
	}
	
	public void setEstado(boolean estado){
		this.state = estado;
	}
	
}
