package by.gulis.hibernate.repositories;

import by.gulis.hibernate.models.Item;
import by.gulis.hibernate.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemsRepository extends JpaRepository<Item,Integer> {
    List<Item> findByOwner(Person owner);
    List<Item> findByName(String name);
}
