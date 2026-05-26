package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    public void test2EqualBooks() {
        Book b1 = new Book(1, "Title1", "Author1", "111", "Programming", 100);
        Book b2 = new Book(2, "Title1", "Author1", "111", "Programming", 100);

        assertEquals(b1, b2);
        assertEquals(b1.hashCode(), b2.hashCode());
    }

    @Test
    public void test2NonEqualBooks() {
        Book b1 = new Book(1, "Title1", "Author1", "111", "Programming", 100);
        Book b2 = new Book(2, "Title2", "Author2", "222", "Programming", 100);

        assertNotEquals(b1, b2);
    }
}
