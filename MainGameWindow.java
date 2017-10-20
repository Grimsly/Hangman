//package HangmanGame.gui;

//imports everything necessary
import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
//import HangmanGame.logic.*;


/**class MainGameWindow
*@Purpose Is called by HangmanTitle class that passes on a difficulty level
*displays necessary information about game (figure of hangman, lives, buttons, ) 
*/
public class MainGameWindow extends JFrame implements ActionListener{
	
	//creates instance variables
	private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 640;
	JLabel label1;
	JLabel label2;
	JFrame frame;
	DrawHangmanFigure figure;
	int fails = 0;
	int lives = 6;
	private String pressed;
	JPanel alphaPanel;
	private String word;
	ValidGuess newGuess;
	CheckList wordList;
	UnderscoresForWord lines;
	lettersDrawn letter; 
	JButton A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
	
	/**main window and constructor class
	*@Argument Takes String dif as the difficulty
	*contains panel for alphabet to choose a letter, number of lives, 
	*and the drawing of the hangman  
	*calls upon other methods
	**/
	public MainGameWindow(String wordGiven) {
		
		//creates the appropriate variables by calling other classes/methods
		word = wordGiven;
		figure = new DrawHangmanFigure(fails);
		lines = new UnderscoresForWord(word);
		letter = new lettersDrawn(word);
		frame = new JFrame("Hangman");
		alphaPanel = new JPanel (new GridLayout(0,4));
		newGuess = new ValidGuess(word);
		wordList = new CheckList(word);
		label1 = new JLabel (word, SwingConstants.CENTER);
		label2 = new JLabel ("Number Of Lives Left: " + lives, SwingConstants.CENTER);
		
		//adds the different widgets into the frame
		frame.add(label1,BorderLayout.SOUTH);
		frame.add(label2,BorderLayout.NORTH);
		alphaPanel();
		frame.add(alphaPanel, BorderLayout.EAST);

		//sets the appropriate circumstances
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setVisible(true);
		frame.add(new DrawPane());
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/** creates a panel containing buttons with every letter in the alphabet*/
	public JPanel alphaPanel(){
		//The entire Alphabet in JButtons
		//convert to for loop later
		
		A = new JButton("A");
		alphaPanel.add(A);
		A.addActionListener(this);
		B = new JButton("B");
		alphaPanel.add(B);
		B.addActionListener(this);
		C = new JButton("C");
		alphaPanel.add(C);
		C.addActionListener(this);
		D = new JButton("D");
		alphaPanel.add(D);
		D.addActionListener(this);
		E = new JButton("E");
		alphaPanel.add(E);
		E.addActionListener(this);
		F = new JButton("F");
		alphaPanel.add(F);
		F.addActionListener(this);
		G = new JButton("G");
		alphaPanel.add(G);
		G.addActionListener(this);
		H = new JButton("H");
		alphaPanel.add(H);
		H.addActionListener(this);
		I = new JButton("I");
		alphaPanel.add(I);
		I.addActionListener(this);
		J = new JButton("J");
		alphaPanel.add(J);
		J.addActionListener(this);
		K = new JButton("K");
		alphaPanel.add(K);
		K.addActionListener(this);
		L = new JButton("L");
		alphaPanel.add(L);
		L.addActionListener(this);
		M = new JButton("M");
		alphaPanel.add(M);
		M.addActionListener(this);
		N = new JButton("N");
		alphaPanel.add(N);
		N.addActionListener(this);
		O = new JButton("O");
		alphaPanel.add(O);
		O.addActionListener(this);
		P = new JButton("P");
		alphaPanel.add(P);
		P.addActionListener(this);
		Q = new JButton("Q");
		alphaPanel.add(Q);
		Q.addActionListener(this);
		R = new JButton("R");
		alphaPanel.add(R);
		R.addActionListener(this);
		S = new JButton("S");
		alphaPanel.add(S);
		S.addActionListener(this);
		T = new JButton("T");
		alphaPanel.add(T);
		T.addActionListener(this);
		U = new JButton("U");
		alphaPanel.add(U);
		U.addActionListener(this);
		V = new JButton("V");
		alphaPanel.add(V);
		V.addActionListener(this);
		W = new JButton("W");
		alphaPanel.add(W);
		W.addActionListener(this);
		X = new JButton("X");
		alphaPanel.add(X);
		X.addActionListener(this);
		Y = new JButton("Y");
		alphaPanel.add(Y);
		Y.addActionListener(this);
		Z = new JButton("Z");
		alphaPanel.add(Z);
		Z.addActionListener(this);
		return alphaPanel;
	}
	
	/**overwrites the paint class in the super class to paint the hangman*/
	class DrawPane extends JPanel {	
		public void paint(Graphics canvas){
			super.paint(canvas);
			figure.paint(canvas);
			lines.paint(canvas);
			letter.paint(canvas);
			
		}
	}
	/**ActionPerformed method
	*each time a button is pressed its value is sent to the ValidGuess class
	*ValidGuess class checks to see if it is a valid guess
	*whether it is wrong or right is then passed to isCorrect to affect lives*/
	public void actionPerformed(ActionEvent event) {
		pressed = (event.getActionCommand()).toLowerCase();
		newGuess.answerList(pressed);
		wordList.checkOff(pressed);
		System.out.println(pressed);
		System.out.println(newGuess.isValidGuess());
		isCorrect(newGuess.isValidGuess(), wordList.winGame(), pressed);
		
		if(pressed.equals("a")){
			A.setEnabled(false);
		}
		else if(pressed.equals("b")){
			B.setEnabled(false);
		}
		else if(pressed.equals("c")){
			C.setEnabled(false);
		}
		else if(pressed.equals("d")){
			D.setEnabled(false);
		}
		else if(pressed.equals("e")){
			E.setEnabled(false);
		}
		else if(pressed.equals("f")){
			F.setEnabled(false);
		}
		else if(pressed.equals("g")){
			G.setEnabled(false);
		}
		else if(pressed.equals("h")){
			H.setEnabled(false);
		}
		else if(pressed.equals("i")){
			I.setEnabled(false);
		}
		else if(pressed.equals("j")){
			J.setEnabled(false);
		}
		else if(pressed.equals("k")){
			K.setEnabled(false);
		}
		else if(pressed.equals("l")){
			L.setEnabled(false);
		}
		else if(pressed.equals("m")){
			M.setEnabled(false);
		}
		else if(pressed.equals("n")){
			N.setEnabled(false);
		}
		else if(pressed.equals("o")){
			O.setEnabled(false);
		}
		else if(pressed.equals("p")){
			P.setEnabled(false);
		}
		else if(pressed.equals("q")){
			Q.setEnabled(false);
		}
		else if(pressed.equals("r")){
			R.setEnabled(false);
		}
		else if(pressed.equals("s")){
			S.setEnabled(false);
		}
		else if(pressed.equals("t")){
			T.setEnabled(false);
		}
		else if(pressed.equals("u")){
			U.setEnabled(false);
		}
		else if(pressed.equals("v")){
			V.setEnabled(false);
		}
		else if(pressed.equals("w")){
			W.setEnabled(false);
		}
		else if(pressed.equals("x")){
			X.setEnabled(false);
		}
		else if(pressed.equals("y")){
			Y.setEnabled(false);
		}
		else if(pressed.equals("z")){
			Z.setEnabled(false);
		}
	}
	/** method which controls the fails/lives of the game
	*if a guess is incorrect it adds a +1 to fails until 6 fails are met, then the game ends*/
	public void isCorrect(boolean correctGuess, boolean listDone, String pressed){
		if (correctGuess == false){
			
			fails += 1;
			figure.addFails();
			lives--;
			label2.setText("Number Of Lives Left: " + lives);
			frame.repaint();
			
		} else if (correctGuess == true){
			
			letter.addCorrect(pressed);
			frame.repaint();
			
		}
		
		if(listDone == true){
			System.out.println("You win");
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}else if (fails == 6){
			System.out.println("You lose");
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
	}
	
	
	
}	