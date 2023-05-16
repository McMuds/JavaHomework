import java.util.ArrayList;

public class Borrower {
    String name;
    ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void borrowBook(Book book, Library library){
        if (library.hasBook(book)){
            this.collection.add(book);
            library.lendBook(book);
        }
    }

    public int countCollection(){
        return this.collection.size();
    }
}
