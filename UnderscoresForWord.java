//Important packaging info
//package HangmanGame.logic;

//imports necessary items
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UnderscoresForWord{
	
	//keeps track of how many underscores it should draw
	private int numberOfUnderscores;
	
	/**default constructor (normally not used)*/
	public UnderscoresForWord(){
		this("words");
	}
	
	/**String Constructor 
	*@param String type variable word
	*sets the number of underscores to the # of letters in the word*/
	public UnderscoresForWord(String word){
		numberOfUnderscores = word.length();
	}
	
	/**drawLine method which calls canvas.drawLine and passes x1, y1, x2, y2 as variables
	*@param Graphics canvas, Int variables x1,y1,x2,y2
	*@returns void method
	*/
	public void drawLine(Graphics canvas, int x1, int y1, int x2, int y2){
		canvas.drawLine(x1, y1, x2, y2);
	}
	
	/**paint method that uses numberOfUnderscores as a switch statement 
	*calls the drawLine method as many times with the correct spacing and coordinates
	*@param Graphics canvas
	*@returns void method
	*/
	public void paint(Graphics canvas){
		switch (numberOfUnderscores) {
			case 5: drawLine(canvas, 200, 150, 225, 150);
					drawLine(canvas, 250, 150, 275, 150);
					drawLine(canvas, 300, 150, 325, 150);
					drawLine(canvas, 350, 150, 375, 150);
					drawLine(canvas, 400, 150, 425, 150);
					break;
			case 10:drawLine(canvas, 50, 150, 75, 150);
					drawLine(canvas, 100, 150, 125, 150);
					drawLine(canvas, 150, 150, 175, 150);
					drawLine(canvas, 200, 150, 225, 150);
					drawLine(canvas, 250, 150, 275, 150);
					drawLine(canvas, 300, 150, 325, 150);
					drawLine(canvas, 350, 150, 375, 150);
					drawLine(canvas, 400, 150, 425, 150);
					drawLine(canvas, 450, 150, 475, 150);
					drawLine(canvas, 500, 150, 525, 150);
					break;
			case 15:drawLine(canvas, 20, 150, 40, 150);
					drawLine(canvas, 60, 150, 80, 150);
					drawLine(canvas, 100, 150, 120, 150);
					drawLine(canvas, 140, 150, 160, 150);
					drawLine(canvas, 180, 150, 200, 150);
					drawLine(canvas, 220, 150, 240, 150);
					drawLine(canvas, 260, 150, 280, 150);
					drawLine(canvas, 300, 150, 320, 150);
					drawLine(canvas, 340, 150, 360, 150);
					drawLine(canvas, 380, 150, 400, 150);
					drawLine(canvas, 420, 150, 440, 150);
					drawLine(canvas, 460, 150, 480, 150);
					drawLine(canvas, 500, 150, 520, 150);
					drawLine(canvas, 540, 150, 560, 150);
					drawLine(canvas, 580, 150, 600, 150);
					break;
		
		}
	}
}