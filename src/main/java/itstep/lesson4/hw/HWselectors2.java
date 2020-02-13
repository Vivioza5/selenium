package itstep.lesson4.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HWselectors2 {
//    метод для проверки соответсвия таблицы вывода выбранным элементам остался вопрос как выводить статус проверки после прохождения цикла
    public static class MethodsPizza {

        public static boolean checkItems(List<WebElement> allitemsOut2 , String[] expectedOptions) {
int testItems=0;
        if (allitemsOut2.size() == expectedOptions.length) {
            for (int i = 0; i < allitemsOut2.size(); i++) {
                WebElement option = allitemsOut2.get(i);
                if(expectedOptions[i].equals(option.getText())){
//                    System.out.println("test ok");
                    testItems++;
                }
            }
        }else {
            System.err.println("размеры не совпадают");
        }
        return testItems==expectedOptions.length;
        }

    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file:////home/vitaliy/IdeaProjects/Selenium/src/main/resources/select.html");

//создания списка элементов формы пицца
        WebElement pizza = webDriver.findElement(By.cssSelector("div.example2 > div:nth-child(1) > label>select"));

        Select selectPizza = new Select(pizza);
//        выбор элемента Cheese и проверка на вывод в форме выввода
        selectPizza.selectByIndex(0);
        WebElement checkOut2 = webDriver.findElement(By.cssSelector("#out2"));
        String expectedValue1 = "Cheese";
        String testOut1=checkOut2.getText().equals(expectedValue1)? "All items equals" : "test not ok";
        System.out.println(testOut1);

//  выбор элемента Pepperoni и проверка на вывод в форме выввода с помощью метода MethodsPizza.checkItems
        selectPizza.selectByValue("Pepperoni");
//        метод получает название ингредиента > добавляет в стринг массив> создает список из selectPizza > сравнивает списки
//        для пустой формі нужен отдельній метод в єтом случае
        List<WebElement> allitemsOut2 = selectPizza.getAllSelectedOptions();
        String[] expectedOptions = {"Cheese", "Pepperoni"};
        String testOut2=MethodsPizza.checkItems(allitemsOut2,expectedOptions) ? "All items equals" : "test not ok";
        System.out.println(testOut2);

        //  выбор элемента Mushrooms и проверка на вывод в форме выввода с помощью метода MethodsPizza.checkItems и очистка вібора
        selectPizza.selectByVisibleText("Mushrooms");
        List<WebElement> allitemsOut3 = selectPizza.getAllSelectedOptions();
        String[] expectedOptions2 = {"Cheese", "Pepperoni","Mushrooms"};
        String testOut3=MethodsPizza.checkItems(allitemsOut3,expectedOptions2) ? "All items equals" : "test not ok";
        System.out.println(testOut3);
        selectPizza.deselectAll();

        //  проверка на вывод в форме выввода с помощью метода MethodsPizza.checkItems
        String[] expectedOptions4 = {};
        List<WebElement> allitemsOut4 = selectPizza.getAllSelectedOptions();
        String testOut4=MethodsPizza.checkItems(allitemsOut4,expectedOptions4) ? "The form is empty now" : "test not ok";
        System.out.println(testOut4);
        webDriver.quit();

    }
}
