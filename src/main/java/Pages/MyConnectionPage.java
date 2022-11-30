package Pages;

import Constants.Const;

public class MyConnectionPage extends BasePage {


    public boolean isInviteButtonVisible() {
        return elementExist(Const.INVITE_BUTTON);
    }

    public void clickOnInviteButton() {
        clickElementByXpath(Const.INVITE_BUTTON);
    }

    public boolean isSuccessTextVisible() throws Exception {
        Thread.sleep(2000);
        return elementExist(Const.SUCCESS_TEXT);
    }
}
