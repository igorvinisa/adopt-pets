package com.adotapets.adotapets.services;

import com.adotapets.adotapets.repository.CardPostRepository;
import com.adotapets.adotapets.model.CardPost;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CardPostService {

    @Autowired
    static CardPostRepository repository;

    public static List<CardPost> getCardPost(){
        List<CardPost> cardList;
        cardList = repository.findAll();
        return cardList;
    }
}
