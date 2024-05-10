import java.util.ArrayList;

public abstract class Player {
    private String name;
    private ArrayList<Integer> guesses = new ArrayList<Integer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void setGuess(Integer guess) {
        this.guesses.add(guess);
    }

    public abstract int makeGuess();

}
