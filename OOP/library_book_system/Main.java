package library_book_system;

/* library book system */

abstract class LibraryItem {
    private String title;
    private String itemId;
    
    //constructor
    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    //getter
    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    //abstract method
    abstract public String getType();

}

class Book extends LibraryItem {
    private String author;

    //constructor
    public Book(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    //getter
    public String getAuthor() {
        return author;
    }

    //setter
    public void setAuthor(String author) {
        this.author = author;
    }

    //inherited abstract method from "LibraryItem"
    @Override
    public String getType() {
        return "Book";
    }

    public void displayBook() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Book itemID: " + getItemId());
        System.out.println("Book Author: " + getAuthor());
        System.out.println("Type: " + getType());
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    //constructor
    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    //getter
    public int getIssueNumber() {
        return issueNumber;
    }

    //setter
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    //inherited abstract method from "LibraryItem"
    @Override
    public String getType() {
        return "Magazine";
    }

    public void displayMagazine() {
        System.out.println("Magazine Name: " + getTitle());
        System.out.println("Magazine ID: "  + getItemId());
        System.out.println("Magazine IssueNumber: " + getIssueNumber());
        System.out.println("Type: " + getType());
    }

}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Mahabharat", "A001", "Gaurav Chaudhari");
        Magazine m1 = new Magazine("Ramayana", "B0012", 2);
        
        //System.out.println(b1.getTitle() + " | " + b1.getItemId() + " | " + b1.getType() + " | " + b1.getAuthor());
        //System.out.println(m1.getTitle() + " | " + m1.getItemId() + " | " + m1.getType() + " | Issue: " + m1.getIssueNumber());

        b1.displayBook();
        System.out.println("----------------------------------------------");
        m1.displayMagazine();
    }
}