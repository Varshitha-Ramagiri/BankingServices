package com.example.BankingServices.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="bank_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankInfo {
    @Id
    @GeneratedValue
    public int id;
    public int bankCode;
    public String name;
    public String address;
    public String phone;
    public String email;
    public String website;
    public String bankName;
    public String branchName;
    public String ifsc;
    @OneToMany(targetEntity = Accounts.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_id", referencedColumnName = "bankCode")
        private List<Accounts> account;



}

