public class Student {
    private boolean haveLibraryCard;
    private String firstName;
    private String secondName;
    private int numberGroup;


    public Student(String firstName, String secondName, int numberGroup, boolean libraryCard) {
        this.haveLibraryCard = libraryCard;
        this.firstName = firstName;
        this.secondName = secondName;
        this.numberGroup = numberGroup;
    }
    public void setHaveLibraryCard(boolean haveLibraryCard) {
        this.haveLibraryCard = haveLibraryCard;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public boolean isHaveLibraryCard() {
        return haveLibraryCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void takeTicket(){
        setHaveLibraryCard(true);
    }

}
