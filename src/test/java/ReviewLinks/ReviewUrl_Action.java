package ReviewLinks;

import net.serenitybdd.core.pages.PageObject;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ReviewUrl_Action extends PageObject {

    public void clickOnReviewLinks(){
        setImplicitTimeout(10,SECONDS);
        $("#REVIEW").click();
    }
}
