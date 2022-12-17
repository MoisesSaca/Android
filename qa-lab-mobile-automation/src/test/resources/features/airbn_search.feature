Feature: Búsqueda en SwagLabs

  @test
  Scenario: Iniciar sesión

    Given que me encuentro en la página de login de Saucedemo
    When inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Then valido que debería aparecer el título de "PRODUCTS"