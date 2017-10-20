//package HangmanGame.logic;

import java.util.Random;
/**takes a random value from between 0 and 5 and then returns a word based on the number and the difficulty setting*/


abstract class Difficulty{
	public abstract String wordChosen(int wordNum);
}

class Easy extends Difficulty{
	public String wordChosen(int wordNum) {
		if (wordNum == 0) {
			return "aimed";
		} else if (wordNum == 1) {
			return "havoc";
		} else if (wordNum == 2) {
			return "flute";
		} else if (wordNum == 3) {
			return "twist";
		} else{
			return "blade";
		}
	}
}

class Medium extends Difficulty{
	public String wordChosen(int wordNum) {
		if (wordNum == 0) {
			return "girlfriend";
		} else if (wordNum == 1) {
			return "attractive";
		} else if (wordNum == 2) {
			return "resounding";
		} else if (wordNum == 3) {
			return "speciality";
		} else{
			return "xenophobia";
		}
	}
}

class Hard extends Difficulty{
	public String wordChosen(int wordNum) {
		if (wordNum == 0) {
			return "counterargument";
		} else if (wordNum == 1) {
			return "autobiographies";
		} else if (wordNum == 2) {
			return "destructiveness";
		} else if (wordNum == 3) {
			return "logarithmically";
		} else{
			return "unsportsmanlike";
		}
	}
}

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
		Difficulty howHard;
		switch (dif) {
			case 1:
				howHard = new Easy();
				word = howHard.wordChosen(wordNum);
			case 2:
				howHard = new Medium();
				word = howHard.wordChosen(wordNum);
			case 3:
				howHard = new Hard();
				word = howHard.wordChosen(wordNum);
		}
		return word;
	}
}

