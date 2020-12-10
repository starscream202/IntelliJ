package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {

    public static String url="http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
    public static String path="C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\chromedriver.exe";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement daysDropDown=driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDropDown);
        select.selectByIndex(2);
        Thread.sleep(1500);
        select.selectByVisibleText("Wednesday");
        Thread.sleep(1000);
        select.selectByValue("Saturday");

        List<WebElement> allOptions=select.getOptions();
        System.out.println(allOptions.size());
        //System.out.println(allOptions);
        for(int i=0; i< allOptions.size();i++){
            String optionText=allOptions.get(i).getText();
            System.out.println(optionText);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }

    }
}
