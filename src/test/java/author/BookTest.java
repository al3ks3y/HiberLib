package author;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void getId() {
        Book book=new Book(1,"StarWars",1000,1);
        assertEquals(1,book.getId());
    }

    @Test
    public void getTitle() {
        Book book=new Book(1,"StarWars",1000,1);
        assertEquals("StarWars",book.getTitle());
    }

    @Test
    public void setTitle() {
        Book book=new Book(1,"StarWars",1000,1);
        book.setTitle("Lord of the Rings");
        assertEquals("Lord of the Rings",book.getTitle());
    }

    @Test
    public void setId() {
    }

    @Test
    public void getPageCount() {
    }

    @Test
    public void setPageCount() {
    }

    @Test
    public void getAuthor() {
    }

    @Test
    public void setAuthor() {
    }

    @Test
    public void toString1() {
    }
}