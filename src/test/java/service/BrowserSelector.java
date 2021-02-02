package service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class BrowserSelector {
    private static final Logger logger = LogManager.getRootLogger();

    public BrowserSelector() {
    }

    public static String getBrowserName(String key){
        FileInputStream fis = null;
        ResourceBundle resourceBundle = null;
        try {
            fis = new FileInputStream(String.format("src/test/java/resources/%s.properties", System.getProperty("browser")));
            resourceBundle = new PropertyResourceBundle(fis);
        } catch (IOException e) {
            //e.printStackTrace();
            logger.error("Can not find '.properties' file or something go wrong with FileInputStream "+e.getLocalizedMessage());
        }
        System.out.println(resourceBundle);
        return resourceBundle.getString(key);
    }
}
