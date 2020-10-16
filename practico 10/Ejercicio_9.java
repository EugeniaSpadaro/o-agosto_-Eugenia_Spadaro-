package test.Practico_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class Ejercicio_9 {

    @Test
    public void completeRegistration () throws InterruptedException {
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Eugi\\Desktop\\Curso de selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("u_1_b")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");

        Select diaCumple = new Select(driver.findElement(By.name("birthday_day")));
        diaCumple.selectByValue("26");
        Select mesCumple = new Select(driver.findElement(By.name("birthday_month")));
        mesCumple.selectByValue("6");
        Select anioCumple = new Select(driver.findElement(By.name("birthday_year")));
        anioCumple.selectByValue("1980");
        Thread.sleep(3000);
        driver.findElement(By.id("u_1_5")).click();

    }
}
