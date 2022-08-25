package com.petshop.service;

import com.petshop.models.Item;
import com.petshop.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ItemService {

    private final ItemRepository itemRepository;

    public List<Item> listAll(){
        List<Item> retornaTodosItens = itemRepository.findAll();
        return retornaTodosItens.stream()
                .collect(Collectors.toList());
    }
}
