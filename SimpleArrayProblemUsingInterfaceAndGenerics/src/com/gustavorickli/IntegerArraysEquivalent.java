package com.gustavorickli;

public class IntegerArraysEquivalent implements IArraysEquivalent {
	
	private Integer []v;
	private int []referenceIndex;
	private int index = 0;
	
	public IntegerArraysEquivalent(int capacity) {
		this.v = new Integer[capacity];
		this.referenceIndex = new int[capacity];
	}
	
	/**
	 * Este método adiciona um novo elemento ao array
	 *
	 * @param valor do array, e index referencia do array original
	 * @return void
	 */
	public <T> void add(T element, int referenceIndex) {
		if (index < v.length) {
			v[index] = (Integer) element;
			this.referenceIndex[index] = referenceIndex;
			index++;
		}
	}

	/**
	 * Este método retorna o valor por index de um array.
	 *
	 * @param index do array
	 * @return valor do array
	 */
	public <T> Object get(int index) {
		return v[index];
	}

	/**
	 * Este método retorna o index do elemento do array referencia.
	 *
	 * @param index desejado
	 * @return index do array referencia
	 */
	public int getIndexReferenceOf(int index) {
		return referenceIndex[index];
	}
	
	public int getIndexLength( ) {
		return index;
	}
	
}
