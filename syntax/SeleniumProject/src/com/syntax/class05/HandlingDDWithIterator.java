package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandlingDDWithIterator {
    public static final String path="C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\chromedriver.exe";
    public static final String url="http://www.amazon.com";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement catDD= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(catDD);
        List<WebElement> options=select.getOptions();
        Iterator<WebElement>it= options.iterator();
        while(it.hasNext()){
            WebElement option= it.next();
            String optionText= option.getText();
            System.out.println(optionText);
        }
        boolean isMulti= select.isMultiple();
        System.out.println(isMulti);


    }
}
