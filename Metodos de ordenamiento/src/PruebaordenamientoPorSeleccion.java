import java.util.Arrays;

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


public class PruebaordenamientoPorSeleccion {

	public static void main(String[] args) {
		int [] numeros = { 6, 1, 10, 2, 8, 4, 6, 9,};
		
		OrdenamientoPorSeleccion ops = new OrdenamientoPorSeleccion ();
		System.out.print("Numeros son ordenar ; " + Arrays.toString(numeros));
		ops.ordenamientoSeleccion(numeros);
		System.out.print("numeros ordenados: " + Arrays.toString(numeros));
		
		
		
		
	}

}
