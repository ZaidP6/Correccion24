package ejTipoExam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mazo{

	List<Carta> listaCartas = new ArrayList<Carta>();

	public Mazo(List<Carta> listaCartas) {
		super();
		this.listaCartas = listaCartas;
	}

	public List<Carta> getListaCartas() {
		return listaCartas;
	}

	public void setListaCartas(List<Carta> listaCartas) {
		this.listaCartas = listaCartas;
	}

	@Override
	public String toString() {
		return "Mazo [listaCartas=" + listaCartas + "]";
	}

	public Carta findByNumAndPalo(int num, String palo) {
		Carta carta = null;
		for (int i = 0; i < listaCartas.size(); i++) {
			if(listaCartas.get(i).getNum() == num && listaCartas.get(i).getPalo().equalsIgnoreCase(palo)) {
				carta = listaCartas.get(i);
			}
		}
		return carta;
	}
	
	public List<Carta> buscarCartasMazoV0(){
		List<Carta> cartasValorCero = new ArrayList<Carta>();
		Iterator<Carta> it = listaCartas.iterator();
		while(it.hasNext()) {
			Carta carta = it.next();
			if(carta.obtenerPuntuacionCarta() == 0) {
				cartasValorCero.add(carta);			
			}
		}
		return cartasValorCero;
	}
	
	public int calcularPuntuacionTotal() {
		int suma = 0 ;		
		for (Carta carta : listaCartas) {
			suma += carta.obtenerPuntuacionCarta();
		}
		return suma;
	}
	
	public void modificarNombre(int num, String palo, String nuevoNombre) {
		findByNumAndPalo(num, palo).setNombre(nuevoNombre);
	}
	
	public void mostrarMazo() {
		Iterator<Carta> it = listaCartas.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}


}
