import java.util.Arrays;

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
	
}
		array[izq] = array[j];
		array[j] = pivote;
		if(izq < j-1)
			quicksort(array, izq , j-1);
		if(j+1< der )
		quicksort(array,j+1, der);
		return array;
		
public class pruebaDequicksort {

	public static void main(String[] args) {
		PruebaQuicksort pq = new PruebaQuicksort();
		int [] array = {30, 12, 5, 2, 8, 3, 1, 7, 22,};
		System.out.print("desordenado: " + Arrays.toString(array));
		System.out.print("Ordenado" + Arrays.toString(pq.quicksort(array, izq, der)));
	}
		
	}
		

	}

}
