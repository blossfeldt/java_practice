package library;

import java.time.LocalDate;

public class Rent {

    String bookUID;
    Book book;
    LocalDate dueDate = LocalDate.now().plusDays(15);

    public Rent(Book book) {
        this.book = book;
        this.bookUID = book.getBookUID();
    }

    @Override
    public String toString() {
        return book + "\nis due on : " + dueDate + "\n";
    }
}
