package pageobjects;
 
// Import class packages for this Page Object (PO)
import org.openqa.selenium.WebDriver;   // Selenium WebDriver
import framework.automation.FW_Page;    // Automation framework Page Object (PO) class
import framework.utilities.FW_ConfigMgr;   // Automation framework Configuration Manager to retrieve testConfig.properties values
import framework.utilities.FW_StringUtils; // Automation framework String Utilities
import framework.utilities.FW_ScreenUtils; // Automation framework Screen Utilities
 
/**
* Page Object (PO) class used in the Page Object (PO) design pattern.
* Inherits from the FW_Page class.
*/
// [Note: Automation Engineer, rename this Page Object (PO) class to match the filename.]
public class PO_About extends FW_Page {
 
    // [Note: Automation Engineer, define the Page Object (PO) locators (LO) here.]
    private static final String LO_TXT_ABOUT = "//div[@class='et_pb_text_inner']/h2[text()='Case Studies']";
 
 
    /**
     * Define the Page Object (PO) constructor.
     * @param driver The WebDriver object passed from the test method.
     */
    // [Note: Automation Engineer, rename this Page Object (PO) class to match the filename.]
    public PO_About(WebDriver driver) {
        super(driver);
    }
 
    // [Note: Automation Engineer, define the Page Object (PO) methods here.]
 
    /**
    * Validates if current webpage is loaded and correct.
    *
     * @return A string including [PASS] or [FAIL] along with specific result details.
    */
    public String validateAboutPage(){
        String result = validateLocatorExists(LO_TXT_ABOUT, FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        FW_ScreenUtils.takeScreenshot(getDriver(), "on_page_validation", FW_ConfigMgr.getScreenCaptureDirectory());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
 
}