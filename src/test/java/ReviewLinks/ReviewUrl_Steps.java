package ReviewLinks;

import net.serenitybdd.core.pages.PageObject;

public class ReviewUrl_Steps extends PageObject {
    ReviewUrl_Action reviewUrl_action;
    public void setReviewUrl_action(){
        reviewUrl_action.clickOnReviewLinks();
    }

}
