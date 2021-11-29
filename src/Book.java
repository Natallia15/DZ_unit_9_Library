public class Book {
    String author;
    String bookTitle;
    Book (String author, String bookTitle){
        this.author = author;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return author + " " + bookTitle;
    }
}
