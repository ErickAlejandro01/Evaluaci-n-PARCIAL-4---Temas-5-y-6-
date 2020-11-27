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

	class Shellsort{
		public void ordenar(int [] numeros) {
			int intervalo = numeros.length/2;
			
			while(intervalo >0) {
				for(int i= intervalo;i<numeros.length; i++) {
					int j = i-intervalo;
					while(i>=0) {
						int k = j+intervalo;
						if(numeros[j]<= numeros[k]) {
							j=-1;
						}else {
							int aux = numeros[j];
							numeros[j] = numeros[k];
							numeros[k] = aux;
							j-= intervalo;
						}
					}
				}
				intervalo = intervalo/2;
			}
		}
	}//class

	class Radix{
		public void orden(int [] numeros) {
			if(numeros.length == 0)
				return;
			int [] [] np = new int [numeros.length][2];
			int
	[] q = new int [0x100];
			int i,j,k,l,f = 0;
			for(k=0;k<4;k++) {
				for(i=0;i<(np.length-1);i++)
					np[i][1]= i+1;
					np[i] [1] =-1;
					for(i=0;i<q.length;i++)
						q[i] =-1;
					for(f=i=0;i<numeros.length;i++) {
						j = ((0xFF<<(k<<3))&numeros[i])>>(k<<3);
						if(q[j] ==-1);
						l = q[j] =f;
						else {
							l=q[j];
							while(np[l][1] != -1)
								l = np[l][1];
								np[l][1] = f ;
							l = np[l] [1];
						}
						f= np[f] [1];
						np[l] [0] = numeros[i];
						np[l] [1] =-1;
					}
					for(l=q[i=j=0];i<0x100;i++)
						for(l=q[i];l!=-1;l=np[l][1])
							numeros[j++] = np[l] [0];
				}
			
			}
	}



public class Ejecucion {

	public static void main(String[] args) {
		

	}

}
