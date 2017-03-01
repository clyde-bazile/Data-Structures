import java.util.Iterator;
import java.util.Collection;

/** Doubly-LinkedList.
 * 
 * @author	Clyde-Bazile
 * @since 	2017-02-27
 */

public final class LinkedList<E> implements Iterable<E>
{

	/** Doubly-LinkedList Node */
	private final class Node<E> 
	{
		private final E data;
		private Node<E> next;
		private Node<E> prev;

		Node(final E data)
		{ this(data, null); }

		Node(final E data, final Node<E> next) {
			this.data = data;
			this.next = next;
		}

		@Override
		public String toString() {
			// TODO
			return null;
		}
	}

	/** Constructs an empty list. */
	public LinkedList() { 
		// TODO 
	}

	/** Constructs a list contaning the elements of the specified collection
	  * in the order they are returned by the collection's iterator.
	  */
	public LinkedList(final Collection<? extends E> c) {
		// TODO
	}

	/**
	  * Returns the element at the specified index in the list.
	  *
	  * @param 	e	the element to be returned
	  * @return the element at the specified index in the list or null
	  */
	public E search(final E e) { 
		// TODO
		return null; 
	}

	/**
	  * Inserts the specified element at the front of the list.
	  * 
	  * @param e	the element to be inserted
	  */
	public void insert(final E e) {
		// TODO
	}

	/**
	  * Deletes the first occurance specified element in this list 
	  * if present.
	  *
	  * @param e	the element to be deleted
	  */
	public void delete(final E e) {
		// TODO
	}

	/** 
	 * Returns true if this list contains the specified element.
	 *
	 * @param e		element whose presence in this list is to be tested
	 * @return	true if this list contains the specified element; false otherwise
	 */
	public void contains(final E e) {
		// TODO
	}

	/** 
	 * Returns the number of elements in this list.
	 *
	 * @return the number of elements in this list
	 */
	public int size() {
		// TODO
		return 0;
	}
	
	/** 
	 * Returns true if and only if this list contains no elements.
	 *
	 * @return true if this list contains no elements; false otherwise
	 */
	public boolean isEmpty() {
		// TODO
		return false;
	}
	
	/** 
	 * Inserts the specified element at the beginning of this list.
	 * 
	 * @param e 	the element to add
	 */
	public void addFirst(final E e) {
		// TODO
	}

	/** 
	 * Appends the specfied element to the end of this list.
	 *
	 * @param e 	the elmenet to add
	 */
	public void addLast(final E e) {
		// TODO
	}

	/** 
	 * Appends all elements in the specified collection to the end of this
	 * list, in the order the elements are returned from the specified 
	 * collection's iterator.
	 *
	 * @param c 	the collection to append to this list
	 */
	public void addAll(final Collection<? extends E> c) {
		// TODO
	}

	/** 
	 * Deletes and returns the first element from this list.
	 *
	 * @return the first element in this list
	 */
	public void deleteFirst() {
		// TODO
	}

	/** 
	 * Deletes and returns the last element from this list.
	 *
	 * @return the last element in this list
	 */
	public void deleteLast() {
		// TODO
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public Iterator<E> iterator(){
		return new ListIterator<E>();
	}

	/**
	  * {@inheritDoc}
	  */
	private final class ListIterator<E> implements Iterator<E>
	{

		private int cursor;
		private final int end;

		public ListIterator() {
			// TODO
			end = 0;
		}

		@Override
		public boolean hasNext() {
			// TODO
			return false;
		}

		@Override
		public E next() {
			// TODO
			return null;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
