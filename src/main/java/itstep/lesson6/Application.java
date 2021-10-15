package itstep.lesson6;

//import itstep.lesson6.IFrameTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class Application {
    public static final String CHROME_DRIVER = "webdriver.chrome.driver";
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        String url ="http://www.qaclubkiev.com/";
webDriver.get(url);


//        webDriver.close(); // закрывает текущую вкладку

//
//        String page = webDriver.getPageSource();
//        BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter("index.html"));
//        bufferedWriter.write(page);
//        bufferedWriter.close();
        System.out.println("ok");
        webDriver.quit();
    }
//    private static WebDriver initSelenium() throws IOException {
//        Properties properties = new Properties();
//        properties.load(IFrameTest.class.getClassLoader().getResourceAsStream("selenium.properties"));
//        System.setProperty(CHROME_DRIVER, properties.getProperty("chrome"));
//
//        return new ChromeDriver();
//    }
}
