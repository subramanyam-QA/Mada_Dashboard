package summerySection;

import net.serenitybdd.core.pages.PageObject;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ReviewLink_Actions extends PageObject {

    public void clickOnReviewLinks(){
        setImplicitTimeout(10,SECONDS);
        $("#REVIEW").click();
    }
}
