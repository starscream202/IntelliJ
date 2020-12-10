package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW_Class5 {
    public static String url="https://www.facebook.com";
    /*TC 1: Facebook dropdown verification
    Open chrome browser
    Go to "https://www.facebook.com"
    Verify:
    month dd has 12 month options
    day dd has 31 day options
    year dd has 115 year options
    Select your date of birth
    Quit browser*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
        WebElement monthDropDown=driver.findElement(By.xpath("//select[@id='month']"));
        Select select=new Select(monthDropDown);
        List<WebElement> allOptions=select.getOptions();
        int count=0;
        Thread.sleep(1000);
        for(int i=0; i< allOptions.size();i++){
            String monthText=allOptions.get(i).getText();
            count++;
        }
        if(count==12){
            System.out.println("the count is "+count);
        }else{
            System.out.println("the count is "+count);
        }


    }
}
