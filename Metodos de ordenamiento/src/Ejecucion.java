import java.util.Arrays;
import java.util.Scanner;

class Ordenador{
	
	public void ordenadorInsercion(int[] numeros) {
		long TInicio, TFin, tiempo;        
		 TInicio = System.currentTimeMillis();
		int aux;
		for(int i = 0; i < numeros.length; i++) {
			aux=numeros[i];
			for(int j=i-1; j > 0 && numeros[j] > aux ; j--) {
				numeros[j+1] = numeros [j];
				numeros[j] = aux;
				 TFin = System.currentTimeMillis();
				  tiempo = TFin - TInicio;
				  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
				
			}
			
		}//Segundo for 
		
	}//Primero for 

}//Metodo 


class OrdenamientoPorSeleccion{
	
	public void ordenamientoSeleccion(int [] numeros) {
		long TInicio, TFin, tiempo;        
		 TInicio = System.currentTimeMillis();
		for(int i = 0; i < numeros.length -1; i++) {
			for(int j = i; j< numeros.length; j++) {
				if(numeros[i] > numeros[j]) {
					int minimo = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = minimo;
					TFin = System.currentTimeMillis();
					  tiempo = TFin - TInicio;
					  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
				}
			}
		}
	}
}
class PruebaQuicksort{
	int [] quicksort(int[ ] array, int izq, int der) {
		long TInicio, TFin, tiempo;        
		 TInicio = System.currentTimeMillis();
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
				TFin = System.currentTimeMillis();
				  tiempo = TFin - TInicio;
				  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
			}
	

		array[izq] = array[j];
		array[j] = pivote;
		if(izq < j-1)
			quicksort(array, izq , j-1);
		if(j+1< der )
		quicksort(array,j+1, der);
		return array;
		

		}
		return array;
	}

	class Shellsort{
		public void ordenar(int [] numeros) {
			long TInicio, TFin, tiempo;        
			 TInicio = System.currentTimeMillis();
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
			TFin = System.currentTimeMillis();
			  tiempo = TFin - TInicio;
			  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		}
	}//class

	class Radix{
		public void orden(int [] numeros) {
			long TInicio, TFin, tiempo;        
			 TInicio = System.currentTimeMillis();
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
						 {
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
			TFin = System.currentTimeMillis();
			  tiempo = TFin - TInicio;
			  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
			}
	}

	public class Burbuja {
		
		private void burbuja(int[] arreglo) {
			long TInicio, TFin, tiempo;        
			 TInicio = System.currentTimeMillis();
		    for (int x = 0; x < arreglo.length; x++) {		       
		        for (int y = 0; y < arreglo.length - 1; y++) {
		            int elementoActual = arreglo[y],
		                    elementoSiguiente = arreglo[y + 1];
		            if (elementoActual > elementoSiguiente) {		               
		                arreglo[y] = elementoSiguiente;
		                arreglo[y + 1] = elementoActual;
		            }
		        }
		    }
		    TFin = System.currentTimeMillis();
		    tiempo = TFin - TInicio;
		    System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		}
	}
	class Burbuja02{
		private void burbuja(String[] arreglo) {
		    for (int x = 0; x < arreglo.length; x++) {	
		    	long TInicio, TFin, tiempo;        
				 TInicio = System.currentTimeMillis();
		        for (int y = 0; y < arreglo.length - 1; y++) {
		            String elementoActual = arreglo[y],
		                    elementoSiguiente = arreglo[y + 1];
		            if (elementoActual.compareTo(elementoSiguiente) > 0) {
		                arreglo[y] = elementoSiguiente;
		                arreglo[y + 1] = elementoActual;
		            }
		        }
		        TFin = System.currentTimeMillis();
		        tiempo = TFin - TInicio;
		        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		    }
		}
	}
public class Ejecucion {
	public void main(String[] args) {
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; 
	       while(!salir){
	           System.out.println("1. Opcion 1: Ordenamiento por incercion");
	           System.out.println("2. Opcion 2: Ordenamiento por seleccion");
	           System.out.println("3. Opcion 3: Ordenamiento Por Quicksort");
	           System.out.println("4. Opcion 4: Ordenamiento Por Sellsort");
	           System.out.println("5. Opcion 5: Ordenamiento Por Radix");
	           System.out.println("6. Opcion 6: Ordenamineto Por Burbuja01");
	           System.out.println("7. Opcion 7: Ordenamiento Por Burbuja02");
	           System.out.println("8. Salir");
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion 1");	                 
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion 2");
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la opcion 3");
	                   break;
	                case 4:
		                   System.out.println("Has seleccionado la opcion 4");
		                   break;
	                case 5:
		                   System.out.println("Has seleccionado la opcion 5");
		                   break;
	                case 6:
		                   System.out.println("Has seleccionado la opcion 6");
		                   break;
	                case 7:
		                   System.out.println("Has seleccionado la opcion 7");
		                   break;
	                case 8:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 8");
	           }
	       }
	    }
	}
		
		
		

	

}

