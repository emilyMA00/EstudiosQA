Feature: Registro y login de usuario en Automation Exercise

  Scenario: Registrar y luego iniciar sesión con un nuevo usuario
    Given que Emily abre la página de Automation Exercise
    When ella se registra con datos válidos
    And cierra sesión
    And inicia sesión con las mismas credenciales
    Then debería ver que el login fue exitoso