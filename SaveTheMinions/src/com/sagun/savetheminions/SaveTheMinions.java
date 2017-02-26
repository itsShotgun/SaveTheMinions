package com.sagun.savetheminions;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SaveTheMinions {
	static JPanel pagesPane= new JPanel(); 	
	static JPanel letters=new JPanel();
	static String retWord;
	private static JFrame mainFrame;
	public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
	public void run() {
				
//===================================================| MAIN CONTAINER |===================================================== //
	
		mainFrame=new JFrame("Save the Minions"); 						
		ImageIcon icon = new ImageIcon											
		("data"+File.separator+"Misc"+File.separator+"icon.data");				//  Adding Icon at top 			   		 //
		mainFrame.setIconImage(icon.getImage());								// Icon                        			 //
		mainFrame.setVisible(true);						 						
		mainFrame.setSize(930,710);							 					
		mainFrame.setVisible(true);						 						
		mainFrame.setLocationRelativeTo(null);									
		mainFrame.setResizable(false);		
		JLabel mainBackgoundImage=new JLabel ("");								
		mainFrame.add(mainBackgoundImage);										
		mainBackgoundImage.setIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"bg.data"));   	
		mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);	
		mainFrame.addWindowListener(new WindowAdapter() {
		
	
		public void windowClosing(WindowEvent e)							// When user Press (X) button to close application //
		{ 
		 String promptButtons[] = {"Yes","No"};								// Creating Yes/No button for close dialog         //
		 final ImageIcon icon = new ImageIcon("data"+File.separator+"Misc"+File.separator+"exit.data"); // Setting image       //
		 JLabel exitMsg = new JLabel("<html>Are you sure you want to exit?<br/> All of your progress including your scores will be lost<br/></html>"); //Message to show on close //
		 exitMsg.setFont(new Font("Hobo Std", Font.PLAIN, 18));            // Setting Font 									   //
		 exitMsg.setForeground(new Color(241, 144, 0));					   //Font Color 									   //
		 int Answer = JOptionPane.showOptionDialog(null,exitMsg,"Are you sure?",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,icon,promptButtons,promptButtons[1]); //JOption on close//
		 if(Answer==JOptionPane.YES_OPTION) 							   // Checking if user presses Yes or No Button        //
		 {System.exit(0);}												   // Closing the Application  						   //
		}
		});
		
		
//===================================================| ALL PAGES HOLDER |===================================================== //		
							
	    pagesPane.setSize(930,710);
		pagesPane.setOpaque(false);
		pagesPane.setLayout(null);
		mainBackgoundImage.add(pagesPane);
		
//===================================================| DISCLAIMER PAGE |===================================================== //
		// Disclaimer Components Holder //
		
		final JPanel disclaimerPane=new JPanel();
		disclaimerPane.setOpaque(false);
		disclaimerPane.setLayout(null);
		pagesPane.add(disclaimerPane);
		disclaimerPane.setBounds(20, 2, 880, 690);
		
		// Save the minions image at top //
		JLabel studentDetails=new JLabel();
		studentDetails.setIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"studentDetails.data"));
		disclaimerPane.add(studentDetails);
		studentDetails.setBounds(340, -74 , 350, 450);
		
		
		// Disclaimer information detail image //
		JLabel disclaimer=new JLabel("");
		disclaimer.setIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"disclaimer.data"));
		disclaimerPane.add(disclaimer);
		disclaimer.setBounds(10, 290 , 865, 375);
		
		// Button to proceed next page //
		JButton proceed_HowTo= new JButton(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"proceed.data"));
		disclaimerPane.add(proceed_HowTo);
		proceed_HowTo.setBounds(640, 550 , 200, 88);
		proceed_HowTo.setBorderPainted(false); //Removing border around button//
		proceed_HowTo.setRolloverIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"proceed_hover.data"));
		disclaimerPane.setVisible(true);
		proceed_HowTo.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent arg0) {
		howToPlay();
		}

//===================================================| HOW TO PLAY PAGE |===================================================== //

private void howToPlay() {
	            
            	// How To Play Components Holder //
				disclaimerPane.setVisible(false);
				final JPanel howToPlayPane=new JPanel();
				howToPlayPane.setVisible(true);
        		howToPlayPane.setOpaque(false);
        		howToPlayPane.setLayout(null);
        		pagesPane.add(howToPlayPane);
        		howToPlayPane.setBounds(20, 2, 880, 690);
        		
        		// victor image at top //
        		JLabel victor=new JLabel();
        		victor.setIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"victor.data"));
        		howToPlayPane.add(victor);
        		victor.setBounds(200, 0 , 550, 300);
        		
        		// How to play detail image //
        		JLabel how=new JLabel("");
        		how.setIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"howto.data"));
        		howToPlayPane.add(how);
        		how.setBounds(10, 290 , 865, 375);
        		
        		// Button to Start Game next page //
        		JButton proceed_startGame= new JButton(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"proceed.data"));
        		howToPlayPane.add(proceed_startGame);
        		proceed_startGame.setBounds(640, 550 , 200, 88);
        		proceed_startGame.setBorderPainted(false); 
        		proceed_startGame.setRolloverIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"proceed_hover.data"));
        		
        		mainFrame.setVisible(false);
        		mainFrame.setVisible(true);
        		proceed_startGame.addActionListener(new ActionListener() {
        		
        		public void actionPerformed(ActionEvent arg1)
        		{
        			 gamesOn();
        			 howToPlayPane.setVisible(false); } });
}


	//===================================================| GAMES ON PAGE :) |===================================================== //                      
	
private void gamesOn() {
	
	// Games On Components Holder //
    JPanel GamesOn=new JPanel();
    GamesOn.setVisible(true);
    GamesOn.setOpaque(false);
    GamesOn.setLayout(null);
    pagesPane.add(GamesOn);
    GamesOn.setBounds(20, 2, 880, 690);
    
    //Score//
    JLabel minions=new JLabel();
    minions.setIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"Score.data"));
	GamesOn.add(minions);
	minions.setBounds(640, 90 , 180, 210);
	JLabel score=new JLabel("20");
    score.setForeground(new Color(241, 144, 0));
    score.setFont(new Font("Hobo Std", Font.PLAIN, 30));
	score.setBounds(110, 110 , 40, 50);
	minions.add(score);
	
    
    // Keyboard and Game Pane holder//
    JLabel letrGamPanel=new JLabel();
    letrGamPanel.setIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"fill.data"));
    GamesOn.add(letrGamPanel);
    letrGamPanel.setBounds(10, 290 , 865, 375);
    
    //Hint Image Border//
    JLabel hintBorder=new JLabel();
    hintBorder.setBounds(295, 25, 285, 155);
    hintBorder.setIcon(new ImageIcon ("data"+File.separator+"Misc"+File.separator+"photoHolder.data"));
    hintBorder.setOpaque(false);
    letrGamPanel.add(hintBorder);
    
    //Hint Image//
    JLabel hint=new JLabel();
    hint.setBounds(315, 25, 285, 155);
    hint.setOpaque(false);
    letrGamPanel.add(hint);

    letrGamPanel.add(letters);
    letters.setOpaque(true); 
    letters.setBounds(20, 250 , 825,100);
    letters.setOpaque(false);
  
    // Game Pane //
    JPanel game=new JPanel();
    game.setBounds(40,185,780,90);
    game.setOpaque(false);
    letrGamPanel.add(game);
    
    
//===================================================| FETCHING REAL WORD FROM DATABASE |===================================================== //
    
    DataHandling data = new DataHandling(); 	
    String randomWord=null;
    retWord=data.dataReturn(randomWord);
    

//===================================================| CHANGING FETCHED LETTERS TO '_' |===================================================== //
    
    hint.setIcon(new ImageIcon ("data"+File.separator+"Characters"+File.separator+retWord+".DPM")); //Pictures for Guessing letters//                
    for(int i =0; i< retWord.length() ;i++){
    JTextField question = new JTextField("_");
    game.add(question);
    question.setForeground(new Color(241, 144, 0));  
    question.setFont(new Font("Elephant" /*Hobo Std*/, Font.BOLD, 44)); 
    question.setOpaque(false);
    question.setBorder(null);
    question.setEditable(false);
    }
    
    int[] myInt = new int[retWord.length()];	
    
    char word = retWord.charAt(0); 
    int length = retWord.length();
    char[] word_arr = retWord.toCharArray();
    for(int count = 0; count<length; count++){
    //System.out.print(word_arr[count]); 
    
    }
 
    
//===================================================| REVEALING WORDS UPON RIGHT GUESS |===================================================== //


  
//===================================================| Splitting word to array |===================================================== //                
   
    
  
createKeyboard();        		    
}

//===================================================| CREATING BUTTONS USING ARRRAY |===================================================== //

private void createKeyboard() {
	final JButton alpha[]=new JButton[91];  	// Making array of JButton 91 : Estimating the last number in ASCII is 90         // 
    for(int i=65; i<alpha.length; i++){			// First letter i.e. "A" in ASCII is supposed to be 65 hence loop started from 65 //
    alpha[i] = new JButton();					// Creating 26 JButton Assigning individual number from 65-90 i.e A-Z (ASCII)	  // 
    letters.add (alpha[i]);						// Adding all of the letters to The Pane or window 								  //
    alpha[i].setIcon((new ImageIcon( "data"+File.separator+"Letters"+ File.separator +  i+".let" ))); // Image for Buttons   	  //
  
    alpha[i].addActionListener(new ActionListener() {    
    String s=new String("");
    int error = 0; //Error count
    int j=0;
   
 	public void actionPerformed(ActionEvent arg1) {
	for (int i = 0; i < 91; i++) 				// Setting Condition to fetch values from individual numbers upto 91              // 
    	{ 								
    	 if(arg1.getSource()==alpha[i]) 		// Fetching each of the values assigned for individual numbers					  //
    	  	{
    		  char asciiToChar = (char)i;		// Changing each of the buttons ASCII numbers to Alphabets 						  //
    		  alpha[i].setEnabled(false);		// Disabling the the buttons after it'll be clicked                               // 
    		  alpha[i].setToolTipText("You've already tried this letter once"); //Setting tool-tip text when it is hovered        //
    		  JOptionPane.showMessageDialog(null, asciiToChar);
    		
    		  //String guess= Character.toString(asciiToChar);
    		  //alpha[i].setBackground(new Color(255, 174, 183)); //in case of wrong
  
 
  //====================================================| COUNTING ERRORS |======================================================== //
/*
    		  
    		 
    		  for (j=0; j < retWord.length(); j++)
  		    {
  		        if (retWord.charAt(j) == asciiToChar)
  		        {
  		             error++;
  		        }
  		    }
  		    System.out.println(error);
  		    
*/
    		  
//===================================================| Needs Modification |==============================================================//  		    
    		  
  		      String word = retWord; // what the user must guess	
    		  String s = "" + asciiToChar;
    		  StringBuilder gletters = new StringBuilder(s); // letters guessed
    		  //s.concat("" + asciiToChar);
    		  String mainword = word.replaceAll("[^" + gletters + "]", "_");
    		  System.out.println(mainword);
    	  	}
    	
    	 
    	  }} });} 			  					// End of Adding alphabets buttons    											  // 
} });  						  					// End of Disclaimer Action Listener  											  //
mainFrame.setVisible(false);  					// Making Frame invisible to make every component visible after adding components //
mainFrame.setVisible(true);   					// Making Frame visible             											  //
			       	
		}
	});
	
}    
}
		