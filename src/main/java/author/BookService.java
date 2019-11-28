package author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;


    public List<Book> getBooks(Long id) {
        List <Book> books=new ArrayList<>();
        bookRepository.findByAuthorId(id)
                .forEach(books::add);
        return books;
    }

    public void addBook(Long authorid, Book book){
        Author author=authorRepository.findById(authorid).orElseThrow(() -> new NoSuchElementException());
        book.setAuthor(author);
        bookRepository.save(book);
    }

    public Book getBook(Long id){
        return bookRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }
    public List<Book> getBookByTitle(String title){
        return bookRepository.findByTitle(title);
    }
    public void updateBook(Long authorid, Book book){
        Author author=authorRepository.findById(authorid).orElseThrow(() -> new NoSuchElementException());
        book.setAuthor(author);
        bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    public List<Book> getBookByAuthorId(long id){
        return bookRepository.findByAuthorId(id);
    }


}
