package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\chromedriver.exe");
        //for set propety u need webdriver and path where it is stored
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        String url=driver.getCurrentUrl();//prints url in command prompt
        System.out.println(url);
        String title=driver.getTitle();//gets title of website
        System.out.println(title);
        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        Thread.sleep(1000);//pauses your program 1000=1sec
        driver.navigate().forward();
        driver.navigate().refresh();
        //driver.close();will close current tab
        driver.quit();//will close browser
    }
}
