package Pages;
import Constants.Const;

public class BillingPage extends BasePage {


    public boolean isBillingHeaderVisible() {
        return elementExist(Const.BILLING_HEADER);
    }
}