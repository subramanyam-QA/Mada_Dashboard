package summerySection;

//import ReviewLinks.ReviewLink_Actions;
import net.serenitybdd.core.pages.PageObject;

public class ReviewLink_Steps extends PageObject {
    ReviewLink_Actions reviewUrl_action;
    public void setReviewUrl_action(){
        reviewUrl_action.clickOnReviewLinks();
    }

}
