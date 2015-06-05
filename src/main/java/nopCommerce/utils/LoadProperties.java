package nopCommerce.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Anantha on 02/06/2015.
 */
public class LoadProperties {
    static Properties prop;
    static String propertiesFileLocation = "src/test/java/Properties/";
    static String propFileName = "TestData.Properties";
    static FileInputStream input;

    public static String getProperty(String Key) {
        prop = new Properties();
        try {
            input = new FileInputStream(propertiesFileLocation + propFileName);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(Key);

    }
}
