package summerySection;


import net.serenitybdd.core.pages.PageObject;

public class ActiveLink_Actions extends PageObject {
    //ActiveLink_Steps activeLink_steps;
    ActiveLink_Steps activeLink_steps;

    public void setActiveLinks_steps(){
        activeLink_steps.clickOnActiveLinks();
    }

}
