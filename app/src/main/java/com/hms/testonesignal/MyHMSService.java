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

import android.os.Bundle;

import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.push.HmsMessageService;
import com.onesignal.OneSignalHmsEventBridge;

public class MyHMSService  extends HmsMessageService {
    public void onNewToken(String token, Bundle bundle) {
        // ...
        // Forward event on to OneSignal SDK
        OneSignalHmsEventBridge.onNewToken(this, token, bundle);
    }

    @Override
    public void onMessageReceived(RemoteMessage message) {
        // ...
        // Forward event on to OneSignal SDK
        OneSignalHmsEventBridge.onMessageReceived(this, message);
    }
}