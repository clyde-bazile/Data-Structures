import java.util.Iterator;

/** Singly-LinkedList implemntation of List.
 * 
 * @author	Clyde-Bazile
 * @since 	2017-02-27
 */

public class LinkedList<E> implements Iterable<E>
{

	/** Constructs an empty list. */
	public LinkedList() { 
		// TODO 
	}

	/** Constructs a list contaning the elements of the specified collection
	  * in the order they are returned by the collection's iterator.
	  */
	public LinkedList(Collections<? extends E> c) {
		// TODO
	}

	/**
	  * Returns the element at the specified index in the list.
	  *
	  * @param 	e	the element to be returned
	  * @return the element at the specified index in the list or null
	  */
	public E search(E e) { 
		// TODO 
	}

	/**
	  * Inserts the specified element at the front of the list.
	  * 
	  * @param e	the element to be inserted
	  */
	public void insert(E e) {
		// TODO
	}

	public void delete(E item) {
		// TODO
	}

	public void contains(E item) {
		// TODO
	}

	public int size() {
		// TODO
	}

	public boolean isEmpty() {
		// TODO
	}
	
	public void addFirst() {
		// TODO
	}

	public void addLast() {
		// TODO
	}

	public void addAll(Collection<? extends E> c) {
		// TODO
	}

	public void deleteFirst() {
		// TODO
	}

	public void deleteLast() {
		// TODO
	}

	@Override
	public String toString() {
		// TODO
	}

	private static final class ListIterator implements Iterator<E>
	{

		private int cursor;
		private final int end;

		public ListIterator() {
			// TODO
		}

		@Override
		public boolean hasNext() {
			// TODO
		}

		@Override
		public Integer next() {
			// TODO
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
