package itstep.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.w3c.dom.ls.LSOutput;

public class testSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/vitaliy/dev/webdriver/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        String url1 ="http://www.google.com/";
        webDriver.get(url1);
        WebElement searchinput = By.name("q").findElement(webDriver);
        searchinput.sendKeys("первый тест на selenium");

        Thread.sleep(3000);
        searchinput.submit();
        String expectedtext = webDriver.findElement(By.id("resultStats")).getText();

        String test =expectedtext.startsWith("Приблизна кількість результатів: 43 800 000") ? "test not ok" : "test ok";
        System.out.println(test);
    }
}
