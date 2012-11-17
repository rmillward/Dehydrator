//Brandon Forster, Robert Millward,
//William Corlett and Phillip Rajala
//COP 3503 Assignment 4
//Huffman Encoding and Decoding
//21 November 2012
//Launcher and Helper Object

import java.util.*;

public class Launcher {
	
	private String inputFileText;
	
	public Launcher(String inputFilename)
	{
		try{
			Scanner inputReader= new Scanner(inputFilename);
			
			while (inputReader.hasNext())
			{
				inputFileText= inputFileText + inputReader.next();
			}
			
			inputReader.close();
		}
		catch (Exception e)
		{
			System.out.println("File not found. Please relaunch.");
			System.exit(1);
		}
	}
	
	//getter for the big string
	public String getText()
	{
		return this.inputFileText;
	}

	/**
	 * The main function for @Launcher.
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
			//create a new Launcher object, reading in the filename
			Launcher encoderScanner= new Launcher(args[1]);
			
			//pass the string from the read in to the encoder
			Encoder encoder= new Encoder(encoderScanner.getText());
			
			//print outputs
			System.out.println("Compression ratio: "+
					encoder.getCompressionRatio());
			
			//print out the filename where the compressed file is stored.
			System.out.println("The compressed file can be found at:\n"+
			encoder.getCompressedFilename());
		}
		
		//perform a decode
		else if (args[0].compareTo("decode") == 0)
		{
			//create a new Launcher object, reading in the filename
			Launcher decoderScanner= new Launcher(args[1]);
			
			//pass the string from the read in to the decoder
			Decoder decoder= new Decoder(decoderScanner.getText());
			
			//print outputs
			System.out.print("Decompression ratio: "+
					decoder.getDecompressionRatio());
			
			//print out the filename where the decompressed file is stored.
			System.out.println("The decompressed file can be found at:\n"+
			decoder.getDecompressedFilename());
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
