package PayerSummeryPage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class PayerSummerySteps extends PageObject {
    PayerSummery payerSummery;

    public void clickPayerSummery() {
        payerSummery.clickOnPayer();
    }


}
