package ule.edi.util;

import java.util.Iterator;

/**
 * Lista en la que la posición de los elementos está determinada por
 * el orden de inserción.
 * 
 * @author profesor
 *
 * @param <T> tipo elemento que esta lista almacena.
 */
public interface UnorderedListADT<T> extends ListADT<T> {

	/**
	 * Inserta el elemento dado en la primera posición de la lista.
	 * 
	 * @param element
	 *            elemento a añadir lista en la primera posición.
	 */
	public void addToFront(T element);

	/**
	 * Añade el elemento al final de la lista.
	 * 
	 * @param element
	 *            elemento a insertar al final de la lista.
	 */
	public void addToRear(T element);

	/**
	 * Cambia un elemento en la posición [1, ...] dada.
	 * 
	 * Si la lista tiene N elementos, las posiciones válidas son [1, 2, ..., N].
	 * 
	 * @param i posición a cambiar
	 * @param value nuevo valor a almacenar en la posición
	 * @return valor que estaba en la posición
	 * @throws IndexOutOfBoundsException posición no es válida.
	 */
	public T replaceElementAt(int i, T value) throws IndexOutOfBoundsException;
		
}
