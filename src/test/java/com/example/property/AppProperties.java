package com.example.property;

import com.example.exception.PropertyNotFound;
import com.example.util.FileUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class AppProperties {

    private static final String propertiesFileName = "/properities/application.properties";
    private static final Properties properties;

    static {
        properties = new Properties();

        try(InputStream propertiesIS = AppProperties.class.getResourceAsStream(propertiesFileName)) {
            properties.load(propertiesIS);
        } catch (IOException e) {
            throw new RuntimeException(String.format("Error al cargar archivo properties '%s'", propertiesFileName));
        }
    }

    public static String getProperty(String property) {
        String prop = properties.getProperty(property);
        System.out.printf("Getting com.example.property '%s': {%s}%n",property, prop);
        return Optional.ofNullable(prop).orElseThrow(() -> new PropertyNotFound(property));
    }

    public static void setChromeProperties() {
        System.setProperty(getProperty("chromeDriver.property"), System.getProperty("user.dir") + FileUtils.SEPARATOR + "drivers" + FileUtils.SEPARATOR + getProperty("chromeDriver.name"));
    }
    
    public static void setFirefoxProperties() {
        System.setProperty(getProperty("geckoDriver.com.example.property"), System.getProperty("user.dir") + FileUtils.SEPARATOR + "drivers" + FileUtils.SEPARATOR + getProperty("geckoDriver.name"));
    }

    public static void setIEProperties() {
        System.setProperty(getProperty("IEDriverServer.com.example.property"), System.getProperty("user.dir") + FileUtils.SEPARATOR + "drivers" + FileUtils.SEPARATOR + getProperty("IEDriverServer.name"));
    }

}
