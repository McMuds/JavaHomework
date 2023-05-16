import java.util.ArrayList;

public class Library {
    String libraryName;
    ArrayList<Book> libraryBooks;
    int capacity;

    public Library(String name, int capacity){
        this.libraryName = name;
        this.libraryBooks = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book book){
        if (countBooks() < this.capacity){
            this.libraryBooks.add(book);
        }
    }

    public int countBooks(){
        return this.libraryBooks.size();
    }
}
