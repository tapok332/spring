package com.company.service;

import com.company.entity.Account;
import com.company.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long createAccount(String name, String mail, Integer age){
        Account account = new Account(name, mail, age);
        return accountRepository.save(account).getUser_id();
    }
}
