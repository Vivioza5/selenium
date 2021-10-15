package itstep.lesson6.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        String extensionTittle="W3Schools Online Web Tutorials";
//        Thread.sleep(10000);
        WebDriver iframeWebDriver = webDriver.switchTo().frame("iframeResult");
        WebElement iframeTittle= iframeWebDriver.findElement(By.cssSelector("iframe:title"));
        System.out.println(iframeTittle.getText());
        String testOut1=(extensionTittle.equals(iframeTittle.getText()))? "All items equals" : "test not ok";
        System.out.println(testOut1);
    }


}
