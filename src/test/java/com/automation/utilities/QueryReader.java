package com.automation.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class QueryReader {
    private static Properties properties = new Properties();

    static{
        try {
            FileInputStream file = new FileInputStream("src/test/resources/queries/queries.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Properties File not found");
        }
    }

    public static String read(String keyWord){
        return properties.getProperty(keyWord);
    }


}
