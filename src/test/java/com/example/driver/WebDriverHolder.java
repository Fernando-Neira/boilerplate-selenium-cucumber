package com.example.driver;

import java.util.HashMap;
import java.util.Map;

public class WebDriverHolder {

    private static final Map<String, WebDriverManager> webDriverManagers;

    private WebDriverHolder() {

    }

    static {
        webDriverManagers = new HashMap<>();
    }

    public static void setWebDriverManager(WebDriverManager webDriverManager) {
        webDriverManagers.put(Thread.currentThread().getName(), webDriverManager);
    }

    public static WebDriverManager getWebDriverManager() {
        return webDriverManagers.get(Thread.currentThread().getName());
    }

}
