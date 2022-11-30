package Pages;

import Constants.Const;

public class DashboardPage extends BasePage {

    public boolean isDashboardHeaderVisible() {
        return elementExist(Const.DASHBOARD_PAGE_HEADER);
    }
}
