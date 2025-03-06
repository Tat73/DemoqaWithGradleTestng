package org.example.ui.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    public static String UI_BASE_URL;
    public static String url;
    public static String USERNAME;
    public static String USER_PASSWORD;
    public static String USER_FIRSTNAME;
    public static String USER_LASTNAME;
    public static String USER_ID;

    public static String loadProperty(String filePath, String key) {
        Properties props = new Properties();
        String result;

        try (InputStream input = new FileInputStream(filePath)) {
            props.load(input);
            result = props.getProperty(key);
            if (result != null && result.contains("${url}")) {
                result = result.replace("${url}", url);
            }

        } catch (IOException e) {
            System.err.println("Can not read a properties file: " + e.getMessage());
            throw new RuntimeException("Can not load the properties", e);
        }
        return result;
    }

    static {
        url = loadProperty("src/main/resources/config.properties", "url");
        UI_BASE_URL = loadProperty("src/main/resources/config.properties", "ui.path");
        USERNAME = loadProperty("src/main/resources/credentials.properties", "user.name");
        USER_PASSWORD = loadProperty("src/main/resources/credentials.properties", "user.password");
        USER_FIRSTNAME = loadProperty("src/main/resources/credentials.properties", "user.first.name");
        USER_LASTNAME = loadProperty("src/main/resources/credentials.properties", "user.last.name");
        USER_ID = loadProperty("src/main/resources/credentials.properties", "user.id");
    }
}
