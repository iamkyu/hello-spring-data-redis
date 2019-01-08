package io.iamkyu.domain;

public class User {
    private Long id;
    private String userName;
    private String password;

    public User(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
}
