package Pages;

import Constants.Const;

public class PendingRequestsPage extends BasePage {


    public boolean isPendingRequestsOpened() {
        return elementExist(Const.PENDING_REQUESTS_WINDOW_HEADLINE);
    }

}
