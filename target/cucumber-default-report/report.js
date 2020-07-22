$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "languages",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As an admin user should be able to add any available languages to any employee by specifying  Language, Fluency, Competency",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged in as an admin",
  "keyword": "Given "
});
formatter.match({
  "location": "com.goat.test.Test2.user_is_logged_in_as_an_admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to employee list",
  "keyword": "When "
});
formatter.match({
  "location": "com.goat.test.Test2.user_navigates_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates new employee",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.test.Test2.user_creates_new_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to qualifications",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.test.Test2.user_navigates_to_qualifications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user chooses language, fluency and competency",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.test.Test2.user_chooses_language_fluency_and_competency(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees saved language",
  "keyword": "Then "
});
formatter.match({
  "location": "com.goat.test.Test2.user_sees_saved_language()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "As an admin user should be able to add any available languages to any employee by specifying  Language, Fluency, Competency");
formatter.after({
  "status": "passed"
});
});