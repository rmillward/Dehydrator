//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 4
//Huffman Encoding and Decoding
//21 November 2012
//Node Object

public class Node implements Comparable<Node> {

	private char 	token;
	private int 	frequency;
	private Node 	left;
	private Node 	right;

	Node(char ch, int freq, Node left, Node right) {
		this.setToken(token);
		this.setFrequency(frequency);
		this.setLeft(left);
		this.setRight(right);
	}

	public char getToken() {
		return token;
	}

	public void setToken(char token) {
		this.token = token;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	// is the node a leaf node?
	public boolean isLeaf() {
		return (getLeft() == null && getRight() == null);
	}

	/**
	 * returns a positive value when this node has a larger value than arg,
	 * negative when this node's frequency is smaller
	 */
	public int compareTo(Node other) {

		return (other.getFrequency() - this.getFrequency());
	}

}
