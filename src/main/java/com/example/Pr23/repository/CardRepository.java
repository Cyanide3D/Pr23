package com.example.Pr23.repository;

import com.example.Pr23.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {

    Card findOneById(Long id);
    List<Card> findAllByCardNumber(int cardNumber);
    List<Card> findAllByCode(int code);

}
