import java.util.Scanner;
public class HumanPlayer extends Player{
    @Override
    public int makeGuess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Jogador humano, digite um número de 1 a 100: ");
        //LÓGICA DE PEGAR PALPITE DO JOGADOR HUMANO.
        return input.nextInt();
    }
}
