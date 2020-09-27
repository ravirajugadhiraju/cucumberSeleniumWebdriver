$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/search.feature");
formatter.feature({
  "name": "search and place order for Vegetabels",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search for items and validte results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "user is on greencart landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "user serarched for \u003cveg\u003e vegetable",
  "keyword": "When "
});
formatter.step({
  "name": "\u003cveg\u003e results1 are displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "add vestible to cart",
  "keyword": "And "
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "veg"
      ]
    },
    {
      "cells": [
        "Cucumber"
      ]
    },
    {
      "cells": [
        "Brinjal"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for items and validte results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "user is on greencart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user serarched for Cucumber vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDefinitions.user_serarched_for_vegetable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cucumber results1 are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.results1_are_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add vestible to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.add_vestible_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and validte results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "user is on greencart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user serarched for Brinjal vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDefinitions.user_serarched_for_vegetable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Brinjal results1 are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.results1_are_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add vestible to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.add_vestible_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});