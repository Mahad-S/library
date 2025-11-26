package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    public void test2EqualBooks() {
        Book b1 = new Book("Title1", "Author1", "111");
        Book b2 = new Book("Title1", "Author1", "111");

        assertEquals(b1, b2);
        assertEquals(b1.hashCode(), b2.hashCode());
    }

    @Test
    public void test2NonEqualBooks() {
        Book b1 = new Book("Title1", "Author1", "111");
        Book b2 = new Book("Title2", "Author2", "222");

        assertNotEquals(b1, b2);
    }
}
