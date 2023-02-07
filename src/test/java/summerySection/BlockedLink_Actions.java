package summerySection;

//import BlockedLinks.BlockedLink_Steps;
import net.serenitybdd.core.pages.PageObject;

public class BlockedLink_Actions extends PageObject {
    BlockedLink_Steps blockedLinks_steps;
    public void setBlockedLinks_steps(){
        blockedLinks_steps.clickBlockedLinks();
    }
}
