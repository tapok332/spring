package com.company.controller;

import com.company.controller.dto.AccountRequestDTO;
import com.company.controller.dto.AccountResponseDTO;
import com.company.entity.Account;
import com.company.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello new spring!";
    }

    @PostMapping("/create")
    public Long create(@RequestBody AccountRequestDTO accountRequestDTO){
        return accountService.createAccount(accountRequestDTO.getName(), accountRequestDTO.getMail(), accountRequestDTO.getAge());
    }

    @GetMapping("/get/{id}")
    public AccountResponseDTO getAccountById(@PathVariable Long id) throws AccountNotFoundException {
        return new AccountResponseDTO(accountService.getAccount(id));
    }

    @GetMapping("/get")
    public AccountResponseDTO getAccount(){
        return new AccountResponseDTO((Account) accountService.getFull());
    }
}
