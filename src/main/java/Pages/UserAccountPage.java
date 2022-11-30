package Pages;

import Constants.Const;

public class UserAccountPage extends BasePage {


    public boolean isUserAccOpened() {
        return elementExist(Const.ACCOUNT_ICON);

    }
    public void clickOnDashboardButton() {
        clickElementByXpath(Const.DASHBOARD_OPTION);
    }

    public void clickOnMyWorkspaceButton() {
        clickElementByXpath(Const.MY_WORKSPACE_OPTION);
    }

    public void clickOnNewMeetingButton() {
        clickElementByXpath(Const.NEW_MEETING_OPTION);
    }

    public void clickOnPendingRequests() {
        clickElementByXpath(Const.PENDING_REQUESTS_OPTION);
    }

    public void clickOnMyConnections() {
        clickElementByXpath(Const.MY_CONNECTIONS_OPTION);
    }

    public void clickOnMyConnectionGroups() {
        clickElementByXpath(Const.CONNECTION_GROUP_OPTION);
    }

    public void clickOnCalendar() {
        clickElementByXpath(Const.CALENDAR_OPTION);
    }

    public void clickOnUpComingSession() {
        clickElementByXpath(Const.UPCOMING_SESSION_OPTION);
    }

    public void clickOnSettings() {
        clickElementByXpath(Const.SETTINGS_OPTION);
    }

    public void clickOnBillingButton() {
        clickElementByXpath(Const.BILLING_OPTION);
    }

    public void clickOnLogoutButton() {
        clickElementByXpath(Const.LOGOUT_OPTION);
    }

    public boolean isBusinessPageOpened() {
        return elementExist(Const.BUSINESS_PAGE_HEADER);
    }

    public void clickOnPricingButton() {
        clickElementByXpath(Const.PRICING_BUTTON);
    }

    public void clickOnContactUsButton() {
        clickElementByLinkText(Const.CONTACT_US_BUTTON);
    }

    public void clickOnHomeButton() {
        clickElementByLinkText(Const.HOME_BUTTON);
    }

    public boolean isUserAccPageReloaded() {
        return isPageReloaded(Const.HOME_BUTTON);
    }

    public void clickOnNotificationButton() {
        clickElementByXpath(Const.NOTIFICATION_BUTTON);
    }

    public boolean isNotificationsWindowOpened() {
        return elementExist(Const.NOTIFICATION_WINDOW);
    }

    public void clickOnPersonIcon() {
        clickElementByXpath(Const.PERSON_ICON);
    }

    public boolean isUserInfoOpened() {
        return elementExist(Const.LOGOUT_OPTION);
    }

    public void clickOnXpertesyLogo() {
        clickElementByXpath(Const.XPERTESY_LOGO);
    }
}
