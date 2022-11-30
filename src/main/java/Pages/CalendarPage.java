package Pages;

import Constants.Const;

public class CalendarPage extends BasePage {


    public boolean isTodayButtonVisible() {
        return elementExist(Const.TODAY_BUTTON);
    }
}