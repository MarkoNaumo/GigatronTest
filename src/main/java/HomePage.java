import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(css = "#header__center__searchbox .search-container input")
    WebElement search;

    @FindBy(css = "#header__center__searchbox .search-container i")
    WebElement lupa;

    public HomePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void inputSearch(String text){
        search.sendKeys(text);
        lupa.click();
    }
}
