package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
    @FindBy(name="username")
    private WebElement username;

    @FindBy(css ="input[name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement login_button;

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement getUsername()
    {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogin_button()
    {
        return login_button;
    }
}
