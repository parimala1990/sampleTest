@test_id01

Feature: Validate sign in page after adding item to checkout

  Scenario: User checkouts summer dress and validates that he is taken to sign in page
    Given I search for product "summer dresses"
    And I add item "Printed Chiffon Dress" to the cart
    When I proceed to checkout
    Then I should be on the "Sign in" page




