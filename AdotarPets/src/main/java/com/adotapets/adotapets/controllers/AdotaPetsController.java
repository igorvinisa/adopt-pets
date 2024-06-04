package com.adotapets.adotapets.controllers;

import com.adotapets.adotapets.model.CardPost;
import com.adotapets.adotapets.services.CardPostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("home")
public class AdotaPetsController {

    @GetMapping
    public List<CardPost> GetCardPostList(){
        List<CardPost> cardList;
        cardList = CardPostService.getCardPost();
        return cardList;
    }
}
