package ejercicio01;

import java.util.Comparator;

public class OrdenarPorOcupado implements Comparator<Trastero>{

	@Override
	public int compare(Trastero o1, Trastero o2) {
		if(o1.getPrecio() > o2.getPrecio()) {
			return -1;
		}else if(o1.getPrecio() < o2.getPrecio()) {
			return 1;
		}else
			return 0;
	}
	

}
