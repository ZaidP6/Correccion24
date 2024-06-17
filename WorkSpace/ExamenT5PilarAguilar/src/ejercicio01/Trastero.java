package ejercicio01;

public class Trastero implements Comparable<Trastero>{

	private double metros2;
	private String direccion;
	private int num;
	private double precio;
	private boolean ocupado;
	
	
	public Trastero(double metros2, String direccion, int num, double precio, boolean ocupado) {
		super();
		this.metros2 = metros2;
		this.direccion = direccion;
		this.num = num;
		this.precio = precio;
		this.ocupado = ocupado;
	}
	public double getMetros2() {
		return metros2;
	}
	public void setMetros2(double metros2) {
		this.metros2 = metros2;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	@Override
	public String toString() {
		return "Trastero [metros2=" + metros2 + ", direccion=" + direccion + ", num=" + num + ", precio=" + precio
				+ ", ocupado=" + ocupado + "]";
	}
	
	
	@Override
	public int compareTo(Trastero t) {
		if(this.getNum() > t.getNum()) {
			return 1;
		}else if(this.getNum() < t.getNum()) {
			return -1;
		}else
			return 0;
	}
	
	
}
