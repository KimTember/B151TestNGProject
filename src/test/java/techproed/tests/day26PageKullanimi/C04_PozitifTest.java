package techproed.tests.day26PageKullanimi;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C04_PozitifTest {
    @Test(groups = "smoke")
    public void test01() {

        //Acceptance Criteria:
        //Admin olarak, uygulamaya giriş yapabilmeliyim
        //https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);

        //Admin email: jack@gmail.com -->.properties dosyasında
        //Admin password: 12345 -->.properties dosyasında
        rentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"), Keys.TAB ,
                ConfigReader.getProperty("blueRentalPassword"),Keys.ENTER);

        //Giriş yapıldığını doğrulayalım
        ReusableMethods.bekle(2);
        Assert.assertTrue(rentalPage.loginVerify.getText().contains("Jack"));

        //Sayfayı kapatınız
        Driver.closeDriver();

    }
}
