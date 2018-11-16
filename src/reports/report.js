$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TECH-W112/IdeaProjects/AutomationPracticeProject/src/test/resources/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "User login",
  "description": "as I user\r\nI want to be able to sign up\r\nand login to test site",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "If I input incorrect password details I will receive the correct error message",
  "description": "",
  "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I input a valid email address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I input an invalid \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I receive the corresponding error \u003cerror\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;",
  "rows": [
    {
      "cells": [
        "password",
        "error"
      ],
      "line": 15,
      "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;1"
    },
    {
      "cells": [
        "a@34567",
        "Error Message."
      ],
      "line": 16,
      "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;2"
    },
    {
      "cells": [
        "abcd1234",
        "Error Message."
      ],
      "line": 17,
      "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;3"
    },
    {
      "cells": [
        "abcdefgh",
        "Error Message."
      ],
      "line": 18,
      "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;4"
    },
    {
      "cells": [
        "1234567834234323",
        "Error Message."
      ],
      "line": 19,
      "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "If I input incorrect password details I will receive the correct error message",
  "description": "",
  "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I input a valid email address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I input an invalid a@34567",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I receive the corresponding error Error Message.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep_Defs.i_am_on_the_Sign_in_page()"
});
formatter.result({
  "duration": 6727792107,
  "status": "passed"
});
formatter.match({
  "location": "loginStep_Defs.i_input_a_valid_email_address()"
});
formatter.result({
  "duration": 184603081,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a@34567",
      "offset": 19
    }
  ],
  "location": "loginStep_Defs.i_input_an_invalid_(String)"
});
formatter.result({
  "duration": 2181983803,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error Message.",
      "offset": 34
    }
  ],
  "location": "loginStep_Defs.iReceiveTheCorrespondingErrorError(String)"
});
formatter.result({
  "duration": 851585405,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "If I input incorrect password details I will receive the correct error message",
  "description": "",
  "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I input a valid email address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I input an invalid abcd1234",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I receive the corresponding error Error Message.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep_Defs.i_am_on_the_Sign_in_page()"
});
formatter.result({
  "duration": 5405918354,
  "status": "passed"
});
formatter.match({
  "location": "loginStep_Defs.i_input_a_valid_email_address()"
});
formatter.result({
  "duration": 236562745,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 19
    }
  ],
  "location": "loginStep_Defs.i_input_an_invalid_(String)"
});
formatter.result({
  "duration": 1205919034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error Message.",
      "offset": 34
    }
  ],
  "location": "loginStep_Defs.iReceiveTheCorrespondingErrorError(String)"
});
formatter.result({
  "duration": 929252665,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "If I input incorrect password details I will receive the correct error message",
  "description": "",
  "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I input a valid email address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I input an invalid abcdefgh",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I receive the corresponding error Error Message.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep_Defs.i_am_on_the_Sign_in_page()"
});
formatter.result({
  "duration": 6451450081,
  "status": "passed"
});
formatter.match({
  "location": "loginStep_Defs.i_input_a_valid_email_address()"
});
formatter.result({
  "duration": 206172768,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcdefgh",
      "offset": 19
    }
  ],
  "location": "loginStep_Defs.i_input_an_invalid_(String)"
});
formatter.result({
  "duration": 1107327750,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error Message.",
      "offset": 34
    }
  ],
  "location": "loginStep_Defs.iReceiveTheCorrespondingErrorError(String)"
});
formatter.result({
  "duration": 860564280,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "If I input incorrect password details I will receive the correct error message",
  "description": "",
  "id": "user-login;if-i-input-incorrect-password-details-i-will-receive-the-correct-error-message;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I input a valid email address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I input an invalid 1234567834234323",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I receive the corresponding error Error Message.",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep_Defs.i_am_on_the_Sign_in_page()"
});
formatter.result({
  "duration": 5614632620,
  "status": "passed"
});
formatter.match({
  "location": "loginStep_Defs.i_input_a_valid_email_address()"
});
formatter.result({
  "duration": 207995728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567834234323",
      "offset": 19
    }
  ],
  "location": "loginStep_Defs.i_input_an_invalid_(String)"
});
formatter.result({
  "duration": 1186996944,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error Message.",
      "offset": 34
    }
  ],
  "location": "loginStep_Defs.iReceiveTheCorrespondingErrorError(String)"
});
formatter.result({
  "duration": 885892784,
  "status": "passed"
});
});