package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class WebElemEx {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        String url1 ="127.0.1.1";
        webDriver.get(url1);
        WebElement h2 = webDriver.findElement(By.tagName("h2"));
        System.out.println("tag :"+h2.getTagName());
        System.out.println("Text"+h2.getText());
        System.out.println("location"+h2.getLocation());
        System.out.println("Size"+ h2.getSize());
        System.out.println("Display: "+ h2.isDisplayed());
//        webDriver.quit();
    }
}
