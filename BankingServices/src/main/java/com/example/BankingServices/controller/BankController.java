
package com.example.BankingServices.controller;
import com.example.BankingServices.Model.BankInfo;
import com.example.BankingServices.dto.Bankinforequest;
import com.example.BankingServices.repository.AccountRepository;
import com.example.BankingServices.repository.BankInforepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/varshabanks")
public class BankController {
    @Autowired
    private BankInforepository bankrepo;

    @Autowired
    private AccountRepository accountrepo;

    @PostMapping("/addaccounts")
    public BankInfo addaccounts(@RequestBody Bankinforequest bank) {

        return bankrepo.save(bank.getBankInfo());
    }
}