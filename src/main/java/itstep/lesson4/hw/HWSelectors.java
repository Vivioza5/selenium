package itstep.lesson4.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HWSelectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file:////home/vitaliy/IdeaProjects/Selenium/src/main/resources/select.html");
        WebElement cars = webDriver.findElement(By.cssSelector("div.example1 > form > label >select"));
        Select selectCar = new Select(cars);
        selectCar.selectByIndex(1);
        WebElement checkOut1 = webDriver.findElement(By.cssSelector("#out1"));
        String expectedValue = "value:volvo";
        String testOut1=checkOut1.getText().equals(expectedValue) ? "test ok" : "test not ok";
        System.out.println(testOut1);
        selectCar.selectByValue("saab");
        String expectedValue2 = "value:saab";
        String testOut2=checkOut1.getText().equals(expectedValue2) ? "test ok" : "test not ok";
        System.out.println(testOut2);
        selectCar.selectByVisibleText("Mercedes");
        String expectedValue3 = "value:mercedes";
        String testOut3=checkOut1.getText().equals(expectedValue3) ? "test ok" : "test not ok";
        System.out.println(testOut3);


//        webDriver.quit();
    }
}
