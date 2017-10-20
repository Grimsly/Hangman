import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class hangmanTest {

	@Test
	public void wordReturnTest() {
		WordBeingGuessed guess = new WordBeingGuessed (1);
		assertThat(guess.wordChosen(), anyOf(is("aimed"), is("havoc"), is("flute"), is("twist"), is("blade")));
		guess = new WordBeingGuessed (2);
		assertThat(guess.wordChosen(), anyOf(is("girlfriend"), is("attractive"), is("resounding"), is("speciality"), is("xenophobia")));
		guess = new WordBeingGuessed (3);
		assertThat(guess.wordChosen(), anyOf(is("counterargument"), is("autobiographies"), is("destructiveness"), is("logarithmically"), is("unsportsmanlike")));
	}
	
	@Test
	public void wordCheckTest() {
		CheckList check = new CheckList("abba");
		assertFalse(check.winGame());
		check.checkOff("a");
		assertFalse(check.winGame());
		check.checkOff("b");
		assertTrue(check.winGame());
	}
	
	@Test
	public void validGuessTest() {
		ValidGuess guess = new ValidGuess("abba");
		guess.answerList("d");
		assertFalse(guess.isValidGuess());
		guess.answerList("a");
		assertTrue(guess.isValidGuess());
		guess.answerList("c");
		assertFalse(guess.isValidGuess());
		guess.answerList("b");
		assertTrue(guess.isValidGuess());
	}

}
