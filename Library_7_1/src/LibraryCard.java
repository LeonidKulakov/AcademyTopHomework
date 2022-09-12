public class LibraryCard {
    private int numberLibraryCard;
    private Student ownerLibraryCard;
    private Book[] booksArr;
    private String[] dateOfIssueArr;
    private int[] timeOfUseArr;

    public LibraryCard(int numberLibraryCard, Student ownerLibraryCard) {
        this.numberLibraryCard = numberLibraryCard;
        this.ownerLibraryCard = ownerLibraryCard;
        this.booksArr = new Book[0];
        this.dateOfIssueArr = new String[0];
        this.timeOfUseArr = new int[0];
    }

    public void takeBook(Book book, String dateOfIssue, int timeOfUse) {
        examinationLibraryCard();
        expandBooksArr();
        expandDateOfIssueArr();
        expandTimeOfUseArr();
        this.booksArr[this.booksArr.length - 1] = book;
        this.dateOfIssueArr[this.dateOfIssueArr.length - 1] = dateOfIssue;
        this.timeOfUseArr[this.timeOfUseArr.length - 1] = timeOfUse;
    }

    private void expandBooksArr() {
        Book[] swapBook = this.booksArr.clone();
        this.booksArr = new Book[this.booksArr.length + 1];
        System.arraycopy(swapBook, 0, this.booksArr, 0, swapBook.length);
    }

    private void expandDateOfIssueArr() {
        String[] swapDateOfIssueArr = this.dateOfIssueArr.clone();
        this.dateOfIssueArr = new String[this.dateOfIssueArr.length + 1];
        System.arraycopy(swapDateOfIssueArr, 0, this.dateOfIssueArr, 0, swapDateOfIssueArr.length);
    }

    private void expandTimeOfUseArr() {
        int[] swapTimeOfUseArr = this.timeOfUseArr.clone();
        this.timeOfUseArr = new int[this.timeOfUseArr.length + 1];
        System.arraycopy(swapTimeOfUseArr, 0, this.timeOfUseArr, 0, swapTimeOfUseArr.length);
    }

    private void examinationLibraryCard() {
        if (!this.ownerLibraryCard.isHaveLibraryCard()) {
            ownerLibraryCard.takeTicket();
        }
    }

    public void print() {
        for (int i = 0; i < this.booksArr.length; i++) {
            System.out.print("Книга: "+booksArr[i].getNameBook() + " | Автор: " + booksArr[i].getAuthorBook());
            System.out.print(" | Дата выдачи: " + dateOfIssueArr[i]);
            System.out.print(" | Срок пользования " + timeOfUseArr[i]);
            System.out.println();
        }
    }

}
