import java.util.Collection;


public abstract class BinaryTree<E>{

	protected Node<E> root = new Node<>();

	public BinaryTree(){ 
		// TODO
	}

	public BinaryTree(final Collection<? extends E> c) {
		// TODO
	}

	public abstract void insert(final E data);

	public abstract void delete(final E data);

	public abstract E minimum(final E data);

	public abstract E maximum(final E data);

	public abstract boolean contains(final E data);

	protected abstract Node<E> search(final E data);

	protected class Node<E>{
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
