public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }
    public void start(){
        Student student = new Student("Леонид","Кулаков", 451, false);
        LibraryCard libraryCard = new LibraryCard(11, student);
        Book book = new Book("Зеленая ламка","Александр Грин");
        Book book1 = new Book("Расчет железобетонных ростверков свайных фундаментов","ЦНИИПромзданий Госстроя СССР");
        libraryCard.takeBook(book,"12.09.22",14);
        libraryCard.takeBook(book1,"12.09.22",21);
        libraryCard.print();
    }
}
