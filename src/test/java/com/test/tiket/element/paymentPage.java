package com.test.tiket.element;

import org.openqa.selenium.By;

public class paymentPage {
    public static String orderid_1, total_pay_1, total_pay_2;
    public static By vaMandiri = By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div" +
            "/a[2]/div");
    public static By vaBCA = By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div" +
            "/a[1]/div");
    public static By btnPay = By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div[2]/div[1]/div/div/div[4]" +
            "/div[2]/button");
}
