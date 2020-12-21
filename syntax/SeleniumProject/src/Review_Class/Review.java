package Review_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Review {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(1000);
        List<WebElement> genderOptions=driver.findElements(By.xpath("//input[@name='sex']"));

        for (WebElement option :genderOptions) {
            option.click();
            Thread.sleep(1000);
        }

    }
}
