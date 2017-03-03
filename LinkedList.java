import java.util.Iterator;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Collections;

/** 
  * Circular, doubly linked list with sentinel whose next always points
  * to head and whose previous always points to tail.
  * 
  * @author	Clyde-Bazile
  * @since 	2017-02-27
  */
public final class LinkedList<E> implements Iterable<E>
{
	private int size;
	private Node<E> sentinel = new Node<>();

	/** Doubly-LinkedList Node */
	private final class Node<E> 
	{
		private final E key;
		private Node<E> next;
		private Node<E> prev;

		Node(){
			this(null, null, null);
		}

		Node(E key, Node<E> prev, Node<E> next){
			this.key = key;
			this.prev = prev;
			this.next = next;
		}
	}

	/** Constructs an empty list. */
	public LinkedList() {
		clear();
	}

	/** Constructs a list contaning the elements of the specified collection
	  * in the order they are returned by the collection's iterator.
	  */
	public LinkedList(final Collection<? extends E> c) {
		this();
		addAll(c);
	}

	/**
	  * Inserts the specified element at the front of the list.
	  * 
	  * @param e	the element to be inserted
	  */
	public void insert(final E e) {
		Node<E> newNode = new Node<>(e, sentinel, sentinel.next);
		sentinel.next.prev = newNode;
		sentinel.next = newNode;
		++size;
	}

	/**
	  * Deletes the first occurance specified element in this list 
	  * if present.
	  *
	  * @param e	the element to be deleted
	  */
	public void delete(final E e) {
		Node<E> nodeFound = search(e);
		delete(nodeFound);
	}

	/** 
	 * Returns true if this list contains the specified element.
	 *
	 * @param e		element whose presence in this list is to be tested
	 * @return	true if this list contains the specified element; false otherwise
	 */
	public boolean contains(final E e) {
		return search(e) != null;
	}

	/** 
	 * Returns the number of elements in this list.
	 *
	 * @return the number of elements in this list
	 */
	public int size() { 
		return size; 
	}
	
	/** 
	 * Returns true if and only if this list contains no elements.
	 *
	 * @return true if this list contains no elements; false otherwise
	 */
	public boolean isEmpty() {
		return size() == 0;
	}

	public void clear() {
		sentinel.next = sentinel;
		sentinel.prev = sentinel;
		size = 0;
	}

	/** 
	 * Appends the specfied element to the end of this list.
	 *
	 * @param e 	the elmenet to add
	 */
	public void append(final E e) {
		Node<E> newNode = new Node<>(e, sentinel.prev, sentinel);
		sentinel.prev.next = newNode;
		sentinel.prev = newNode;
		++size;
	}

	/** 
	 * Appends all elements in the specified collection to the end of this
	 * list, in the order the elements are returned from the specified 
	 * collection's iterator.
	 *
	 * @param c 	the collection to append to this list
	 */
	public void addAll(final Collection<? extends E> c) {
		for (E key : c) {
			append(key);
		}
	}

	/** 
	 * Deletes and returns the first element from this list.
	 *
	 * @return the first element in this list
	 */
	public Node<E> deleteFirst() {
		Node<E> head = sentinel.next;
		delete(head);
		return head;
	}

	/** 
	 * Deletes and returns the last element from this list.
	 *
	 * @return the last element in this list
	 */
	public Node<E> deleteLast() {
		Node<E> tail = sentinel.prev;
		delete(tail);
		return tail;
	}

	/** Finds and returns the first ocurrence of the node containing the specifed element */
	private Node<E> search(final E e) {
		for (Node<E> current = sentinel.next; current != sentinel; current = current.next) {
			if (current.key == e) {
				return current;
			}
		}
		return null;
	}

	/** Deletes the specified Node */
	private void delete(Node<E> e) {
		try {
			e.prev.next = e.next;
			e.next.prev = e.prev;
			if (size > 0) {
				--size;
			}
		} catch (NullPointerException expected) {
		}
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuilder list = new StringBuilder();
		for (E current : this){
			list.append(String.format("[ %s ]->", current));
		}
		return list.toString();
	}

	@Override
	public Iterator<E> iterator(){
		if (isEmpty()) {
			return Collections.<E>emptyList().iterator();
		}
		return new ListIterator();
	}

	/**
	  * {@inheritDoc}
	  */
	private final class ListIterator implements Iterator<E>
	{
		private Node<E> cursor = sentinel.next;
		private final Node<E> end = sentinel;

		@Override
		public boolean hasNext() {
			return cursor != end;
		}

		@Override
		public E next() {
			if(hasNext()){
				Node<E> currentNode = cursor;
				cursor = cursor.next;
				return currentNode.key;
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
