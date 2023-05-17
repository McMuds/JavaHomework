import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower customer1;
    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void before(){
        book = new Book("Classics", "Mary Norton", "The Borrowers");
        book2 = new Book("Classics", "Enid Blyton", "Tales of Noddy");
        library = new Library("Test Library", 6);
        library.addBook(book);
        customer1 = new Borrower("Claire");
    }

    @Test
    public void hasName(){
        assertEquals("Claire", customer1.getName());
    }
    @Test
    public void canBorrowBook_Borrower(){
        customer1.borrowBook(book, library);
        assertEquals(1, customer1.countCollection());
    }

    @Test
    public void canBorrowBook_Library(){
        customer1.borrowBook(book, library);
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canNotBorrowBookNotInLibrary_Borrower(){
        customer1.borrowBook(book2, library);
        assertEquals(0,customer1.countCollection());
    }

    @Test
    public void canNotBorrowBookNotInLibrary_Library(){
        customer1.borrowBook(book2, library);
        assertEquals(1, library.countBooks());
    }
}
