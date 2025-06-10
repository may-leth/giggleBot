package com.example.GiggleBot.controllers;

import com.example.GiggleBot.models.FunnyPhrase;
import com.example.GiggleBot.services.FunnyPhraseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FunnyPhraseController {
    private final FunnyPhraseService funnyPhraseService;

    public FunnyPhraseController(FunnyPhraseService funnyPhraseService) {
        this.funnyPhraseService = funnyPhraseService;
    }

    @GetMapping("/FunnyPhrases")
    public List<FunnyPhrase> getAllFunnyPhrases() {
        return funnyPhraseService.getAllFunnyPhrases();
    }

    @PostMapping("/FunnyPhrases")
    public void addFunnyPhrase(@RequestBody FunnyPhrase funnyPhrase) {
        funnyPhraseService.addFunnyPhrase(funnyPhrase);
    }
}
