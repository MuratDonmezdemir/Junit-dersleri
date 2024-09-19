package utilities;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReusableMethods {


    // Webelement'lerden olusan listeyi,
    // String'lerden olusan listeye ceviren bir method olusturalim

    public static List<String> stringListeyeCevir(List<WebElement> elementListesi){

        List<String> stringListesi = new ArrayList<>();

        for (WebElement eachElement : elementListesi) {

            stringListesi.add(eachElement.getText());
        }

        return stringListesi;
    }

    public static void bekle(int saniye){

        try {
            Thread.sleep( saniye*1000);
        } catch (InterruptedException e) {

        }

    }

    public static void switchToWindowByTitle(WebDriver driver , String istenenSayfaTitle){
        Set<String> acikOlanWindowlarinWHDSeti = driver.getWindowHandles();
        for (String eachWhd : acikOlanWindowlarinWHDSeti){

            driver.switchTo().window(eachWhd);
            ReusableMethods.bekle(1);

            if (driver.getTitle().equals(istenenSayfaTitle)){
                break;
            }

        }
    }

    public static void switchToWindowByUrl(WebDriver driver , String istenenSayfaUrl){
        Set<String> acikOlanWindowlarinWHDSeti = driver.getWindowHandles();
        for (String eachWhd : acikOlanWindowlarinWHDSeti){

            driver.switchTo().window(eachWhd);
            ReusableMethods.bekle(1);

            if (driver.getCurrentUrl().equals(istenenSayfaUrl)){
                break;
            }

        }
    }

    public static void switchToWindow(WebDriver driver, String newWindow) {
    }
}