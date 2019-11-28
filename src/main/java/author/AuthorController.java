package author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @RequestMapping("/authors")
    public List<Author> getAllAuthors(){
            return authorService.getAuthors();
    }
    /*@RequestMapping("/authors/{id}")
    public Author getAuthor(@PathVariable Long id){
        return authorService.getAuthor(id);
    }

     */
    @RequestMapping(method = RequestMethod.POST, value = "/authors")
    public void addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/authors")
    public void updateAuthor(@RequestBody Author author){
        authorService.updateAuthor(author);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/authors/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorService.deleteAuthor(id);
    }
    @RequestMapping("/authors/{name}")
    public Author findByName(@PathVariable String name){
        return authorService.getByName(name);
    }
}
