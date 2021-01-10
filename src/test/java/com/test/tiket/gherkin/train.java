package com.test.tiket.gherkin;

import org.openqa.selenium.By;

public class train {
    public static void access_kereta_page() {
        generic.waitfor(3);
        generic.driver.get("https://tiket.com/kereta-api");
    }

    public static void create_order_kereta(String dewasa, String anak) {
        generic.waitfor(1);
        generic.driver.get("https://www.tiket.com/kereta-api/cari?d=JAKARTA&dt=CITY&a=LPN&at=STATION&" +
                "date=2021-01-15&adult=" + dewasa + "&infant=" + anak + "");
        generic.waitfor(2);
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]" +
                "/div/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/button")).click();
        generic.waitfor(3);
    }

    public static void fill_data_passangers() {
        //toggle
        generic.driver.findElement(By.xpath("//*[@id='contact-form']/div[2]/div[2]/div[1]/div")).click();
        generic.waitfor(1);
        generic.scroll();

        generic.driver.findElement(By.xpath("//*[@id='adult-form-0']/div[2]/div/div/div[4]/div/input"))
                .sendKeys("12343554667");

        generic.driver.findElement(By.xpath("//*[@id='infant-form-0']/div[2]/div/div/div[1]/div/input")).click();
        generic.driver.findElement(By.xpath("//*[@id='infant-form-0']/div[2]/div/div/div[1]/div[2]/div[3]")).click();
    }

    public static void choose_seat() {
        //pilih kursi
        generic.driver.findElement(By.xpath("//*[@id='contact-form']/div[4]/button[1]")).click();
        generic.waitfor(2);
        //lanjut pembayaran
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[2]/div/div/div[4]/button")).click();
        generic.waitfor(2);
        // ya lanjutkan
        generic.driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div/div/div[5]/button[1]")).click();
        generic.waitfor(2);
    }

}
