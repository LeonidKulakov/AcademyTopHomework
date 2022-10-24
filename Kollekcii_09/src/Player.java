import java.util.HashMap;

public class Player {

    private HashMap<String, Integer> gameRating = new HashMap<>();
    private int sumRating;

    public Player() {
        sumRating = 0;
    }

    public Integer getGameRating(String game) {
        return gameRating.get(game);
    }

    public int getSumRating() {
        return sumRating;
    }

    public void win(String game) {
        Integer rating = gameRating.get(game);
        gameRating.put(game, rating + 1);
        sumRating++;
    }

    public void addNewGame(String game) {
        if (!gameRating.containsKey(game)) {
            gameRating.put(game, 0);
        } else {
            System.out.println("Игра уже есть в списке");
        }
    }

}
