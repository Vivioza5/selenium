package itstep.lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectEx {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file:////home/vitaliy/IdeaProjects/Selenium/src/main/resources/Selection.html");



        WebElement browsers = webDriver.findElement(By.cssSelector("label:nth-child(3) > select"));


        Select selectBrowsers = new Select(browsers);
        selectBrowsers.selectByIndex(2);


        String[] expectedOptions = {"Firefox", "Opera", "Chrome", "Edge"};

        List<WebElement> allBrowsers = selectBrowsers.getOptions();

        if (allBrowsers.size() == expectedOptions.length) {
            for (int i = 0; i < allBrowsers.size(); i++) {
                WebElement option = allBrowsers.get(i);
                if(expectedOptions[i].equals(option.getText())){
                    System.out.println();
                }
            }

        }else {
            System.err.println("размеры не совпадают");
        }

//        webDriver.quit();

    }

}
