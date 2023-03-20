package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("edgeDriver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//Boş bir browser açar
        driver.get("https://www.amazon.com");//Gitmek istediğimiz ayfayı belirtiriz
        System.out.println("Sayfa başlığı: " + driver.getTitle());//driver.getTitle() sayfa başlığını getirir
        System.out.println("Sayfa adresi(URL): " + driver.getCurrentUrl());//driver.getCurrentUrl() sayfa adresini getirir
        //System.out.println(driver.getPageSource()); driver.getPageSource() ==> Sayda kaynak kodlarını getirir.
        System.out.println(driver.getWindowHandle());//Sayfanın(Window) hash değerini getirir.
        // Bu hash değerleri ile başka sayfadan bu sayfaya direkt dönebilmeyi sağlar.
        //(Sayfalar arası geçiş)



        driver.get("https://techproeducation.com");
        System.out.println("Sayfa başlığı: " + driver.getTitle());//driver.getTitle() sayfa başlığını getirir
        System.out.println("Sayfa adresi(URL): " + driver.getCurrentUrl());//driver.getCurrentUrl() sayfa adresini getirir

    }
}