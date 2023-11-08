package gun01.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _03assert {
    //www.saucedemo.com
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getTitle());
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
           /*
        assert testNg'nin parcasidir
        assert false return ederse mesage ekrar yazilir ve Assertion Exxception firlatilir
        Assert false retırn ederse cikti olarak hicbir sey uretmez
        Assert.assertEquals(actualTitle,"Swag Labs","Hata, Sayfa basligi yanlis");
        ^ yukaridaki assert islemi ile yapilan bir olcude asagidaki kontrol islemidir.
         */
        if (!driver.getTitle().equals("Swag labs")) {
        throw new AssertionError("Hata mesaji");
        }
        System.out.println(driver.getCurrentUrl());

        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
Assert.assertEquals(actualURL,expectedURL);

        Thread.sleep(2000);
        driver.quit();

    }
}