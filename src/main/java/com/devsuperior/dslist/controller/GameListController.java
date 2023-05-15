package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.ReplacementDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;



    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(gameListService.findAll());
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity findAll(@PathVariable Long listId){
        return ResponseEntity.ok(gameService.findByList(listId));
    }

    @PostMapping("/{listId}/replacement")
    public ResponseEntity move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId, body.sourceIndex(), body.destinationIndex());
        return ResponseEntity.noContent().build();
    }

//    @GetMapping(value = "/{id}")
//    public GameDTO findById(@PathVariable Long id){
//        return gameService.findById(id);
//    }

}
