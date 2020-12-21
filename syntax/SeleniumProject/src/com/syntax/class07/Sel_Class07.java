package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Sel_Class07 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        System.out.println(mainPageHandle);
        WebElement helpLink =driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a"));
        helpLink.click();
        Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String>it= allWindowHandles.iterator();
        mainPageHandle=it.next();
        String childHandle=it.next();
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);




    }
}
