package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class FindAndReplace 
{

	public static void main(String[] args) throws ClassNotFoundException 
	{
		Scanner Scan = new Scanner(System.in);
		FileWriter out;
		BufferedWriter writeFile;
		String text;
		
        
        try
        {
        	String dataFile = null;
			out = new FileWriter(dataFile);
        	writeFile = new BufferedWriter(out);
        	System.out.println("Enter file name for storing names: ");
			File textFile = new File(Scan.next());
	        System.out.println("Enter a sentence or phrase:");
	        text = Scan.next();
	        System.out.println("Enter the word you want to replace");
	        String word = Scan.next();
        	
        	
        	
        }catch (IOException e)
        {
        	System.out.println("File could not be created.");
        	System.err.println("IOException: " + e.getMessage());
        }
        
        
        
        
        
	}
}