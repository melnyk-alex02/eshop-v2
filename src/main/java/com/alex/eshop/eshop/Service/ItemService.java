package com.alex.eshop.eshop.Service;

import com.alex.eshop.eshop.Entity.Item;

import java.util.List;

public interface ItemService {
    Item getItemWithCategoryInfo(Long id);

    List<Item> getLastFiveItems();

    List<Item> getItemsInCategory(Long id);
}
