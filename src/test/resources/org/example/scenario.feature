Feature: filling card
  #Позитивный сценарий
  Scenario: add item to card
    Given url of skill_factory 'https://skillfactory.ru/'
    Then click on first
    And  add to data Science
    Then click add button
    Then click add data Science
    Then click add button 'Програмирование'
    Then click on button 'Тестирование'
    Then click on Postman
    Then click on chapter 'Тестировщик-автоматизатор на Phyton'
    Then click on word 'Все онлайн курсы'
    Then click on chapter 2 'Backend-разработка'
    Then click on Kotlin
    Then click on chapter 3 'Android-разработчик'
    Then click on word 2 'Все онлайн курсы'
    Then click on chapter 4 'Безопасность'
    Then click on chapter 5 'Белый хакер'
    Then click on word 3 'Все онлайн курсы'
    Then click on chapter 6 'Менеджемент'
    Then click on Product Manager
    Then click on word 4 'Все онлайн курсы'
