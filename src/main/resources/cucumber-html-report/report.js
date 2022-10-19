$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the login functionality of kavida application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validte the login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in kavida login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_kavida_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should enter firstname, email and jobtitle",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_should_enter_firstname_email_and_jobtitle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the start tour button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_should_click_the_start_tour_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user open the Control Tower Action",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_open_the_Control_Tower_Action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the Threats \u0026 Alert",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_see_the_Threats_Alert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the Order TimeLine Action",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_click_the_Order_TimeLine_Action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the Communication Hub",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_click_the_Communication_Hub()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Compose an Email",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.click_the_Compose_an_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should The Add Shipping Information",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_The_Add_Shipping_Information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user  Enter Vessel Tracking Id",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_Enter_Vessel_Tracking_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the Global Risks",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_click_the_Global_Risks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});