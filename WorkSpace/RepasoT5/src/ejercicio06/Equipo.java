package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Equipo {

	private List<Jugador> listaJugadores;

	public Equipo(List<Jugador> listaJugadores) {
		super();
		this.listaJugadores = listaJugadores;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [listaJugadores=" + listaJugadores + "]";
	}
	
	public void addJugador(Jugador j) {
		listaJugadores.add(j);
	}
	
	public Jugador findByDorsal(int num) {
		boolean encontrado = false;
		int i = 0;
		Jugador j = null;
		while(i<listaJugadores.size()) {
			if(listaJugadores.get(i).getNum() == num) {
				j = listaJugadores.get(i);
				encontrado = true;
			}
			i++;
		}
		if(encontrado) {
			return j;
		}else
			return null;
	}
	
	public List findByName(String nombre) {
		List<Jugador> listilla = new ArrayList<Jugador>();
		for (Jugador jugador : listaJugadores) {
			if (jugador.getNombre().equalsIgnoreCase(nombre)) {
				listilla.add(jugador);
			}
		}
		return listilla;
	}
	
	
	public void eliminarJugador(int dorsal) {
		listaJugadores.remove(this.findByDorsal(dorsal));
		
	}
	
	public void modificarPosicion(int num, String nuevaPosicion) {
		
		this.findByDorsal(num).setPosicion(nuevaPosicion);
	}
	
	public void imprimirLista() {
		Iterator<Jugador> it = listaJugadores.iterator();
		while(it.hasNext()) {
			Jugador j = it.next();
			System.out.println(j);
		}
	}
	
	public void ordenarPorPosicion() {
		Collections.sort(listaJugadores);
	}
	
}
