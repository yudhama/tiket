package com.test.tiket.gherkin;

import com.test.tiket.element.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.test.tiket.element.flightPage.*;


public class flight extends basePage {

    public static void access_pesawat_page() {
        generic.waitfor(3);
        driver.get(urlFlight);
    }

    public static void click_roundtrip() {
        driver.findElement(radioBtnRoundTrip).click();
    }

    public static void search_flight() {
        // write airport name
        driver.findElement(txtAirport).click();
        driver.findElement(txtAirport).sendKeys("jakarta");
        driver.findElement(txtAirport).sendKeys(Keys.RETURN);
        waitfor(1);
        driver.findElement(swtchBtn).click();
        waitfor(1);
        driver.findElement(txtAirport).sendKeys("sentani");
        driver.findElement(txtAirport).sendKeys(Keys.RETURN);
        waitfor(1);
        driver.findElement(swtchBtn).click();
        waitfor(1);

        // write calendar
        driver.findElement(sectionCalendar).click(); waitfor(1);

        // 28 jan 2021
        driver.findElement(datePicker1).click(); waitfor(1);

        // 31 jan 2021
        driver.findElement(datePicker2).click(); waitfor(1);

        //selesai button
        driver.findElement(btnSelesai).click(); waitfor(1);

        // click search
        driver.findElement(btnSearch).click(); waitfor(5);

    }

    public static void filter_and_choose(String transit) {
        //click mengerti modals
        try {
            driver.findElement(modalsMengerti).click();
        } catch (Exception e) {
            waitfor(1);
        }

        // ab test
        try {
            driver.findElement(btnOk).click();
        } catch (Exception e) {
            waitfor(1);
        }

        // filter for transit
        if (transit == "1") {
            driver.findElement(chkSatu).click();
        } else if (transit == "2") {
            driver.findElement(chkDua).click();
        } else {
            driver.findElement(chkDrct).click();
        } waitfor(5);

        price0 = driver.findElement(By.className("text-price")).getText();
        driver.findElement(By.className("btn-book-now")).click(); waitfor(5);

        // filter for transit
        if (transit == "1") {
            driver.findElement(chkSatu).click();
        } else if (transit == "2") {
            driver.findElement(chkDua).click();
        } else {
            driver.findElement(chkDrct).click();
        } waitfor(5);

        price1 = driver.findElement(By.className("text-price")).getText();
        driver.findElement(btnBook).click(); waitfor(5);
    }

    public static void fill_the_passanger_data() {
        //toggle
        driver.findElement(tgglSameAsContanct).click(); waitfor(1);

        //indonesia
        driver.findElement(ddKewarganegaraan).click(); generic.waitfor(1);
        driver.findElement(ddIndo).click(); waitfor(1);

        for (int i = 0; i < 4; i++) {
            generic.scroll();
        }

        waitfor(1);
        driver.findElement(btnLanjut).click(); generic.waitfor(1);
        driver.findElement(btnYaLanjutkan).click(); generic.waitfor(3);

        // button lanjutkan
        try {
            generic.driver.findElement(btnOkk).click();
        } catch (Exception e) {
            waitfor(1);
        } waitfor(15);
    }

}

