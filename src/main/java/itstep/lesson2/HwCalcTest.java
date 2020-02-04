package itstep.lesson2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//       Написать тесткейсы для тестирования калькулятора (http://sivka.zzz.com.ua/calculator2.html)
//       Проверить функциональность всех кнопок (использовать метод click() для WebElement) т.е. при нажатии на кнопку отображается цифра, операция
//          	или очищается поле ввода (для кнопки C) (использовать метод getText() для WebElement).

//думал как сократить код с помощью цикла, может чего не знаю, нюансі коллекций списка и сделал тесты только по прямым сравнениям
//попробовал через отдельный метод передавать массив строки и сравнить, но не работает, где-то что то упустил))
import java.util.Arrays;
import java.util.List;

import static itstep.lesson2.HwCalcTest.MethodsTest.testArr;

//import static itstep.lesson2.MethodsTest.testArr;

public class HwCalcTest {

//    метод передающий строку от 0 до 9


    public static class MethodsTest {
        public static String testArr(){
            String [] arr= new String[10];
            for (int j = 0; j <10 ; j++) {
//                arr[j]="\""+j+"\"";
                arr[j]="\""+j+"\"";
            }
            String testArr= Arrays.toString(arr);
        return testArr ;
//            return arr ;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://sivka.zzz.com.ua/calculator2.html");
        List<WebElement> keys = webDriver.findElements(By.cssSelector("span"));
//        System.out.println(testArr());

        for (int i = 0; i < keys.size(); i++) {
            WebElement key = keys.get(i);
            WebElement screen = webDriver.findElement(By.className("screen"));
            System.out.println("key " + (i) + " " + " = " + key.getText());
            keys.get(i).click();
//            System.out.println((i+1)+": Pressed key= "+key.getText() );
            Thread.sleep (10);
            if (key.getText().equals(testArr())) {
//                keys.get(i).click();
                 System.out.println("test ok");
            }
//
//            if (screen.getText().equals(testArr()))

//            else {
//                continue;
//            }
//            проверка двух строк и запуск теста кликом

//            for (int i = 0; i < keys.size(); i++) {
//                WebElement key = keys.get(i);
//
//                if (key.getText().equals(testArr())) {
//
//                }

//            прописал  от 0 до 9, но так как єто анти код не стал еще и знаки добавлять, но схема та же, но ноль тоже не віводит єто тоже баг)))
//            if (key.getText().equals("null")) {
//                keys.get(i).click();
//                System.out.println("test ok");
//            }
//            if (key.getText().equals("1")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            if (key.getText().equals("2")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            if (key.getText().equals("3")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            if (key.getText().equals("4")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            if (key.getText().equals("5")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            if (key.getText().equals("6")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            if (key.getText().equals("7")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            if (key.getText().equals("8")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            if (key.getText().equals("9")) {
//                keys.get(i).click();
//                 System.out.println("test ok");
//            }
//            проверка кнопки "С" пока что не работает
//            if (key.getText().equals("С")) {
//                keys.get(i).click();
//
//            if (screen.getText().equals(" "))
//                System.out.println("test ok");
//            }
        }
    }
}
