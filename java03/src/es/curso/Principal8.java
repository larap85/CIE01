package es.curso;

public class Principal8 {

	public static void main(String[] args) {

		int[] lista = new int[] { 2, 5, 6, 7 };
		
		int suma=0;
				
		for (int i=0; i<=3; i++) {
			
			if (lista[i]>=5)
			System.out.println(lista[i]);
			suma=suma+lista[i];
			//suma+=lista[i];
		}
		
		System.out.println(suma);
	}
				
}