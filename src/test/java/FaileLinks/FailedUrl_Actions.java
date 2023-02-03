package FaileLinks;

import net.serenitybdd.core.pages.PageObject;

import static java.time.temporal.ChronoUnit.SECONDS;

public class FailedUrl_Actions extends PageObject {
    public void clickOnFailedLinks(){
        setImplicitTimeout(20, SECONDS);
        $("#FAILED").click();
    }

}
