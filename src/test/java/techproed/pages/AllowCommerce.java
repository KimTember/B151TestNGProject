package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AllowCommerce {

    public AllowCommerce() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signin;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passWord;


    @FindBy(xpath = "//*[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement aramaKutusu;


    @FindBy(xpath = "(//*[@class='product-media'])[3]")
    public WebElement aratilanUrun;



    @FindBy(xpath = "//*[@name='add-to-cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@class='btn btn-success btn-md']")
    public WebElement viewCart;



    //*[@class='btn btn-success btn-md']
}
