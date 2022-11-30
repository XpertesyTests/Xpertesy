package Pages;

import Constants.Const;

public class MyWorkspacePage extends BasePage {


    public boolean isJoinSessionWindowOpened() {
        return elementExist(Const.JOIN_SESSION_BUTTON);
    }

    public void clickOnPlaceHolderButton() {
        clickElementByXpath(Const.PLACEHOLDER_BUTTON);
    }

    public void clickOnSettingsButton() {
        clickElementByXpath(Const.SETTINGS_BUTTON);
    }

    public boolean isVolumeControlVisible() {
        return elementExist(Const.VOLUME_CONTROL);
    }

    public void clickVolumeSlider() {
        moveVolumeSlider(Const.VOLUME_CONTROL);
    }

    public void clickOnAudioOnlyOption() {
        moveVolumeSlider(Const.AUDIO_ONLY_OPTION);
    }

    public void clickOnAudioAndVideoOption() {
        moveVolumeSlider(Const.AUDIO_AND_VIDEO_OPTION);
    }

    public void clickOnMuteAllOption() {
        moveVolumeSlider(Const.MUTE_ALL_OPTION);
    }

    public void clickOnSkipPreviewDialog() {
        clickElementByXpath(Const.SKIP_PREVIEW_DIALOG_CHECK_BOX);
    }

    public boolean isSkipPreviewDialogChecked() {
        return checkedBox(Const.SKIP_PREVIEW_DIALOG_CHECK_BOX);
    }

    public void clickOnSwitchButton() {
        clickElementByXpath(Const.DUO_CAMERA_SWITCH_BUTTON);
    }

    public void clickOnJoinSessionButton() {
        clickElementByXpath(Const.JOIN_SESSION_BUTTON);
    }

    public boolean isMyWorkspaceSessionPageOpened() {
        return elementExist(Const.MY_WORKSPACE_SESSION_TITLE);
    }
}
