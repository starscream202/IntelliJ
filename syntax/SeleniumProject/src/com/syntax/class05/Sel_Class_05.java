package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sel_Class_05 {
    public static String url="http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        /*driver.get("http://www.amazon.com");
        driver.findElement(By.tagName("a"));*/
        driver.get(url);
        List<WebElement> checkbox= driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int checkBoxCount=checkbox.size();
        System.out.println(checkBoxCount);
        for (WebElement checkBoxOption :checkbox) {
            if(checkBoxOption.isEnabled()){
                String checkBox=checkBoxOption.getAttribute("value");
                if(checkBox.equalsIgnoreCase("Option-2"))
                    checkBoxOption.click();
                    Thread.sleep(2000);

            }


        }


    }
}
