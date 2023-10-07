package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		StuName StuName;
		Scanner Scan = new Scanner(System.in);
		int num;
		
		
		//Write data to file
		System.out.println("Enter file name for storing names: ");
		String stuFile = Scan.next();
        System.out.println("How many students? ");
        num  = Scan.nextInt();
        
        
        try
        {
        	
        	FileOutputStream out = new FileOutputStream(stuFile);
        	ObjectOutputStream writeStuName = new ObjectOutputStream(out);
        	
        	
        	
        	// Run a for statement depending on the number of students inputed by the user
        	for(int i = 0; i < num; i++)
        	{
        		System.out.println("Enter student first name: ");
        		String firstName = Scan.next();
        		
        		System.out.println("Enter student last name: ");
        		String lastName = Scan.next();
        		
        		writeStuName.writeObject(new StuName(firstName, lastName));
        	}
        	writeStuName.close();
        	out.close();
        	System.out.println("Data has been transferred to the file!");
        
        	
        	FileInputStream in = new FileInputStream(stuFile);
        	ObjectInputStream readStu = new ObjectInputStream(in);
        	for (int i = 0; i< num; i++)
        	{
        		System.out.println((StuName) readStu.readObject());
        	}
        	
        	
        }catch(IOException e)
        {
			System.out.println("File could not be created.");
			System.err.println("IOException: " + e.getMessage());
		}
        
       
       
	}
}
        	
        	
      