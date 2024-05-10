import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GuessTheNumberGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int targetNumber = rand.nextInt(101);
        int numTries = 0;

        System.out.println(targetNumber);

        boolean game = false;
        // Variável para controlar qual jogador está jogando (0 para humano, 1 para computador)


        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        Player currentPlayer = computerPlayer;
        while (!game) {

            // Alternar entre os jogadores
            currentPlayer = (currentPlayer instanceof HumanPlayer) ? computerPlayer : humanPlayer;
            int guess = currentPlayer.makeGuess();
            currentPlayer.setGuess(guess);
            game = checkGuess(currentPlayer, targetNumber);


        }

        System.out.println("Foram " + currentPlayer.getGuesses().size() + " tentativas:");

        for (int i = 0; i < currentPlayer.getGuesses().size(); i++) {
            System.out.println("Tentativa " + (i + 1) + ": " + currentPlayer.getGuesses().get(i));
        }
    }

    private static boolean checkGuess(Player player, int targetNumber) {
        int guess = player.getGuesses().getLast();
        if (guess == targetNumber) {
            System.out.println("Parabéns " + player.getName() + " você acertou! O número é " + targetNumber);
            return true;
        } else if (guess < targetNumber) {
            System.out.println("Tente um número maior!");
        } else {
            System.out.println("Tente um número menor!");
        }
        return false;
    }
}
