package com.company.controller.dto;

import com.company.entity.Account;

public class AccountResponseDTO {

        private Long id;
        private String name;
        private String mail;
        private Integer age;

    public AccountResponseDTO(Long id, String name, String mail, Integer age) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    public AccountResponseDTO(Account account) {
            id = account.getUser_id();
            name = account.getUser_name();
            mail = account.getUser_mail();
            age = account.getUser_age();
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
}
