package author;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private String birthday;
    private String email;

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected Author() {}

    public Author(long id, String name, String birthday, String email) {
        this.id=id;
        this.name = name;
        this.birthday = birthday;
        this.email=email;
    }

    @Override
    public String toString() {
        return String.format(
                "Book[ name='%s', birthday='%s']",
                name, birthday);
    }



}