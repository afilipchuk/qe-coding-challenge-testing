@feature-github-repos
Feature: As a user, I want to be able to search repositories in github

  @test-github-repos-1
  Scenario Outline: Verify page components and displayed "Github user not found" error message when user enters invalid search criteria(clicking "Go" button)
    Given I am on the dashboard page
    And I type into search field "<repo>"
    When I click go button
    Then I verify no user found error message

    Examples:
      | repo             |
      |                  |
      | iinnccoorreecctt |

  @test-github-repos-2
  Scenario Outline: Verify page components and displayed "Github user not found" error message when user enters invalid search criteria(pressing Enter key)
    Given I am on the dashboard page
    And I type into search field "<repo>"
    When I press Enter key
    Then I verify no user found error message

    Examples:
      | repo             |
      |                  |
      | iinnccoorreecctt |

  @test-github-repos-3
  Scenario Outline: Verify a "Success" message pops up when pressing Enter key
    Given I am on the dashboard page
    And I type into search field "<repo>"
    And I press Enter key
    Then I verify successful message
    Then I verify found repositories

    Examples:
      | repo  |
      | luke  |
      | allan |

  @test-github-repos-4
  Scenario Outline: Verify a "Success" message pops up when clicking "Go" button
    Given I am on the dashboard page
    And I type into search field "<repo>"
    When I click go button
    Then I verify successful message

    Examples:
      | repo |
      | luke  |
      | allan |

  @test-github-repos-5
  Scenario Outline: Verify github urls after clicking on all found repository links
    Given I am on the dashboard page
    And I type into search field "<repo>"
    And I click go button
    When I verify found repositories
    Then I verify github urls

    Examples:
      | repo |
      | luke |

  @test-github-repos-6
  Scenario Outline: Verify description of each github repository
    Given I am on the dashboard page
    And I type into search field "<repo>"
    When I click go button
    Then I verify description of each github repository

    Examples:
      | repo |
      | luke |