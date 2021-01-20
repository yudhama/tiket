package com.test.tiket.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class basePage {
    public static WebDriver driver;
//    public static interface tiket;
    public static By username = By.name("username");
    public static By btnLanjutkan = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div" +
            "/div[1]/div[4]/button");
    public static By password = By.name("password");
    public static By btnLogin = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div" +
            "/div[2]/div/form/div[4]/button");

    public static void waitfor(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
