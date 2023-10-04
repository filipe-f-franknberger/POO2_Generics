package Exemplo_Generics;

public class MainMetodoGenerico{

	public static void main(String[] args) {
		
		String [] v = {"a","ab","abc","abcd"};
		String valor = "b";
		int cont = Comp2.<String> countGreaterThan(v,valor);
		
		System.out.println(cont);


	}

}
