package ProgrammingWithClasses.books;

public class Book {

    // класс BookUtil агрегирует массив данного типа

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfEdition;
    private int numberOfPages;
    private double price;
    private String typeOfBinding;

    public Book() {
    }

    public Book(int id, String title, String author, String publisher, int yearOfEdition,
                int numberOfPages, double price, String typeOfBinding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfEdition = yearOfEdition;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }

    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book {" +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", publisher = '" + publisher + '\'' +
                ", yearOfEdition = " + yearOfEdition +
                ", numberOfPages = " + numberOfPages +
                ", price = " + price +" $" +
                ", typeOfBinding = '" + typeOfBinding + '\'' +
                '}';
    }
}
