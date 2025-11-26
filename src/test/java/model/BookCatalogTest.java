package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "autor1", "111-1-11-111111-1", "Programming", 50);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        Book newBook = new Book(2, "Java Basics", "author2", "222-2-22-222222-2", "Programming", 100);
        bc.addBook(newBook);
        assertEquals(newBook, bc.findBook(2));
    }

    //G
    @Test
    public void testFindBook() {
        Book found = bc.findBook(1);
        assertEquals(book1, found);
    }

    //G
    @Test
    public void testFindBookIgnoringCase() {
        Book found = bc.findBook("learning java");
        assertEquals(book1, found);
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {
        Book found = bc.findBook("  Learning Java  ");
        assertEquals(book1, found);
    }
}
