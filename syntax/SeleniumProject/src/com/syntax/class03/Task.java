package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[contains(@id, 'username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()= 'Logout']")).click();
        driver.close();

    }
}
