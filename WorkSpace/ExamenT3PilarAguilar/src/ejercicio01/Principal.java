package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor p1 = new Profesor("Ángel", "Naranjo", 1, 1920.34, 7);
		
		Gestoria g1 = new Gestoria(p1);
		
		int op, tope;
		double precioHExtra, gastosMes,porcentajeImpuesto, nuevoSueldo;
		
		System.out.println("Bienvenido al programa");
		
		System.out.println("Antes que nada indique el precio de hoy de las horas extras");
		precioHExtra = Leer.datoDouble();
		System.out.println("Indique el porcenaje de impuestos");
		porcentajeImpuesto= Leer.datoDouble();
		
		System.out.println();
		
		do {
			System.out.println();
			System.out.println("*************************************************************");
			System.out.println();
			System.out.println("Elija una opción");
			System.out.println("""
					1 - Calcular sueldo neto
					2 - Comprobar si te has pasado de horas extra
					3 - Calcula ahorro
					4 - Modificar sueldo base
					0 - Salir
					""");
			System.out.println();
			System.out.println("*************************************************************");
			System.out.println();
			
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.printf("El sueldo bruto es de %.2f€.\n", g1.calcularSueldoNeto(porcentajeImpuesto, precioHExtra));
					
					break;
					
				case 2:
					System.out.println("Indique el tope de horas extra");
					tope = Leer.datoInt();
					g1.comprobarTopeHoras(p1, tope);
					g1.mostrarAvisoHExtras(p1, tope);
					
					break;
					
				case 3: 
					System.out.println("A cuánto ascienden los gastos de este mes???");
					gastosMes = Leer.datoDouble();
					System.out.printf("El ahorro obtenido es de %.2f€.\n",g1.calcularAhorro(gastosMes, porcentajeImpuesto, precioHExtra));
					
					break;
					
				case 4:
					System.out.println("Indique el nuevo sueldo");
					nuevoSueldo = Leer.datoDouble();
					
					System.out.printf("Se ha modificado el sueldo base, ahora es de %.2f€.\n",g1.modificarSueldoBase(nuevoSueldo));
					break;
	
				default:
					System.out.println("No ha marcado ninguna opción");
					break;
				}
			
		} while (op!=0);
		
		System.out.println();
		System.out.println("Gracias por usar el programa!!!");
		
	}

}
