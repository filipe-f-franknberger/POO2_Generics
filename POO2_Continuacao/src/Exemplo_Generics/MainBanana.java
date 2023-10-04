package Exemplo_Generics;

import java.util.ArrayList;
import java.util.List;

public class MainBanana {

	public static void main(String[] args) {
		List<Banana> lista = new ArrayList<Banana>();
		Banana b = new Banana("Branca","Brasil");
		lista.add(b);
		Banana b1 = lista.get(0);
		System.out.println(b1.toString());
		
	}

}
