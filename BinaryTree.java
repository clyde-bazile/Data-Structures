import java.util.Collection;

/**
  * Abstract binary tree class.
  *
  * @author Clyde-Bazile
  * @since 2017-03-20
  */
public abstract class BinaryTree<E extends Comparable<? extends E>>{

	protected Node<E> root = new Node<>();

	/** constructs an empty binary tree */
	public BinaryTree(){;}

	/** Constructs a tree contaning the elements of the specified collection
	  * in the order they are returned by the collection's iterator.
	  */
	public BinaryTree(final Collection<? extends E> c) {
		for (E item : c) {
			insert(item);
		}
	}

	/**
	  * Inserts the specified element into this tree.
	  *
	  * @param e 	the element to be inserted
	  */
	public abstract void insert(final E e);

	/**
	  * Deletes and returns the first occurence of the specified element in this tree.
	  *
	  * @param e 	the element to be deleted.
	  * @return the specified element; null if the specified element does not exist.
	  */
	public abstract E delete(final E e);

	/**
	  * Finds and returns the minimum element in this tree.
	  *
	  *	@return the minimum element in this tree.
	  */
	public abstract E minimum();

	/**
	  * Finds and returns the maximum element in this tree.
	  *
	  *	@return the maximum element in this tree.
	  */
	public abstract E maximum();

	/**
	  * Returns true if the specified element is in this tree.
	  *
	  * @param e 	the element whose presence in this tree is to be tested.
	  * @return true if the tree contains the specified element; false otherwise.
	  */
	public abstract boolean contains(final E e);

	/**
	  * Returns the first occurence of a node containing the specified data in this tree. 
	  *
	  * @param data 	the data to be searched for.
	  * @return the node containing the specified data; null otherwise.
	  */
	protected abstract Node<E> search(final E data);

	/** Binary Node class */
	final protected class Node<E>{
		E data;
		Node<E> left;
		Node<E> right;

		Node() {
			this(null, null, null);
		}

		Node(E data, Node<E> left, Node<E> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

}
