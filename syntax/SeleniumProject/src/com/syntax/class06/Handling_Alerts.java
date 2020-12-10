package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {
    public static final String url="http://www.uitestpractice.com/Students/Switchto";
    public static final String path="C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\chromedriver.exe";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver= new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        /*WebElement simpleAlertButton= driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert=driver.switchTo().alert();
        Thread.sleep(2000);
        //Handling simple alert
        simpleAlert.accept();
        WebElement confirmAlertButton= driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert =driver.switchTo().alert();
        String confirmText=confirmAlert.getText();
        System.out.println(confirmText);
        Thread.sleep(1000);
        confirmAlert.dismiss();*/
        WebElement promptAlertButton=driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Syntax techs");

        promptAlert.accept();

    }
}
