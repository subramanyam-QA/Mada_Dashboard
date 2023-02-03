package ActiveLinks;

import net.serenitybdd.core.pages.PageObject;

public class ActiveLinks_Actions extends PageObject {
    ActiveLinks_Steps activeLinks_steps;

    public void setActiveLinks_steps(){
        activeLinks_steps.clickOnActiveLinks();
    }

}
