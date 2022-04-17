# Heading
Feature: Login page scenarios
Background:
 Given Login into facebook url

 #@Smoke
 # Scenario: Correct User name and Correct password
    # test steps
   # Given Login into facebook url
   # When Enter the username "poiuyt"
   # And Enter the pass word "lkjhg"
    #And click the loginbutton
    # Expected value
   # Then Validate the errormessage "status"

 # @Smoke
  #Scenario Outline: Validate the username and password
  #  Given Login into facebook url
  #  When Enter the user name <"Username">
  #  And Enter the password <"Password">
  #  And click the login button
  #  Then Validate the error message <"status">

   # Examples: 
   #   | Username | Password | status           |
   #   | test1    | werty    | invalid data     |
   #   | test2    | ghjhjk   | invalid password |
   
    #datatable concept asList()
  #  @smoke
  # Scenario: Correct User name and incorrect password
    # test steps
  #  Given Login into facebook url
  #  When Enter the user name
  #  |name|test2@gmail|tamil|
  #  And Enter the password "password testdata"
 #   And click the login button
    # Expected value
 #   Then Validate the error message "Invalid Password"
    
    #datatable concept asLists()
    #  @smoke
 # Scenario: Correct User name and incorrect password
   # Given Login into facebook url
  #  When Enter the user name
  #  |name|mail|
  #  |Aiite|test1|
  #  |tech|test2|
  #  And Enter the password "password testdata"
  #  And click the login button
    # Expected value
  #  Then Validate the error message "Invalid Password"
    
     #datatable concept asMap()
      #  @smoke
    #Scenario: Correct User name and incorrect password
    #  Given Login into facebook url
     # When Enter the user name
     # |name1|Yuvaraj1|
     # |name2|Yuvaraj2|
     # And Enter the password "password testdata"
     # And click the login button
     # Then Validate the error message "Invalid Password"
    
    #datatable concept asMaps()
    @smoke
  Scenario: Correct User name and incorrect password
    Given Login into facebook url
    When Enter the user name
    |name1|Yuvaraj1|Yuvaraj2|
    |name2|Yuvaraj3|Yuvaraj4|
    |name3|Yuvaraj5|Yuvaraj6|
    And Enter the password "password testdata"
    And click the login button
    Then Validate the error message "Invalid Password"
      
      
      
      
