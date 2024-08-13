package pageobjects;
 
// Import class packages for this Page Object (PO)
import org.openqa.selenium.WebDriver;   // Selenium WebDriver
import framework.automation.FW_Page;    // Automation framework Page Object (PO) class
import framework.utilities.FW_ConfigMgr;   // Automation framework Configuration Manager to retrieve testConfig.properties values
import framework.utilities.FW_ReportUtils; // Automation framework Report Utilities
import framework.utilities.FW_StringUtils; // Automation framework String Utilities
 
/**
* Page Object (PO) class used in the Page Object (PO) design pattern.
* Inherits from the FW_Page class.
*/
// [Note: Automation Engineer, rename this Page Object (PO) class to match the filename.]
public class PO_Education extends FW_Page {
 
    // [Note: Automation Engineer, define the Page Object (PO) locators (LO) here.]
    private static final String LO_TXT_FREE_COURSE = "//h2[@class='collections__heading']";
    private static final String LO_EDT_SEARCH = "//input[@placeholder='Search']";
    private static final String LO_SEARCHED_ITEM = "//a[@href='/courses/selenium-java-bootcamp']";
 
    /**
     * Define the Page Object (PO) constructor.
     * @param driver The WebDriver object passed from the test method.
     */
    // [Note: Automation Engineer, rename this Page Object (PO) class to match the filename.]
    public PO_Education(WebDriver driver) {
        super(driver);
    }
 
    // [Note: Automation Engineer, define the Page Object (PO) methods here.]
 
    /**
    * Validates if current webpage is loaded and correct.
    *
     * @return A string including [PASS] or [FAIL] along with specific result details.
    */
    public String validateOnPage(){
        String result = validateLocatorExists(LO_TXT_FREE_COURSE, FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * Search for a course
     *
     * @param courseName The name of the course to search for.
     * @return A string including [PASS] or [FAIL] along with specific result details.
     *
     */
 
    public String searchForCourse(String courseName) {
        String result = setText(LO_EDT_SEARCH, courseName, FW_ConfigMgr.getDefaultTimeout(),false);
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * validate on the searched course
     *
     * @return A string including [PASS] or [FAIL] along with specific result details.
     *
     */
    public String validateSearchedCourse() {
        String result = validateLocatorExists(LO_SEARCHED_ITEM, FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * Click on the searched course
     *
     * @return A string including [PASS] or [FAIL] along with specific result details.
     *
     */
    public String clickSearchedCourse() {
        String result = clickLocator(LO_SEARCHED_ITEM, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
 
}
