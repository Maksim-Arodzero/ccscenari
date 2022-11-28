Feature: filling card
  #Позитивный сценарий
  Scenario: add item to card
    Given url of skill_factory 'https://skillfactory.ru/'
    Then click on first
    And  add to data Science
    Then click add button
    Then click add data Science
    Then click add button 'Програмирование'
