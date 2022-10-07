## Ekam Template

[Ekam](https://ekam.studio/), A Rapid Test Development Platform. It is a low-code & unified test automation solution, that brings speed, scale, and sophistication, right out of the box! Powered by Selenium, Appium & Retrofit. Ekam enables engineering teams to focus on delivering great software, while it provides accelerated test authoring and execution capabilities!

## Get Started
1. Clone this repository
2. If you are using IntelliJ IDEA, install [Ekam plugin for IntelliJ IDEA](https://plugins.jetbrains.com/plugin/17315-ekam) to further boost test case authoring.
3. Execute example tests in IDE & from command line
4. Start building your own tests !!

Our <a href="https://ekam.studio/quick-start/" target="_blank">quick start guide</a> would help you get started with Ekam in no time.

## Documentation
Our <a href="https://ekam.studio/" target="_blank">Comprehensive Documentation</a>, describes various capabilities of ekam.

## Prerequisites

+ #### Common
    * <a href="https://www.oracle.com/in/java/technologies/javase-jdk11-downloads.html" target="_blank">Java11</a>

+ #### Mobile Automation
    * <a href="https://nodejs.org/en/download/" target="_blank">Node</a>
    * <a href="https://appium.io/docs/en/about-appium/getting-started/?lang=en" target="_blank">Appium</a>
    * <a href="https://developer.android.com/studio" target="_blank">Android SDK</a>
    * <a href="https://developer.apple.com/xcode/" target="_blank">XCode</a>
    * <a href="https://github.com/Carthage/Carthage#quick-start" target="_blank">Carthage</a>
    * <a href="https://www.docker.com/products/docker-desktop" target="_blank">Docker</a>

+ #### Web Automation
    * <a href="https://www.google.com/intl/en_in/chrome/" target="_blank">Chrome</a>
    * <a href="https://www.mozilla.org/en-US/firefox/new/" target="_blank">Firefox</a>
    * <a href="https://www.microsoft.com/en-us/edge" target="_blank">Edge</a>

### Template Structure

```
sample_project/
+-- build.gradle
+-- app //Store Application Under Test for Android or Ios platforms.
    +-- sample_app.apk
    +-- <android>.apk
    +-- <ios>.app
    +-- <ios>.ipa
+-- config //test run configuration
    +-- default.properties
    +-- mobile.remote.properties
    +-- web.remote.properties
+-- src/test
    +-- java/ekam/example
    ¦   +-- api 
    ¦   ¦ +-- ApiExampleTest.java 
    ¦   +-- mobile 
    ¦   ¦ +-- screens
    ¦   ¦ +-- MobileExampleTest.java
    ¦   +-- web 
    ¦   ¦ +-- pages
    ¦   ¦ +-- WebExampleTest.java
    +-- resources
    ¦   +-- api
    ¦   ¦ +-- hosts.json
    ¦   +-- cloud_config
    ¦   ¦ +-- browserstack.json
    ¦   +-- data_sets
    ¦   ¦ +-- sample.json
    ¦   +-- db
    ¦   ¦ +-- drivers.yml
    ¦   +-- mobile
    ¦   ¦ +-- mobilefeed.json
    ¦   +-- web
    ¦   ¦ +-- webfeed.json
    ¦   +-- allure.properties

```

## Examples

[Ekam Examples](https://gitlab.com/testvagrant/automation-studio/ekam-studio/ekam-examples)

## Issue Tracker

[Ekam Issues](https://gitlab.com/testvagrant/automation-studio/issues-studio/ekam-beta/-/issues)

## Developers

* [Sudarshan GS](sudarshan@testvagrant.com)
* [Krishnanand](krishnanand@testvagrant.com)



