package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement userText=driver.findElement(By.xpath("//input[contains(@id, 'user')]"));
        userText.sendKeys("Tester");
        WebElement userPass= driver.findElement(By.xpath("//input[contains(@id, 'pas')]"));
        userPass.sendKeys("test");
    }
}
