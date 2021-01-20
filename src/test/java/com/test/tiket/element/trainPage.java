package com.test.tiket.element;

import org.openqa.selenium.By;

public class trainPage {
    public static String urlTrain = "https://www.tiket.com/kereta-api";
    public static By btnOk = By.className("v3-btn-blue");
    public static By sectionTrain = By.className("header-part");
    public static By sectionStation = By.className("user-area");
    public static By lstFirst = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[2]/div[2]" +
            "/div[2]/div/div/div[2]/ul/li[2]");
    public static By lstSec = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[2]/div[2]" +
            "/div[2]/div/div/div[2]/ul/li[1]");
    public static By swtchBtn = By.className("switcher");
    public static By dtpckDepart = By.className("datepicker-depart");
    public static By dateDepart = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[4]/div[2]/div[2]" +
            "/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[5]/div");
    public static By txtDewasa = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[6]/div[2]/div/div" +
            "/div[2]/div[1]/div[2]/div[2]");
    public static int dewasa , bayi ;
    public static By txtBayi = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[6]/div[2]/div/div/" +
            "div[2]/div[2]/div[2]/div[2]");
    public static By btnPlusDewasa = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[6]/div[2]/div/div/" +
            "div[2]/div[1]/div[2]/div[3]/button");
    public static By btnPlusAnak = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[6]/div[2]/div/div/" +
            "div[2]/div[2]/div[2]/div[3]/button");
    public static By btnSelesai = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[6]/div[2]/div/" +
            "div/div[3]/button");
    public static By btnCariKereta = By.xpath("//*[@id='formhome']/div/div/div[1]/div[4]/button");
    public static By btnPilih = By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div/div/div[2]/div[2]" +
            "/div[1]/div/div[2]/div[3]/button");
}
