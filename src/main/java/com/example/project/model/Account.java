package com.example.project.model;

public class Account {
    private long id;
    private long user_id;
    private String username;
    private AccountStatus accountStatus;

    public Account(long id, long user_id, String username) {
        this.id = id;
        this.user_id = user_id;
        this.username = username;
        this.accountStatus = AccountStatus.ACTIVE;
    }

    public Account() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
