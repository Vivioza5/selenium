package itstep.lesson3.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file:////home/vitaliy/IdeaProjects/Selenium/src/main/resources/hw3.html");
        List<WebElement>  checkbox = webDriver.findElements(By.xpath("/html/body/form/div/input[@type='checkbox']"));

        int countRadio=0, countCheckbox=0;
        for (int i = 0; i <checkbox.size() ; i++) {
            countCheckbox++;
            WebElement lang=checkbox.get(i);

            if (lang.isSelected()==false){
                lang.click();
            }

            System.out.println("language "+(i+1)+": "+ lang.isSelected());


        }
        List<WebElement>  radio = webDriver.findElements(By.xpath("/html/body/form/div/input[@type='radio']"));

        for (int j = 0; j <radio.size() ; j++) {
            countRadio++;
            WebElement prof=radio.get(j);
//            prof.click();
            Thread.sleep(2000);
            System.out.println("profession "+(j+1)+": "+ prof.isSelected());



        }
        System.out.println("checkbox on this page= "+countCheckbox);
        System.out.println("radiobutton on this page= "+countRadio);
        WebElement java=webDriver.findElement(By.xpath("/html/body/form/div/input[@value='Java']"));
        String testJava=java.isSelected()? "java language is selecting now":"java language isn't selecting now";
        System.out.println(testJava);
        WebElement testAutomation=webDriver.findElement(By.xpath("/html/body/form/div/input[@value='Test Automation']"));
        String testRadio=testAutomation.isSelected()? "Test Automation is selecting now":"Test Automation isn't selecting now";
        System.out.println(testRadio);

        webDriver.quit();
    }
}
