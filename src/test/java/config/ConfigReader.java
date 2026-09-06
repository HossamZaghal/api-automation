package config;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try {
            String env = System.getProperty("env", "dev");

            String fileName = "config-" + env + ".properties";

            InputStream input =
                    ConfigReader.class
                            .getClassLoader()
                            .getResourceAsStream(fileName);

            if (input == null) {
                throw new RuntimeException(
                        "Config file not found: " + fileName);
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException(
                    "Could not load config.properties", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}