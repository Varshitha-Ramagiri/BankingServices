package com.example.BankingServices.repository;

import com.example.BankingServices.Model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts,Integer> {
}
