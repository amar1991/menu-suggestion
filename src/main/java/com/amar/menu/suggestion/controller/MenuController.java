package com.amar.menu.suggestion.controller;

import com.amar.menu.suggestion.model.Menu;
import com.amar.menu.suggestion.repository.MenuRepository;
import com.amazonaws.services.accessanalyzer.model.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/menu/v1")
public class MenuController {


    @Autowired
    private MenuRepository menuRepository;

    // get all menu
    @GetMapping("/menu")
    public List<Menu> getAllMenu(){
        return menuRepository.findAll();
    }

    // create menu rest api
    @PostMapping("/menu")
    public Menu createMenuSuggestion(@RequestBody Menu menu) {
        return menuRepository.save(menu);
    }

    // get menu details by id rest api
    @GetMapping("/menu/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable Long id) {
        Menu menu = menuRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Details not exist with id :" + id));
        return ResponseEntity.ok(menu);
    }

    // update menu suggestion rest api

    @PutMapping("/menu-suggestion/{id}")
    public ResponseEntity<Menu> updateMenuSuggestion(@PathVariable Long id, @RequestBody Menu menueDetails){
        Menu menu = menuRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Details not exist with id :" + id));
        menu.setMenuSuggestion(menueDetails.getMenuSuggestion());

        Menu updatedMenuSuggestion = menuRepository.save(menu);
        return ResponseEntity.ok(updatedMenuSuggestion);
    }

}