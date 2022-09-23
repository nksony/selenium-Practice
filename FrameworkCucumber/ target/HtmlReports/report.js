$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/appFeature/faceBooklogin.feature");
formatter.feature({
  "name": "Test login functionality of facebook page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check ogin functionality with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.GoogleSearchSteps.browser_is_open()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 103\nCurrent browser version is 105.0.5195.102 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\n  (Driver info: chromedriver\u003d103.0.5060.53 (a1711811edd74ff1cf2150f36ffa3b0dae40b17f-refs/branch-heads/5060@{#853}),platform\u003dWindows NT 10.0.19044 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 3.21 seconds\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027DESKTOP-CRP4OM8\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:242)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:128)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:170)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:159)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat stepDefination.GoogleSearchSteps.browser_is_open(GoogleSearchSteps.java:22)\r\n\tat ✽.Browser is open(file:///F:/SELENIUM/ADACTIN/FrameworkCucumber/src/test/java/appFeature/faceBooklogin.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User is on facebook login page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enter valid username and password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click on login  button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User is navigate to facebook home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:src/test/java/appFeature/googleSearch.feature");
formatter.feature({
  "name": "Feature to test Google search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Google serch functionality is working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.GoogleSearchSteps.browser_is_open()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 103\nCurrent browser version is 105.0.5195.102 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\n  (Driver info: chromedriver\u003d103.0.5060.53 (a1711811edd74ff1cf2150f36ffa3b0dae40b17f-refs/branch-heads/5060@{#853}),platform\u003dWindows NT 10.0.19044 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.38 seconds\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027DESKTOP-CRP4OM8\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:242)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:128)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:170)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:159)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat stepDefination.GoogleSearchSteps.browser_is_open(GoogleSearchSteps.java:22)\r\n\tat ✽.Browser is open(file:///F:/SELENIUM/ADACTIN/FrameworkCucumber/src/test/java/appFeature/googleSearch.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User is on Google search page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.GoogleSearchSteps.user_is_on_Google_search_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter a text on search box",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.GoogleSearchSteps.user_enter_a_text_on_search_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "hits enter button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.GoogleSearchSteps.hits_enter_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is navigate to search result",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.GoogleSearchSteps.user_is_navigate_to_search_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/java/appFeature/loginDemo.feature");
formatter.feature({
  "name": "Test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the \u003cusername\u003e and\u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user click on login botton",
  "keyword": "And "
});
formatter.step({
  "name": "user is navigated to login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ]
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ]
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.GoogleSearchSteps.browser_is_open()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 103\nCurrent browser version is 105.0.5195.102 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\n  (Driver info: chromedriver\u003d103.0.5060.53 (a1711811edd74ff1cf2150f36ffa3b0dae40b17f-refs/branch-heads/5060@{#853}),platform\u003dWindows NT 10.0.19044 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.64 seconds\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027DESKTOP-CRP4OM8\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:242)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:128)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:170)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:159)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat stepDefination.GoogleSearchSteps.browser_is_open(GoogleSearchSteps.java:22)\r\n\tat ✽.Browser is open(file:///F:/SELENIUM/ADACTIN/FrameworkCucumber/src/test/java/appFeature/loginDemo.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.LoginDemo.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the \u003cusername\u003e and\u003cpassword\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.LoginDemo.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on login botton",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.LoginDemo.user_click_on_login_botton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is navigated to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.LoginDemo.user_is_navigated_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.GoogleSearchSteps.browser_is_open()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 103\nCurrent browser version is 105.0.5195.102 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\n  (Driver info: chromedriver\u003d103.0.5060.53 (a1711811edd74ff1cf2150f36ffa3b0dae40b17f-refs/branch-heads/5060@{#853}),platform\u003dWindows NT 10.0.19044 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.38 seconds\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027DESKTOP-CRP4OM8\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:242)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:128)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:170)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:159)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat stepDefination.GoogleSearchSteps.browser_is_open(GoogleSearchSteps.java:22)\r\n\tat ✽.Browser is open(file:///F:/SELENIUM/ADACTIN/FrameworkCucumber/src/test/java/appFeature/loginDemo.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.LoginDemo.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the \u003cusername\u003e and\u003cpassword\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.LoginDemo.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on login botton",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.LoginDemo.user_click_on_login_botton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is navigated to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.LoginDemo.user_is_navigated_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/java/appFeature/search.feature");
formatter.feature({
  "name": "Feature to test Search page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check  Search on Amazon page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a search field on Amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.SearchStep.i_have_a_search_field_on_Amazon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I  search a product with name\"apple macbook pro\"and price 10000",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.SearchStep.i_search_a_product_with_name_apple_macbook_pro_and_price(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product with name\"apple macbook pro\"should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SearchStep.product_with_name_apple_macbook_pro_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});