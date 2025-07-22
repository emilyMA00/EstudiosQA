@test
Feature: Login en SauceDemo

  Scenario: Login exitoso con credenciales válidas
    Given que Wilder accede a  bonite
    And ingresa con credenciales validad
    When realiza la compra de un bolso "Cartera en cuero grabado berenjena por miel"
    Then debería ver el nombre del bolso "Cartera en cuero grabado berenjena por miel" en el carro de compras
