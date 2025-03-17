package org.example.ui.utils;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJsonFile {

    public static <T> T readJsonFromFile(String filePath, Class<T> type) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(new File(filePath), type);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
