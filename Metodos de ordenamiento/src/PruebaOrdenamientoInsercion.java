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


public class PruebaOrdenamientoInsercion {
	
	
	
	

	public static void main(String[] args) {
		int [] numeros = {5,7,11,15,4,12,23,3,4,2,1,45,13};
		
		System.out.println("Numeros Desordenados" + Arrays.toString(numeros));
		
		Ordenador o = new Ordenador ();
		o.ordenadorInsercion(numeros);
		
	

	}

}
