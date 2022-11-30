package Pages;

import Constants.Const;

public class SettingsPage extends BasePage {

    public boolean isSettingsHeaderVisible() {
        return elementExist(Const.SETTINGS_HEADER);
    }
}
