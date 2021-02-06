package com.test.tiket.gherkin;

import com.test.tiket.element.basePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class generic extends basePage {

    public static void runDriver() {
        driver = new ChromeDriver();
    }

    public static void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

    public static void login() {
        driver.get("https://tiket.com/login");
        waitfor(2);
        driver.findElement(username).sendKeys("tiketdotkom@yahoo.com");
        driver.findElement(btnLanjutkan).click();
        waitfor(2);
        driver.findElement(password).sendKeys("_Bismillah0-=_");
        driver.findElement(btnLogin).click();
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
