package es.curso;

public class Principal3 {

	public static void main(String[] args) {
		
		//DRY dont repeat yourself
		int numero1=5;
		int numero2=7;
		
		
		//invocacion de la funcion
		//asignar resultado
		int resultado1=sumar(numero1,numero2);
		System.out.println(resultado1);
		int resultado2=restar(numero1,numero2);
		System.out.println(restar(numero1,numero2));
	
		int suma=5+7;
		
		//recibo el resultado y lo imprimo
		System.out.println(sumar(numero1,numero2));
		System.out.println(restar(numero1,numero2));
		int numero3=8;
		int numero4=9;
		
		//recibo el resultado y lo imprimo
		System.out.println("el resultado de la suma es:"+sumar(numero3,numero4));	
		System.out.println(sumar(numero3,numero4));
		System.out.println("el resultado de la resta es:"+restar(numero3,numero4));	

	}
		//no es sencillo de entender
	public static int sumar(int n1, int n2) {
	
		int suma=n1 + n2;
		return suma;
		//return n1 + n2; (es otro modo de escribirlo)
	}
	
	public static int restar (int n1, int n2) {
		int resta = n1 - n2;
		return resta;	
		
	}
}

