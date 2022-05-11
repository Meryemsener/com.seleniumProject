package day02_DriverMEthodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        /*
        1-https://www.amazon.com url ine gidin
        2-basligin Amazon kelimesi icerdigini test edin
        3-url'in "https://www.amazon.com" a esit oldugunu test edin
        4-sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1-https://www.amazon.com url ine gidin
        driver.get("https://www.amazon.com");

        //2-basligin Amazon kelimesi icerdigini test edin

        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title testi PASSED");
        } else System.out.println("Title " + arananKelime + " 'yi icermiyor. Title testi FAILED ");
        //3-url'in "https://www.amazon.com" a esit oldugunu test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("url testi PASSED");

        } else {
            System.out.println("url beklenen url den farkli");
        }
        //4-sayfayi kapatin
        driver.close();


    }


    }

