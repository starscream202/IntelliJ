package com.syntax.class08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://demoqa.com/browser-windows";
        String url1="http://www.uitestpractice.com/Students/Contact";
        driver.get(url1);

    }
}
