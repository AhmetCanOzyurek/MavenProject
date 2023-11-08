package gun01.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02DriverMethods {
    //www.saucedemo.com
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(2000);
        driver.quit();

    }
}