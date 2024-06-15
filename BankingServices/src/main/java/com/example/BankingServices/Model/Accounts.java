package com.example.BankingServices.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Accounts {
    @Id
    public int accountholderid;
    public int bankCode;
    public String bankname;
    public String accountNumber;
    public String accountType;
    public String balance;
    public String accountholdername;
    public String accountholderaddress;
    public String accountholderphoneno;
    public String accountholderemail;
    public String accountholderpassword;

}
