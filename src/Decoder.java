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

		Node root = getTree();

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

	public Node getTree()
	{
		// parse out our tree from the giant String
		String textWeWant = this.getText().substring(0, this.getText().indexOf(DELIMITER) - 1);
		//String[] tokens = textWeWant.split(" ");
		
		Scanner treeScanner = new Scanner(textWeWant);
		
		

		// fill out our tree
		String path = "0";
		int id, freq = 0;
		Node root = null, current, next = null;
		current = root;

		for (int i=0; i < treeScanner.; i+=3){
			// parsing relevant info
			path = treeScanner.nextInt();
			id = treeScanner.nextInt();
			freq = treeScanner.nextInt();
//			path = tokens[i];
//			id = Integer.parseInt(tokens[i+1]);
//			freq = Integer.parseInt(tokens[i+2]);

			// follwing the path
			for (int j=0; j < path.length()-1; j++){
				if (path.charAt(j) == 0){
					next = current.getLeft();
					if (next == null){ // if a child doesn't exist, create an empty one
						next = new Node((char)-1, -1, null, null);
						current.setLeft(next); // assign the newborn child
					}
				}
				else if (path.charAt(j) == 1){
					next = current.getRight();
					if (next == null){
						next = new Node((char)-1, -1, null, null);
						current.setRight(next);
					}
				}
				current = next;
				next = null;
			}

			// setting variables at the end of that path
			current.setToken((char) id);
			current.setFrequency(freq);
			current = root;
		}

		return root;
	}

	public String getText()
	{
		return this.text;
	}

}
