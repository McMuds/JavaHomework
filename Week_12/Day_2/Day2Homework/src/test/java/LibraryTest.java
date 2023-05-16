import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;
    private Library library1;

    @Before
    public void before(){
        book1 = new Book("Horror", "Stephen King", "It");
        book2 = new Book("YA", "Suzanne Collins", "The Hunger Games");
        library1 = new Library("Claire's Library", 2);
    }

    @Test
    public void canAddBooksToLibrary(){
        library1.addBook(book1);
        assertEquals(1, library1.countBooks());
    }

    @Test
    public void willNotAddIfLibraryFull(){
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book1);
        assertEquals(2, library1.countBooks());
    }

    @Test
    public void canLendOutBook(){
        library1.addBook(book1);
        assertEquals(true,library1.lendBook(book1));
    }

    @Test
    public void hashMapChanges_AddSingleGenre(){
        library1.addBook(book1);
        assertEquals(1, library1.getGenreCount("Horror"));
    }
    @Test
    public void hashMapChanges_AddDoubleGenre(){
        library1.addBook(book1);
        library1.addBook(book1);
        assertEquals(2, library1.getGenreCount("Horror"));
    }
    @Test
    public void hashMapChanges_removeGenre(){
        library1.addBook(book1);
        library1.addBook(book1);
        library1.lendBook(book1);
        assertEquals(1, library1.getGenreCount("Horror"));
    }
}