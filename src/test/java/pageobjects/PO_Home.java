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
public class PO_Home extends FW_Page {
 
    // [Note: Automation Engineer, define the Page Object (PO) locators (LO) here.]
    private static final String LO_IMG_LOGO = "//img[@class='wp-image-218123 lazyloaded']";
    private static final String LO_BUT_SCHEDULE_AFREE_DISCOVERY_SESSION = "//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']";
    private static final String LO_LNK_SERVICE = "//ul[@id='menu-main-menu']//li[@id='menu-item-218392']";
    private static final String LO_LNK_ABOUT = "//ul[@id='menu-main-menu']//li[@id='menu-item-217940']";
    private static final String LO_LNK_BLOG = "//div[@class='et_pb_menu__menu']//li[@id='menu-item-218226']";
    private static final String LO_LNK_EDUCATION = "//div[@class='et_pb_menu__menu']//li[@id='menu-item-218225']";
    private static final String LO_LNK_FREE_COURSE = "//ul[@id='menu-main-menu']//ul[@class='sub-menu']/li[@id='menu-item-217933']";
 
    /**
     * Define the Page Object (PO) constructor.
     * @param driver The WebDriver object passed from the test method.
     */
    // [Note: Automation Engineer, rename this Page Object (PO) class to match the filename.]
    public PO_Home(WebDriver driver) {
        super(driver);
    }
 
    // [Note: Automation Engineer, define the Page Object (PO) methods here.]
 
    /**
    * Validates if current webpage is loaded and correct.
    *
     * @return A string including [PASS] or [FAIL] along with specific result details.
    */
    public String validateOnPage(){
        String result = validateLocatorExists(LO_IMG_LOGO, FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    public String validateHomePage() {
        String result = validateLocatorExists(LO_IMG_LOGO, FW_ConfigMgr.getDefaultTimeout(),
                FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * Click schedule a free discovery session button
     *
     * @return A string including [PASS] or [FAIL] along with specific result
     *         details.
     *
     */
    public String clickScheduleAFreeDiscoverySession() {
        String result = clickLocator(LO_BUT_SCHEDULE_AFREE_DISCOVERY_SESSION, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * switch tab.
     *
     * @return A string including [PASS] or [FAIL] along with specific result
     *         details.
     */
    public String switchWindow(int position) {
        String result = switchToWindowByPosition(position);
        return result;
 
    }
 
    /**
     * Click service link
     *
     * @return A string including [PASS] or [FAIL] along with specific result
     *         details.
     *
     */
 
    public String clickServiceLink() {
        String result = clickLocator(LO_LNK_SERVICE, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * Click about link
     *
     * @return A string including [PASS] or [FAIL] along with specific result
     *         details.
     *
     */
 
    public String clickAboutLink() {
        String result = clickLocator(LO_LNK_ABOUT, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * Click blog link
     *
     * @return A string including [PASS] or [FAIL] along with specific result
     *         details.
     *
     */
 
    public String clickBlogLink() {
        String result = clickLocator(LO_LNK_BLOG, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * Click education link
     *
     * @return A string including [PASS] or [FAIL] along with specific result
     *         details.
     *
     */
 
    public String clickEducationLink() {
        String result = mouseOverLocator(LO_LNK_EDUCATION, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
    /**
     * Click free course link
     *
     * @return A string including [PASS] or [FAIL] along with specific result
     *         details.
     *
     */
 
    public String clickFreeCourseLink() {
        String result = clickLocator(LO_LNK_FREE_COURSE, FW_ConfigMgr.getDefaultTimeout());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }
 
}
