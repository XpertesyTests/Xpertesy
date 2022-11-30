package Pages;

import Constants.Const;

public class UpcomingSessionPage extends BasePage {

    public boolean isUpcomingSessionHeaderVisible() {
        return elementExist(Const.SESSION_HEADER);
    }
}