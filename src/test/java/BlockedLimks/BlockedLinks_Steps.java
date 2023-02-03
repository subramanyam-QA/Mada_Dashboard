package BlockedLimks;

import net.serenitybdd.core.pages.PageObject;

import static java.time.temporal.ChronoUnit.SECONDS;

public class BlockedLinks_Steps extends PageObject {
    public void clickBlockedLinks() {
        setImplicitTimeout(20, SECONDS);
        $("#BLOCKED").click();
    }
}
