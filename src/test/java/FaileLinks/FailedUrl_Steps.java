package FaileLinks;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class FailedUrl_Steps extends PageObject {
    FailedUrl_Actions failedUrl_actions;
    public void setFailedUrl_actions(){
        failedUrl_actions.clickOnFailedLinks();

    }
}
