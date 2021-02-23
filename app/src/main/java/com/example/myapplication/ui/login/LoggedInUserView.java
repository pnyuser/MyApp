package com.example.myapplication.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    private String displayName1;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName1 = displayName;
    }

    String getDisplayName1() {
        return displayName1;
    }
}