import java.util.LinkedList;

/** 
  * The Stack class represents a 
  * last-in-first-out (LIFO) stack of objects.
  *
  * @author 	Clyde-Bazile
  * @since 	2017-02-26
  */
public class Stack<E>
{
	private LinkedList<E> stack;

	/** Creates an empty stack. */
	public Stack()
	{ stack = new LinkedList<>(); }

	/**
	  * Pushes an item onto the top of this stack.
	  *
	  * @param item 	the item to be pushed onto this stack
	  */
	public void push(E item)
	{ stack.addFirst(item); }

	/** 
	  * Removes the object at the top of this stack and returns
	  * that object as the value of this function.
	  * 
	  * @return the object at the top of this stack
	  */
	public E pop()
	{ return stack.poll(); }

	/**
	  * Looks at the object at the top of this stack without removing
	  * it from the stack.
	  *
	  * @return the object at the top of this stack
	  */
	public E peek()
	{ return stack.peek(); }

	/**
	  * Test if this stack is empty.
	  * 
	  * @return true if and only if this stack contains no items;
	  * false otherwise
	  */
	public boolean isEmpty()
	{ return stack.isEmpty(); }
}


