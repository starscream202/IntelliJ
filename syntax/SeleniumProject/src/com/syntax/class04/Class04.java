package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class04 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.findElement(By.cssSelector("a#btn_basic_example")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();
        Thread.sleep(3000);
        //driver.close();
    }
}
