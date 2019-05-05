package com.acst.commons;

import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.Properties;

public class GetProperties {

    private static String filePath = "C:\\Users\\dsr\\IdeaProjects\\acst\\src\\main\\resources\\conf.properties";
    public static String getProperties(String key) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        Properties properties = new Properties();
        properties.load(fileReader);
        String value = null;
        value = properties.getProperty(key);
        return value;
    }

}
