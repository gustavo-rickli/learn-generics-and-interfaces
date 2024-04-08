package com.gustavorickli;

public interface IArraysEquivalent  {

	public abstract <T> void add(T object, int referenceIndex);
	public abstract <T> Object get(int index);
	public abstract int getIndexReferenceOf(int index);

}
