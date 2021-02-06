package com.test.tiket.gherkin;

import com.test.tiket.element.basePage;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.test.tiket.element.flightPage.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


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
        if (driver.findElement(startDate).isDisplayed()){
//            cCal = driver.findElement(startDate).getText().substring(8);
            driver.findElement(startDate).click();
            waitfor(1);
            driver.findElement(buttonNextCal).click();
            waitfor(2);
            driver.findElement(endDate).click();
            waitfor(2);


//            driver.findElement(buttonNextCal).click();
//solution 1
//            WebElement dates = driver.findElement(By.xpath(".//*[@class='widget-date-picker-content']//ancestor::div[3]/div/div/table/tbody"));
//            List<WebElement> column = dates.findElement(By.tagName("td"));
//            for (WebElement cell: column){
//                if(cell.getText().equals(cCal)){
//                    cell.click();
//                    break;
//                }
//            }
//solution 2
//            driver.findElement(buttonNextCal).click();
//            waitfor(2);
//            driver.findElement(By.xpath("//*[text()="+cCal+"]//ancestor::td[1]")).click();
//            driver.findElement(calBtn).click();
//solution  3

        }

        // 31 jan 2021
//        driver.findElement(datePicker2).click(); waitfor(1);

        //selesai button
        driver.findElement(btnSelesai).click(); waitfor(1);

        // click search
        driver.findElement(btnSearch).click(); waitfor(5);

        int rand = ThreadLocalRandom.current().nextInt(0, 5);

        // Create a date object
        LocalDate myObj = LocalDate.now();
        String myObjj = myObj.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Calendar cc = Calendar.getInstance();
        try{
            //Setting the date to the given date
            c.setTime(sdf.parse(myObjj));
            cc.setTime(sdf.parse(myObjj));
        }catch(ParseException e){
            e.printStackTrace();
        }

        c.add(Calendar.DAY_OF_MONTH, (30+rand));
        cc.add(Calendar.DAY_OF_MONTH, (35+rand));
        String newDate = sdf.format(c.getTime());
        String newDatee = sdf.format(cc.getTime());

        String url = "https://www.tiket.com/pesawat/search?d=JKTC&a=DJJ&dType=CITY&aType=AIRPORT&" +
                "date="+newDate+"" +
                "&" +
                "ret_date="+newDatee+"" +
                "&adult=1&child=0&infant=0&class=economy&type=depart&flexiFare=false";

        driver.get(url);

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
        driver.findElement(tgglSameAsContanct).click(); waitfor(2);

        //indonesia
        driver.findElement(ddKewarganegaraan).click(); generic.waitfor(2);
        driver.findElement(ddIndo).click(); waitfor(2);

        for (int i = 0; i < 4; i++) {
            generic.scroll();
        }

        waitfor(2);
        driver.findElement(btnLanjut).click(); generic.waitfor(2);
        driver.findElement(btnYaLanjutkan).click(); generic.waitfor(3);

        // button lanjutkan
        try {
            generic.driver.findElement(btnOkk).click();
        } catch (Exception e) {
            waitfor(1);
        } waitfor(20);
    }

}

