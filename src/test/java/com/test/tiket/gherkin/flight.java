package com.test.tiket.gherkin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class flight {

    public static String price0, price1;

    public static void access_pesawat_page() {
        generic.waitfor(3);
        generic.driver.get("https://tiket.com/pesawat");
    }

    public static void click_roundtrip() {
        generic.driver.findElement(By.xpath("//*[@id='formhome']/div/div/div[1]/div[2]/div/div[2]")).click();
    }

    public static void search_flight() {
        // write airport name
        String airport = "//*[@id='formhome']/div/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input";
        generic.driver.findElement(By.xpath(airport)).click();
        generic.driver.findElement(By.xpath(airport)).sendKeys("jakarta");
        generic.driver.findElement(By.xpath(airport)).sendKeys(Keys.RETURN);
        generic.waitfor(1);
        generic.driver.findElement(By.className("wrapper-btn-switch ")).click();
        generic.waitfor(1);
        generic.driver.findElement(By.xpath(airport)).sendKeys("sentani");
        generic.driver.findElement(By.xpath(airport)).sendKeys(Keys.RETURN);
        generic.waitfor(1);
        generic.driver.findElement(By.className("wrapper-btn-switch ")).click();
        generic.waitfor(1);

        // write calendar
        generic.driver.findElement(By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[4]/div[2]")).click();
        generic.waitfor(1);
        // 28 jan 2021
        generic.driver.findElement(By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[4]/div[2]/div[2]" +
                "/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[5]/div")).click();
        generic.waitfor(1);
        // 31 jan 2021
        generic.driver.findElement(By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[5]/div[2]/div[2]" +
                "/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[6]/td[1]/div")).click();
        generic.waitfor(1);
        //selesai button
        generic.driver.findElement(By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[6]/div[2]/div/" +
                "div/div[3]/button")).click();
        generic.waitfor(1);
        // click search
        generic.driver.findElement(By.xpath("//*[@id='formhome']/div/div/div[1]/div[5]/button")).click();
        generic.waitfor(5);

    }

    public static void filter_and_choose(String transit) {
        //click mengerti modals
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div[2]/div/div[2]/div/div[2]/" +
                "div[2]/div[2]/div[1]/div[2]/div[3]")).click();

        // default filter 2 transit
        String filter;
        if (transit == "1") {
            filter = "//*[@id='app']/div/div[3]/div[2]/div/div[2]/div/div[1]" +
                    "/div/form/div/div[1]/div/div[2]/div/div[3]";
        } else if (transit == "2") {
            filter = "//*[@id='app']/div/div[3]/div[2]/div/div[2]/div/div[1]" +
                    "/div/form/div/div[1]/div/div[2]/div/div[4]";
        } else {
            filter = "//*[@id='app']/div/div[3]/div[2]/div/div[2]/div/div[1]" +
                    "/div/form/div/div[1]/div/div[2]/div/div[2]";
        }

        generic.driver.findElement(By.xpath(filter)).click();
        generic.waitfor(5);

        price0 = generic.driver.findElement(By.className("text-price")).getText();
        generic.driver.findElement(By.className("btn-book-now")).click();
        generic.waitfor(5);

        generic.driver.findElement(By.xpath(filter)).click();
        generic.waitfor(5);

        price1 = generic.driver.findElement(By.className("text-price")).getText();
        generic.driver.findElement(By.className("btn-book-now")).click();
        generic.waitfor(5);
    }

    public static void fill_the_passanger_data() {
        //toggle
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]" +
                "/div/div[1]/div/div[2]/div[2]/div/div[1]/label/span[2]")).click();
        generic.waitfor(1);

//        //indonesia
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]" +
//                "/div/div[1]/div/div[2]/div[2]/div/div[2]/div[4]/div[1]/div")).click();
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]" +
//                "/div/div[1]/div/div[2]/div[2]/div/div[2]/div[4]/div[1]/div/div/div[3]/div" +
//                "[2]/ul/li[1]")).click();
//        generic.waitfor(1);
//
//        generic.scroll();
//
//        //01
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]" +
//                "/div/div[1]/div/div[2]/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div[1]/" +
//                "div")).click();
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]" +
//                "/div/div[1]/div/div[2]/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div[1]/" +
//                "div/div[3]/ul/li[1]")).click();
//        generic.waitfor(1);
//        //jan
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]" +
//                "/div/div[1]/div/div[2]/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div[3]" +
//                "/div")).click();
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]" +
//                "/div/div[1]/div/div[2]/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div[3]/" +
//                "div/div[3]/ul/li[1]")).click();
//        generic.waitfor(1);
//        //2003
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div" +
//                "/div[1]/div/div[2]/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div[5]/div/input")).click();
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]" +
//                "/div/div[2]/div[4]/div[2]/div/div[1]/div[5]/div/div[3]/ul/li[3]")).click();
//        generic.waitfor(1);
//
//        //nopassport
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]" +
//                "/div/div[2]/div[5]/div[1]/div/input")).sendKeys("1234567890123");
//        //ddpass
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/" +
//                "div[1]/div/div[2]/div[2]/div/div[2]/div[5]/div[2]/div/div[1]/div[1]/div/input")).click();
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]" +
//                "/div/div[2]/div[5]/div[2]/div/div[1]/div[1]/div/div[3]/ul/li[3]")).click();
//        //mmpass
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/" +
//                "div[1]/div/div[2]/div[2]/div/div[2]/div[5]/div[2]/div/div[1]/div[3]/div/div[3]/ul/li[1]")).click();
//        //yypass
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/" +
//                "div[1]/div/div[2]/div[2]/div/div[2]/div[5]/div[2]/div/div[1]/div[5]/div/div[3]/ul/li[1]/div")).click();
//
//        //negpass
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/" +
//                "div[1]/div/div[2]/div[2]/div/div[2]/div[6]/div[1]/div/div")).click();
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/" +
//                "div[1]/div/div[2]/div[2]/div/div[2]/div[6]/div[1]/div/div/div[3]/div[2]/ul/li[1]")).click();
//        //ddnegpass
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]" +
//                "/div/div[2]/div[6]/div[2]/div/div[1]/div[1]/div/input")).click();
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]" +
//                "/div/div[2]/div[6]/div[2]/div/div[1]/div[1]/div/div[3]/ul/li[1]")).click();
//        //mm
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]" +
//                "/div/div[2]/div[6]/div[2]/div/div[1]/div[3]/div/div[3]/ul/li[1]")).click();
//        //yy
//        generic.waitfor(1);
//        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]" +
//                "/div/div[2]/div[6]/div[2]/div/div[1]/div[5]/div/div[3]/ul/li[3]")).click();

        for (int i = 0; i < 4; i++) {
            generic.scroll();
        }

        generic.waitfor(1);
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[7]" +
                "/button")).click();
        generic.waitfor(1);
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[3]/div/div/div/div/div[3]" +
                "/button[2]")).click();
        generic.waitfor(3);
        // button lanjutkan
        try {
            generic.driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div/div/div/div/div[3]/button")).click();
        } catch (Exception e) {
            generic.waitfor(1);
        }
        generic.waitfor(10);
    }

}

