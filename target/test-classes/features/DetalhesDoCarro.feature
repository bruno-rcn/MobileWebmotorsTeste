@reg
@telaDetalhes
Feature: Detalhes do carro

  @CT06
  Scenario: Verificar se os campos nao estao vazios
    Given que eu clique no anuncio
    When for direcionado para tela de detalhes do carro
    Then verifico se os campos na tela de detalhes nao estao vazios

