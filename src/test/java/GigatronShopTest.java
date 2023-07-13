import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronShopTest extends BaseTest{

    PopupPage popupPage;

    @BeforeMethod
    public void setUp()
    {
        driver = openBrowser();
        popupPage = new PopupPage(driver);
    }

    @Test
    public void ShopTest(){
        popupPage.clickOnPopup();
        popupPage.clickPrihavti();
    }


    @AfterMethod
    public void after()
    {
        driver.quit();
    }
}
