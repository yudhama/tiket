package com.test.tiket.gherkin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class generic {

    public static WebDriver driver;

    public static void runDriver() {
        driver = new ChromeDriver();
    }

    public static void waitfor(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

    public static void login() {
        driver.get("https://tiket.com/login");
        waitfor(2);
        driver.findElement(By.name("username")).sendKeys("tiketdotkom@yahoo.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div" +
                "/div[1]/div[4]/button")).click();
        waitfor(1);
        driver.findElement(By.name("password")).sendKeys("_Bismillah0-=_");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div" +
                "/div[2]/div/form/div[4]/button")).click();
    }

    public static void logout() {
        waitfor(1);
        driver.get("https://tiket.com/logout");
    }

    public static void access_tiket() {
        driver.get("https://tiket.com");
    }

    public static void close() {
        driver.close();
    }
}
