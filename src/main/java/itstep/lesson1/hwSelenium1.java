package itstep.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class hwSelenium1 {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        String url ="https://freeteamclub.com/forum/";
        webDriver.get(url);


//        webDriver.close(); // закрывает текущую вкладку


        String page1 = webDriver.getPageSource();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("index.html"));
        bufferedWriter.write(page1);
        bufferedWriter.close();
        System.out.println("ok");
//        webDriver.quit();
    }
}
