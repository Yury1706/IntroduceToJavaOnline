package ProgrammingWithClasses.books;

public class BookUtil {

    private Book[] books;

    public BookUtil() {
    }

    public BookUtil(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void searchBooksByAuthor(String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }
        }
        System.out.println();
    }

    public void searchBooksByPublisher(String publisher) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublisher().equals(publisher)) {
                System.out.println(books[i]);
            }
        }
        System.out.println();
    }

    public void searchBooksByYear(int year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfEdition() > year) {
                System.out.println(books[i]);
            }
        }
        System.out.println();
    }
}
