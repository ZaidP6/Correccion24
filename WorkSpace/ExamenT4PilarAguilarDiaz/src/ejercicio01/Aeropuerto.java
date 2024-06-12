package ejercicio01;

import java.util.Arrays;

public class Aeropuerto {

	private String nombre;
	private Avion [] listaAviones;
	
	
	public Aeropuerto(String nombre, Avion[] listaAviones) {
		super();
		this.nombre = nombre;
		this.listaAviones = listaAviones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Avion[] getListaAviones() {
		return listaAviones;
	}
	public void setListaAviones(Avion[] listaAviones) {
		this.listaAviones = listaAviones;
	}
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", listaAviones=" + Arrays.toString(listaAviones) + "]";
	}
	
	
	
	public double calcularPrecioAterrizajeAvion(Avion avion, double cantPorMetro, double cantPlusLitros, double cantPorPasajero, double cantPorPeligrosidad) {
		if(avion instanceof AvPasajeros) {
			return ((AvPasajeros)avion).calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad);
		}else if(avion instanceof AvMercancia) {
			return ((AvMercancia)avion).calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad);
		}else
			return avion.calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad);
		
		
	}
	
	public void mostrarLista() {
		for (int i = 0; i < listaAviones.length; i++) {
			System.out.println(listaAviones[i]);
			if(listaAviones[i] instanceof AvMercancia) {
				((AvMercancia)listaAviones[i]).avisarBomberos();
			}
		}
	}
	
	public double calcularTotalReacudadoSoloPasajeros(double cantPorMetro, double cantPlusLitros, double cantPorPasajero, double cantPorPeligrosidad) {
		double total = 0;
		for (int i = 0; i < listaAviones.length; i++) {
			if(listaAviones[i] instanceof AvPasajeros) {
				total +=((AvPasajeros)listaAviones[i]).calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad);
			}
		}
		
		return total;
	}
	
	public Avion findByIdAvion(int id) {
		boolean encontrado = false;
		int i = 0;
		Avion a = null;
		while(i<listaAviones.length) {
			
			if(!encontrado && listaAviones[i].getId() == id) {
				encontrado = true;
				 a = listaAviones[i];
			}else
				i++;	
		}
		return a;
		
	}
	
	public double calcularTotalRecaudado(double cantPorMetro, double cantPlusLitros, double cantPorPasajero, double cantPorPeligrosidad) {
		double total = 0;
		for (int i = 0; i < listaAviones.length; i++) {
			total += listaAviones[i].calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad);
		}
		return total;
	}
	
	public double calcularMediaSoloMercancias(double cantPorMetro, double cantPlusLitros, double cantPorPasajero, double cantPorPeligrosidad) {
		double total = 0;
		int num = 0;
		for (int i = 0; i < listaAviones.length; i++) {
			if(listaAviones[i] instanceof AvMercancia) {
				total +=((AvMercancia)listaAviones[i]).calcularPrecioAterrizaje(cantPorMetro, cantPlusLitros, cantPorPasajero, cantPorPeligrosidad);
				num++;
			}
		}
		
		return total/num;
		
	}
	
}
