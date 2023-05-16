import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

        private Book book1;
        private Book book2;

        @Before
        public void before(){
            book1 = new Book("Horror", "Stephen King", "It");
            book2 = new Book("YA", "Suzanne C", "The Hunger Games");
        }

        @Test
        public void hasName(){
            assertEquals("It", book1.getName());
        }

        @Test
        public void hasGenre(){
            assertEquals("YA", book2.getGenre());
        }

        @Test
        public void hasAuthor(){
            assertEquals("Stephen King", book1.getAuthor());
        }
}

