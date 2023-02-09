package AcquisitionPage;

import net.serenitybdd.core.pages.PageObject;

import static java.time.temporal.ChronoUnit.SECONDS;

public class CrudSteps extends PageObject {
    CrudActions crudActions;
    public void setUpdateBtn(){

        crudActions.clickOnUpdateBtn();
    }
}
