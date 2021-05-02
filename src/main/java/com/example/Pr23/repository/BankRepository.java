package com.example.Pr23.repository;

import com.example.Pr23.models.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankRepository extends JpaRepository<Bank, Long> {

    List<Bank> findAllByAddress(String address);
    Bank findOneById(Long id);
    List<Bank> findAllByName(String name);

}
