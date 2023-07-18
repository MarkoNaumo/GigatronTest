import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GigatronShopTest extends BaseTest{

    PopupPage popupPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp()
    {
        driver = openBrowser();
        popupPage = new PopupPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void ShopTest(){
        popupPage.clickPrihavti();
        homePage.inputSearch("Samsung");

        Assert.assertEquals(homePage.getResult.isDisplayed(),true,"SAMSUNG Galaxy S23+ 8/512GB Cream is displayed");

        homePage.addToCartSamsung();

        Assert.assertEquals(homePage.getCart(),"1");
    }


    @AfterMethod
    public void after()
    {
        driver.quit();
    }
}
