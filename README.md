## Ekam Template

Ekam, a test automation platform, helps you to quickly get started with WEB | MOBILE | API.

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

## Get Started

Install `ekam-cli` npm package.

```$bash
npm install -g ekam-cli
 ```

or

```$bash
yarn add -g ekam-cli
```

### Create New Project

Go to the folder where you want to create a new ekam project and run below command

```$bash
ekam create -n <project_name>
 ```

If you want to create a project using path, use below command

```$bash
ekam create -p <path/to/project> -n <project_name>
 ```

### Template Structure

```
sample_project/
+-- build.gradle
+-- app //Store Application Under Test for Android or Ios platforms.
    +-- <android>.apk
    +-- <ios>.app
    +-- <ios>.ipa
+-- config //test run configuration
    +-- default.properties
    +-- mobile.remote.properties
    +-- web.remote.properties
+-- src/test
    +-- java
    ¦   +-- api 
    ¦   ¦ +-- ApiExampleTest.java 
    ¦   +-- mobile 
    ¦   ¦ +-- MobileExampleTest.java
    ¦   +-- web 
    ¦   ¦ +-- WebExampleTest.java
    +-- resources
    ¦   +-- cloud_config
    ¦   ¦ +-- browserstack.json
    ¦   +-- mobilefeed.json
    ¦   +-- webfeed.json
```

Follow below quick start guides.

## Quick Start Guides

* [Web](docs/quickstartguides/web.md)
* [Mobile](docs/quickstartguides/mobile.md)
* [Api](docs/quickstartguides/api.md)

## Examples

[Ekam Examples](https://gitlab.com/testvagrant/automation-studio/ekam-studio/ekam-examples)

## Issue Tracker

[Ekam Issues](https://gitlab.com/testvagrant/automation-studio/issues-studio/ekam-beta/-/issues)

## Developers

* [Sudarshan GS](sudarshan@testvagrant.com)
* [Krishnanand](krishnanand@testvagrant.com)



