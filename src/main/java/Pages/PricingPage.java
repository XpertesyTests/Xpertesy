package Pages;

import Constants.Const;

public class PricingPage extends BasePage{


    public boolean isPricingPageOpened(){
        return elementExist(Const.PRICING_PLANS_HEADER);
    }
}
