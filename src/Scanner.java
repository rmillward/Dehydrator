//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 4
//Huffman Encoding and Decoding
//21 November 2012
//Scanner and Helper Object

public class Scanner {
	
	private String inputFileText;
	
	public Scanner(String inputFilename)
	{
		
	}

	/**
	 * The main function for @Scanner.
	 * 
	 * Functions as a helper function to launch the rest of the program. 
	 * 
	 * @param args 0 must be "encode" or "decode", 1 is the filename 
	 */
	public static void main(String[] args)
	{
		//perform an encode
		if (args[0].compareTo("encode") == 0)
		{
			new Scanner(args[1]);
		}
		
		//perform a decode
		if (args[0].compareTo("decode") == 0)
		{
			new Scanner(args[1]);
		}
		
		//if there is an error in the scripting file
		else
		{
			System.out.println("Invalid argument to function call.\n" +
					"Please edit your argument.");
			System.exit(1);
			
		}
	}

}
