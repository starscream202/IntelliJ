package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiDropDowns {
    public static final String path="C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\chromedriver.exe";
    public static final String url="http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement multiSelctDD=driver.findElement(By.id("multi-select"));
        Select select=new Select(multiSelctDD);
        boolean isMultiple=select.isMultiple();
        System.out.println(isMultiple);
        if(isMultiple){
            List<WebElement>options= select.getOptions();
            int count=0;
            for(int i=0;i< options.size();i++){
                String monthText=options.get(i).getText();
                count++;
                if(count==12){
                    System.out.println("12 entries in month drop down list");
                }
                else{
                    System.out.println("Does not have 12 entries for month");
                }

            }

        }//select.deselectAll();
        select.deselectByIndex(5);

    }
}
