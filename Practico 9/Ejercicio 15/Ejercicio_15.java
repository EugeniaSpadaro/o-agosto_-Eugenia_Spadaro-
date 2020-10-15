package test.Practico_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class Ejercicio_15 {

    @Test
    public void validarPagina ()
    {
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eugi\\Desktop\\Curso de selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");

        List<WebElement> elementosH1 = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de elementos h1 es: "+elementosH1.size()+ " y son: ");
        for (WebElement mostrarH1 : elementosH1)
        {
            System.out.println( mostrarH1.getText());
        }
        List<WebElement> elementosH2 = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de elementos h2 es: "+elementosH2.size()+" y son: ");
        for (WebElement mostrarH2 : elementosH2)
        {
            System.out.println( mostrarH2.getText());
        }
        List<WebElement> elementosH3 = driver.findElements(By.tagName("h3"));
        System.out.println("La cantidad de elementos h3 es: "+elementosH3.size()+" y son: ");
        for (WebElement mostrarH3 : elementosH3)
        {
            System.out.println( mostrarH3.getText());
        }
        driver.navigate().refresh();
        List<WebElement> botones = driver.findElements(By.tagName("button"));
        for (WebElement mostrarBotones : botones)
            {
                System.out.println("Los botones de la pagina son: "+ mostrarBotones.getText());
            }
        driver.manage().window().maximize();

        List<WebElement> elementosDiv = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de elementos div son: "+ elementosDiv.size());
        System.out.println("El titulo de la pagina es: "+driver.getTitle()+ " y la url es: "+driver.getCurrentUrl());

        List <WebElement> elementosLink = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de elementos tipo link son : "+ elementosLink.size());

        if((elementosDiv.size()>elementosH1.size()) && (elementosDiv.size()>elementosH2.size())&& (elementosDiv.size()>elementosH3.size())&&(elementosDiv.size()>elementosLink.size())&& (elementosDiv.size()>botones.size()))
        {
            System.out.println("Hay mas elementos DIV "+ elementosDiv.size());
        }
        if((elementosH1.size()>elementosDiv.size()) && (elementosH1.size()>elementosH2.size())&& (elementosH1.size()>elementosH3.size())&&(elementosH1.size()>elementosLink.size())&& (elementosH1.size()>botones.size()))
        {
            System.out.println("Hay mas elementos H1 "+ elementosH1.size());
        }
        if((elementosH2.size()>elementosDiv.size()) && (elementosH2.size()>elementosH1.size())&& (elementosH2.size()>elementosH3.size())&&(elementosH2.size()>elementosLink.size())&& (elementosH2.size()>botones.size()))
        {
            System.out.println("Hay mas elementos H2 "+ elementosH2.size());
        }
        if((elementosH3.size()>elementosDiv.size()) && (elementosH3.size()>elementosH1.size())&& (elementosH3.size()>elementosH2.size())&&(elementosH3.size()>elementosLink.size())&& (elementosH3.size()>botones.size()))
        {
            System.out.println("Hay mas elementos H3 "+ elementosH3.size());
        }
        if((elementosLink.size()>elementosDiv.size()) && (elementosLink.size()>elementosH1.size())&& (elementosLink.size()>elementosH2.size())&&(elementosLink.size()>elementosH3.size())&& (elementosLink.size()>botones.size()))
        {
            System.out.println("Hay mas elementos tipo link  "+ elementosLink.size());
        }
        if((botones.size()>elementosDiv.size()) && (botones.size()>elementosH1.size())&& (botones.size()>elementosH2.size())&&(botones.size()>elementosH3.size())&& (botones.size()>elementosLink.size()))
        {
            System.out.println("Hay mas elementos tipo link  "+ elementosLink.size());
        }
    }
}
