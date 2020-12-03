package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement radioButton=driver.findElement(By.xpath("//input[@value='0 - 5']"));
        boolean isEnabled= radioButton.isEnabled();
        boolean buttonDisplayed= radioButton.isDisplayed();
        System.out.println(isEnabled);
        System.out.println(buttonDisplayed);
        System.out.println("Before Clicking "+radioButton.isSelected());
        radioButton.click();
        System.out.println("After Clicking "+radioButton.isSelected());
    }
}
