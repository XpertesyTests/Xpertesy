package PopUpWindows;

import Constants.Const;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPassWindow extends BasePage {


    public boolean isForgotPasswordWindowOpened() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Const.FORGOT_PASSWORD_TEXT)));
        return elementExist(Const.FORGOT_PASSWORD_HEADER);

    }

    public void clickOnSendButton() {
        clickElementByXpath(Const.SEND_BUTTON);
    }

    public boolean isForgotMessageSent() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Const.ALMOST_THERE_HEADER)));
        return elementExist(Const.ALMOST_THERE_NOTIFICATION);
    }

    public void closeAlmostThereNotification() {
        clickElementByXpath(Const.ALMOST_THERE_NOTIFICATION_CLOSE_BUTTON);
    }

    public boolean isAlmostThereNotificationClosed() {
        return elementExist(Const.GET_STARTED_BUTTON);
    }

    public void clickOnBackToLoginButton() {
        clickElementByXpath(Const.BACK_LOGIN_BUTTON);
    }

}
