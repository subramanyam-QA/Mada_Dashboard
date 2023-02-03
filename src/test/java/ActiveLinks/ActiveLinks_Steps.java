package ActiveLinks;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ActiveLinks_Steps extends PageObject {
    public void clickOnActiveLinks() {
        setImplicitTimeout(20, SECONDS);
        $("#ACTIVE").click();
        String safe = $("#ACTIVE").getText();




    }
    public void clickOnScriptStatus(){
        WebElement dropdown= $("//select[@id='scriptStatusFilter']");
//        String dropdown=  $("//select[@id='scriptStatusFilter']").getText();
//       System.out.println(abc);
        Select se = new Select( $("//select[@id='scriptStatusFilter']"));
        String vl =se.getAllSelectedOptions().toString();
        List<WebElement> lt =se.getOptions();

    }

}
