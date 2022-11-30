package PopUpWindows;

import Constants.Const;
import Pages.BasePage;


public class NewMeetingWindow extends BasePage {


    public boolean isNewSessionWithWindowOpened() {
        return elementExist(Const.NEW_SESSION_WITH);
    }

    public void clickOnMyConnection() {
        clickElementByXpath(Const.MY_CONNECTION_OPTION);
    }

    public boolean isYouHaveNoConnectionNotificationVisible() {
        return elementExist(Const.YOU_HAVE_NO_CONNECTION_YET_NOTIFICATION);
    }

    public boolean isNextButtonVisible() {
        return elementExist(Const.NEXT_BUTTON);
    }

    public void clickOnGuestOption() {
        clickElementByXpath(Const.GUEST_OPTION);
    }

    public void clickOnCloseButton() {
        clickElementByXpath(Const.CLOSE_BUTTON);
    }

    public void clickOnBackButton() {
        clickElementByXpath(Const.BACK_BUTTON);
    }

    public void clickOnTitleField() {
        clickElementByXpath(Const.TITLE_INPUT_FIELD);
    }

    public void enterTitle(String title) {
        findElementByXpath(Const.TITLE_INPUT_FIELD).clear();
        sendTextToElementByXpath(Const.TITLE_INPUT_FIELD, title);
    }

    public boolean isTitleEntered(String title) {
        return sameValue(Const.TITLE_INPUT_FIELD, title);
    }

    public void clickOnNowOption() {
        clickElementByXpath(Const.NOW_START_OPTION);
    }

    public boolean isNowOptionChosen() {
        return checkedBox(Const.NOW_START_OPTION);
    }

    public void clickOnLaterOption() {
        clickElementByXpath(Const.LATER_START_OPTION);
    }

    public boolean isLaterOptionChosen() {
        return checkedBox(Const.LATER_START_OPTION);
    }

    public void clickOnDateField() {
        clickElementByXpath(Const.DATE_INPUT_FIELD);
    }

    public void chooseDate() {
        clickElementByXpath(Const.CALENDAR);
    }

    public boolean isDateChosen(String value) {
        return sameValue(Const.DATE_INPUT_FIELD, value);
    }

    public void chooseTime(String date) {
        sendTextToElementByXpath(Const.TIME_INPUT_FIELD, date);
    }

    public boolean isTimeChosen(String value) {
        return sameValue(Const.TIME_INPUT_FIELD, value);
    }

    public void clickOnConnections() {
        clickElementByXpath(Const.CONNECTIONS);
    }

    public void selectParticipants() {
        clickElementByXpath(Const.PARTICIPANT1);
    }

    public void clickOnNextButton() throws Exception {
        clickElementByXpath(Const.NEXT_BUTTON);
        Thread.sleep(3000);
    }

    public void clickOnConnectionGroup() {
        clickElementByXpath(Const.CONNECTIONS_GROUP);
    }

    public void selectConnectionGroup() {
        clickElementByXpath(Const.TEST_CONNECTION_GROUP);
    }
}