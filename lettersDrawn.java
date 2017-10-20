//package HangmanGame.logic;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class lettersDrawn{

	private static int size; 
	private static int spacing;
	private static String word;
	private static int startX;
	private static String letterString = "";
	private static int lettersGuessed;
	
	/**default constructor class (not normally used)*/
	public lettersDrawn(){
		this("words");
	}
	
	/**String argument constructor class
	*@param String wordGiven
	*sets the spacing and starting position of X to whatever number of letters are in the word*/
	public lettersDrawn(String wordGiven){
	
		word = wordGiven;
		size = word.length();
		
		//startX values were decided on where the first letter looked best when placed in the frame
		if (size == 15){
			spacing = 40;
			startX = 27;
		} else if (size == 10){
			spacing = 50;
			startX = 60;
		} else if (size == 5){
			startX = 207;
			spacing = 50;
		}

	}

	/**drawString method calls canvas.drawString with arguments letterPassed, x, y
	*@param Graphics canvas, String letterPassed, int x, int y
	*@returns void method
	*/
	public static void drawString(Graphics canvas, String letterPassed, int x, int y){
		canvas.drawString(letterPassed, x, y);
		
	}
	
	/**void paint method
	*@param Graphics canvas
	*@returns N/A - void method
	*calls the drawString method as many times as needed with the letters that have been guessed correctly so far
	*OVERVIEW:
	*paints not only the current correct letter but the previous correct letters 
	*these previous correct letters are added/stored in a String called letterString
	*the for loops in this method compares each letter in letterString with each letter in word
	*FOR LOOPS:
	*the nested for loop goes through every index in letterString and compares it to the index in word
	*the 1st for loop then changes the index of word at which letterString it comparing itself to
	*/
	public static void paint(Graphics canvas){
		lettersGuessed = 0;
		int a = 0;
		for (int index = 0; index< size ; index++){
			for (int index2 = 0; index2<letterString.length(); index2++){
				
				if ((letterString.substring(index2,(index2+1))).equals(word.substring(index,(index+1)))){
					drawString(canvas, letterString.substring(index2,(index2+1)), startX + ((index)*spacing), 140);
					++lettersGuessed;
					System.out.println(lettersGuessed);
					}
			}
		}
	}
	
	public static int getInt(){
		return lettersGuessed;
	}
	public static boolean getWinCondition(){
		//System.out.println(lettersGuessed);
		if (size == lettersGuessed){
			return true;
		}else{
			return false;
		}
	}
	
	/**addCorrect method adds the letterToDraw passed from the button pressed to letterString
	*@param String letterToDraw
	*@returns void method
	*/
	public void addCorrect(String letterToDraw){
		letterString += letterToDraw;
	}
}
	