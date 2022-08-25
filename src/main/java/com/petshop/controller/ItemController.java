package com.petshop.controller;


import com.petshop.models.Item;
import com.petshop.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/apipetshop/v1/item")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ItemController {

    private ItemService itemService;

    @GetMapping
    public List<Item> listaTodosItens(){
        return itemService.listAll();
    }
}
