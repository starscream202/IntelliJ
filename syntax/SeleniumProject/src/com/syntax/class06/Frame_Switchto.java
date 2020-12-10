package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Switchto {
    public static String url="http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement textBox= driver.findElement(By.cssSelector("input#name"));
        textBox.sendKeys("2020 Sucks");
        driver.switchTo().defaultContent();
       /* WebElement alertButton=driver.findElement(By.id("alerts"));
        alertButton.click();*/
        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("LOLOLOLOL");
        driver.switchTo().defaultContent();
        WebElement frame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frame);
        textBox.sendKeys("3rd way");

    }
}
