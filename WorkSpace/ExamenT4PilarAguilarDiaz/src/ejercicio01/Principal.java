package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op, id;
		double cantPorMetro = 25.5, cantPlusLitros = 200.38, cantPorPasajero = 8.96, cantPorPeligrosidad = 525.5;
		
		Avion a1 = new Avion(1, 120, 22000);
		Avion a2 = new Avion(2, 98, 18000);
		
		Avion a3 = new AvPasajeros(3, 110, 20001, 220);
		Avion a4 = new AvPasajeros(4, 50, 12000, 85);
		
		Avion a5 = new AvMercancia(5, 240, 38000, true);
		Avion a6 = new AvMercancia(6, 340, 45000, false);
		
		Avion [] listaAviones = {a1, a2,a3,a4,a5,a6};
		
		Aeropuerto svq = new Aeropuerto("SQV", listaAviones);
		
		
		System.out.println("Bienvenido al aeropuerto " + svq.getNombre());
		
		do {
			System.out.println();
			System.out.println("Elija una opción");
			System.out.println("""
					
					1 - Calcular precio de aterrizaje de un avion (ids del 1 al 6)
					2 - Mostrar lista
					3 - Calcular total recaudado de aviones de pasajeros
					4 - Calcular total recaudado de todos los aviones
					5 - Calcular media pagada de todos los aviones de mercancía
					0 - Salir
					
					""");
			
			op = Leer.datoInt();
			
			
			switch (op) {
				case 1:
					System.out.println("indique el avión a buscar");
					id = Leer.datoInt();
					System.out.printf("El precio de aterrizaje de este avión es de %.2f€.\n", 
							svq.calcularPrecioAterrizajeAvion(svq.findByIdAvion(id), cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad));
					break;
				case 2:
					svq.mostrarLista();
					break;
				case 3:
					System.out.printf("El total recaudado solo de los aviones de pasajeros es de %.2f€.\n", 
							svq.calcularTotalReacudadoSoloPasajeros(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad));
					break;
				case 4:
					System.out.printf("El total recaudado es de %.2f€.\n", svq.calcularTotalRecaudado(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad));
					break;
				case 5:
					System.out.printf("La media recaudada solo aviones de mercancías es de %.2f€.\n", 
							svq.calcularMediaSoloMercancias(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad));
					break;
				case 0:
					System.out.println("Bye bye");
					break;
				default:
					System.out.println("Opción errónea");
					break;
			}
			
		} while (op!=0);
		
		System.out.println("Gracias por usar el programa.");
		
		
	}

}
