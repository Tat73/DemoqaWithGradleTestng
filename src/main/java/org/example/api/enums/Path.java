package org.example.api.enums;

public enum Path {

    SITE_URL("https://demoqa.com/"),
    AUTHORIZED("Account/v1/Authorized"),
    ALL_BOOKS("BookStore/v1/Books");


    private final String path;

    Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
