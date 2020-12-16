package Review;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stars\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://the-internet.herokuapp.com";
        driver.get(url);
        Thread.sleep(2000);

        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(1000);
        //alert.accept();
        String expectedAlert="I am a JS Alert";
        String alertTextFromApplication=alert.getText();
        if(expectedAlert.equals(alertTextFromApplication)){
            System.out.println("Correct Alert text");
        }else
            System.out.println("Wrong Alert Text");
        alert.accept();
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        alert=driver.switchTo().alert();
        Thread.sleep(1000);
        alert.dismiss();
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        alert=driver.switchTo().alert();
        String textToSend="hello from batch 8";
        alert.sendKeys(textToSend);
        Thread.sleep(1000);
        alert.accept();
        String enteredText=driver.findElement(By.id("result")).getText();
        String[] textArray=enteredText.split(":");
        if (textArray[1].equals(textToSend)) {
            System.out.println("Correct input displayed");
        }else
            System.out.println("Test failed");
        //System.out.println(enteredText);

        System.out.println(enteredText);
    }
}
