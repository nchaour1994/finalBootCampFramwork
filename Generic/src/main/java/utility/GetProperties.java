package utility;

import org.jsoup.helper.StringUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    public static String projectPath(){
        String fileSeparator = File.pathSeparator;
        Properties prop = GetProperties.loadProperties("config.properties");
        String userDir = System.getProperty("user.dir");
        String projectName = prop.getProperty("project.name");
        List<String> directories = Arrays.asList(userDir.split(fileSeparator));
        List<String> newDirectories = new ArrayList<>();
        for (String dirName: directories){
            newDirectories.add(dirName);
            if(dirName.equalsIgnoreCase(projectName)){
                break;
            }
        }
        System.out.println(StringUtil.join(newDirectories, fileSeparator));
        return StringUtil.join(newDirectories, fileSeparator);
    }

    public static void main(String[] args) {
     //   Properties prop = GetProperties.loadProperties("C:\\Users\\nchao\\IdeaProjects\\finalBootCampFramwork\\Walgreens\\src\\test\\resources\\config.properties");
     //   String username= prop.getProperty("username");
       // System.out.println(username);
      //  System.out.println(prop.get("browserstackUsername"));
       // System.out.println(prop.get("browserstackPassword"));
        System.out.println(GetProperties.projectPath());
    }
}
