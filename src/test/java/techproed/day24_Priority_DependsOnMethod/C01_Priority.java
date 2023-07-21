package techproed.tests.day24_Priority_DependsOnMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_Priority {
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test(priority = 1)
    public void amazonTest() {
        driver.get("https://amazon.com");//-->ikinci olarak amazon çalışsın
    }

    @Test
    public void youtubeTest() {
        driver.get("https://youtube.com");//-->youtube önce çalışsın
    }

    @Test(priority = 2)
    public void facebookTest() {
        driver.get("https://facebook.com");//-->son olarak facebook çalışsın

    }

    @AfterMethod
    public void tearDown() {

    }
}
