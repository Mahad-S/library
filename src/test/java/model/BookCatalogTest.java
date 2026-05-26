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
    public void testAddABook() throws BookNotFoundException{
        Book newBook = new Book(2, "Java Basics", "author2",
                "222-2-22-222222-2", "Programming", 100);
        bc.addBook(newBook);
        assertEquals(newBook, bc.findBook("Java Basics"));
    }

    //G
    @Test
    public void testFindBook() throws BookNotFoundException {
        Book found = bc.findBook("Learning Java");
        assertEquals(book1, found);
    }

    //G
    @Test
    public void testFindBookIgnoringCase() throws BookNotFoundException {
        Book found = bc.findBook("learning java");
        assertEquals(book1, found);
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() throws BookNotFoundException{
        Book found = bc.findBook("  Learning Java  ");
        assertEquals(book1, found);
    }
}
