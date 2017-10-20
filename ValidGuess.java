//package HangmanGame.logic;

/**compares the guessed letter to the word given
*if the letter appears in the word isValid variable is changed to true
*uses a for loop to go through the word*/
public class ValidGuess extends ValidList{
	//instance variables
	private String word;
	private String guess;
	private static String[] guesses;
	public static int size;

	//sets instance variables and size to the word chosen
	public ValidGuess(String wordChosen){
		word = wordChosen;
		size = word.length();
	}
	
	/**If the letter guessed is part of the String
	 * then it will go into an array to keep track of guesses available
	 * otherwise fill with *
	*/
	public void guessesAvailable(String guessChosen){
		guess = guessChosen;
		guesses = new String[size];
		for (int index = 0; index< size ; index++){
			if (guess.equals(word.substring(index,(index+1)))){
				guesses[index] = guess;
				
			}else{
				guesses[index] = "*";
			}
		}
	}

	
	/**checks to see if the letter recently given is a valid guess
	*@returns boolean result of whether it was a correct guess */
	public boolean isValidGuess(){
		return !listCheck(guesses, size);
	}
	
}
		
			
				
				
	