package com.apb.beacon.common;

import roboguice.activity.RoboFragmentActivity;

public class TestFragmentActivity extends RoboFragmentActivity{
    private boolean actionButtonEnabled;

//    @Override
//    public void enableActionButton(boolean isEnabled) {
//        this.actionButtonEnabled = isEnabled;
//    }

    public boolean isActionButtonEnabled() {
        return actionButtonEnabled;
    }
}


