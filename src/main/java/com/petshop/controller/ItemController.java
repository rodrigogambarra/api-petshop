package com.petshop.controller;


import com.petshop.exception.ItemNotFoundException;
import com.petshop.models.Item;
import com.petshop.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.validation.Valid;

@RestController
@RequestMapping("/apipetshop/v1/item")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ItemController {

    private ItemService itemService;

    @GetMapping
    public List<Item> listaTodosItens(){
        return itemService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item criaItem(@RequestBody @Valid Item item){
        return itemService.criaItem(item);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Item procuraPorId(@PathVariable Long id) throws ItemNotFoundException {
        return itemService.procuraPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaPorId(@PathVariable Long id) throws ItemNotFoundException {
        itemService.deletaPorId(id);
    }

    @PutMapping("/{id}")
    public Item updatePorId(@PathVariable Long id, @RequestBody @Valid Item item) throws ItemNotFoundException {
        return itemService.updatePorId(id, item);
    }
}
