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
	
	//getter for the big string
	public String getText()
	{
		return this.inputFileText;
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
			//create a new Scanner object, reading in the filename
			Scanner encoderScanner= new Scanner(args[1]);
			
			//pass the string from the read in to the encoder
			Encoder encoder= new Encoder(encoderScanner.getText());
			
			//print outputs
			System.out.print("Compression ratio: "+
					encoder.getCompressionRatio());
			
			//print out the filename where the compressed file is stored.
			System.out.println("The compressed file can be found at:\n"+
			encoder.getCompressedFilename());
		}
		
		//perform a decode
		if (args[0].compareTo("decode") == 0)
		{
			Scanner decoderScanner= new Scanner(args[1]);
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
