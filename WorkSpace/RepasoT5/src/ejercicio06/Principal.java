package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6. Vamos a crear un programa que nos ayude para gestionar un equipo de
		 * fútbol. Para ello, se deben crear tres clases, una llamada Jugador, otra
		 * Equipo y una Principal de prueba. Dependiendo de la forma que uséis para
		 * ordenar, puede que haga falta otra clase más. Los Jugadores están
		 * caracterizados por: Nombre, posición (Un string. Pueden ser central, lateral
		 * derecho, delantero centro...) y el número de la camiseta. Nuestra clase
		 * Equipo se caracteriza por una lista de jugadores, siendo la colección usada
		 * para almacenarlos un ArrayList. En ella, se debe poder hacer lo siguiente: •
		 * Añadir un nuevo jugador. • Borrar un jugador de la lista buscando antes al
		 * mismo. • Imprimir todos los datos de todos los jugadores de la lista usando
		 * un iterator. • Buscar un jugador por nombre. • Buscar todos los jugadores que
		 * tengan la misma posición, por ejemplo, todos los centrales. • Modificar la
		 * posición en que juega un jugador buscando antes al mismo. • Ordenar la lista
		 * por posiciones de juego. Se puede usar, si se quiere, un método que cargue la
		 * lista con varios jugadores de prueba para no tener que leerlos por teclado.
		 * Crear un menú en la clase principal donde se pueda comprobar toda la
		 * funcionalidad del programa.
		 */
		
		
		int op;
		
		System.out.println("Bienvenido");
		
		System.out.println("Elija una opción");
		System.out.println("""
				1 - Añadir un nuevo jugador.
				2 - Borrar un jugador de la lista buscando antes al mismo.
				3 - Imprimir todos los datos de todos los jugadores de la lista usando un iterator.
				4 - Buscar un jugador por nombre.
				5 - Buscar todos los jugadores que tengan la misma posición, por ejemplo, todos los centrales.
				6 - Modificar la posición en que juega un jugador buscando antes al mismo.
				7 - Ordenar la lista por posiciones de juego
				""");

	}

}
