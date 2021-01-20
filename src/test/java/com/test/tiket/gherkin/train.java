package com.test.tiket.gherkin;

import com.test.tiket.element.basePage;
import cucumber.api.java.es.E;
import cucumber.api.java.sl.In;
import org.openqa.selenium.By;

import static com.test.tiket.element.trainPage.*;

public class train extends basePage {
    public static void access_kereta_page() {
        waitfor(3);
        driver.get(urlTrain);
    }

    public static void create_order_kereta(String countDewasa, String countAnak) {
        waitfor(3);

        try {
            driver.findElement(btnOk).click();
            driver.findElement(sectionTrain).click();
        } catch (Exception e){
            waitfor(1);
        }

        //choose station
        driver.findElement(sectionStation).click();
        driver.findElement(lstFirst).click();
        driver.findElement(swtchBtn).click();
        driver.findElement(sectionStation).click();
        driver.findElement(lstSec).click();
        driver.findElement(swtchBtn).click();

        //choose time
        driver.findElement(dtpckDepart).click();
        driver.findElement(dateDepart).click();
        waitfor(2);

        //check Penumpang
        String dew = driver.findElement(txtDewasa).getText();
        dewasa = Integer.parseInt(dew);
        String bay = driver.findElement(txtBayi).getText();
        bayi = Integer.parseInt(bay);
        int cAnak = Integer.parseInt(countAnak);
        int cDewasa = Integer.parseInt(countDewasa);

        if (dewasa < cDewasa)
        {
            for (int i=0;i<cDewasa;i++){
                driver.findElement(btnPlusDewasa).click();
            }
        }

        if (bayi < cAnak)
        {
            for (int i=0;i<cAnak;i++){
                driver.findElement(btnPlusAnak).click();
            }
        }

        driver.findElement(btnSelesai).click(); waitfor(1);
        driver.findElement(btnCariKereta).click(); waitfor(2);
        driver.findElement(btnPilih).click(); waitfor(3);
    }

    public static void fill_data_passangers() {
        //toggle
        driver.findElement(By.xpath("//*[@id='contact-form']/div[2]/div[2]/div[1]/div")).click();
        waitfor(1);
        generic.scroll();

        driver.findElement(By.xpath("//*[@id='adult-form-0']/div[2]/div/div/div[4]/div/input"))
                .sendKeys("12343554667");

        driver.findElement(By.xpath("//*[@id='infant-form-0']/div[2]/div/div/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id='infant-form-0']/div[2]/div/div/div[1]/div[2]/div[3]")).click();
    }

    public static void choose_seat() {
        //pilih kursi
        driver.findElement(By.xpath("//*[@id='contact-form']/div[4]/button[1]")).click();
        generic.scroll();
        waitfor(2);
        //lanjut pembayaran
        driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[2]/div/div/div[4]/button")).click();
        waitfor(2);
        // ya lanjutkan
        driver.findElement(By.xpath("//*[@id='popup']/div/div/div/div[5]/button[1]")).click();
        waitfor(2);
    }

}
