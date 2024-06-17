package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Oficina {

	private List<Trastero> listaTrasteros = new ArrayList<>();

	public Oficina(List<Trastero> listaTrasteros) {
		super();
		this.listaTrasteros = listaTrasteros;
	}

	public List<Trastero> getListaTrasteros() {
		return listaTrasteros;
	}

	public void setListaTrasteros(List<Trastero> listaTrasteros) {
		this.listaTrasteros = listaTrasteros;
	}

	@Override
	public String toString() {
		return "Oficina [listaTrasteros=" + listaTrasteros + "]";
	}
	
	
	public void addNuevoTrastero(Trastero t) {
		listaTrasteros.add(t);
	}
	
	public void mostrarLista() {
		Iterator<Trastero> it = listaTrasteros.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public Trastero findByPrecio(double precioBuscado) {
		Trastero t = null;
		for (int i = 0; i < listaTrasteros.size(); i++) {
			if(listaTrasteros.get(i).getPrecio() == precioBuscado) {
				t = listaTrasteros.get(i);
			}else
				t = null;
		}
		return t;
		
	}
	
	public List<Trastero> findByLibreAndDireccion(boolean libre, String direccionB) {
		Trastero t = null;
		List<Trastero> listaLibres = new ArrayList<Trastero>();
		for (int i = 0; i < listaTrasteros.size(); i++) {
			if(listaTrasteros.get(i).isOcupado() == false && listaTrasteros.get(i).getDireccion().equalsIgnoreCase(direccionB)) {
				t = listaTrasteros.get(i);
				listaLibres.add(t);
			}
		}
		return listaLibres;
		
	}
	
	public List<Trastero> findByMayorPrecio() {
		double p = 0;
		Trastero tr = null;
		List<Trastero> list = new ArrayList<Trastero>();
		for (Trastero t : listaTrasteros) {
			if(t.getPrecio()>p) {
				tr = t;
				p = t.getPrecio();
				list.clear();
				list.add(tr);
			}else if(t.getPrecio()==p) {
				tr = t;
				p = t.getPrecio();
				list.add(tr);
			}				
		}
		return list;
	}
	
	public Trastero findByIdAndDireccion(int id, String direccionB) {
		Trastero t = null;
		for (int i = 0; i <listaTrasteros.size(); i++) {
			if(listaTrasteros.get(i).getNum() == id && listaTrasteros.get(i).getDireccion().equalsIgnoreCase(direccionB)) {
				t = listaTrasteros.get(i);
			}
		}
		return t;
	}
	
	public void deleteByIdAndDireccion(int id, String direccionB) {
		Trastero t = findByIdAndDireccion(id, direccionB);
		listaTrasteros.remove(t);
		
	}
	
	public List<Trastero> mostrarlistaOcupados(){
		List<Trastero> listaOcupados = new ArrayList<Trastero>();
		for (Trastero trastero : listaTrasteros) {
			if(trastero.isOcupado()) {
				listaOcupados.add(trastero);
			}
		}
		return listaOcupados;
	}
	
}
