package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import sun.reflect.misc.ReflectUtil;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import sun.reflect.misc.ReflectUtil;

import static org.openqa.selenium.By.tagName;

public class WebElemEx {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        String url ="~/IdeaProjects/Selenium/src/main/resources/index.html";
        webDriver.get(url);
        WebElement h2 = webDriver.findElement(By.tagName("h2"));
        System.out.println("tag :"+h2.getTagName());
        System.out.println("Text"+h2.getText());
        System.out.println("location"+h2.getLocation());
        System.out.println("Size"+ h2.getSize());
        System.out.println("Display"+ h2.isDisplayed());
        webDriver.quit();
    }
}
