package ejercicio04list2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1= new Cliente("1", "Pepe", "González", false, 25.48, 1.75);

		Cliente c2= new Cliente("2", "Ana", "González", false, 54.32, 1.68);

		Cliente c3= new Cliente("3", "Jose", "González", true, 70.41, 1.90);
		
		Cliente []listaClientes = {c1,c2,c3};
		Gimnasio gym = new Gimnasio(listaClientes); 
		
		
		gym.mostrarLista();
	}

}
