package Review_Class_Tuesday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Review {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://the-internet.herokuapp.com";
        driver.get(url);
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();
        Thread.sleep(4000);
        driver.switchTo().frame(0);

        WebElement webElement=driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        webElement.clear();
        webElement.sendKeys("Hello i entered my own text");
        driver.switchTo().defaultContent();
        WebElement img=driver.findElement(By.xpath("/html/body/div[2]/a/img"));
        boolean isDispalyed=img.isDisplayed();
        if (isDispalyed){
            System.out.println("Is the picture displayed "+isDispalyed+" Test case pass");
        }else
            System.out.println("Is the picture displayed "+isDispalyed+" Test case Fail");
        driver.switchTo().defaultContent();
    }
}
