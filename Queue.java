/** 
* The Queue class represents a first-in-first-out 
* (FIFO) queue of objects.
* 
* @author 	Clyde-Bazile
* @since 	2017-03-07
*/
public final class Queue<E> {

	private LinkedList<E> queue;

	public Queue() {
		queue = new Queue<>();
	}

	public void enqueue() {
		// TODO
	}

	public E deqeue() {
		// TODO
		return null;
	}

	public E peek() {
		// TODO
		return null;
	} 

	public boolean isEmpty() {
		// TODO
		return false;
	}

	public void clear() {
		// TODO
	}

	public int size() {
		// TODO
		return 0;
	}

	/**
	  * {@inheritDoc}
	  */
	@Override
	public String toString() {
		StringBuilder list = new StringBuilder();
		for (E item : stack) {
			list.append(String.format("[%s|", item));
		}
		return list.toString();
	}

}