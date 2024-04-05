#encoding: iso-8859-1
Feature: En este caso de prueba automatizado se desea probar la funcionalidad de compras en la web https://www.domain.com/

  @SuccessfulScenario
  Scenario Outline: Validacion pruebas carrito de compras.
    Given Que ingreso a la web domain.com
    And Ingreso el <dominio>
    When Agrego al carrito de compras el dominio mas popular y el dominio con el primer año a la venta
    And cambio el año y obtengo el valor total de compra
    Then Elimino los dominios del carrito de compra y el carrito de compra debe estar vacio

    Examples:
      | dominio      |
      | RTRC Testing |