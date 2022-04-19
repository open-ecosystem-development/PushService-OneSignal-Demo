/*
      Copyright 2021. Futurewei Technologies Inc. All rights reserved.

      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at

        http:  www.apache.org/licenses/LICENSE-2.0

      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
*/


package com.hms.testonesignal;

import android.app.Application;
import android.util.Log;

import com.onesignal.OSDeviceState;
import com.onesignal.OneSignal;

public class TestOneSignal extends Application {

    private static final String ONE_SIGNAL = "OneSignal";
    private static final String ONESIGNAL_APP_ID = "########-####-####-####-############";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

        // Set userId based on application data
        String externalUserId = "12345";
        OneSignal.setExternalUserId(externalUserId);


        // Send some tags & triggers
        OneSignal.sendTag("user_name", "TestUser");
        OneSignal.addTrigger("location_prompt", "true");

        // Display Device State
        OSDeviceState device = OneSignal.getDeviceState();
        Log.d(ONE_SIGNAL, "User ID "+ device.getUserId());
        Log.d(ONE_SIGNAL, "Push Token "+ device.getPushToken());
        Log.d(ONE_SIGNAL, "Is subscribed "+ device.isSubscribed());



    }
}
