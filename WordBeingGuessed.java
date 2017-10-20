//package HangmanGame.logic;

import java.util.Random;
/**takes a random value from between 0 and 5 and then returns a word based on the number and the difficulty setting*/


public class WordBeingGuessed {
	//instance variables
	private int dif;
	private int wordNum = new Random().nextInt(5);
	private String word;	
	
	public WordBeingGuessed(int difficulty) {
		if (difficulty >=1 && difficulty <=3){
			dif = difficulty; 
		} else {
			dif = 1;
		}
	}
	
	/**Depending on the difficulty level, a word will be randomly chosen for each difficulty
	*@returns word*/
	public String wordDifficulty(){

		switch (dif) {
			case 1:
				switch (wordNum) {
					case 0:
						word = "aimed";
						break;
					case 1:
						word = "havoc";
						break;
					case 2:
						word = "flute";
						break;
					case 3:
						word = "twist";
						break;
					case 4:
						word = "blade";
						break;
				}
				break;
			case 2:
				switch (wordNum) {
				case 0:
					word = "girlfriend";
					break;
				case 1:
					word = "attractive";
					break;
				case 2:
					word = "resounding";
					break;
				case 3:
					word = "speciality";
					break;
				case 4:
					word = "xenophobia";
					break;
				}
				
				break;
			case 3:
				switch (wordNum) {
				case 0:
					word = "counterargument";
					break;
				case 1:
					word = "autobiographies";
					break;
				case 2:
					word = "destructiveness";
					break;
				case 3:
					word = "logarithmically";
					break;
				case 4:
					word = "unsportsmanlike";
					break;
				}
				break;
		}
		return word;
	}
}
