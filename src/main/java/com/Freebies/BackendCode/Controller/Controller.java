package com.Freebies.BackendCode.Controller;

import com.Freebies.BackendCode.Model.Item;
import com.Freebies.BackendCode.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")

public class Controller {
    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public String add(@RequestBody Item item){
        itemService.saveItem(item);
        return "new item added";
    }
    @GetMapping("/getItems")
    public List<Item> getItems(){
        return itemService.getAllItems();
    }
}
