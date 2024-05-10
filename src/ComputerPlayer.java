import java.util.Random;

public class ComputerPlayer extends Player {
        @Override
        public int makeGuess() {
                Random computerGuess = new Random();
                // Gerando um palpite aleatório de 1 a 100
                int ComputerPlayerGuess = computerGuess.nextInt(100) + 1;
                System.out.println("O jogador computador tentou: " + ComputerPlayerGuess);
                return ComputerPlayerGuess;
        }

        public ComputerPlayer() {
                this.setName("Jogador computador");
        }
}
