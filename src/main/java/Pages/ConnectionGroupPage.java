package Pages;

import Constants.Const;

public class ConnectionGroupPage extends BasePage {


    public boolean isCreateButtonVisible() {
        return elementExist(Const.CREATE_BUTTON);
    }

    public void clickOnCreateButton() {
        clickElementByXpath(Const.CREATE_BUTTON);
    }

    public boolean isCreateNewGroupTextVisible() {
        return elementExist(Const.CREATE_NEW_GROUP_HEADER);
    }

    public void enterGroupName(String name) {
        sendTextToElementByXpath(Const.CREATE_NEW_GROUP_INPUT_FIELD, name);
    }

    public boolean isNameEntered(String name) {
        return sameValue(Const.CREATE_NEW_GROUP_INPUT_FIELD, name);
    }

    public void selectGroupMembers() {
        clickElementByXpath(Const.PARTICIPANT1);
    }

    public void clickOnCreateGroupButton() {
        clickElementByXpath(Const.CREATE_GROUP_BUTTON);
    }

    public void clickOnCloseButton() {
        clickElementByXpath(Const.YOUR_CONNECTION_GROUP_CREATED_NOTIFICATION_CLOSE_BUTTON);
    }
}