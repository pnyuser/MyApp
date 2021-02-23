package com.example.myapplication.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    private String displayname1;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayname1 = displayName;
    }

    String getDisplayname1() {
        return displayname1;
    }
}