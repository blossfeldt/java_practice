package library;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryUser {
    private final HashMap<String, Rent> rented = new HashMap<>();
    Library library;
    LibraryUser(Library library) {
        this.library = library;
    }
    void rent(String bookUID) {
        if (library.rent(bookUID)) {
            rented.put(bookUID, new Rent(library.getBook(bookUID)));
        }
    }

    void giveBack(String bookUID) {
        if (rented.containsKey(bookUID)) {
            library.giveBack(bookUID);
            rented.remove(bookUID);
        } else {
            System.out.println("These are your " + toString());
        }
    }

    @Override
    public String toString() {
        String list = "";
        for (Rent rent : rented.values()) {
            list += "\n" + rent.toString();
        }
        return "Rented Books: " + list;
    }
}
