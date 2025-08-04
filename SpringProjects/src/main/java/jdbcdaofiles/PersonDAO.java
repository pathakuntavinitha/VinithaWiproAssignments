package jdbcdaofiles;
import java.util.List;
public interface PersonDAO {
    void save(Person p);
    void update(Person p);
    void delete(int id);
    Person get(int id);
    List<Person> list();
}

