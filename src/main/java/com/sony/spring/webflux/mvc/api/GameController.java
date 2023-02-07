package com.sony.spring.webflux.mvc.api;

import com.sony.spring.webflux.mvc.model.Game;
import com.sony.spring.webflux.mvc.service.GameService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public List<Game> getAllGames() {
        return gameService.getAllCustomers();
    }

    @GetMapping("/games/{id}")
    public Game getById(@PathVariable Integer id) {
        return gameService.getById(id);
    }
}
