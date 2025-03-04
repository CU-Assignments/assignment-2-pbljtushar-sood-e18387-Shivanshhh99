class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    void displayBookDetails() {
        System.out.println("Fiction Book Details:");
        super.displayBookDetails();
    }
}

class NonFiction extends Book {
    NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    void displayBookDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayBookDetails();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        fictionBook.displayBookDetails();
        System.out.println();
        nonFictionBook.displayBookDetails();
    }
}
