package com.syntax.class08;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Fluent_Waits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

    }
}
