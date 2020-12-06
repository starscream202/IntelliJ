package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewClas {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        String currentURL= driver.getCurrentUrl();
        System.out.println(currentURL);
        System.out.println(driver.getTitle());
        String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        if(expectedTitle.equals(driver.getTitle())){
            System.out.println("Title Test Pass");
        }else{
            System.out.println("Title Test Fail");
        }

    }
}
