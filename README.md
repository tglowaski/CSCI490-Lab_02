# CSCI490-Lab_02
Lab to demonstrate building blocks and Intents

Instructions for Inclass Lab 02:


## Problem
This lab will have you creating a button that will navigate you to another activity with the choice of two images to set the background of your first activity.

## Purpose
This lab will introduce some basic features of calling an Intent to switch activities, perform an action on the sub Activity, and return a result back to the first Activity. Use of the **values** resource files will also be demonstrated.  

## Steps
### Create Views:
* Open Android Studio and create a basic project. Name the project whatever you like, **IntentDemo** is a good candidate. Choose **API 23: Android 6.0 (Marshmallow)**. Next choose just an **Empty Activity**.
* Place the two (2) images from Github into your **drawable** folder.
* Create a Button at the bottom of **activity_main.xml**. Name the button "Set Background" (Be sure to use strings.xml)
* Create another Activity class and associated layout. Name them whatever you would like.
* In second layout file, create two (2) ImageView widgets. You can use whatever Layout you desire, but ContstraintLayout works just fine. 
* Link each ImageView with one of the images as shown in the screenshot.png and position/size the ImageView widgets.

### Launch Second Activity
* 
* Replace all of the XML inside of res/layout/activity_main.xml with code from the view.xml file in the lab repository.
* Create a virtual device (or use a real device if you are able) to run the lab on. This virtual device will need to have API 23 or greater.
* AFter you have code running on a device properly, refactor "hard coded" strings to be read from res/values/strings.xml
* Share, commit, and push lab to your GitHub account
