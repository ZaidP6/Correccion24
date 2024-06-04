package ejercicio06;

public class Cuenta {

	private String titular;
	private String dni;
	private String nCuenta;
	private double saldo;
	private double tipoInteres;
	
	
	public Cuenta(String titular, String dni, String nCuenta, double saldo, double tipoInteres) {
		super();
		this.titular = titular;
		this.dni = dni;
		this.nCuenta = nCuenta;
		this.saldo = saldo;
		this.tipoInteres = tipoInteres;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getnCuenta() {
		return nCuenta;
	}


	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getTipoInteres() {
		return tipoInteres;
	}


	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}


	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", dni=" + dni + ", nCuenta=" + nCuenta + ", saldo=" + saldo
				+ ", tipoInteres=" + tipoInteres + "]";
	}
	
	
	
	
	
}
