package Pages;

import Constants.Const;

public class ContactUsPage extends BasePage {


    public boolean isContactUsPageOpened() {
        return elementExist(Const.CONTACT_US_HEADER);
    }
}
