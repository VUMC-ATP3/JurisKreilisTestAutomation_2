import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver chromeParluks;

    @Test
    public void testPageTitle(){
        this.chromeParluks = new ChromeDriver();//atvert parlukprogrammu
        this.chromeParluks.navigate().to("https://www.lu.lv/");
        this.chromeParluks.manage().window().maximize();
        String expectedTitle = "Latvijas Universitāte";
        String actualTitle = chromeParluks.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @AfterMethod
    public void closeBrowser(){
        chromeParluks.quit();
    }

}
