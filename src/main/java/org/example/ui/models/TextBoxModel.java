package org.example.ui.models;

public class TextBoxModel {

    private String name;
    private String email;
    private String currentAddress;
    private String permanentAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    @Override
    public String toString() {
        return
                "Name='" + name + '\'' +
                        ", Email='" + email + '\'' +
                        ", Current Address='" + currentAddress + '\'' +
                        ", Permanent Address='" + permanentAddress;
    }
}
