package day03_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_FindElements {
    //amazon sayfasinda kac tane link bulundugunu yazdiralim
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));

        System.out.println("Sayfadaki link sayisi : "+linkListesi.size());

        driver.close();
    }
}