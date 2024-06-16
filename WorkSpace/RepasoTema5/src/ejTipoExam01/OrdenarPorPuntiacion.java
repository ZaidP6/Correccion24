package ejTipoExam01;

import java.util.Comparator;

public class OrdenarPorPuntiacion implements Comparator<Carta>{

	@Override
	public int compare(Carta c1, Carta c2) {
		if(c1.obtenerPuntuacionCarta() == c2.obtenerPuntuacionCarta()) {
			return 0;
		}else if(c1.obtenerPuntuacionCarta() > c2.obtenerPuntuacionCarta()) {
			return 1;
		}else
			return -1;
		
	}

	
}
