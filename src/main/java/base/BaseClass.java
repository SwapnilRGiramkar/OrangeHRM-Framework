package base;
import fileUtility.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.Login;

import java.time.Duration;
import java.util.Properties;
import java.io.IOException;
public class BaseClass
{
    public static WebDriver driver=null;
    @BeforeClass
    public static void preCondition() throws IOException {
        String browser= PropertiesFile.readProperties("browser");
        String url=PropertiesFile.readProperties("url");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");

        if(browser.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge"))
        {
            driver=new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
        else
        {
            System.out.println("No browser Found ");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
    }
    @BeforeMethod
    public static void login() throws IOException {
        Login log=new Login(driver);
        log.getUsername().sendKeys(PropertiesFile.readProperties("username"));
        log.getPassword().sendKeys(PropertiesFile.readProperties("password"));
        log.getLogin_button().click();
    }
    @AfterMethod
    public static void logout()
    {
        HomePage home=new HomePage(driver);
        home.getProfile_icon().click();
        home.getLogout().click();
    }
    @AfterClass
    public void postCondition()
    {
        driver.quit();
    }

}
