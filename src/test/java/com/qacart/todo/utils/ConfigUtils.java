package com.qacart.todo.utils;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {

    private static ConfigUtils configUtils;
    private Properties prop;
    private ConfigUtils(){
        prop = readProp();
    }

    public static ConfigUtils getInstance(){
        if(configUtils == null) {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    private Properties readProp() {
        try {
            InputStream is = new FileInputStream("C:\\IJWorkspace\\to-do\\src\\test\\resources\\env\\production.properties");
            prop = new Properties();
            prop.load(is);
            System.out.println(prop.get("URL"));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        return prop;
    }

    public String getBaseUrl(){
        return prop.getProperty("URL").toString();
    }

}
