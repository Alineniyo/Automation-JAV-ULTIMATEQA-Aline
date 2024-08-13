package pageobjects;
 
// Import class packages for this Page Object (PO)
import org.openqa.selenium.WebDriver;   // Selenium WebDriver
import framework.automation.FW_Page;    // Automation framework Page Object (PO) class
import framework.utilities.FW_ConfigMgr;   // Automation framework Configuration Manager to retrieve testConfig.properties values
import framework.utilities.FW_StringUtils; // Automation framework String Utilities
 
/**
* Page Object (PO) class used in the Page Object (PO) design pattern.
* Inherits from the FW_Page class.
*/
// [Note: Automation Engineer, rename this Page Object (PO) class to match the filename.]
public class PO_Service extends FW_Page {
 
    // [Note: Automation Engineer, define the Page Object (PO) locators (LO) here.]
    private static final String LO_TXT_PROFESSIONAL_SERVICE = "//div[@class='et_pb_heading_container']/h2[@class='et_pb_module_heading' and text()='Our Professional Services']";
    private static final String LO_BUT_SEE_FULL_STORY = "et_pb_button et_pb_button_3 show-full-story et_pb_bg_layout_light";
 
    /**
     * Define the Page Object (PO) constructor.
     * @param driver The WebDriver object passed from the test method.
     */
    // [Note: Automation Engineer, rename this Page Object (PO) class to match the filename.]
    public PO_Service(WebDriver driver) {
        super(driver);
    }
 
    // [Note: Automation Engineer, define the Page Object (PO) methods here.]
 
/**
     * validate service page
     *
     * @return A string including [PASS] or [FAIL] along with specific result details.
     *
     */
    public String validateServicePage() {
        String result = validateLocatorExists(LO_TXT_PROFESSIONAL_SERVICE, FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * Click see full story button
     *
     * @return A string including [PASS] or [FAIL] along with specific result details.
     *
     */
    public String clickSeeFullStory() {
        String result = clickLocator(LO_BUT_SEE_FULL_STORY, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
}