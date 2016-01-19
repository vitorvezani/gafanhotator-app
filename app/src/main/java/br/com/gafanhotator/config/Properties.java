package br.com.gafanhotator.config;

/**
 * Created by vitor on 19/01/2016.
 */
public class Properties {

    private static Properties ourInstance = new Properties();
    private static String baseURL = "http://192.168.1.104:8080";

    public static Properties getInstance() {
        return ourInstance;
    }

    private Properties() {
    }

    public static String getBaseURL() {
        return baseURL;
    }
}
