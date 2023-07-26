package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {
    /*
       Bir sayfanın locatelerini page class'ında tutarız. Bir constructor oluşturup locatelere ulaşabilmek için
   Pagefactory'den initelements() methodu ile driver'imizi bu class'a tanımlarız.
       findelement() methodu yerine @FindBy notasyonu ile bu notosyona parametre olarak locateleri gireriz.
    */
    public OpenSourcePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//h6")
    public WebElement verify;

}
