package com.sagun.savetheminions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class DataHandling {	
public String dataReturn(String randomWord){
	try{															// Exception handling for file not found  
        BufferedReader reader = new BufferedReader(new FileReader("data"+File.separator+"Characters"+File.separator+"characters.data")); // Fetching characters.data file
        String line = reader.readLine(); 			     			// reading the file line by line
        List<String> words = new ArrayList<String>(); 				// creating array lists
        while(line != null) { 										// reading to end of file
            String[] wordsLine = line.split(" "); 					//reading the string in form of array
            for(String word : wordsLine) { 							//Reading Each line 
                words.add(word);
            }
            line = reader.readLine();
        }
        Random rand = new Random(System.currentTimeMillis()); 		// Creating Random Keys per milliseconds
        randomWord = words.get(rand.nextInt(words.size())); 		// Fetching random string
        reader.close();												// Closing the Opened files
        return randomWord;											//Returning Values to main Class 
    
	} catch (Exception e) {     									//Exception Handling if "File Not Found"
    	JOptionPane.showMessageDialog
    	(null, "Some of the files are missing from your directory \n Please re-install the program and try to run it again", "Error", JOptionPane.ERROR_MESSAGE,null);
		System.exit(0);												// Ending program if "File Not Found" 
    	}
	return randomWord;												//Returning value to main class//
	}
}
