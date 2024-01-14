Feature: Test Guru99 Application

  Scenario: validate Guru99 register page functionality
    Given user is on home page

    When Enter details firstName and lastName
      | Harshada | Barawkar |

  Scenario Outline: validate Guru99 Adress page functionality
    When Enter details "<Address>" and "<City>"

    Examples: 
      | Address | City |
      | Kedgaon | Pune |

  Scenario: validate Guru99 username page functionality
    When Enter details userName and password
      | userName     | password     |
      | Harshada@123 | Barawkar@123 |
