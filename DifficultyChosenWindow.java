//package HangmanGame.gui;

/** imports everything necessary */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import HangmanGame.logic.*;

/** @Creates the DifficultyChosenWindow class
*@Purpose To call the MainGameWindow class according to a constructor chosen based on the button clicked
*/

public class DifficultyChosenWindow extends JFrame implements ActionListener{
	
	/** 
	creates the following instance variables 
	*/
	private static final int WINDOW_WIDTH = 100;
    private static final int WINDOW_HEIGHT = 300;
	JButton button1;
	JButton button2;
	JButton button3;
	JPanel panel;
	JLabel label1;
	JLabel label2;
	
	/** 
	*@Creates labels1, label2, button1, button2, button3, panel
	*@Places all of these widgets in their correct location
	*@Actions sets the buttons to be inside the panel and for each of the buttons to have a purpose
	*/
	public DifficultyChosenWindow() {
		
		label1 = new JLabel("Welcome to Hangman.", SwingConstants.CENTER);
		label2 = new JLabel("Start the game by selecting a difficulty listed above", SwingConstants.CENTER);
		button1 = new JButton ("Hard Difficulty");
		button2 = new JButton ("Medium Difficulty");
		button3 = new JButton ("Easy Difficulty");
		panel = new JPanel (new FlowLayout());
		panel.add(button1, SwingConstants.CENTER);
		panel.add(button2, SwingConstants.CENTER);
		panel.add(button3, SwingConstants.CENTER);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		add(label1,BorderLayout.NORTH);
		add(label2,BorderLayout.SOUTH);
		add(panel,BorderLayout.CENTER);
		
		button3.addActionListener(this);
		button2.addActionListener(this);
		button1.addActionListener(this);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/** @Calls MainGameWindow class
	*@Ifs if the button marked "hard" is clicked it will call the class with "Hard" as a constructor, the same for other difficulties
	*/
	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand().equals("Hard Difficulty")){
			
			WordBeingGuessed newWord = new WordBeingGuessed(3);
			MainGameWindow newWindow3 = new MainGameWindow(newWord.wordChosen());

		} else if(event.getActionCommand().equals("Medium Difficulty")) { 
			
			WordBeingGuessed newWord = new WordBeingGuessed(2);
			MainGameWindow newWindow3 = new MainGameWindow(newWord.wordChosen());
			
		} else if(event.getActionCommand().equals("Easy Difficulty")) {
			
			WordBeingGuessed newWord = new WordBeingGuessed(1);
			MainGameWindow newWindow3 = new MainGameWindow(newWord.wordChosen());
			
		}
		
	
	}
	
	/*
	public static void main (String[] args) {
		
		DifficultyChosenWindow newWindow = new DifficultyChosenWindow();
		
	}
	*/
}
	
	