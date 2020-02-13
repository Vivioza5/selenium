package itstep.lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com.ua/?hl=ru");

        WebElement element = null;
        try {
             element = webDriver.findElement(By.id("some id"));
        }catch (NoSuchElementException e){
            System.out.println("Элемент не найден");
        }

        if(element != null){
            //....
        }
        webDriver.quit();

        System.out.println("Тест окончен");
    }
}
