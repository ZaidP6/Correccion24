package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		double metros2;
		String direccion, direccionB, comprobacion;
		int num;
		double precio, precioBuscado;
		boolean ocupado;
		List<Trastero> listaTrasteros = new ArrayList<Trastero>();
		Oficina of = new Oficina(listaTrasteros);
		Trastero t1 = new Trastero(25, "Afrodita 16", 13, 37.89, true);
		listaTrasteros.add(t1);
		
		
		System.out.println("Bienvenido a la empresa de trasteros");
		
		
		do {
			System.out.println("Elija una opción");
			System.out.println("""
					
					1 - Añadir un nuevo trastero
					2 - Mostrar todos los trasteros
					3 - Buscar por precio
					4 - Buscar por direccion y libres
					5 - Buscar por mayor precio
					6 - Eliminar un trastero
					7 - Modificar precio de un trastero
					8 - Ordenar por números
					9 - Ordenar por precio
					10 - Mostrar solo ocupados
					
					""");
			op = Leer.datoInt();
			
			
			switch (op) {
				case 1:
					System.out.println("Indique los metros cuadrados");
					metros2 = Leer.datoDouble();
					System.out.println("Indique la dirección");
					direccion = Leer.dato();
					System.out.println("Indique el número del trastero");
					num = Leer.datoInt();
					System.out.println("Indique el precio");
					precio = Leer.datoDouble();
					System.out.println("Indique 'F' si no está ocupado y 'T' si está ocupado");
					comprobacion = Leer.dato();
					if(comprobacion.equalsIgnoreCase("F")) {
						ocupado = false;
					}else if(comprobacion.equalsIgnoreCase("V")) {
						ocupado = true;
					}else
						ocupado= false;
					
					Trastero t = new Trastero(metros2, direccion, num, precio, ocupado);
					of.addNuevoTrastero(t);

					break;
				case 2:
					of.mostrarLista();
					break;
				case 3:
					System.out.println("Indique el precio a buscar");
					precioBuscado = Leer.datoDouble();
					System.out.println(of.findByPrecio(precioBuscado));
					break;
				case 4:
					System.out.println("Indique la direccion que desaea buscar");
					direccionB = Leer.dato();
					ocupado = false;
					System.out.println(of.findByLibreAndDireccion(ocupado, direccionB));
					break;
				case 5:
					of.findByMayorPrecio();
					break;
				case 6:
					System.out.println("Indica el número del trastero a eliminar");
					num = Leer.datoInt();
					System.out.println("Indica la dirección del trastero");
					direccionB = Leer.dato();
					of.deleteByIdAndDireccion(num, direccionB);
					break;
				case 7 :
					System.out.println("Indica el número del trastero a modificar");
					num = Leer.datoInt();
					System.out.println("Indica la dirección del trastero");
					direccionB = Leer.dato();
					System.out.println("Indica el precio nuevo");
					precioBuscado = Leer.datoDouble();
					Trastero tr = null;
					tr = of.findByIdAndDireccion(num, direccionB);
					tr.setPrecio(precioBuscado);
					break;
				case 8:
					Collections.sort(listaTrasteros);
					System.out.println(listaTrasteros);
					break;
				case 9:
					Collections.sort(listaTrasteros, new OrdenarPorOcupado());
					System.out.println(listaTrasteros);
					break;
				case 10:
					System.out.println(of.mostrarlistaOcupados());
				default:
					break;
			}
			
		} while (op!=0);
		
		
		
	}

}
