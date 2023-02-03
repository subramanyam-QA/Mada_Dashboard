package BlockedLimks;

import net.serenitybdd.core.pages.PageObject;

public class BlockedLinks_Actions extends PageObject {
    BlockedLinks_Steps blockedLinks_steps;
    public void setBlockedLinks_steps(){
        blockedLinks_steps.clickBlockedLinks();
    }
}
