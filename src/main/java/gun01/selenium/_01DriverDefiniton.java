package gun01.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01DriverDefiniton {
    public static void main(String[] args) throws InterruptedException {
        // Webdriver'a ihtiyacımız var, browser'i kontrol etmek icin
        //Java'nin webdriver'in yerini bilmesi lazim
        //System.setProperties("webdriver.chrome.driver","driverin lokasyonu");
        //Chrome driver set edildi
        WebDriverManager.chromedriver().setup();

        //WebDriver instance tanimliyoruz
        WebDriver driver = new ChromeDriver();
        //WebDriver driver1 = new FirefoxDriver();

         driver.get("https://www.google.com");
        driver.getTitle();              //browser'in title'ini return eder
        driver.getCurrentUrl();         // browser'in current url'ini


         //driver.close(); // aktif pencereyi kapatır


        Thread.sleep(3000);
          driver.quit(); // tum chrome'u kapatir
    }
}
