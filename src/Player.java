import java.util.ArrayList;

public abstract class Player {
    private String name;
    private ArrayList<Integer> guesses;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void setGuesses(ArrayList<Integer> guesses) {
        this.guesses = guesses;
    }

    public abstract int makeGuess();

}
