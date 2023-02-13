package AcquisitionPage;


import net.serenitybdd.core.pages.PageObject;

public class CrudSteps extends PageObject {
    CrudActions crudActions;
    public void setUpdateBtn() throws InterruptedException {
       crudActions.clickOnUpdateBtn();

    }
//    public void setCreateBtn(){
//
//    }
//    public void setDeleteBtn(){
//
//    }
}
