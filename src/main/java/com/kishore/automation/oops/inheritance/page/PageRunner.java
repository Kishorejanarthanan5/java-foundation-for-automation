package com.kishore.automation.oops.inheritance.page;

public class PageRunner {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
    class LoginPage extends BasePage {
        public void login() {
            click("Username Field");
            click("Password Field");
            click("Login Button");
        }
    }