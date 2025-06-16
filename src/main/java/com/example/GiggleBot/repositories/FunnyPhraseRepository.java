package com.example.GiggleBot.repositories;

import com.example.GiggleBot.models.FunnyPhrase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FunnyPhraseRepository extends JpaRepository<FunnyPhrase, Long> {
}
