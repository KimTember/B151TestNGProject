package techproed.tests.day28_DataProvider;


import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C02_DataProviderTest {
    @DataProvider
    public static Object[][] arabalar() {
        return new Object[][]{{"volvo"},{"audi"},{"mercedes"},{"ford"}};
    }

    @Test(dataProvider = "arabalar")

    public void test01(String araclar) {
        //google sayfasına girelim

        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        //DataProvider'daki verilerle arama yapalım
        GooglePage googlepage=new GooglePage();
        googlepage.aramaKutusu.sendKeys(araclar, Keys.ENTER);
       // googlepage.aramaKutusu.submit();-->enter ile aynı işi yapar

        ReusableMethods.bekle(3);
        //Her arama için sayfa resmi alalım
        ReusableMethods.tumSayfaResmi(araclar);


        //sayfayı kapatalım
        Driver.closeDriver();




    }
}



