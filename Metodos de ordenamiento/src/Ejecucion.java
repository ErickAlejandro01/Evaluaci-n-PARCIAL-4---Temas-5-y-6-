import java.util.Arrays;

class Ordenador{
	
	public void ordenadorInsercion(int[] numeros) {
		
		int aux;
		for(int i = 0; i < numeros.length; i++) {
			aux=numeros[i];
			for(int j=i-1; j > 0 && numeros[j] > aux ; j--) {
				numeros[j+1] = numeros [j];
				numeros[j] = aux;
				
				
			}
			
		}//Segundo for 
		
	}//Primero for 

}//Metodo 


class OrdenamientoPorSeleccion{
	
	public void ordenamientoSeleccion(int [] numeros) {
		for(int i = 0; i < numeros.length -1; i++) {
			for(int j = i; j< numeros.length; j++) {
				if(numeros[i] > numeros[j]) {
					int minimo = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = minimo;
					
				}
			}
		}
	}
}




























































public class Ejecucion {

	public static void main(String[] args) {
		

	}

}
