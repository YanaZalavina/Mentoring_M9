package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ResourceBundle;

public class BrowserSelector {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("browser"));

    public BrowserSelector() throws FileNotFoundException {
    }

    public static String getBrowserName(String key){
        System.out.println(resourceBundle);
        return resourceBundle.getString(key);
    }
}
