package com.kishore.automation.oops.encapsulation;

public class LoginExampleEncaps {
    public static void main(String[] args) {

        LoginData login = new LoginData();

        login.setUsername("admin_user");
        login.setPassword("StrongPass123");

        System.out.println(login.getUsername());
    }
}
class LoginData {

    private String username;
    private String password;
    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}
