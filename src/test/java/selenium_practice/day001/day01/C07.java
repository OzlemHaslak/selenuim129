package selenium_practice.day001.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class C07 {
    public static void main(String[] args) {

        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz

        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin

        driver.get("https://www.amazon.com/");

        // arama motorunda nutella yazip aratınız



      WebElement aramaMotoru = driver.findElement(By.id("twotabsearchtextbox"));
       aramaMotoru.sendKeys("nutella"+ Keys.ENTER);


        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz



    }
}
