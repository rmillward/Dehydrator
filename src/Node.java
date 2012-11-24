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
        this.token    	= token;
        this.frequency  = frequency;
        this.left  		= left;
        this.right 		= right;
    }

    // is the node a leaf node?
    private boolean isLeaf() {
        return (left == null && right == null);
    }

	/**
	 * returns a positive value when this node has a larger value than arg,
	 * negative when this node's frequency is smaller
	 */
	public int compareTo(Node other) {
		
		return (other.frequency - this.frequency);
	}

}
