package summerySection;

import net.serenitybdd.core.pages.PageObject;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FailedLink_Actions extends PageObject {
    public void clickOnFailedLinks(){
        setImplicitTimeout(20, SECONDS);
        $("#FAILED").click();
    }

}
