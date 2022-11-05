Feature: Calculate the insurance primer for a customer 1
Scenario: The costumer with age 50, female,married and drivers license with expire date of  2026/10/19
Given is female and married
When I Calculate the premium
Then The premium must be 200

Feature: Calculate the insurance primer for a customer 2
Scenario: The costumer with age 28, male,not married and drivers license with expire date of   2023/07/09
Given is male and not married 
When I Calculate the premium
Then The premium must be 500

Feature: Calculate the insurance primer for a customer 3
Scenario: The costumer with age 83, female,married and drivers license with expire date of  2026/10/19
Given is 83 years old
When I Calculate the premium
Then The premium must be -1

Feature: Calculate the insurance primer for a customer 4
Scenario: The costumer with age 67 , female,not married and drivers license with expire date of  2015/01/24
Given has invalid drivers license
When I Calculate the premium
Then The premium must be -1

Feature: Calculate the insurance primer for a customer 5
Scenario: The costumer with age 17, male ,not married and drivers license with expire date of  2024/07/09
Given is underage
When I Calculate the premium
Then The premium must be -1


Scenario Outline: Costumer enters the store
Given the costumer is "<sex>", marital status is "<maritalStatus>", age is "<age>" and drivers license with expire date of "<drivingLicense>"
When I calculate de insurance premium
Then the premium is $ "<insurance premium>"

Examples:
| sex | mStatus | age | answer |
| female | married | 50 | 200 |
| male | notmarried | 28 | 500 |
| male | notmarried | 17 | -1 |
| female | married | 67 | -1 |


