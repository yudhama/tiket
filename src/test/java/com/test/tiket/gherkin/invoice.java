package com.test.tiket.gherkin;

import com.test.tiket.element.basePage;
import org.openqa.selenium.By;
import static com.test.tiket.element.paymentPage.total_pay_1;
import static com.test.tiket.element.paymentPage.total_pay_2;

public class invoice extends basePage {
    public static void check_myorder()
    {
        generic.driver.get("https://www.tiket.com/myorder");
        String ok = "//*[@id='filter-area']/div/div[1]/div/div[2]/button";
        if (driver.findElement(By.xpath(ok)).isDisplayed()) {
            driver.findElement(By.xpath(ok)).click();
        }
        driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/a")).click();
        waitfor(2);
        String pay = driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/p[2]")).getText();
        String inv_id = driver.findElement(By.xpath("//*[@id='app']/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/p[2]")).getText();

        if (pay == total_pay_1 && pay == total_pay_2)
        {
            System.out.printf("pass");
        }
        else {
            System.out.printf("notpass").checkError();
        }
    }
}
