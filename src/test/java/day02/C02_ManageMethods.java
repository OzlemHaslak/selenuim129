package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        System.out.println("Sayfa Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = " + driver.manage().window().getSize());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//NOT: Sayfadaki her bir webelement için max 20 saniye bekler

        /*
        Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Youtube sayfasina geri donun
        Sayfayi yenileyin
        Amazon sayfasina donun
        Sayfayi tamsayfa yapin
        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        Sayfayi kapatin
         */




//Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actulaTitle = driver.getTitle();//Gerçek başlık
        String expectedTitle = "youtube";//Beklenen başlık
        if (actulaTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Başlık : "+actulaTitle);
        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenKelime = "youtube";
        if (actualUrl.contains(beklenenKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+actualUrl);
        //daha sonra amazon sayfasina gidin
        driver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        //you tube sayfasina geri donun
        driver.navigate().back();
        //sayfayi yenileyin
        driver.navigate().refresh();
        //amazon sayfasina donun
        driver.navigate().forward();
        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actuallTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actuallTitle.contains(istenenKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Başlıl = "+actuallTitle);
        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String gercekUrl = driver.getCurrentUrl();
        String istenenUrl = "https://www.amazon.com/";
        if (gercekUrl.equals(istenenUrl)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+gercekUrl);

        //Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();





    }
}
