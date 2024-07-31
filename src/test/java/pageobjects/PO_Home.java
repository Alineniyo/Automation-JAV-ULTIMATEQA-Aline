package pageobjects;

import org.openqa.selenium.WebDriver;
import framework.automation.FW_Page;
import framework.utilities.FW_ConfigMgr;
import framework.utilities.FW_StringUtils;

public class PO_Home extends FW_Page {

private static final String LO_LNK_NAVIGATION_HOME_VALIDATE_PAGE = "";




    public PO_Home(WebDriver driver) {
        super(driver);
    }

    public String validateOnPage(){
        String result = validateLocatorExists(LO_LNK_NAVIGATION_HOME_VALIDATE_PAGE, FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }


  



    

}