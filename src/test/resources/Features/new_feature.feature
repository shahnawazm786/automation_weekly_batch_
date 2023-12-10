@new_feature
Feature: New Feature
  @newfeature
  Scenario Outline: New feature testing
    Given I am verifying the user "<username>"

    Examples:
    |username|
    |KAZ|
    |Coding Maktab|
    |Mohammad     |
  @second
    Scenario: Second new feature
      Given I am going to verify password "<password>"
        |KAZ@123|
      |KAZ@2023|
      |KAZ1999#|
@Third
Scenario: Correct non-zero number of books found by author
  Given I have the following books in the store
    | The Devil in the White City          | Erik Larson |
    | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
    | In the Garden of Beasts              | Erik Larson |
  When I search for books by author Erik Larson
  Then I find 2 books
  And  The price is 2.89
