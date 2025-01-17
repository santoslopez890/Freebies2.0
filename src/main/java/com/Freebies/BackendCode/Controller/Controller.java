package com.Freebies.BackendCode.Controller;

import com.Freebies.BackendCode.Model.Item;
import com.Freebies.BackendCode.Model.RawItem;
import com.Freebies.BackendCode.Service.ItemService;
import com.Freebies.BackendCode.Service.Scraper;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")

public class Controller {
    private final Scraper scraper;


    @Autowired
    private ItemService itemService;
    @Autowired
    public Controller(Scraper scraper) {
        this.scraper = scraper;
    }

    @PostMapping("/add")
    public String add(@RequestBody Item item){
        itemService.saveItem(item);
        return "new item added";
    }
    @GetMapping("/getItems")
    public List<Item> getItems(){
        return itemService.getAllItems();
    }
    @GetMapping("/getScrapedItems")
    public List<RawItem> getScrapedItems() throws InterruptedException {
        return scraper.scrapeData("home","19805");
    }

}
