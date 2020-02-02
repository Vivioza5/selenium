package itstep.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class WebElemEx {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        String url1 ="file:////home/vitaliy/IdeaProjects/Selenium/src/main/resources/automation-practice-table.html";
        webDriver.get(url1);
        List<WebElement> elements_td = webDriver.findElements(By.tagName("td"));
        for (int i = 0; i <elements_td.size() ; i++) {
            WebElement td=elements_td.get(i);
            System.out.println("city "+(i+1)+": "+ td.getText() );
        }
//        WebElement h2 = webDriver.findElement(By.tagName("h2"));
        WebElement detailsLink = webDriver.findElement(By.linkText("details"));
        detailsLink.click();
//        System.out.println("tag :"+h2.getTagName());
//        System.out.println("Text"+h2.getText());
//        System.out.println("location"+h2.getLocation());
//        System.out.println("Size"+ h2.getSize());
//        System.out.println("Display: "+ h2.isDisplayed());
////        webDriver.quit();
    }
}
