package com.test.tiket.element;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class flightPage {
    public static String urlFlight = "https://www.tiket.com/pesawat";
    public static String price0, price1;
    public static By radioBtnRoundTrip = By.xpath("//*[@id='formhome']/div/div/div[1]/div[2]/div/div[2]");
    public static By txtAirport = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[2]/div[2]/div[2]" +
            "/div[1]/input");
    public static By swtchBtn = By.className("wrapper-btn-switch ");
    public static By sectionCalendar = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[4]/div[2]");
    //28jan2021
    public static By datePicker1 = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[4]/div[2]/div[2]" +
            "/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[5]/div");
    //31jan2021
    public static By datePicker2 = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[5]/div[2]/div[2]" +
            "/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[6]/td[1]/div");
    public static By btnSelesai = By.xpath("//*[@id='formhome']/div/div/div[1]/div[3]/div[6]/div[2]/div/" +
            "div/div[3]/button");
    public static By btnSearch = By.xpath("//*[@id='formhome']/div/div/div[1]/div[5]/button");
    public static By modalsMengerti = By.xpath("//*[@id='app']/div/div[4]/div[2]/div/div[2]/div/div[2]/" +
            "div[2]/div[2]/div[1]/div[2]/div[3]");
    public static By chkSatu = By.xpath("//*[@id='app']/div/div[3]/div[2]/div/div[2]/div/div[1]" +
            "/div/form/div/div[1]/div/div[2]/div/div[3]");
    public static By chkDua = By.xpath("//*[@id='app']/div/div[3]/div[2]/div/div[2]/div/div[1]" +
            "/div/form/div/div[1]/div/div[2]/div/div[4]");
    public static By chkDrct = By.xpath("//*[@id='app']/div/div[3]/div[2]/div/div[2]/div/div[1]" +
            "/div/form/div/div[1]/div/div[2]/div/div[2]");
    public static By btnOk = By.className("ab-close-button");
    public static By btnBook = By.className("btn-book-now");
    public static By tgglSameAsContanct = By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]" +
            "/div/div[1]/div/div[2]/div[2]/div/div[1]/label/span[2]");
    public static By ddKewarganegaraan = By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]" +
            "/div[2]/div/div[2]/div[3]/div/div/div/input");
    public static By ddIndo = By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/" +
            "div[2]/div[3]/div/div/div/div[3]/div[2]/ul/li[1]");
    public static By btnLanjut = By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[7]" +
            "/button");
    public static By btnYaLanjutkan = By.xpath("//*[@id='app']/div/div[3]/div[3]/div/div[3]/div/div/div/div/div[3]" +
            "/button[2]");
    public static By btnOkk = By.xpath("//*[@id='app']/div/div[1]/div/div/div/div/div[3]/button");
}
