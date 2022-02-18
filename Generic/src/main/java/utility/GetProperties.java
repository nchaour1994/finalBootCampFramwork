package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {

    public static Properties loadProperties(String path) {
        Properties prop = new Properties();
        InputStream ism = null;
        try {
            ism = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(ism);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ism.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static void main(String[] args) {
        Properties prop = GetProperties.loadProperties("C:\\Users\\nchao\\IdeaProjects\\finalBootCampFramwork\\Walgreens\\src\\test\\resources\\config.properties");
        String username= prop.getProperty("username");
        System.out.println(username);
      //  System.out.println(prop.get("browserstackUsername"));
       // System.out.println(prop.get("browserstackPassword"));
    }
}
