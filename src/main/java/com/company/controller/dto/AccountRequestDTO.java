package com.company.controller.dto;


public class AccountRequestDTO {

    private String name;
    private String mail;
    private Integer age;

    public AccountRequestDTO(String name, String mail, Integer age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    public AccountRequestDTO() {
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
