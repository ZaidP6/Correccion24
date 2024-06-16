package ejTipoExam01;

public class Carta implements Comparable<Carta>{

	private String nombre;
	private String palo;
	private int num;
	
	
	public Carta(String nombre, String palo, int num) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.num = num;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", palo=" + palo + ", num=" + num + "]";
	}

	public int obtenerPuntuacionCarta() {
		int puntos = 0;
		if(getNum() == 1) {
			setNombre("As");
			puntos = 11;
		}else if((4 <= getNum() && getNum() <= 9) || getNum() == 2) {
			puntos = 0;
		}else if(getNum() == 3) {
			puntos = 10;
		}else if(getNum() == 10) {
			setNombre("Sota");
			puntos = 2;
		}else if(getNum() == 11) {
			setNombre("Caballo");
			puntos = 3;
		}else if(getNum() == 12) {
			setNombre("Rey");
			puntos = 4;
		}
		return puntos;
	}
	
	@Override
	public int compareTo(Carta c) {
		
		if(getPalo().equalsIgnoreCase(c.getPalo())) {
			return 1;
		}else if(getPalo() != c.getPalo()) {
			return -1;
		}else
			return 0;
	}
	
}
