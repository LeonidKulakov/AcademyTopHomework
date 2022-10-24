public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        Player user1 = new Player();
        Website website = new Website();
        website.addNewUser("Тилль Линдеманн", user1);
        website.addNewGame("Тилль Линдеманн", "Fallout");
        for (int i = 0; i<12;i++) {
            website.win("Тилль Линдеманн", "Fallout");
        }
        Player user2 = new Player();
        website.addNewUser("Лемми Килмистер", user2);
        website.addNewGame("Лемми Килмистер", "Gothic");
        website.addNewGame("Лемми Килмистер", "Fallout");
        for (int i = 0; i<3;i++) {
            website.win("Лемми Килмистер", "Fallout");
            website.win("Лемми Килмистер", "Gothic");
            website.win("Лемми Килмистер", "Gothic");
        }
        Player user3 = new Player();
        website.addNewUser("Алекси Лайхо", user3);
        website.addNewGame("Алекси Лайхо","Fallout");
        for (int i = 0; i<15;i++) {
            website.win("Алекси Лайхо", "Fallout");
        }
        System.out.println(website.getSumRating("Лемми Килмистер"));
        System.out.println(website.getSumRating("Тилль Линдеманн"));
        website.getTop10();
        website.getTop10Game("Fallout");

    }
}
