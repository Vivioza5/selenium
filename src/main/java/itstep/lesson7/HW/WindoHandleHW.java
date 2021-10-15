package itstep.lesson7.HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class WindoHandleHW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to("file:////home/vitaliy/IdeaProjects/Selenium/src/main/resources/windows.html");
        String mainWindowHandle = webDriver.getWindowHandle();
        System.out.println("Current window have name = "+mainWindowHandle);
        WebElement btnNewBrowser = webDriver.findElement(By.cssSelector("#button1"));
        WebElement btnBrowserTab = webDriver.findElement(By.cssSelector("#content > p:nth-child(6) > button"));

        btnNewBrowser.click();
        btnBrowserTab.click();

        String newWindowHandle = null;
        Set<String> windowHandles = webDriver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()){
            newWindowHandle = iterator.next();


            if(!newWindowHandle.equals(mainWindowHandle)){
                break;
            }
        }
        System.out.println("New Window Handle1 = " + newWindowHandle);

        WebDriver newWindowDriver = webDriver.switchTo().window(newWindowHandle);

        System.out.println(newWindowDriver.getTitle());
webDriver.switchTo().window(mainWindowHandle);
        btnBrowserTab.click();
        String newWindowHandle2 = null;
        newWindowHandle2 = getString(windowHandles, newWindowHandle2);
        System.out.println("New Window Handle2 = " + newWindowHandle2);
        printWindow(windowHandles);


    }
Actions actions;
    public static String getString(Set<String> windowHandles, String newWindowHandle2) {
        Iterator<String> iterator2 = windowHandles.iterator();
        while (iterator2.hasNext()){
            newWindowHandle2 = iterator2.next();


            if(windowHandles.add(newWindowHandle2)){
                break;
            }
        }
        return newWindowHandle2;
    }

    private static void printWindow(Set<String> allWindowHandles) {
        Iterator<String> windowIterator = allWindowHandles.iterator();
        System.out.println("Windows count : = " + allWindowHandles.size());
        int i=0;
        while (windowIterator.hasNext()) {
            String windowHandle = windowIterator.next();
            i++;
            System.out.println("windowHandle " +i + "  = " +windowHandle);

        }
    }

}
