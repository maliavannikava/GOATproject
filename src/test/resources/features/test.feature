Feature: languages

  Scenario: As an admin user should be able to add different languages in qualifications
  Given user is logged in as an admin
  And iser navigates to Admin
  And user navigates to Qualifications
  And user clicks on Languages
  And user clicks on Add
  And user enters language and clicks save button
  Then user sees added language
  
  
  Scenario: As an admin user should be able to add any available languages to any employee by specifying  Language, Fluency, Competency
    Given user is logged in as an admin
    When user navigates to employee list
    And user creates new employee
    And user navigates to qualifications
    And user chooses language, fluency and competency
      | language    | fluency  | competency    |
      | Abrakadabra | Reading  | Basic         |
      | Russian     | Writing  | Mother Tongue |
      | English     | Speaking | Good          |
    Then user sees saved language
