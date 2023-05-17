import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    String libraryName;
    ArrayList<Book> libraryBooks;
    int capacity;
    HashMap<String, Integer> genreMap;

    public Library(String name, int capacity){
        this.libraryName = name;
        this.libraryBooks = new ArrayList<>();
        this.capacity = capacity;
        this.genreMap = new HashMap<>();
    }

    public void addBook(Book book){
        int currentCount = 0;
        if (genreMap.containsKey(book.getGenre())) {
            currentCount = genreMap.get(book.getGenre());
        }
        if (countBooks() < this.capacity){
            this.libraryBooks.add(book);
            this.genreMap.put(book.getGenre(), currentCount + 1);
            this.genreMap.replace(book.getGenre(), currentCount + 1);
        }
    }

    public int countBooks(){
        return this.libraryBooks.size();
    }

    public Boolean lendBook(Book book){
        if (hasBook(book)){
            String genre = book.getGenre();
            this.libraryBooks.remove(book);
//            this.genreMap.put(book.getGenre(), this.genreMap.get(book.getGenre()) - 1);
            this.genreMap.replace(genre, this.genreMap.get(genre) - 1);
            return true;
        }
        return false;
    }

    public Boolean hasBook(Book book){
        return this.libraryBooks.contains(book);
    }

    public int getGenreCount(String genre){
        if (this.genreMap.containsKey(genre)){
            return this.genreMap.get(genre);
        }
        return 0;
    }

}
