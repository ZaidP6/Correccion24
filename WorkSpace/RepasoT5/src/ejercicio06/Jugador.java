package ejercicio06;

public class Jugador implements Comparable<Jugador>{

	private String nombre;
	private String posicion;
	private int num;
	
	
	public Jugador() {
		super();
	}

	

	public Jugador(String nombre, String posicion, int num) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.num = num;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", num=" + num + "]";
	}



	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return this.posicion.compareToIgnoreCase(o.posicion);
	}

	
	
	
	
}
