package summerySection;

//import FailedLinks.FailedLink_Actions;
import net.serenitybdd.core.pages.PageObject;

public class FailedLink_Steps extends PageObject {
    //FailedLink_Actions failedUrl_actions;
    FailedLink_Actions failedLink_actions;
    public void setFailedUrl_actions(){
        failedLink_actions.clickOnFailedLinks();

    }
}
