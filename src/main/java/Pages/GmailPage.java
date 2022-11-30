package Pages;

import Constants.Const;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GmailPage extends BasePage {

    public boolean isGmailHeaderVisible() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Const.CREATE_ACC)));
        return elementExist(Const.GMAIL_HEADER);
    }





}