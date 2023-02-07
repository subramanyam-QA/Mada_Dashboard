package PayerSummeryPage;

import net.serenitybdd.core.pages.PageObject;


public class PayerSummery extends PageObject {

    public void clickOnPayer(String businessName) {
        $("//a[text()='"+businessName+"']").click();
    }


}
