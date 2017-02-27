import java.util.Iterator;

/** LinkedList */

public class LinkedList<E> implements Iterable<E>
{

	public LinkedList() { 
		// TODO 
	}

	public LinkedList(Collections<? extends E> c) {
		// TODO
	}

	public E search(E item) { 
		// TODO 
	}

	public void insert(E item) {
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
