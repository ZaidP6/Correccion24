package ejercicio01;

public class Avion implements IAterrizaje{

	private int id;
	private double longitud;
	private double litrosCombustible;
	
	
	public Avion(int id, double longitud, double litrosCombustible) {
		super();
		this.id = id;
		this.longitud = longitud;
		this.litrosCombustible = litrosCombustible;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getLitrosCombustible() {
		return litrosCombustible;
	}
	public void setLitrosCombustible(double litrosCombustible) {
		this.litrosCombustible = litrosCombustible;
	}
	@Override
	public String toString() {
		return "Avion con id "+id+" de longitud "+longitud+"m con "+litrosCombustible+ " litros de combustible";
	}
	@Override
	public double calcularPrecioAterrizaje(double cantPorMetro, double cantPlusLitros, double cantPorPasajero, double cantPorPeligrosidad) {
		if(litrosCombustible>20000) {
			return cantPorMetro*longitud + cantPlusLitros;
		}
		return cantPorMetro*longitud;
	}
	
	
	
}
