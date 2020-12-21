package class34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Files {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String path= "C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\class34\\Credentials.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        //Different files will have differnt classes
        Properties properties=new Properties();
        properties.load(fileInputStream);
        driver.get("https://www.facebook.com/");
        String username=properties.getProperty("Username");
        String pass=properties.getProperty("pass");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(pass);
        //Storing data in file
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        properties.setProperty("Username","statscreen");
        properties.store(fileOutputStream,"Changing username");
        username=properties.getProperty("Username");



    }
}
