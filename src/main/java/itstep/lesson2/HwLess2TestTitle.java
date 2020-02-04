package itstep.lesson2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
// можно было бы каждую ссылку по отдельности тестировать, но так более масштабируемо, просто добавить в массив адресс,  и обратиться к нему для работі с ним внутри цикла
public class HwLess2TestTitle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        String strArr []= {"https://itstep.kh.ua/about_academy","https://itstep.kh.ua/programmer","https://itstep.kh.ua/qa_course"};
        for (int i = 0; i < strArr.length; i++) {
            webDriver.navigate().to(strArr[i]);
            if (strArr[i].equals("https://itstep.kh.ua/about_academy")){
                String expectedTitle = "ᐅ Об Академии";
                System.out.println(expectedTitle.equals(webDriver.getTitle())  ? "test  ok" : "test not ok");
            }
            if (strArr[i].equals("https://itstep.kh.ua/programmer")){
                String expectedTitle = "ᐅ Обучение программированию | IT-курс программирования в Харькове | Академия ШАГ";
               System.out.println(expectedTitle.equals(webDriver.getTitle())  ? "test  ok" : "test not ok");
            }
            if (strArr[i].equals("https://itstep.kh.ua/qa_course")){
                String expectedTitle = "ᐅ IT-курс «QA Engineer» | Курс тестировщика ПО в Харькове | Академия ШАГ";
                System.out.println(expectedTitle.equals(webDriver.getTitle())  ? "test  ok" : "test not ok");
            }
            System.out.println("loaded = " + strArr[i] + "equal" +webDriver.getCurrentUrl());
            Thread.sleep(1000);
        }
        webDriver.quit();
    }
}
