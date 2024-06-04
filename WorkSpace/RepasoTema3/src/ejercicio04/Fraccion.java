package ejercicio04;

public class Fraccion {

	private int numerador;
	private int denominador;
	
	
	@Override
	public String toString() {
		return "Operacion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}


	public int getNumerador() {
		return numerador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}


	public int getDenominador() {
		return denominador;
	}


	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}


	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	
	public Fraccion() {
		// TODO Auto-generated constructor stub
	}


	public Fraccion sumar(Fraccion a, Fraccion b) {
		int nuevoNumerador = a.numerador*b.denominador + a.denominador*b.numerador;
		int nuevoDenominador = a.denominador*b.denominador;

		return new Fraccion(nuevoNumerador, nuevoDenominador); 
		
	}
	
	public Fraccion restar(Fraccion a, Fraccion b) {
		int nuevoNumerador = a.numerador*b.denominador - a.denominador*b.numerador;
		int nuevoDenominador = a.denominador*b.denominador;
		Fraccion nuevaFraccion = new Fraccion(nuevoNumerador, nuevoDenominador); 
		return nuevaFraccion;
		
	}
	public Fraccion multiplicar(Fraccion a, Fraccion b) {
		int nuevoNumerador = a.numerador*b.numerador;
		int nuevoDenominador = a.denominador*b.denominador;
		Fraccion nuevaFraccion = new Fraccion(nuevoNumerador, nuevoDenominador); 
		return nuevaFraccion;
		
	}
	public Fraccion dividir(Fraccion a, Fraccion b) {
		int nuevoNumerador = a.numerador*b.denominador;
		int nuevoDenominador = a.denominador*b.numerador;
		Fraccion nuevaFraccion = new Fraccion(nuevoNumerador, nuevoDenominador); 
		return nuevaFraccion;
		
	}
	
	public void imprimirFraccion (Fraccion f) {
		System.out.println("El resultado es: " + f.numerador + "/" + f.denominador);
	}
	
	
	
}
