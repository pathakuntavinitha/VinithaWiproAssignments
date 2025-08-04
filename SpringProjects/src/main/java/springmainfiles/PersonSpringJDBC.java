package springmainfiles;
import jdbcdaofiles.Person;
import jdbcdaofiles.PersonDAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class PersonSpringJDBC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDAO dao = context.getBean("personDAO",PersonDAO.class);
        System.out.println("List of person is:");
        dao.list().forEach(System.out::println);
        System.out.println("\nGet person with ID 2");
        System.out.println(dao.get(2));
        System.out.println("\nCreating person:");
        dao.save(new Person(4,36,"Sergey","Emets"));
        System.out.println("\nList of person is:");
        dao.list().forEach(System.out::println);
        System.out.println("\nDeleting person with ID 2");
        dao.delete(2);
        System.out.println("\nUpdate person with ID 4");
        dao.update(new Person(4,36,"Sergey","CHANGED"));
        System.out.println("\nList of person is:");
        dao.list().forEach(System.out::println);
    }
}

