package author;



import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String title;
    private Integer pageCount;
    @ManyToOne //(cascade=CascadeType.ALL)
    private Author author;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    protected Book() {}

    public void setId(long id) {
        this.id = id;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author=author;
    }

    public Book(int id, String title, int pageCount, long authorId) {
        this.id=id;
        this.pageCount=pageCount;
        this.title = title;
        this.author=new Author(authorId,"","","");
    }

    @Override
    public String toString() {
        return String.format(
                "Book[ title='%s', pages:'%s']",
                title, pageCount);
    }



}