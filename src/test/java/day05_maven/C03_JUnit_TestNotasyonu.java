package day05_maven;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C03_JUnit_TestNotasyonu {



        // 3 farklı test yapmak istiyoruz ancak testler bağımsız olarak da calıstırılabılmelıdır
   @Test
   public void test01(){
       WebDriver driver = new ChromeDriver();

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://testotomasyonu.com/");

       ReusableMethods.bekle(3);
       driver.quit();
        }
        @Test
      public  void test02(){
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://amazon.com/");

          ReusableMethods.bekle(3);
          driver.quit();

      }
      @Test
     public  void  test03(){
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://youtube.com/");

         ReusableMethods.bekle(3);
         driver.quit();

     }

    }

