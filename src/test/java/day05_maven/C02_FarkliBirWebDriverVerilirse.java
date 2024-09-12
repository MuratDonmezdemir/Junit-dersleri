package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C02_FarkliBirWebDriverVerilirse {
    public static void main(String[] args) {

// bize dışardan bir web driver verirse
// verilen dosyayı POm.xml ekleriz

        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testotomasyonu.com/");
        ReusableMethods.bekle(5);
        driver.quit();


    }
}
