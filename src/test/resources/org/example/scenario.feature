Feature: filling card
  #Позитивный сценарий
  Scenario: add item to card
    Given url of ozon 'https://www.ozon.ru/'
    Then start search 'футболка'
    Then click on first
    And  add to cart
    Then click add button
