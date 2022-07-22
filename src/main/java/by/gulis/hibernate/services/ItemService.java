package by.gulis.hibernate.services;


import by.gulis.hibernate.models.Item;
import by.gulis.hibernate.models.Person;
import by.gulis.hibernate.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemService {

    @Autowired
    private final ItemsRepository itemsRepository;

    public ItemService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Item> findByItemName(String itemName){
        return itemsRepository.findByName(itemName);
    }

    public List<Item> findByOwner(Person owner){
        return itemsRepository.findByOwner(owner);
    }


}
