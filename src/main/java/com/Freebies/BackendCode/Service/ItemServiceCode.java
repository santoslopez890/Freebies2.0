package com.Freebies.BackendCode.Service;

import com.Freebies.BackendCode.Model.Item;
import com.Freebies.BackendCode.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceCode implements ItemService {
    @Autowired
    private ItemRepo itemRepo;

    @Override
    public Item saveItem(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }
}
