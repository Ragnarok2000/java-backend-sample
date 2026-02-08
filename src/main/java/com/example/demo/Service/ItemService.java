package com.example.demo.Service;

import com.example.demo.Model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();
    private int currentId = 1;

    public Item addItem(Item item) {
        item.setId(currentId++);
        items.add(item);
        return item;
    }

    public Item getItemById(int id) {
        return items.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }
}