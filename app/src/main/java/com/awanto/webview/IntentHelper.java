package com.awanto.webview;

import android.content.Context;
import android.content.Intent;

import static com.awanto.webview.UriHelper.getGooglePlay;
import static com.awanto.webview.UriHelper.getAmazonAppstore;
import static com.awanto.webview.UriHelper.isPackageExists;

final class IntentHelper {

    private static final String GOOGLE_PLAY_PACKAGE_NAME = "com.android.vending";

    private IntentHelper() {
    }

    static Intent createIntentForGooglePlay(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent(Intent.ACTION_VIEW, getGooglePlay(packageName));
        if (isPackageExists(context, GOOGLE_PLAY_PACKAGE_NAME)) {
            intent.setPackage(GOOGLE_PLAY_PACKAGE_NAME);
        }
        return intent;
    }

    static Intent createIntentForAmazonAppstore(Context context) {
        String packageName = context.getPackageName();
        return new Intent(Intent.ACTION_VIEW, getAmazonAppstore(packageName));
    }

}
