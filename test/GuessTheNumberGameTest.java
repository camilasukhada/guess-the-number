import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessTheNumberGameTest {

@Mock
Player humanPlayer;

@BeforeEach
void setup(){
    humanPlayer = new HumanPlayer("Camila");
    humanPlayer.setGuess(50);

}
    @Test
    @DisplayName("Retornar 'Tente um número maior' se o palpite do jogador humano for menor do que targetNumber")
    void testCheckGuessTryHigherNumber() {
    GuessTheNumberGame.targetNumber = 51;
    boolean guessResult = GuessTheNumberGame.checkGuess(humanPlayer);

        assertFalse(guessResult);

    }
    @Test
    @DisplayName("Retornar 'Tente um número menor' se o palpite do jogador humano for maior do que targetNumber")
    void testCheckGuessTrylowerNumber() {
        GuessTheNumberGame.targetNumber = 49;
        boolean guessResult = GuessTheNumberGame.checkGuess(humanPlayer);

        assertFalse(guessResult);

    }

    @Test
    @DisplayName("Retornar 'Acertou' se o palpite do jogador humano for igual ao targetNumber")
    void testRightGuess() {
        GuessTheNumberGame.targetNumber = 50;
        boolean guessResult = GuessTheNumberGame.checkGuess(humanPlayer);

        assertTrue(guessResult);

    }

}