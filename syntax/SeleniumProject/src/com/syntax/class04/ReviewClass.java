package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.ebay.com";
        driver.navigate().to(url);
        Thread.sleep(3000);
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().forward();
        String currentURL= driver.getCurrentUrl();
        System.out.println(currentURL);
    }
}
