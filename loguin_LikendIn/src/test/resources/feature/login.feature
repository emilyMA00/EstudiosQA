Feature: Login en linkedin

  Scenario: Login exitoso con credenciales validas
    Given que emily ingresa a linkedin
    And las credenciales son validas
    When cuando intenta acceder a su cuenta en linkedin
    Then deberia aparecer su feed de linkendin