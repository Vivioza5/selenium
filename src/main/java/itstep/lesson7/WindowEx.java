package itstep.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowEx {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to("file:////home/vitaliy/IdeaProjects/Selenium/src/main/resources/window/windows.html");


        WebElement btn = webDriver.findElement(By.cssSelector("#window>button"));

        String mainWindowHandle = webDriver.getWindowHandle();
        //Set<String> allWindowHandles = webDriver.getWindowHandles();
        System.out.println("До того как открыли окна");
        printWindow(webDriver.getWindowHandles());
        System.out.println("======================================");

        btn.click();

        System.out.println("После того как открыли окна");
        printWindow(webDriver.getWindowHandles());

        //переключиться на новое окно
        String newWindowHandle = null;
        Set<String> windowHandles = webDriver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()){
            newWindowHandle = iterator.next();
            if(!newWindowHandle.equals(mainWindowHandle)){
                break;
            }
        }
        System.out.println("New Window Handle = " + newWindowHandle);

        //переключение на новое окно
        WebDriver newWindowDriver = webDriver.switchTo().window(newWindowHandle);

        System.out.println(newWindowDriver.getTitle());

        webDriver.quit();
        System.out.println("Test End");
    }




    private static void printWindow(Set<String> allWindowHandles) {
        Iterator<String> windowIterator = allWindowHandles.iterator();
        System.out.println("Windows count : = " + allWindowHandles.size());
        while (windowIterator.hasNext()) {
            String windowHandle = windowIterator.next();
            System.out.println("windowHandle = " + windowHandle);
        }
    }


}
