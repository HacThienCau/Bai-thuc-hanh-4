package com.example.controller;

import com.example.model.Shoe;
import com.example.repository.ShoeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shoes")
public class ShoeController {

    private final ShoeRepository shoeRepository;

    public ShoeController(ShoeRepository shoeRepository) {
        this.shoeRepository = shoeRepository;
    }

    @GetMapping
    public List<Shoe> getAllShoes() {
        return shoeRepository.findAll();
    }
}
