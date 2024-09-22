package T145_JunitPractice;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;
import java.time.Duration;
public class P03_Assertion {
    // https://www.automationexercise.com/ adresine gidin
    // Singup/login butonuna tıklayın
    // Yeni bir kullanıcı oluşturun
    // Kullanıcı kaydının başarıyla tamamlandığını doğrulayın
    // Oluşturduğunuz kullanıcı hesabını silin ve silindiğini doğrulayın
    static WebDriver driver;
    static WebElement signUpButton;
    @BeforeAll
    public static void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationexercise.com/");
        signUpButton= driver.findElement(By.xpath("//*[@class='fa fa-lock']"));
        signUpButton.click();
    }
    @AfterAll
    public  static void tearDown(){driver.quit();}
    @Test
    public void userRegister(){
        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("murat");
        driver.findElement(By.xpath("//*[@ data-qa='signup-email']")).sendKeys("kiok@uceles.bond" + Keys.ENTER);
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("258963");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("first_name")).sendKeys("Murat");
        driver.findElement(By.id("last_name")).sendKeys("dnmzdmr");
        driver.findElement(By.id("address1")).sendKeys("Atatürk Bulvarı");
        driver.findElement(By.id("state")).sendKeys("NonUsa");
        driver.findElement(By.id("city")).sendKeys("Kırıkkale");
        driver.findElement(By.id("zipcode")).sendKeys("71100");
        driver.findElement(By.id("mobile_number")).sendKeys("555555555"+Keys.ENTER);
        String actualResult=driver.findElement(By.xpath("//b")).getText();
        System.out.println(actualResult);
        if (actualResult.equalsIgnoreCase("ACCOUNT CREATED!")){
            System.out.println("Hesap başarıyla oluşturuldu.");
        }else{
            System.out.println("Hesap Oluşturulamadı");
        }
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        //a href="/delete_account
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
        String actualDelete=driver.findElement(By.xpath("//b")).getText();
        System.out.println(actualDelete);
        if (actualDelete.equalsIgnoreCase("Account Deleted!")){
            System.out.println("Hesap başarıyla silindi.");
        }else{
            System.out.println("Hesap Silinemedi");
        }
    }
}