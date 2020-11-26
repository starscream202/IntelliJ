package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\stars\\\\Downloads\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        String title= driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders Login")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is wrong");
        }

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
