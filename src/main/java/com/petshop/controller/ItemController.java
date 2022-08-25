package com.petshop.controller;


import com.petshop.models.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apipetshop/v1/item")
public class ItemController {

    @GetMapping
    public List<Item> listaTodosItens(){
        List<Item> lista = new ArrayList<>() {{
            add(new Item(3L,"Shampoo","Para caes",4));
            add(new Item(3L,"Coleira","Para caes e gatos",8));
            add(new Item(3L,"Ração","Para caes e gatos",8));
        }};
        return lista;
    }
}
