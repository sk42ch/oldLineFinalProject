$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 9181559898,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.iAmOnHomePage()"
});
formatter.result({
  "duration": 576153555,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Verify signup btton",
  "description": "",
  "id": "login-feature;verify-signup-btton",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@login-4"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "I enter Mohammad into firstname text fields on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "I enter Muntakim into lastname text fields on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I verify that signup button is disable at homepage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Mohammad",
      "offset": 8
    },
    {
      "val": "firstname",
      "offset": 22
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 341524519,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Muntakim",
      "offset": 8
    },
    {
      "val": "lastname",
      "offset": 22
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 230910762,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.verifyDisableSignupButton()"
});
formatter.result({
  "duration": 47479514,
  "error_message": "java.lang.AssertionError: Signup button should be disable expected [false] but found [true]\n\tat org.testng.Assert.fail(Assert.java:93)\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\n\tat org.testng.Assert.assertFalse(Assert.java:62)\n\tat stepdefinition.LoginSD.verifyDisableSignupButton(LoginSD.java:73)\n\tat ✽.Then I verify that signup button is disable at homepage(login.feature:39)\n",
  "status": "failed"
});
formatter.after({
  "duration": 194074182,
  "status": "passed"
});
});