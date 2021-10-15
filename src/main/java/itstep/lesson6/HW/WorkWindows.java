package itstep.lesson6.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file://////home/vitaliy/IdeaProjects/Selenium/src/main/resources/windows.html");

        String extensionFeedback="You've selected: #1(one).";
        String extensionH1="Inner html";

            WebDriver iframeWebDriver = webDriver.switchTo().frame("actions");//переходим на iframe
        WebElement firstFrame = iframeWebDriver.findElement(By.id("feedback"));
            WebElement firstLi = iframeWebDriver.findElement(By.cssSelector("li:first-child"));
            firstLi.click();
        String testOut1=(extensionFeedback.equals(firstFrame.getText()))? "All items equals" : "test not ok";
            System.out.println(testOut1);
            Thread.sleep(1000);
            webDriver.navigate().refresh();
            WebDriver iframeWebDriverInner = webDriver.switchTo().frame("inner");
            WebElement firstInner = iframeWebDriverInner.findElement(By.tagName("h1"));
        String testOut2=(extensionH1.equals(firstInner.getText()))? "All items equals" : "test not ok";
        System.out.println(testOut2);
//        webDriver.quit();



    }
}
