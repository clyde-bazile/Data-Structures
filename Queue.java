/** 
  * The Queue class represents a 
  * first-in-first-out (FIFO) queue of objects.
  *
  * @author Clyde-Bazile
  * @since	2017-03-07
  */
public final class Queue<E> {

	private LinkedList<E> queue;

	/** Creates an empty queue */
	public Queue() {
		queue = new LinkedList<>();
	}

	/**
	  * Enqueues an item onto the front of this queue.
	  *
	  * @param item 	the item to enqueue into this queue
	  */
	public void enqueue(final E item) {
		queue.append(item);
	}

	/** 
	  * Removes the object at the front of this queue and returns
	  * that object as the value of this function.
	  * 
	  * @return the object at the front of this queue
	  */
	public E deqeue() {
		return queue.deleteFirst();
	}

	/**
	  * Looks at the object at the front of this queue without removing
	  * it from this queue.
	  *
	  * @return the object at the front of this queue
	  */
	public E peek() {
		return queue.getFirst();
	} 

	/**
	  * Test if this queue is empty.
	  * 
	  * @return true if and only if this queue contains no items;
	  * false otherwise
	  */
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	/**
	  * Removes all of the elements from this queue.
	  */
	public void clear() {
		queue.clear();
	}

	/**
	  * Returns the number of elements in this queue.
	  *
	  * @return the number of elements in this queue.
	  */
	public int size() {
		return queue.size();
	}

	/**
	  * {@inheritDoc}
	  */
	@Override
	public String toString() {
		StringBuilder list = new StringBuilder();
		for (E item : queue) {
			list.append(String.format("[%s|", item));
		}
		return list.toString();
	}
}