package ejercicio04;

import utilidades.Leer;

public class Principal {

	/*
	 * 4. Realizar una aplicación que opere con números racionales, es decir,
	 * fracciones. Se harán las operaciones básicas, sumar, restar, multiplicar y
	 * dividir dos racionales mediante métodos. Se pueden hacer pasando como
	 * argumento varios enteros leídos por teclado, el numerador y el denominador de
	 * cada número e impriman el resultado en pantalla a modo de fracción, por
	 * ejemplo, 2/3. Se puede realizar con un método específico “imprimirFraccion”
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerador1, numerador2;
		int denominador1,denominador2;
		int op;
		
		System.out.println("Bienvenido al programa de los números racionales");
		
		System.out.println("Indique el numerador de la primera fraccion");
		numerador1 = Leer.datoInt();
		System.out.println("Indique el denominador de la primera fraccion");
		denominador1 = Leer.datoInt();
		
		System.out.println("Indique el numerador de la segunda fraccion");
		numerador2 = Leer.datoInt();
		System.out.println("Indique el numerador de la segunda fraccion");
		denominador2 = Leer.datoInt();
		
		System.out.println("Indique la operación que desea realizar");
		System.out.println("""
				1 - Sumar
				2 - Restar
				3 - Multiplicar
				4 - Dividir
				0 - Salir
				""");
		
		op = Leer.datoInt();
		
		switch (op) {
			case 1:
				
				
				break;
	
			default:
				break;
		}
		
		
	}

}
