package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

    public static String readConfigData(String data) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream =
                new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Config.properties");
        properties.load(fileInputStream);
        return properties.getProperty(data);
    }
}
