package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement username;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement user_role;

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])")
    private WebElement employee_name;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    private WebElement status;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--ghost'])")
    private WebElement reset;

    @FindBy(xpath = "(//button[@type='submit'])")
    private WebElement search;

    @FindBy(xpath = "(//button[@class='oxd-icon-button'])[2]")
    private WebElement hide_button;

    @FindBy(xpath = "(//button[@class='oxd-icon-button'])[1]")
    private WebElement help;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])")
    private WebElement add;

    @FindBy(xpath = "(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[1]")
    private WebElement selectAll;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin'])")
    private WebElement deleteAll;

    public Admin(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public WebElement getUsername()
    {
        return username;
    }
    public WebElement getUser_role()
    {
        return user_role;
    }
    public WebElement getEmployee_name()
    {
        return employee_name;
    }
    public WebElement getStatus()
    {
        return status;
    }
    public WebElement getReset()
    {
        return reset;
    }
    public WebElement getSearch()
    {
        return search;
    }
    public WebElement getHide_button()
    {
        return hide_button;
    }
    public WebElement getHelp()
    {
        return help;
    }
    public WebElement getAdd()
    {
        return add;
    }
    public WebElement getSelectAll()
    {
        return selectAll;
    }
    public WebElement getDeleteAll()
    {
        return deleteAll;
    }
}

