package com.adotapets.adotapets.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Table(name = "User")
@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String pasword;
    private String phone;

    public User(Long id, String login, String pasword, String phone) {
        this.id = id;
        this.login = login;
        this.pasword = pasword;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPasword() {
        return pasword;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
