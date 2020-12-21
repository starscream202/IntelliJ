package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTables {
    public static String url="http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
    public static void main(String[] args) {
        //Static webTables
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        List<WebElement> rowdata=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowdata.size());
        Iterator<WebElement> it=rowdata.iterator();
        while(it.hasNext()){
            WebElement row=it.next();
            String rowText=row.getText();
            System.out.println(rowText);

        }


    }
}
