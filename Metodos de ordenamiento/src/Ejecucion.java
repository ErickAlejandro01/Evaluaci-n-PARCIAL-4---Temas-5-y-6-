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
class PruebaQuicksort{
	int [] quicksort(int[ ] array, int izq, int der) {
		int pivote = array[izq];
		int i = izq, j = der;
		int aux;
		while(i<j) {
			while(array[i] <= pivote && i<j) i++;
			while(array[j]>pivote) j--;
			if(i<j) {
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}
	

		array[izq] = array[j];
		array[j] = pivote;
		if(izq < j-1)
			quicksort(array, izq , j-1);
		if(j+1< der )
		quicksort(array,j+1, der);
		return array;
		

		}
	}

























































public class Ejecucion {

	public static void main(String[] args) {
		

	}

}
