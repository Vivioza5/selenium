package itstep.lesson5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        String url = "file://///home/vitaliy/IdeaProjects/Selenium/src/main/resources/windows.html";


        webDriver.get(url);

        WebElement alertBtn = null;

        try {
            alertBtn = webDriver.findElement(By.cssSelector("#alert>button"));
        } catch (NoSuchElementException e) {
            System.out.println("Кнопка alert не найдена");
        }
        if (alertBtn != null) {
            //пишем тест здесь
            alertBtn.click();//клик на саму кнопку на странице
            Thread.sleep(1000);
//            WebDriver.TargetLocator locator = webDriver.switchTo();
//            Alert alert = locator.alert();
            Alert alert = webDriver.switchTo().alert();//доступ к работе с модальным окном
            String exp = "It is simple alert";
            String actual = alert.getText();
            if (!exp.equalsIgnoreCase(actual)){
                System.out.println("Alert содержит другой текст = " + actual);
            }else {
                System.out.println("Все ок!");
            }
            alert.accept();//жмем OK на alert
            //alert.sendKeys("5");
        }

        webDriver.quit();
        System.out.println("Тест пройден");
    }
}