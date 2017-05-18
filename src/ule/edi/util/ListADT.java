package ule.edi.util;

import java.util.Iterator;

import ule.edi.EmptyCollectionException;

/**
 * Interfaz para las operaciones comunes a los TAD lista.
 * 
 * Iteración.
 * 
 * Hereda del interface Iterable<T> por lo que una clase que extienda ListADT<T> tiene
 * que implementar también el método: public Iterator<T> iterator(). Los iteradores
 * para la práctica no implementarán la operación {@link Iterator#remove()}.
 * 
 * Consultar la API de {@link Iterator} para saber qué excepciones deben lanzarse
 * en los métodos cuando:
 * 
 *   - Se solicita el siguiente elemento {@link Iterator#next()} y no existe.
 *   - Se invoca la operación {@link Iterator#remove()} pero no se ha implementado.

 * @author profesor
 *
 * @param <T> tipo de dato en cada posición de la lista.
 */
public interface ListADT<T> extends Iterable<T> {

	/**
	 * Elimina y devuelve el elemento en la primera posición de la lista.
	 * 
	 * @return el elemento que ocupaba la primera posición en esta lista.
	 * 
	 * @throw EmptyCollectionException si la lista estaba vacía.
	 */
	public T removeFirst() throws EmptyCollectionException;

	/**
	 * Elimina y devuelve el elemento en la última posición de la lista.
	 * 
	 * @return el elemento que ocupaba la última posición de esta lista.
	 * 
	 * @throw EmptyCollectionException si la lista estaba vacía.
	 */
	public T removeLast() throws EmptyCollectionException;

	/**
	 * Elimina y devuelve un elemento determinado de la lista.
	 * 
	 * Se eliminará el primer elemento <code>x</code> tal que <code>x.equal(element)</code>
	 * sea <tt>true</tt>.
	 * 
	 * @param element
	 *            el elemento a eliminar de la lista.
	 * @return el elemento eliminado.
	 * @throw NoSuchElementException no existe tal elemento en la lista.
	 */
	public T remove(T element);

	/**
	 * Devuelve una referencia al elemento que ocupa la primera posición.
	 * 
	 * @return referencia al primer elemento en la lista.
	 * 
	 * @throw EmptyCollectionException si la lista está vacía.
	 */
	public T getFirst() throws EmptyCollectionException;

	/**
	 * Devuelve una referencia al último elemento de la lista.
	 * 
	 * @return referencia al último elemento de la lista.
	 * 
	 * @throw EmptyCollectionException si la lista está vacía.
	 */
	public T getLast() throws EmptyCollectionException;

	/**
	 * Devuelve <tt>true</tt> si el elemento está en la lista.
	 * 
	 * La comprobación se basará en {@link Object#equals(Object)}.
	 * 
	 * @param target
	 *            el elemento a buscar en la lista.
	 *            
	 * @return <tt>true</tt> si la lista contiene al elemento, <tt>false</tt> si no.
	 */
	public boolean contains(T target);

	/**
	 * Devuelve <tt>true</tt> si la lista no contiene elementos.
	 * 
	 * @return <tt>true</tt> si la lista está vacía, <tt>false</tt> si no.
	 */
	public boolean isEmpty();

	/**
	 * Devuelve el número de elementos en esta lista.
	 * 
	 * @return el número de elementos en esta lista.
	 */
	public int size();

	/**
	 * Construye y devuelve una representación como cadena de esta lista.
	 * 
	 * El formato debe ser "[A, B, C]" para una lista de tres elementos,
	 * construída a partir de lo que devuelva <code>toString()</code> para
	 * cada elemento, separado por coma y un espacio.
	 * 
	 * @return una codificación de esta lista.
	 */
	public String toString();

	/**
	 * Consulta el elemento en la posición [1, ...] dada.
	 * 
	 * Si la lista tiene N elementos, las posiciones válidas son [1, 2, ..., N].
	 * 
	 * @param i posición en la colección
	 * @return el elemento en esa posición.
	 * @throws IndexOutOfBoundsException la posición no es válida.
	 */
	public T getElementAt(int i) throws IndexOutOfBoundsException;
		
	/**
	 * Elimina un elemento en la posición [1, ...] dada.
	 * 
	 * Si la lista tiene N elementos, las posiciones válidas son [1, 2, ..., N].
	 * 
	 * @param i posición del elemento a eliminar, comienza en 1.
	 * @return el elemento que estaba en esa posición.
	 * @throws IndexOutOfBoundsException posición no es válida.
	 */
	public T removeElementAt(int i) throws IndexOutOfBoundsException;
	
	/**
	 * Devuelve un iterador que recorre la lista, pero sólo para posiciones pares de la lista (2º, 4º..)
	 * 
	 * Por ejemplo, para una lista x con elementos [A, B, C, D, E] 
	 * 
	 * el iterador creado con x.skippingIterator() devuelve en sucesivas llamadas a next(): B y D.
	 * 
	 * @return iterador para posiciones pares de la lista.

	 */
	public Iterator<T> skippingIterator();
	
	/**
	 * Devuelve un iterador que recorre la lista en orden inverso.
	 * 
	 * Por ejemplo, para una lista x con elementos [A, B, C, D, E]
	 * 
	 * el iterador creado con x.reverseIterator() devuelve en sucesivas llamadas a next(): E, D, C, B y A.
	 * 
	 * @return iterador para orden inverso.
	 */
	public Iterator<T> reverseIterator();
	
}
