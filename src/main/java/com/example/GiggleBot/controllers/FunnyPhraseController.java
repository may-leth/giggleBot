package com.example.GiggleBot.controllers;

import com.example.GiggleBot.models.FunnyPhrase;
import com.example.GiggleBot.services.FunnyPhraseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.List;

@RestController
public class FunnyPhraseController {
    private final FunnyPhraseService funnyPhraseService;

    public FunnyPhraseController(FunnyPhraseService funnyPhraseService) {
        this.funnyPhraseService = funnyPhraseService;
    }

    @GetMapping("/FunnyPhrases")
    public ResponseEntity<List<FunnyPhrase>> getAllFunnyPhrases() {
        List<FunnyPhrase> funnyPhrase = funnyPhraseService.getAllFunnyPhrases();
        return new ResponseEntity<List<FunnyPhrase>>(funnyPhrase, HttpStatus.OK);
    }

    @PostMapping("/FunnyPhrases")
    public ResponseEntity<FunnyPhrase> addFunnyPhrase(@RequestBody FunnyPhrase newFunnyPhrase) {
        FunnyPhrase createdFunnyPhrase = funnyPhraseService.addFunnyPhrase(newFunnyPhrase);
        return new ResponseEntity<FunnyPhrase>(createdFunnyPhrase, HttpStatus.CREATED);
    }

    @PutMapping("/FunnyPhrase/{id}")
    public ResponseEntity<FunnyPhrase> updateFunnyPhrase(@PathVariable Long id, @RequestBody FunnyPhrase newUpdateFunnyPhrase){
        FunnyPhrase updatePhrase = funnyPhraseService.updateFunnyPhrase(id, newUpdateFunnyPhrase);
        return new ResponseEntity<FunnyPhrase>(updatePhrase, HttpStatus.CREATED);
    }

    @DeleteMapping("/FunnyPhrases/{id}")
    public ResponseEntity<Void> deleteFunnyPhrase(@PathVariable long id){
        funnyPhraseService.deleteFunnyPhrase(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/FunnyPhrases/{id}")
    public ResponseEntity<FunnyPhrase> getFunnyPhrase(@PathVariable Long id){
        return funnyPhraseService.getFunnyPhrase(id).map(phrase -> new ResponseEntity<>(phrase, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
