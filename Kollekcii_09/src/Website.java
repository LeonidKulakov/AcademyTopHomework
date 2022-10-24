import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Website {
    private HashMap<String, Player> users = new HashMap<>();
    private HashSet<String> gameList = new HashSet<>();

    public HashSet<String> getGameList() {
        return gameList;
    }
    public void addNewUser(String nickName, Player player) {
        if (!users.containsKey(nickName)) {
            users.put(nickName, player);
        } else {
            System.out.println("Никнейм занят");
        }
    }

    public void addNewGame(String nickName, String game) {
        Player user = users.get(nickName);
        gameList.add(game);
        user.addNewGame(game);
    }

    public Integer getRating(String nickName, String game) {
        Player user = users.get(nickName);
        return user.getGameRating(game);
    }

    public void win(String nickName, String game) {
        Player user = users.get(nickName);
        user.win(game);
    }

    public Integer getSumRating(String nickName){
        Player user = users.get(nickName);
        return user.getSumRating();
    }
    public void getTop10(){
        String[] mas = getArrayUsers();
        boolean isSorted = false;
        String buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(users.get(mas[i]).getSumRating() > users.get(mas[i+1]).getSumRating()){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }

        if (mas.length<=10) {
            for (int i = 0; i < mas.length; i++) {
                System.out.println(mas[mas.length-1-i]);
            }
        }else {
            for (int i = 0; i < 10; i++) {
                System.out.println(mas[mas.length-1-i]);
            }
        }
        System.out.println();
    }

    public void getTop10Game(String game){
        String[] mas = getArrayUsers();
        boolean isSorted = false;
        String buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(users.get(mas[i]).getGameRating(game) > users.get(mas[i+1]).getGameRating(game)){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        if (mas.length<=10) {
            for (int i = 0; i < mas.length; i++) {
                System.out.println(mas[mas.length-1-i]);
            }
        }else {
            for (int i = 0; i < 10; i++) {
                System.out.println(mas[mas.length-1-i]);
            }
        }
    }
    private String[] getArrayUsers (){
        String [] mas = new String[users.size()];
        int i = 0;
        for (String key: users.keySet()){
            mas[i++] = key;
        }
        return mas;
    }


}
