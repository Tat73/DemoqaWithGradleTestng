package org.example.api.models;

public class LoginViewModel {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static LoginViewModel generateModel(String userName, String password) {
        LoginViewModel loginViewModel = new LoginViewModel();
        loginViewModel.setUserName(userName);
        loginViewModel.setPassword(password);
        return loginViewModel;
    }
}
