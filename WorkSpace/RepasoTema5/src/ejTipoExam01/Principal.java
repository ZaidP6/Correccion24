package ejTipoExam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int num;
		String palo;
		String nuevoNombre;
		
		Carta c1 = new Carta("", "basto", 3);
		Carta c2 = new Carta("", "basto", 10);
		Carta c3 = new Carta("", "oro", 1);
		Carta c4 = new Carta("", "oro", 8);
		Carta c5 = new Carta("", "copa",5);
		Carta c6 = new Carta("", "copa", 3);
		Carta c7 = new Carta("", "espada", 11);
		Carta c8 = new Carta("", "espada", 12);

		List<Carta> listaCartas = new ArrayList<Carta>();
		listaCartas.add(c8);
		listaCartas.add(c6);
		listaCartas.add(c4);
		listaCartas.add(c2);
		listaCartas.add(c1);
		listaCartas.add(c3);
		listaCartas.add(c5);
		listaCartas.add(c7);
		Mazo mazo = new Mazo(listaCartas);
		
		System.out.println("Bienvenido a la Brisca");
		
		System.out.println("Busquemos una carta por número y palo");
		System.out.println("Introducza un número");
		num = Leer.datoInt();
		System.out.println("Introducza un palo");
		palo = Leer.dato();
		
		System.out.println("Su carta es: "+mazo.findByNumAndPalo(num, palo));
		
		System.out.println("veamos cuántas cartas del mazo no tienen valor");
		System.out.println(mazo.buscarCartasMazoV0());
		
		System.out.println("Veamos nuestra puntuación total");
		System.out.println(mazo.calcularPuntuacionTotal()+" puntos");
		
		System.out.println("Vamos a cambiarle el nombre a alguna carta.");
		System.out.println("Introducza un número");
		num = Leer.datoInt();
		System.out.println("Introducza un palo");
		palo = Leer.dato();
		System.out.println("Indique el nombre nuevo");
		nuevoNombre = Leer.dato();
		
		mazo.modificarNombre(num, palo, nuevoNombre);
		
		System.out.println("Vamos a mostrar todo el mazo");
		mazo.mostrarMazo();
		
		System.out.println("Ordenemos el mazo  por palo");
		Collections.sort(mazo.getListaCartas());
		mazo.mostrarMazo();
		
		System.out.println("Ordenemos por puntuación");
		Collections.sort(mazo.getListaCartas(), new OrdenarPorPuntiacion());
		mazo.mostrarMazo();
	}

}
