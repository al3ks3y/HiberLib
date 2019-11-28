package author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AuthorService {

    public AuthorRepository getAuthorRepository() {
        return authorRepository;
    }

    @Autowired
    private AuthorRepository authorRepository;


    public List<Author> getAuthors() {
        List <Author> authors=new ArrayList<>();
        authorRepository.findAll()
                .forEach(authors::add);
        return authors;
    }

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public Author getAuthor(Long id){
        return authorRepository.findById(id).orElseThrow(() -> new NoSuchElementException());

    }
    public void updateAuthor(Author author){
        authorRepository.save(author);


    }
    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }
    public Author getByName(String name){
        return authorRepository.findByName(name);
    }
}
