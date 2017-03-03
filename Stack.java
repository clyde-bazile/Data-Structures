/** 
  * The Stack class represents a 
  * last-in-first-out (LIFO) stack of objects.
  *
  * @author Clyde-Bazile
  * @since	2017-02-26
  */
public final class Stack<E>
{
	private LinkedList<E> stack;

	/** Creates an empty stack. */
	public Stack() { 
		stack = new LinkedList<>();
	}

	/**
	  * Pushes an item onto the top of this stack.
	  *
	  * @param item 	the item to be pushed onto this stack
	  */
	public void push(E item) { 
		stack.append(item);
	}

	/** 
	  * Removes the object at the top of this stack and returns
	  * that object as the value of this function.
	  * 
	  * @return the object at the top of this stack
	  */
	public E pop() { 
		return stack.deleteLast(); 
	}

	/**
	  * Looks at the object at the top of this stack without removing
	  * it from the stack.
	  *
	  * @return the object at the top of this stack
	  */
	public E peek() { 
		return stack.getLast(); 
	}

	/**
	  * Test if this stack is empty.
	  * 
	  * @return true if and only if this stack contains no items;
	  * false otherwise
	  */
	public boolean isEmpty() { 
		return stack.isEmpty(); 
	}

	/**
	  * Removes all of the elements from this stack.
	  */
	public void clear() {
		stack.clear();
	}

	/**
	  * Returns the number of elements in this stack.
	  *
	  * @return the number of elements in this stack.
	  */
	public int size() {
		return stack.size();
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


