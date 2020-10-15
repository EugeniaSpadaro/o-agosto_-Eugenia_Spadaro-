package test.Practico_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class Ejercicio_16 {

@Test
        public void ejercicioNetflix () {
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eugi\\Desktop\\Curso de selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        List<WebElement> elementosH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> elementosH2 = driver.findElements(By.tagName("h2"));

        System.out.println("LA CANTIDAD DE ELEMENTOS DE H1 ES: "+elementosH1.size());
        System.out.println("LOS ELEMENTOS DE H1 SON: ");

        for (WebElement elementosH1AMostrar : elementosH1)
        {
            System.out.println("--->"+elementosH1AMostrar.getText());
        }

        System.out.println("LA CANTIDAD DE ELEMENTOS DE H2 ES: "+elementosH2.size());
        System.out.println("LOS ELEMENTOS DE H2  SON: ");

        for (WebElement elementosH2AMostrar : elementosH2)
        {
         System.out.println("--->" + elementosH2AMostrar.getText());
        }

        driver.navigate().back();
        driver.navigate().refresh();

        List<WebElement> elementosDIV = driver.findElements(By.tagName("div"));

        System.out.println("LA CANTIDAD DE ELEMENTOS DIV QUE CONTIENE EL SITIO ES: "+ elementosDIV.size());

        System.out.println("LOS ELEMENTOS DIV QUE CONTIENE EL SITIO ES: ");
                for (WebElement elementoDIVAMostrar : elementosDIV)
                {
                        System.out.println("--->" + elementoDIVAMostrar.getText());
                }

        System.out.println("El titulo de la pagina es: "+driver.getTitle());
        System.out.println("La url de la pagina es: "+driver.getCurrentUrl());

        List <WebElement> elemtosLink = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de elementos de tipo link son : "+elemtosLink.size());

        if ((elementosH1.size()>elementosH2.size())&&(elementosH1.size()>elementosDIV.size())&&(elementosH1.size()>elemtosLink.size()))
        {
                System.out.println("HAY MAS CANTIDAD DE ELEMENTOS H1 "+ elementosH1.size());
        }
        if ((elementosH2.size()>elementosH1.size())&&(elementosH2.size()>elementosDIV.size())&&(elementosH2.size()>elemtosLink.size()))
        {
                System.out.println("HAY MAS CANTIDAD DE ELEMENTOS H2 "+ elementosH2.size());
        }
        if ((elementosDIV.size()>elementosH1.size())&&(elementosDIV.size()>elementosH2.size())&&(elementosDIV.size()>elemtosLink.size()))
        {
                System.out.println("HAY MAS CANTIDAD DE ELEMENTOS DIV "+ elementosDIV.size());
        }
        if ((elemtosLink.size()>elementosH1.size())&&(elemtosLink.size()>elementosH2.size())&&(elemtosLink.size()>elementosDIV.size()))
        {
                System.out.println("HAY MAS CANTIDAD DE ELEMENTOS LINK "+ elemtosLink.size());
        }

    }
}
