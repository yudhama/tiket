package com.test.tiket.gherkin;

import org.openqa.selenium.By;

public class payment {
    public static String orderid_1, total_pay_1, total_pay_2;

    public static void choose_mandiri() {
        generic.scroll();
        // mandiri tab payment
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div/a[2]/div")).click();
        generic.waitfor(1);
        generic.waitfor(3);
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div/div[4]/div[2]/button")).click();
        generic.waitfor(5);
        orderid_1 = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/p[2]")).getText();
        orderid_1 = orderid_1.substring(10);
        total_pay_1 = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/p[2]")).getText();
        generic.waitfor(5);
    }

    public static void choose_bca() {
        generic.scroll();
        // bca tab payment
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div/a[1]/div")).click();
        generic.waitfor(1);
        generic.waitfor(3);
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div/div[4]/div[2]/button")).click();
        generic.waitfor(5);
        orderid_1 = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/p[2]")).getText();
        orderid_1 = orderid_1.substring(10);
        total_pay_1 = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/p[2]")).getText();
        generic.waitfor(5);
    }

    public static void choose_transfer() {
        String ok = "//*[@id='modal-root']/div/div/div/div/div/button";
        try {
            generic.driver.findElement(By.xpath(ok)).click();
            generic.waitfor(2);
        } catch (Exception e) {
        }
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div[2]/div[5]/div/a[1]/div")).click();
        generic.waitfor(1);
        total_pay_1 = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[4]/div[3]/div[1]/p[2]")).getText();
        generic.waitfor(3);
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div/div[4]/div[2]/button")).click();
        generic.waitfor(5);
        orderid_1 = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/p[2]")).getText();
        orderid_1 = orderid_1.substring(10);
        total_pay_1 = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/p[2]")).getText();
        generic.waitfor(5);
    }
}
