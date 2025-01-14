package com.Freebies.BackendCode.Service;

import com.Freebies.BackendCode.Model.Item;

import java.util.List;

public interface ItemService {
    public Item saveItem(Item item);
    public List<Item> getAllItems();
}
