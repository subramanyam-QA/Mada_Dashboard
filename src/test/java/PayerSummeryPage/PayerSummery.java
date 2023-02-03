package PayerSummeryPage;

import net.serenitybdd.core.pages.PageObject;


public class PayerSummery extends PageObject {


    public void clickOnPayer() {

        $("//a[text()='Payer Summary']").click();
    }



}
