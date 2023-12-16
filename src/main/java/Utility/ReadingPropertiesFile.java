package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {
    public static String getPropertyValue(String key) throws IOException {
        Properties prop=new Properties();
        prop.load(new FileInputStream("src/test/resources/Apps_Data/Environment.properties"));
        return prop.getProperty(key);
    }
}
