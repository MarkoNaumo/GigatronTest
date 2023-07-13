import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopupPage extends BasePage{

    @FindBy(css = ".mf-modal-iframe.mf-modal-iframe-middle.mf-animate.mf-loaded")
    WebElement iframe;

    @FindBy(css = ".mf-modal-container .mf-modal-close")
    WebElement close;

    @FindBy(css = ".btn.secondary")
    WebElement buttonPrihavti;

    public PopupPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnPopup(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOf(close)).click();
    }
    public void clickPrihavti()
    {
        buttonPrihavti.click();
    }
}
