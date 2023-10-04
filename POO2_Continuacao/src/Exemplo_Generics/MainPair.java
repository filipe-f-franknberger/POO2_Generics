package Exemplo_Generics;

public class MainPair {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1,"apple");
	//	Pair<Integer, String> p2 = new Pair<>(2,"orange");
		Pair<Integer, String> p2 = new Pair<>(1,"apple");
		boolean compair = Util.<Integer, String>compare(p1,p2);
		System.out.println(compair);

	}

}
