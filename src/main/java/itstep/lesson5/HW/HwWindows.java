package itstep.lesson5.HW;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwWindows {
    //         метод проверки модального окна
    public static void inputPromt(Alert promt, String first, String second) throws InterruptedException {
        promt.sendKeys(first);
        promt.accept();
        promt.sendKeys(second);
        promt.accept();
        Thread.sleep(5000);


    }
//    метод проверки таблицы на соответствие количества столбцов и строк
public static void checkTable(WebElement checkColumns,WebElement checkRows,  String inputFirst, String inputSecond) throws InterruptedException {
    System.out.println(checkColumns.getText());
    String testTableColumns=inputFirst.equals(checkColumns.getText()) ?"columns of this table are  corrrectly now":"columns of this table are not corrrectly now";
    System.out.println(testTableColumns);
    System.out.println(checkRows.getText());
    String testTableRows=inputSecond.equals(checkRows.getText()) ?"Rows of this table are  corrrectly now":"Rows of this table are not corrrectly now";
    System.out.println(testTableRows);
    Thread.sleep(10000);
}


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file://///home/vitaliy/IdeaProjects/Selenium/src/main/resources/table/index.html");
        Alert promt =null;
//        подключение обработки Exception
        try {
            promt = webDriver.switchTo().alert();
        } catch (NoAlertPresentException e) {
            System.out.println("Window to input data for table  no correctly work");
        }
        if (promt != null){
//            обьявление захвата модального окна и вводных данных
            String firstInputFirst="5";
            String firstInputSecond="5";
//         метод проверки модального окна
            inputPromt(promt,firstInputFirst,firstInputSecond);
//        нахождение табличных данных
            WebElement checkColumn = webDriver.findElement(By.cssSelector("tr:first-child > td:last-child"));
            WebElement checkRows = webDriver.findElement(By.cssSelector(" tr:last-child > td:first-child"));
//        метод проверки таблицы на соответствие количества столбцов и строк
            checkTable(checkColumn,checkRows,firstInputFirst,firstInputSecond);
            webDriver.navigate().refresh();
            String secondInputFirst="10";
            String secondInputSecond="3";
            inputPromt(promt,secondInputFirst,secondInputSecond);
            WebElement checkColumn2 = webDriver.findElement(By.cssSelector("tr:first-child > td:last-child"));
            WebElement checkRows2 = webDriver.findElement(By.cssSelector(" tr:last-child > td:first-child"));
            checkTable(checkColumn2,checkRows2,secondInputFirst,secondInputSecond);
            webDriver.quit();

        }

    }
}

