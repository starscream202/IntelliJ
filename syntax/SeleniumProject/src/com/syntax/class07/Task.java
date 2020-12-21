package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";
        driver.get(url);
        String mainHandle= driver.getWindowHandle();
        WebElement instaButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton= driver.findElement(By.linkText("Like us On Facebook"));
        WebElement fbAndInsta=driver.findElement(By.linkText("Follow Instagram & Facebook"));
        instaButton.click();
        fbButton.click();
        fbAndInsta.click();
        Set<String>allWindowsHandle=driver.getWindowHandles();
        System.out.println(allWindowsHandle.size());
        Iterator<String>it= allWindowsHandle.iterator();
        while(it.hasNext()){
            String childHandle=it.next();
            if(!childHandle.equals(mainHandle)){
                driver.switchTo().window(childHandle);
                System.out.println(driver.getTitle());
                driver.close();
            }

        }
        driver.switchTo().window(mainHandle);
        instaButton.click();
    }
}
