package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_LocatorsGetMethodlari {
    /*
  Amazon sayfasına gidin
  Search bölümünü locate edip, "Tablet" aratalım
  Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
  Sayfayı kapatın
   */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//          Amazon sayfasına gidin
        driver.get("https://amazon.com");

//          Search bölümünü locate edip, "Tablet" aratalım
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("telefone");
        aramaKutusu.submit();//Enter'a bas

//          Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
        WebElement aramaSonucu = driver.findElement(By.className("sg-col-inner"));
        System.out.println("aramaSonucu = " + aramaSonucu.getText());

//          Sayfayı kapatın
        Thread.sleep(3000);
        driver.close();
    }
}


















