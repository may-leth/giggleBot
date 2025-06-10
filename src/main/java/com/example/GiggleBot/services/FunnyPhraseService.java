package com.example.GiggleBot.services;

import com.example.GiggleBot.models.FunnyPhrase;
import com.example.GiggleBot.repositories.FunnyPhraseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        funnyPhraseRepository.save(funnyPhrase);
        return funnyPhrase;
    }

    public FunnyPhrase updateFunnyPhrase(long id, FunnyPhrase updatePhrase) {
        FunnyPhrase existingPhrase = funnyPhraseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Frase no encontrada con el id: " + id));

        existingPhrase.setPhrase(updatePhrase.getPhrase());
        return funnyPhraseRepository.save(existingPhrase);
    }

    public void deleteFunnyPhrase(long id) {
        funnyPhraseRepository.deleteById(id);
    }

    public Optional<FunnyPhrase> getFunnyPhrase(Long id){
        return funnyPhraseRepository.findById(id);
    }
}
