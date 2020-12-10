package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_Task1 {
    /*Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify Syntax Logo is displayed.*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        Boolean isLogo=driver.findElement(By.cssSelector("img[alt ^=Orange]")).isDisplayed();
        System.out.println("Is the Logo displayed?: "+isLogo);
    }}