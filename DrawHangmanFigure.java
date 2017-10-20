//package HangmanGame.gui;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DrawHangmanFigure {
	//instance variable
	private int failures;
	
	/**default constructor. sets fails to 0*/
	public DrawHangmanFigure(){
		this(0);
	}
	
	/**main constructor 
	*@arguments fails
	*the number of fails determines how many body parts are drawn*/
	public DrawHangmanFigure(int fails){
		if (fails >= 0 && fails <=6){
			failures = fails;
		}
		System.out.print("constructor fails: "+ failures);
	}
	public void addFails(){
		failures += 1;
		System.out.println("number fails: "+failures);
	}
	
	/**draw method. draws the stake that hangman is hanged on*/
	public void drawStake(Graphics canvas, int top_x1, int top_y1, int width1, int height1) {
		canvas.drawRect (top_x1,top_y1,width1,height1);
	}
	/**draw method. draws the body parts for the hangman*/
	public void drawHangman (Graphics canvas, int top_x2, int top_y2, int width2, int height2) {
		canvas.drawOval(top_x2,top_y2,width2,height2);
	}
	
	/**draw method using a switch statement 
	*switch statement is the fails 
	*the number of fails indicate what body parts are drawn
	*calls on other two draw methods
	*/
	public void paint(Graphics canvas) {
		//System.out.println("case statement. Number of fails: " + failures);
		switch (failures) {
		//reverse order remove break
			case 0: drawStake(canvas,20,200,20,400);
					drawStake(canvas,20,200,220,50);
					break;
			case 1: drawStake(canvas,20,200,20,400);
					drawStake(canvas,20,200,220,50);
					drawHangman(canvas,150,300,40,40);
					break;
			case 2: drawStake(canvas,20,200,20,400);
					drawStake(canvas,20,200,220,50);
					drawHangman(canvas,150,300,40,40);
					drawHangman(canvas,150,360,40,100);
					break;
			case 3: drawStake(canvas,20,200,20,400);
					drawStake(canvas,20,200,220,50);
					drawHangman(canvas,150,300,40,40);
					drawHangman(canvas,150,360,40,100);
					drawHangman(canvas,120,370,20,60);
					break;
			case 4: drawStake(canvas,20,200,20,400);
					drawStake(canvas,20,200,220,50);
					drawHangman(canvas,150,300,40,40);
					drawHangman(canvas,150,360,40,100);
					drawHangman(canvas,120,370,20,60);
					drawHangman(canvas,200,370,20,60);
					break;
			case 5: drawStake(canvas,20,200,20,400);
					drawStake(canvas,20,200,220,50);
					drawHangman(canvas,150,300,40,40);
					drawHangman(canvas,150,360,40,100);
					drawHangman(canvas,120,370,20,60);
					drawHangman(canvas,200,370,20,60);
					drawHangman(canvas,150,470,20,100);
					break;
			case 6: drawStake(canvas,20,200,20,400);
					drawStake(canvas,20,200,220,50);
					drawHangman(canvas,150,300,40,40);
					drawHangman(canvas,150,360,40,100);
					drawHangman(canvas,120,370,20,60);
					drawHangman(canvas,200,370,20,60);
					drawHangman(canvas,150,470,20,100);
					drawHangman(canvas,170,470,20,100);
					break;
		}
	}
}