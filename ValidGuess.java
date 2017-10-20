//package HangmanGame.logic;

/**compares the guessed letter to the word given
*if the letter appears in the word isValid variable is changed to true
*uses a for loop to go through the word*/
public class ValidGuess {
	//instance variables
	private boolean isValid = false;
	private String word;
	private String guess;
	private static String[] guesses;
	public static int size;
	
	//defaults constructor sets word to "hello" testing purposes only
	public ValidGuess(){
		this("hello");
	}
	
	//sets instance variables and size to the word chosen
	public ValidGuess(String wordChosen){
		word = wordChosen;
		size = word.length();
	}
	
	/**@arguments the letter that is being guessed
	*creates a list which is the result of comparing the letter to the word
	*each index is by default "*"
	*an exception is made when the letter guessed appears in the word,
	*in that case the index is "guessChosen"
	*/
	public void answerList(String guessChosen){
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

	
	/**checks to see if the list generated is empty (only contains "*")
	* if its not empty this means that a letter which was present in the word was guessed (a correct guess)
	*and an index contains this letter (ie. ***e***e)
	*@returns boolean result of whether it is an empty list/was a correct guess */
	public boolean isValidGuess(){
		isValid = false;
		for (int index = 0; index<size; index++){
			if (guesses[index] != "*"){
				isValid = true;
			}
		} 
		
		return isValid;
	}
	
}
		
			
				
				
	