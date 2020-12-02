package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\stars\\\\Downloads\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys(("Ash"));
        driver.findElement(By.name("customer.lastName")).sendKeys("Uddin");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Easy Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Baton Rouge");
        driver.findElement(By.id("customer.address.state")).sendKeys("Louisiana");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("50678");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("(678)456-9991");
        driver.findElement(By.id("customer.ssn")).sendKeys("665789973");
        driver.findElement(By.id("customer.username")).sendKeys("NolaAsh");
        driver.findElement(By.id("customer.password")).sendKeys("mimimimi");
        driver.findElement(By.id("repeatedPassword")).sendKeys("mimimimi");
        driver.findElement(By.className("button")).click();
    }
}
