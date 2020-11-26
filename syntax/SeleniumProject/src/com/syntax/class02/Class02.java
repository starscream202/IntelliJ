package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        /*String title= driver.getTitle();
        if(title.equalsIgnoreCase("Facebook")){
            System.out.println("Title is right");
        }else{
            System.out.println("Title is wrong");
        }
        driver.manage().window().maximize();*/
        driver.findElement(By.id("email")).sendKeys("cantse@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("syntax");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
