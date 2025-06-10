package com.example.GiggleBot.services;

import com.example.GiggleBot.models.FunnyPhrase;
import com.example.GiggleBot.repositories.FunnyPhraseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunnyPhraseService {
    private final FunnyPhraseRepository funnyPhraseRepository;

    public FunnyPhraseService(FunnyPhraseRepository funnyPhraseRepository) {
        this.funnyPhraseRepository = funnyPhraseRepository;
    }

    public List<FunnyPhrase> getAllFunnyPhrases() {
        return funnyPhraseRepository.findAll();
    }

    public FunnyPhrase addFunnyPhrase(FunnyPhrase funnyPhrase){
        return funnyPhraseRepository.save(funnyPhrase);
    }
}
