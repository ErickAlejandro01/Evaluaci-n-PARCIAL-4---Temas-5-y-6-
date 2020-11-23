
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

































































public class Ejecucion {

	public static void main(String[] args) {
		

	}

}
