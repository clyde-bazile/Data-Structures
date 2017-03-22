import java.util.Collection;

/**
  * Binary Search Tree implementation that extends the abstract
  * {@code BinaryTree} class.
  *
  * @author Clyde-Bazile
  * @since 2017-03-21
  */
public final class BinarySearchTree<E extends Comparable<? extends E>> extends BinaryTree<E> {

	public BinarySearchTree() {
		super();
	}

	public BinarySearchTree(final Collection<? extends E> c) {
		super(c);
	}

	/**
	  * {@inheritDoc}
	  */
	public void insert(final E e) {
		// TODO
	}

	/**
	  * {@inheritDoc}
	  */
	public E delete(final E e) {
		// TODO
		return null;
	}

	/**
	  * {@inheritDoc}
	  */
	public E minimum() {
		// TODO
		return null;
	}

	/**
	  * {@inheritDoc}
	  */
	public E maximum() {
		// TODO
		return null;
	}

	/**
	  * {@inheritDoc}
	  */
	public boolean contains(final E e) {
		// TODO
		return false;
	}

	/**
	  * {@inheritDoc}
	  */
	protected Node<E> search(final E data) {
		// TODO
		return null;
	}
}