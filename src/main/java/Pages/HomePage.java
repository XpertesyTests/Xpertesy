package Pages;

import Constants.Const;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {


    public void navigateToMainPage() {
        webDriver.get(Const.MAIN_URL);
    }

    public boolean isIntroBannerVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Const.TEXT_CONTENT)));
        return elementExist(Const.INTRO_BANNER);
    }

    public void clickOnGetStartedButton() {
        clickElementByXpath(Const.GET_STARTED_BUTTON);
    }

    public LearnMorePage openLearnMorePage() {
        clickElementByXpath(Const.LEARN_MORE_BUTTON);
        return new LearnMorePage();
    }

    public HomePage clickOnLogoTest() {
        clickElementByXpath(Const.TOP_MENU_LOGO_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnHomeButtonTest() {
        clickElementByXpath(Const.TOP_MENU_HOME_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnBusinessButton() {
        clickElementByXpath(Const.TOP_MENU_BUSINESS_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnFamilyButton() {
        clickElementByXpath(Const.TOP_MENU_FAMILY_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnEducationButton() {
        clickElementByXpath(Const.TOP_MENU_EDUCATION_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnForOfficesButton() {
        clickElementByXpath(Const.TOP_MENU_FOR_OFFICES_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnLearnMoreInDDMenuButton() {
        moveToElement(Const.TOP_MENU_FOR_OFFICES_BUTTON);
        clickElementByXpath(Const.TOP_MENU_FOR_OFFICES_DD_LEARN_MORE_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnAminInDDMenuButton() {
        moveToElement(Const.TOP_MENU_FOR_OFFICES_BUTTON);
        clickElementByXpath(Const.TOP_MENU_FOR_OFFICES_DD_ADMIN_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnMeetingRoomsInDDButton() {
        moveToElement(Const.TOP_MENU_FOR_OFFICES_BUTTON);
        clickElementByXpath(Const.TOP_MENU_FOR_OFFICES_DD_MEETING_ROOMS_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnContactUsButton() {
        clickElementByXpath(Const.TOP_MENU_CONTACT_US_BUTTON);
        return new HomePage();
    }

    public HomePage clickOnAboutLinkInTheBottomMenu() {
        clickElementByXpath(Const.BOTTOM_MENU_ABOUT_LINK);
        return new HomePage();
    }

    public HomePage clickOnContactUsLinkInTheBottomMenu() {
        clickElementByXpath(Const.BOTTOM_MENU_CONTACT_US_LINK);
        return new HomePage();
    }

    public HomePage clickOnPrivacyLinkInTheBottomMenu() {
        clickElementByXpath(Const.BOTTOM_MENU_PRIVACY_LINK);
        return new HomePage();
    }

    public HomePage clickOnTermsOfUseLinkInTheBottomMenu() {
        clickElementByXpath(Const.BOTTOM_MENU_TERMS_OF_USE_LINK);
        return new HomePage();
    }
    public void navigateToHomePage() {
        webDriver.get(Const.MAIN_URL);
    }

    public void enterYourName(String name) {
        sendTextToElementByXpath(Const.YOUR_NAME_INPUT, name);
    }

    public boolean isNameEntered(String enteredName) {

        return inputValue(Const.YOUR_NAME_INPUT);
    }


    public void enterEmail(String email) {
        sendTextToElementByXpath(Const.EMAIL_INPUT, email);
    }

    public boolean isEmailEntered(String enteredEmail) {
        return inputValue(Const.EMAIL_INPUT);
    }

    public void enterSubject(String name) {
        sendTextToElementByXpath(Const.SUBJECT_INPUT, name);
    }

    public boolean isSubjectEntered(String subject) {
        return inputValue(Const.SUBJECT_INPUT);
    }

    public void enterMessage(String message) {
        sendTextToElementByXpath(Const.MESSAGE_INPUT,message);
    }

    public boolean isMessageEntered() {
        return inputValue(Const.MESSAGE_INPUT);
    }

    public void clickOnSubmitMessageButton() {
        clickElementByXpath(Const.SUBMIT_MESSAGE_BUTTON);
    }

    public boolean isMessageSent() {
        return elementExist(Const.YOUR_MESSAGE_SENT_NOTIFICATION);
    }

    public void clickOnYourMessageNotificationCloseButton() {
        clickElementByXpath(Const.YOUR_MESSAGE_SENT_NOTIFICATION_CLOSE_BUTTON);
    }

}


