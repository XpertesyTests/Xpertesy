import Pages.HomePage;
import Pages.LearnMorePage;
import PopUpWindows.YourEmailAddressWindow;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest extends UseCaseBase {

    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static LearnMorePage learnMorePage;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);


    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        learnMorePage = new LearnMorePage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        logger.info("main page load test");
        Boolean success = homePage.isIntroBannerVisible();
        assertTrue(success);
        homePage.takeScreenshot("MainPage");
    }

    @Test
    public void openYourEmailWindowTest() {
        logger.info("your email address window load test");
        homePage.clickOnGetStartedButton();
        Boolean success = yourEmailAddressWindow.isYourEmailAddressWindowOpened();
        assertTrue(success);
        homePage.takeScreenshot("YourEmailAddressWindow");
    }

    @Test
    public void openLearnMorePageTest() {
        logger.info("open Learn More page");
        homePage.openLearnMorePage();
        homePage.takeScreenshot("LearnMorePage");
        Boolean isVisible = learnMorePage.isLearnMoreHeaderVisible();
        assertTrue(isVisible);
        homePage.takeScreenshot("LearnMorePage");
    }

    @Test
    public void clickOnLogoTest() {
        homePage.clickOnLogoTest();
        homePage.takeScreenshot("ClickOnLogoTest");
    }

    @Test
    public void clickOnHomeButtonTest() {
        homePage.clickOnHomeButtonTest();
        homePage.takeScreenshot("ClickOnHomeButtonTest");
    }

    @Test
    public void clickOnBusinessButton() {
        homePage.clickOnBusinessButton();
        homePage.takeScreenshot("ClickOnBusinessButtonTest");
    }

    @Test
    public void clickOnEducationButton() {
        homePage.clickOnEducationButton();
        homePage.takeScreenshot("ClickOnEducationButtonTest");
    }

    @Test
    public void clickOnFamilyButton() {
        homePage.clickOnFamilyButton();
        homePage.takeScreenshot("ClickOnFamilyButtonTest");
    }

    @Test
    public void clickOnForOfficesButton() {
        homePage.clickOnForOfficesButton();
        homePage.takeScreenshot("ClickOnForOfficesButtonTest");
    }

    @Test
    public void clickOnLearnMoreButton() {
        homePage.clickOnLearnMoreInDDMenuButton();
        homePage.takeScreenshot("ClickOnLearnMoreButtonInDDMenuTest");
    }

    @Test
    public void clickOnAdminButton() {
        homePage.clickOnAminInDDMenuButton();
        homePage.takeScreenshot("ClickOnAdminButtonInDDMenuTest");
    }

    @Test
    public void clickOnMeetingRoomsButton() {
        homePage.clickOnMeetingRoomsInDDButton();
        homePage.takeScreenshot("ClickOnMeetingRoomsInDDMenuTest");
    }

    @Test
    public void clickOnContactUsButton() {
        homePage.clickOnContactUsButton();
        homePage.takeScreenshot("ClickOnContactUsButtonTest");
    }
    @Test
    public void clickOnAboutLinkInTheBottomMenu() {
        homePage.clickOnAboutLinkInTheBottomMenu();
        homePage.takeScreenshot("ClickOnAboutLinkInTheBottomMenuTest");
    }
    @Test
    public void clickOnContactUsLinkInTheBottomMenu() {
        homePage.clickOnContactUsLinkInTheBottomMenu();
        homePage.takeScreenshot("ClickOnContactUsLinkInTheBottomMenuTest");
    }
    @Test
    public void clickOnPrivacyLinkInTheBottomMenu() {
        homePage.clickOnPrivacyLinkInTheBottomMenu();
        homePage.takeScreenshot("ClickOnPrivacyLinkInTheBottomMenuTest");
    }
    @Test
    public void clickOnTermsOfUseLinkInTheBottomMenu() {
        homePage.clickOnTermsOfUseLinkInTheBottomMenu();
        homePage.takeScreenshot("ClickOnTermsOfUseLinkInTheBottomMenuTest");
    }
    @Test
    public void EnterYourNameTest()  {
        logger.info("enter name in the Your Name field");
        homePage.enterYourName("User");
        Boolean isEntered = homePage.isNameEntered("User");
        assertTrue(isEntered);
        homePage.takeScreenshot("YourNameInputField");
    }

    @Test
    public void EnterEmailTest() {
        logger.info("enter email in the email input field");
        homePage.enterEmail("alinataksa.testing@gmail.com");
        Boolean isEntered = homePage.isEmailEntered("alinataksa.testing@gmail.com");
        assertTrue(isEntered);
        homePage.takeScreenshot("EmailInputField");
    }

    @Test
    public void EnterSubjectTest() {
        logger.info("enter subject in the subject input");
        homePage.enterSubject("Pricing");
        Boolean isEntered = homePage.isSubjectEntered("Pricing");
        assertTrue(isEntered);
        homePage.takeScreenshot("SubjectInputField");
    }

    @Test
    public void EnterMessage() {
        logger.info("enter message in the message input");
        homePage.enterMessage("Hi there");
        Boolean isEntered = homePage.isMessageEntered();
        assertTrue(isEntered);
        homePage.takeScreenshot("SubjectInputField");
    }

    @Test
    public void SubmitMessage() {
        logger.info("submit message");
        homePage.enterYourName("User");
        homePage.enterEmail("alinataksa.testing@gmail.com");
        homePage.enterSubject("Pricing");
        homePage.clickOnSubmitMessageButton();
        Boolean isMessageSent = homePage.isMessageSent();
        assertTrue(isMessageSent);
        homePage.takeScreenshot("YourMessageSentNotification");
    }

    @Test
    public void CloseYourMessageNotification() {
        logger.info("close the your message notification message");
        homePage.enterYourName("User");
        homePage.enterEmail("alinataksa.testing@gmail.com");
        homePage.enterSubject("Pricing");
        homePage.clickOnSubmitMessageButton();
        homePage.clickOnYourMessageNotificationCloseButton();
    }
    @Test
    public void EmptyFieldErr()  {
        logger.info("close the your message notification message");
        homePage.enterEmail("alinataksa.testing@gmail.com");
        homePage.enterSubject("Pricing");
        homePage.clickOnSubmitMessageButton();
        homePage.takeScreenshot("FillOutThisFieldErr");
    }
}

