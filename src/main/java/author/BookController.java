package author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    /*
    @RequestMapping("/authors/{id}/books")
    public List<Book> getAllBooks(@PathVariable long id){
            return bookService.getBooks(id);
    }

     */
    @RequestMapping("/authors/{authorId}/books/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/authors/{authorId}/books")
    public void addBook(@RequestBody Book book, @PathVariable long authorId){
        bookService.addBook(authorId,book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/authors/{authorid}/books")
    public void updateBook(@RequestBody Book book, @PathVariable long authorid){
        bookService.updateBook(authorid,book);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/authors/{authorId}/books/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }
    @RequestMapping("/books/{title}")
    public List<Book> getAllBooks(@PathVariable String title){
        return bookService.getBookByTitle(title);
    }

    @RequestMapping("/authors/{id}/books")
    public List <Book> getBooksByAuthorId(@PathVariable long id){
        return bookService.getBookByAuthorId(id);
    }



}
