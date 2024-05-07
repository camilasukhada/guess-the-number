import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GuessTheNumberGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int targetNumber = rand.nextInt(101);
        int numTries = 0;

        boolean game = false;
        List<Integer> tentativas = new ArrayList<>();

        // Variável para controlar qual jogador está jogando (0 para humano, 1 para computador)
        int currentPlayer = 0;

        HumanPlayer humanPlayer = new HumanPlayer();

        while (!game) {
            if (currentPlayer == 0) {
                // Vez do jogador humano
                int guess = humanPlayer.makeGuess();
                tentativas.add(guess);
                numTries++;

                game = checkGuess(guess, targetNumber, game);
            } else {
                // Vez do jogador computador
                int computerGuess = rand.nextInt(101);
                System.out.println("O jogador computador tentou: " + computerGuess);
                tentativas.add(computerGuess);
                numTries++;

                game = checkGuess(computerGuess, targetNumber, game);
            }

            // Alternar entre os jogadores
            currentPlayer = (currentPlayer + 1) % 2;
        }

        System.out.println("Foram " + numTries + " tentativas:");

        for (int i = 0; i < tentativas.size(); i++) {
        System.out.println("Tentativa " + (i + 1) + ": " + tentativas.get(i));
        }
    }

    private static boolean checkGuess(int guess, int targetNumber, boolean game) {
        if (guess == targetNumber) {
            System.out.println("Parabéns, você acertou! O número é " + targetNumber);
            game = true;
        } else if (guess < targetNumber) {
            System.out.println("Tente um número maior!");
        } else {
            System.out.println("Tente um número menor!");
        }
        return game;
    }
}
