package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;


public class StuName implements Serializable 
{

	String firstName;
	String lastName;

	
	//constructor
	
	public StuName(String fName, String lName) 
	{
		firstName = fName;
		lastName = lName;
	}
	
	
	public String toString() 
	{
		String stuNameString;
		
		stuNameString = firstName + " " + lastName;
		return(stuNameString);
	}
}


