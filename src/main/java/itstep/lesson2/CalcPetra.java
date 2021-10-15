package itstep.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalcPetra {
    public static class MethodsCalc {

        public static void clickOperator(List <WebElement> button1,int a){

            button1.get(2).click();
            button1.get(a).click();
            button1.get(10).click();
            button1.get(15).click();

        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file:////home/vitaliy/IdeaProjects/Selenium/src/main/resources/calculator.html");
        List<WebElement> spanButtons = webDriver.findElements(By.tagName("span"));
        WebElement screen = webDriver.findElement(By.className("screen"));
        WebElement c = webDriver.findElement(By.className("clear"));
        //System.out.println(spanButtons.size());
        for (int i = 0; i < spanButtons.size(); i++) {
            WebElement button = spanButtons.get(i);
            button.click();
            System.out.println( i + "ая клацнутая кнопка имеет имя " + button.getText());
            if (screen.getText().equals(".")){
                c.click();
                System.out.println(" Это должно быть точка");
                MethodsCalc.clickOperator(spanButtons,14);
                if (screen.getText().equals("8.2")){
                    System.out.println("Точка работает");
                } else System.err.println("Точка не работает");


            }

            if (screen.getText().equals(button.getText())) {
                System.out.println("Кнопка " + button.getText() + " отвечает за ввод " + screen.getText() + " все нормально");
            }
//            else {
//                System.out.println("Кнопка " + button.getText() + " для операций");
//            }
            else if (!screen.getText().equals(button.getText())) {

                String str= button.getText();
                char[] simvols = str.toCharArray();
                switch (simvols[0]) {
                    case '=':
                        System.out.println(" Это должно быть равно");
                        MethodsCalc.clickOperator(spanButtons,4);
                        if (screen.getText().equals("10")){
                            System.out.println("И равно работает вместе с +");
                        } else {
                            System.err.println(" = или + не работает");
                        }
                        break;
                    case '+':
                        System.out.println(" Это должно быть плюс");
                        MethodsCalc.clickOperator(spanButtons,4);
                        if (screen.getText().equals("10")){
                            System.out.println("+ и =  работают");
                        } else {
                            System.err.println(" = или + не работает");
                        }
                        break;
                    case '/':
                        System.out.println(" Это должно быть деление");
                        MethodsCalc.clickOperator(spanButtons,12);
                        if (screen.getText().equals("4")){
                            System.out.println("Деление работает");
                        } else {
                            System.err.println(" Деление не работает");
                        }

                        break;
                    case 'C':
                        System.out.println(" Это сброс и он точно работает. В каждом цикле жмется С");

                        break;
                    case 'x':
                        System.out.println(" Это должно быть умножение");
                        MethodsCalc.clickOperator(spanButtons,16);
                        if (screen.getText().equals("16")){
                            System.out.println("Равно работает вместе с умножением");
                        } else {
                            System.err.println(" = или x не работает");
                        }
                        break;
                }
            }
            c.click();

        }
        webDriver.quit();
    }
}


