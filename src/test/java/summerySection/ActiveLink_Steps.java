package summerySection;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

import static java.time.temporal.ChronoUnit.SECONDS;
import static org.junit.Assert.assertTrue;

public class ActiveLink_Steps extends PageObject {
    public void clickOnActiveLinks() {
        setImplicitTimeout(20, SECONDS);
        $("#ACTIVE").click();
        String safe = $("#ACTIVE").getText();

    }

    public void verfiyStatusInTable(String status) {
        boolean scriptStatusInTable = $(".select2-selection.select2-selection--multiple ul li[title='" + status + "']").isVisible();
        Serenity.reportThat("Verified " + status + " filter is applied in Script status column",
                () -> assertTrue(scriptStatusInTable));
    }


}
