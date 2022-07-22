package by.gulis.hibernate.repositories;

import by.gulis.hibernate.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);
    List<Person> findByNameOrderByAge(String name);
    List<Person> findByEmail(String email);
    List<Person> findByNameStartingWith(String startingWith);
    List<Person> findByNameOrEmail(String name, String Email);
}
