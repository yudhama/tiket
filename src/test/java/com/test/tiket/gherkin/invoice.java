package com.test.tiket.gherkin;

import org.openqa.selenium.By;

public class invoice {
    public static void check_myorder()
    {
        generic.driver.get("https://www.tiket.com/myorder");
        String ok = "//*[@id='filter-area']/div/div[1]/div/div[2]/button";
        if (generic.driver.findElement(By.xpath(ok)).isDisplayed()) {
            generic.driver.findElement(By.xpath(ok)).click();
        }
        generic.driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/a")).click();
        generic.waitfor(2);
        String pay = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/p[2]")).getText();
        String inv_id = generic.driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/p[2]")).getText();

        if (pay == payment.total_pay_1 && pay == payment.total_pay_2)
        {
            System.out.printf("pass");
        }
        else {
            System.out.printf("notpass").checkError();
        }
    }
}
