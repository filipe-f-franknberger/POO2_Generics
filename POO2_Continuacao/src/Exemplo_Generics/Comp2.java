package Exemplo_Generics;

import java.lang.Comparable;

public class Comp2 {
	public static<T extends Comparable <T> > int countGreaterThan (T[] array, T elem) {
		int count = 0;
		for(T e : array) {
			if(e.compareTo(elem) > 0);
			count++;
			
		}
		return count;
	}
}
