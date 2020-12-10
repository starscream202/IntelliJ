package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static String url=" http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("FrameOne");
        WebElement frameHeader=driver.findElement(By.xpath("//a[@href = './index.php']"));
        boolean isHeaderdisplayed= frameHeader.isDisplayed();
        // String header= frameHeader.getText();
        System.out.println("Is Header displayed: "+isHeaderdisplayed);
        driver.switchTo().defaultContent();


    }
}
