package lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        String strArr []= {"http://www.google.com/","http://dou.ua/","https://freeteamclub.com/forum/"};
        for (int i = 0; i < strArr.length; i++) {
            webDriver.navigate().to(strArr[i]);
            System.out.println("loaded = " + strArr[i] + "equal" +webDriver.getCurrentUrl());
            Thread.sleep(1000);
        }
        for (int i = strArr.length-1; i >0 ; i--) {
            webDriver.navigate().back();
            System.out.println("loaded = " + strArr[i] + "equal" +webDriver.getCurrentUrl());
            Thread.sleep(1000);
        }
//        webDriver.navigate().to("http://www.google.com.ua/");
//        System.out.println("Google " + webDriver.getCurrentUrl());
//        webDriver.navigate().to("http://dou.ua/");
//        System.out.println("Dou " + webDriver.getCurrentUrl());
//        webDriver.navigate().to("https://freeteamclub.com/forum/");
//        System.out.println("freeteam");


        webDriver.quit();


    }
    }
