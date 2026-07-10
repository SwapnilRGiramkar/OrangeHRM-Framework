package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    @FindBy(className ="oxd-userdropdown-tab")
    private WebElement profile_icon;

    @FindBy(xpath="//a[text()='Logout']")
    private WebElement logout;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement getProfile_icon()
    {
        return profile_icon;
    }
    public  WebElement getLogout()
    {
        return logout;
    }
}
