package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php";
        driver.navigate().to(url);
        WebElement randomUserButton=driver.findElement(By.id("save"));
        randomUserButton.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name :')]")));

        WebElement firstName=driver.findElement(By.xpath("//p[contains(text(),'First Name :')]"));
        String name1=firstName.getText();
        System.out.println(name1);
    }
}
