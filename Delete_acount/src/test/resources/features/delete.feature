Feature: Registro y eliminacion de la cuenta

  Scenario: Usuario se registra, inicia sesión y elimina su cuenta
    Given el usuario abre la página de Automation Exercise
    When el se registra con datos válidos
    And cierra sesión
    And inicia sesión con las mismas credenciales
    Then debería ver que el login fue exitoso
    When elimina la cuenta
    Then debería ver el mensaje "ACCOUNT DELETED!"