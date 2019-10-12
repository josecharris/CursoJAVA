package Ejercicio;

public class Ejercicio2 {
	public static void main(String[] args) {
		int arr[][]={{1,1,1,1,1},{1,0,1,0,0},{1,1,1,1,1},{0,0,1,0,1},{1,1,1,1,1}};
		System.out.println(new Ejercicio2().calculate(arr));
	}
	
	public int calculate(int matriz[][]){
		int count=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				try{
					if(matriz[i][j]==0 &&matriz[i+1][j]==1&&matriz[i-1][j]==1&&matriz[i][j+1]==1&&
							matriz[i][j-1]==1){
						count++;
					}
				}catch(ArrayIndexOutOfBoundsException e){
					continue;
				}
			}
		}
		return count;
	}
}