/**
 * A class to model a node in a tree.
 * 
 * 
 * >>> Each node is instanciated with no children (leaf).
 * >>> When the branching is increased, leaf nodes should branch out (create two children)
 *  >> This should make up the coordinate tree to draw easily between the coordinates. 
 * 
 * 
 */


/**
 * 
 * @author Chloe
 *
 * @param <E> The element to be stored in this child.
 */
public class Node<E> {

	private Node<E> leftChild;
	private Node<E> rightChild;
	
	public Node(E left, E right) 
	{
		leftChild = null;
		rightChild = null;
	}
	
	public void branch() 
	{
		
	}
	
}
