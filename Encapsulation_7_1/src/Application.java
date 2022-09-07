public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start(){
        Ranges ranges = new Ranges();
        ranges.print();
    }
}
