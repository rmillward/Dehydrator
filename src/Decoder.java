//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 4
//Huffman Encoding and Decoding
//21 November 2012
//Decoding via Huffman Algorithm

public class Decoder {

	/**
	 * Should output decoded file to a different text file
	 * 
	 * @param text text to be decoded as an argument
	 */
	public Decoder(String text) {

		Node temp = root; // temp copy of our tree for the same file encoded above

		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == '0'){ //when reading the file, if we get a 0, traverse the tree left
				temp = temp.getLeft();
			}
			else if(text.charAt(i) == '1')// if we get a 1, traverse the tree right
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

	//return the compression ratio of the compressed file:decompressed file
	public String getDecompressionRatio() {
		// TODO Auto-generated method stub
		return null;
	}

	//return the filename of the decompressed file that the Decoder outputs
	public String getDecompressedFilename() {
		// TODO Auto-generated method stub
		return null;
	}

}
