package com.hms.testonesignal;

import android.app.Application;
import android.util.Log;

import com.onesignal.OSPermissionSubscriptionState;
import com.onesignal.OneSignal;

public class TestOneSignal extends Application {
    private static final String ONESIGNAL_APP_ID = "2f1d8e40-0328-44b6-962a-33b776368e6e";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
      // OneSignal.setAppId(ONESIGNAL_APP_ID);
        OSPermissionSubscriptionState status = OneSignal.getPermissionSubscriptionState();
        OneSignal.setSubscription(true);
        status.getPermissionStatus().getEnabled();
        status.getSubscriptionStatus().getSubscribed();
        OneSignal.sendTag("user_name", "TestUser");
        OneSignal.addTrigger("location_prompt", "true");
        Log.d("One signal", "User ID hmm "+ status.getSubscriptionStatus().getUserId());
        Log.d("One signal", "Push Token hmm "+ status.getSubscriptionStatus().getUserId());
        Log.d("One signal", "Is subscribed "+ status.getSubscriptionStatus().getSubscribed());
        String userId = OneSignal.getPermissionSubscriptionState().getSubscriptionStatus().getPushToken();
        Log.d("One signal", "User ID "+ userId);
        String pushToken = OneSignal.getPermissionSubscriptionState().getSubscriptionStatus().getPushToken();
        Log.d("One signal", "Push token "+ pushToken);


    }
}
