//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 4
//Huffman Encoding and Decoding
//21 November 2012
//Encoding via Huffman Algorithm

public class Encoder {
	
	//size of full ascii table
    private static final int ASCII_ALPHABET_SIZE = 256;

	/**
	 * Should output encoded file to a different text file
	 * 
	 * @param text text to be encoded as an argument
	 */
	public Encoder(String text) {
		
		//make a table to keep track of how many times each ascii character
		//appears
		int[] frequencyTable= new int[ASCII_ALPHABET_SIZE];
		
		//for each character in text
		for (int i = 0; i< text.length(); i++)
		{
			//makes an int cast on the character at i, giving us its ascii
			//value. increment that ascii value in the table
			frequencyTable[(int)text.charAt(i)]++;
		}
	}

	//return the compression ratio of the original file:compressed file
	public String getCompressionRatio() {
		// TODO Auto-generated method stub
		return null;
	}

	//return the filename of the compressed file that the Encoder outputs
	public String getCompressedFilename() {
		// TODO Auto-generated method stub
		return null;
	}

}
