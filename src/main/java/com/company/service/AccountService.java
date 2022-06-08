package com.company.service;

import com.company.entity.Account;
import com.company.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.login.AccountNotFoundException;

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

    public Account getAccount(Long id) throws AccountNotFoundException {
        return accountRepository.findById(id).orElseThrow(AccountNotFoundException::new);
    }

    public @ResponseBody
    Iterable<Account> getFull(){
        return accountRepository.findAll();
    }
}
