package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {

    public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement cookiesButonu;

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(id="login-email")
    public WebElement emailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement loginButonu;

    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement basariliGirisElementi;


}
