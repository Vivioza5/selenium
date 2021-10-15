package itstep.lesson7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practica {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");


    }
}
