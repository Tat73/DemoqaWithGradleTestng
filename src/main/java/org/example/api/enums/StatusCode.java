package org.example.api.enums;

public enum StatusCode {

    OK(200),
    NOT_FOUND(404),
    CREATED(201),
    NO_CONTENT(204),
    BAD_REQUEST(400);

    private final int code;

    StatusCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
