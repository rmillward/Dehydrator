import java.util.*;

//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 4
//Huffman Encoding and Decoding
//21 November 2012
//Decoding via Huffman Algorithm

public class Decoder {
	
	public static final String DELIMITER = "END_OF_TREE";
	
	//save the this.getText() as a value so it can be accessed
	private String text;

	/**
	 * Should output decoded file to a different this.getText() file
	 * 
	 * @param this.getText() this.getText() to be decoded as an argument
	 */
	public Decoder(String text) {

		this.text= text;
		
		Node temp = root; // temp copy of our tree for the same file encoded above

		for (int i = 0; i < this.getText().length(); i++) {
			if(this.getText().charAt(i) == '0'){ //when reading the file, if we get a 0, traverse the tree left
				temp = temp.getLeft();
			}
			else if(this.getText().charAt(i) == '1')// if we get a 1, traverse the tree right
			{
				temp = temp.getRight();
			}

			if(temp.isLeaf())
			{ // if the above traversal took us to a leaf, write the char id at that leaf
				if(temp.getToken() == '\t') // special case error handling for tabs
					System.out.println('\t');
				else if(temp.getToken() == '\n') // special case error handling for returns
					System.out.println("\r\n");
				else
					System.out.println(temp.getToken());
				temp = root; // go to the top of the tree
			}
		}
	}
	
	public Node getTree(Node root)
	{
		if (root.isLeaf())
			return root;
		else
		{
			return new Node(this.get, 0, root, root)
		}
	}

	public String getText()
	{
		return this.text;
	}

}
