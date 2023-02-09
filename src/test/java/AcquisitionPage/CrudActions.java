package AcquisitionPage;

import ChromeDriver.DriverFactory;
import javafx.scene.control.Alert;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.time.temporal.ChronoUnit.SECONDS;

public class CrudActions extends PageObject {
    DriverFactory driverFactory;
    public void clickOnUpdateBtn(){
        setImplicitTimeout(10,SECONDS);

        WebElement ele = driverFactory.driver.findElement(By.cssSelector("#name-update-action-2"));
        Actions action = new Actions(driverFactory.driver);
        action.moveToElement(ele).build().perform();
        $("#name-update-action-2").click();

//        Alert alert= (Alert) driverFactory.driver.switchTo().alert();
//        $("//input[@id='data-source-url-action-label']").click();
//        setImplicitTimeout(10,SECONDS);
//        $("//input[@id='data-source-url-action-label']").clear();
//        setImplicitTimeout(10,SECONDS);
//        $("//input[@id='data-source-url-action-label']").sendKeys("MedTech");

    }
}
