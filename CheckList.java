//package HangmanGame.logic;

/**compares the guessed letter to the word given
*if the letter appears in the word isValid variable is changed to true
*uses a for loop to go through the word*/
public class CheckList extends ValidList{
	//instance variables
	private String word;
	private static String[] guesses;
	public static int size;

	
	//sets instance variables and size to the word chosen
	public CheckList(String wordChosen){
	
		word = wordChosen;
		size = word.length();
		guesses = new String[size];
		
		for (int index = 0; index < size ; index++){
			guesses[index] = word.substring(index,(index+1));
			System.out.println(guesses[index]);
		}
	}
	
	//If the guessed letter is part of the String, replace the letter with *
	public void replaceLetter(String guessChosen){
		
		for (int index = 0; index< size ; index++){
			if (guessChosen.equals(word.substring(index,(index+1)))){
				guesses[index] = "*";
				
			}
		}
	}
	

	/**Check if the array is filled with *
	 * If it is, it means that the user cleared the challenge and they won.
	*@returns boolean result of whether user clears the String**/
	public boolean winGame() {
		return listCheck(guesses, size);
	}
	
}
		
			
				
				
	