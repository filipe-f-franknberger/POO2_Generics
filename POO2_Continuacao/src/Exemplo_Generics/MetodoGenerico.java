package Exemplo_Generics;

public class MetodoGenerico <T, E>{
	private T []array1;
	private E elemento;
	
	public T[] getArray1() {
		return array1;
	}
	public void setArray1(T[] array1) {
		this.array1 = array1;
	}
	public E getElemento() {
		return elemento;
	}

	public void setElemento(E elemento) {
		this.elemento = elemento;
	}

	public MetodoGenerico(T array1[] ,  E elemento) {
		this.array1 = array1;
		this.elemento = elemento;
	}

	public void comparaElementos() {
		
		
	}

}
