import java.util.Collection;
import java.util.Random;
import java.util.List;
import java.util.LinkedList;

/**
  * Binary Search Tree implementation that extends the abstract
  * {@code BinaryTree} class.
  *
  * @author Clyde-Bazile
  * @since 2017-03-21
  */
public final class BSTree<E extends Comparable<E>> extends BinaryTree<E> {

	public BSTree() {
		super();
	}

	public BSTree(final Collection<? extends E> c) {
		super(c);
	}

	/**
	  * {@inheritDoc}
	  */
	public void insert(final E e) {
		root = insert(e, root);	
	}

	private Node insert(final E e, Node current) {
		if (current == null) {
			return new Node(e, null, null);
		}
		if (e.compareTo(current.data) < 0) {
			current.left = insert(e, current.left);
		} else {
			current.right = insert(e, current.right);
		}
		return current;
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
	protected Node search(final E data) {
		// TODO
		return null;
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node current) {
		if (current != null) {
			inOrder(current.left);
			System.out.println(current.data);
			inOrder(current.right);
		}
	}

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		Random rm = new Random();
		for (int i = 0; i < 20; i++) {
			list.add(rm.nextInt() % 100);
		}
		System.out.println(list);
		BSTree<Integer> bs = new BSTree<>(list);
		
		bs.inOrder();

		
	}
}











