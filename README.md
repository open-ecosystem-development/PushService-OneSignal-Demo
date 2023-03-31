"This Project has been archived by the owner, who is no longer providing support.  The project remains available to authorized users on a "read only" basis."

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

 **Huawei - App Gallery Connect setup**
   - Create Huawei developer account, if you don't have [from here](https://developer.huawei.com/consumer/en/). 
   - Create new project and app in App Gallery Connect [Refer](https://developer.huawei.com/consumer/en/codelab/HMSPreparation/index.html#0).   
   - Enable Huawei Push kit service in your app from Huawei App Gallery Connect [Refer](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/android-config-agc-0000001050170137).
   
 **OneSignal setup**
   - Create OneSignal account [from here](https://onesignal.com/) 
   - Configure your OneSignal App's Huawei platform settings [Refer](https://documentation.onesignal.com/docs/authorize-onesignal-to-send-huawei-push).
   
 **Android app - client side setup**
   - Use this demo code and refactor it with your new package name.
   - Go to Huawei App Gallery Connect, find your project. Go to Project Setting->General Information, in the App information, download agconnect-services.json file      and copy it to your application's root directory [Refer](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/android-integrating-sdk-0000001050040084). 
   - In your module-level build.gradle file, add your OneSignal app-id. Configure your signing information and keystore file in the signingConfig.
     Sync gradle.   
   - Run and test your app on Huawei device. 
     OneSignal automatically creates device/channel record with unique ID when user opens app for the first time.
     Make sure your device is subscribed to get notifications  and can receive notifications sent from the OneSignal dashboard.
   - Manage your users, messages, audience through OneSignal dashboard.


## Sending PUSH message
   For sending push notifications from the OneSignal Dashboard and API details, [Refer](https://documentation.onesignal.com/docs/sending-notifications).  
   You can send notification message, data message, in-app message, A/B tests, automated message for selected audience by creating segments.

## License
This sample code for android is licensed under the [Apache License, version 2.0.](http://www.apache.org/licenses/LICENSE-2.0)

## Question
If you have a question 
- [Stack Overflow](https://stackoverflow.com/questions/tagged/huawei-mobile-services) is the best place for any programming questions. 
  Be sure to tag your question with `huawei-mobile-services`.

