package itstep.lesson6;

//import com.sun.glass.ui.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class IFrameTest {
    public static final String CHROME_DRIVER = "webdriver.chrome.driver";

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file://////home/vitaliy/IdeaProjects/Selenium/src/main/resources/windows.html");;

        WebElement firstLi = null;
//===========IFRAME======================
        try {
            WebDriver iframeWebDriver = webDriver.switchTo().frame("actions");//переходим на iframe
            firstLi = iframeWebDriver.findElement(By.cssSelector("li:first-child"));
            firstLi.click();
            Thread.sleep(1000);
        } catch (NoSuchElementException e) {
            System.err.println("Не найден такой элемент");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //==============WINDOW==============

//        WebElement btn = webDriver.findElement(By.cssSelector("#main > div:nth-child(5) > button"));
//
//        Set<String> allWindowHandles = webDriver.getWindowHandles();
//        System.out.println("До того как открыли окна");
//        btn.click();
//        System.out.println("После того как открыли окна");
//
//        Iterator<String>windowIterator = allWindowHandles.iterator();
//        while (windowIterator.hasNext()){
//            String windowHandle = windowIterator.next();
//            System.out.println("windowHandle = " + windowHandle);
//        }
//        webDriver.quit();
//        System.out.println("Test End");
//    }
//    private static WebDriver initSelenium() throws IOException {
//        Properties properties = new Properties();
//        properties.load(IFrameTest.class.getClassLoader().getResourceAsStream("selenium.properties"));
//        System.setProperty(CHROME_DRIVER, properties.getProperty("chrome"));
//
//        return new ChromeDriver();
        }
}
