import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class hangmanTest {

	@Test
	public void wordReturnTest() {
		WordBeingGuessed guess = new WordBeingGuessed (1);
		assertThat(guess.wordDifficulty(), anyOf(is("aimed"), is("havoc"), is("flute"), is("twist"), is("blade")));
		guess = new WordBeingGuessed (2);
		assertThat(guess.wordDifficulty(), anyOf(is("girlfriend"), is("attractive"), is("resounding"), is("speciality"), is("xenophobia")));
		guess = new WordBeingGuessed (3);
		assertThat(guess.wordDifficulty(), anyOf(is("counterargument"), is("autobiographies"), is("destructiveness"), is("logarithmically"), is("unsportsmanlike")));
	}
	
	@Test
	public void wordCheckTest() {
		CheckList check = new CheckList("abba");
		assertFalse(check.winGame());
		check.replaceLetter("a");
		assertFalse(check.winGame());
		check.replaceLetter("b");
		assertTrue(check.winGame());
	}
	
	@Test
	public void validGuessTest() {
		ValidGuess guess = new ValidGuess("abba");
		guess.guessesAvailable("d");
		assertFalse(guess.isValidGuess());
		guess.guessesAvailable("a");
		assertTrue(guess.isValidGuess());
		guess.guessesAvailable("c");
		assertFalse(guess.isValidGuess());
		guess.guessesAvailable("b");
		assertTrue(guess.isValidGuess());
	}

}
