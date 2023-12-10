@scenariooutline
Feature: Login features with scenario outline
  Scenario Outline: Provide Login Data
    Given open the browser
    When i am giving "<username>" and "<password>"
    And i click on login button
    Then i direct to the user dashboard
    And i check the "<dashboardname>"
    And  i login <counter> times

    Examples:
    |username||password||dashboardname||counter|
    |KAZ||KAZ123|       |user|         |   2|
    |ZAID   ||      |   |supervisor|   |   5|
    |       ||ZAID|     |administrator||   7|
    |ZAKIR       ||ZAID||super user|   |   9|

@bookprice
  Scenario Outline: Books price
  Given i have books "<name>"
    And bookprice is <price>
    When bookpage is <page>
    Then publisher is "<publisher>"
    And error message is "<errormessage>"
    Examples:
    |name||price||page||publisher||errormessage|
    |    JAVa|| 500.90||250||    Sun Micro System||Invalid publisher|
    |    Oracle|| 1500.90||450||    Oracle System||Valid publisher|

  @dtexample
  Scenario: Table example in cucumber
    Given book details example
    |Oralce|Oracle Corporation|350|500.99|
    |Java|Java Corporation|350|500.99|
    |Python|Python Corporation|350|500.99|
    |Ruby|Ruby Corporation|350|500.99|
    |React|React Corporation|350|500.99|