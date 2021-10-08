# OneSignal Push Service integration

## Table of Contents
 * [Introduction](#introduction)
 * [Getting Started](#getting-started)
 * [Sending PUSH message](#sending-push-message)
 * [License](#license) 
 * [Question](#question) 
 

## Introduction
This app demonstrates integration of OneSignal Push service through Huawei Push messaging service.

## Getting Started
1. Create OneSignal account from https://onesignal.com/ 
2. Create Huawei developer account. Develop Android app and add app details in Huawei App Gallery Connect by creating an app.
3. Enable Huawei Push kit in your app from Huawei App Gallery Connect. Add Huawei configuration - agconnect-services.json file in your Android Studio project.
   Generate a Signing Certificate Fingerprint.
   https://developer.huawei.com/consumer/en/doc/distribution/app/agc-help-enabling-service-0000001146598793
4. Add Huawei Gradle plugin and dependencies. Add OneSignal dependency. Sync gradle.
5. Create a class that extends from HmsMessageService and add methods as per demo app.
6. Run and test your app on Huawei device to make sure your device is subscribed to notifications as a Huawei device and can receive notifications sent from the 
   OneSignal dashboard.
8. Manage your users, messages, audience through OneSignal dashboard.


## Sending PUSH message
Refer the link https://documentation.onesignal.com/docs/sending-notifications to send push notifications from the OneSignal Dashboard and for API details.  
You can send notification message, data message, in-app message, A/B tests, automated message for selected audience by creating segments.

## License
This sample code for android is licensed under the [Apache License, version 2.0.](http://www.apache.org/licenses/LICENSE-2.0)

## Question
If you have a question 
- [Stack Overflow](https://stackoverflow.com/questions/tagged/huawei-mobile-services) is the best place for any programming questions. 
  Be sure to tag your question with `huawei-mobile-services`.

