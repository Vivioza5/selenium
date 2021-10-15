//package itstep.lesson3;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class Application {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
//        WebDriver webDriver = new ChromeDriver();
//
//        String url = "http://localhost:8080/";
//        webDriver.navigate().to(url);
//
//        //List<WebElement> inputs = webDriver.findElements(By.tagName("input"));//первый способ
//        WebElement login = webDriver.findElement(By.name("login"));
//        WebElement password = webDriver.findElement(By.name("password"));
//
//        login.sendKeys("admin");
//        Thread.sleep(2000);
//        password.sendKeys("qwerty");
//        Thread.sleep(2000);
//        password.submit();
//        Thread.sleep(2000);
//
//        //autotest selenium work
//
//        //1 способ по Title
//        String expectedTitle = "Admin";
//        String title = webDriver.getTitle();
//        if (expectedTitle.equals(title)){
//            System.out.println("Test complete");
//        }else {
//            System.err.println("Test NOT complete");
//            System.err.println("Expected = " + expectedTitle);
//            System.err.println("Actual = " + title);
//        }
//
//        //2 способ по tegName
//        String expectedTeg = "Hello Admin";
//        String h1 = webDriver.findElement(By.tagName("h1")).getText();
//        if (expectedTeg.equals(h1)){
//            System.out.println("H1 Test complete");
//        }else {
//            System.err.println("H1 Test NOT complete");
//            System.err.println("Expected = " + expectedTeg);
//            System.err.println("Actual = " + h1);
//        }
//
//        webDriver.close();
//        System.out.println("End Test");
//    }
//}
