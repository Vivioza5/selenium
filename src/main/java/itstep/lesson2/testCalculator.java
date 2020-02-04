package itstep.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static afu.org.checkerframework.checker.units.UnitsTools.C;
//import static itstep.lesson2.MethodsTest.testArr;

public class testCalculator {
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


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://sivka.zzz.com.ua/calculator2.html");
        List<WebElement> keys = webDriver.findElements(By.cssSelector("span"));
//        System.out.println(testArr());



//        System.out.println(key.getText());
        for (int i = 0; i < keys.size(); i++) {
            WebElement key = keys.get(i);
            WebElement screen = webDriver.findElement(By.className("screen"));

            if (screen.getText().equals(key.getText())){
                System.out.println("Кнопка " + key.getText() + " отвечает за ввод " + screen.getText() + " все нормально");
            }
            keys.get(i).click();
//            if (key.getText().equals(testArr())) {
//
//            }
            System.out.println("key " + (i + 1) + " " + " = " + key.getText());
            if (key.getText().equals("+")) {
                System.out.println("operator + ");
            }
//            if (key.getText().equals("2")) {
//                keys.get(i).click();
//            }
//            if (key.getText().equals("3")) {
//                keys.get(i).click();
//            }
//            if (key.getText().equals("4")) {
//                keys.get(i).click();
//            }
//            if (key.getText().equals("5")) {
//                keys.get(i).click();
//            }
//            if (key.getText().equals("6")) {
//                keys.get(i).click();
//            }
//            if (key.getText().equals("7")) {
//                keys.get(i).click();
//            }
//            if (key.getText().equals("8")) {
//                keys.get(i).click();
//            }
//            if (key.getText().equals("9")) {
//                keys.get(i).click();
//            }
//            if (key.getText().equals("0")) {
//                keys.get(i).click();
//            }
//
////        key.click();
        }
//        for (int j = 0; j < 10; j++) {
//            arr[j]=j;
//            if (key.getText().equals(arr[j])) {
////        keys.get(i).click();
//                keys.get(i).click();
//            }


//String test=keys.contains((int) 7)? "key number 1" : "not";
//        System.out.println(test);
//        ArrayList<WebElement> keys = (ArrayList<WebElement>) webDriver.findElements(By.className("keys"));
////        WebElement detailsLink = webDriver.findElement(By.cssSelector("span"));
//
//        for (WebElement i:keys){
//            int j=0;
//            j++;
//            WebElement key=keys.get(j);
////            System.out.println(keys.get());
//            String number= key.getText();
//             String test=keys.contains(7)? "key number 1" : "not";
//            System.out.println(test);
//            System.out.println("key "+ (j++) +" "+ " = "+ number );
//        }


        webDriver.quit();
//        System.out.println(keys);

//        WebElement key =  webDriver.findElement(By.className("keys"));
//        System.out.println(key);

//        if (key == "1") {
//            System.out.println("key number  1");
//        key.equals("1")? "test ok":"not ok";


    }
}

