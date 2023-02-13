package AcquisitionPage;

import ChromeDriver.DriverFactory;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.time.temporal.ChronoUnit.SECONDS;
import static org.junit.Assert.assertTrue;

public class CrudActions extends PageObject {
    public WebDriver driver;


    public void clickOnUpdateBtn() throws InterruptedException {
        setImplicitTimeout(30, SECONDS);
        withAction().moveToElement(element("//tr[@id = 2]//td[@class = 'data_source_name']")).moveToElement(element(" //i[@id='name-update-action-2']")).click().build().perform();
        setImplicitTimeout(50, SECONDS);

        Serenity.reportThat("User should able to view the URL pop up",
                () -> assertTrue($(".col-lg-2.required").isVisible()));

        $("#data-source-url-action-label").clear();
        $("#data-source-url-action-label").sendKeys("Automation test_1");

        $("#data-source-url-action-textarea").clear();
        $("#data-source-url-action-textarea").sendKeys("https://automationtest1.com");
        setImplicitTimeout(70, SECONDS);
        $("//button[@class='btn btn-primary save-data-source-url']").click();
        setImplicitTimeout(70, SECONDS);
        $("(//a[@href='/dashboard/pa/data_sources/325/qa?health_plan_type_id=4&payer_id=1611&product_id=2'])[1]").click();


        // $("//i[@id='name-update-action-2']").click();

//       Alert alert= driver.switchTo().alert();
//       String alertMessage= driver.switchTo().alert().getText();
//        Thread.sleep(5000);
//        $("data-source-url-action-label").click();
//        setImplicitTimeout(10,SECONDS);
//       $("//input[@id='data-source-url-action-label']").clear();
//        setImplicitTimeout(10,SECONDS);
//       $("//input[@id='data-source-url-action-label']").sendKeys("MedTech");


    }
//    public void clickOnCreate(){
//        $("(//i[@class='fa fa-plus dropdown-toggle data-source-url-action'])[1]").click();
//
//    }
//    public void clickOnDelete(){
//        $("//i[@id='name-delete-action-2']").click();
//
//    }
}
