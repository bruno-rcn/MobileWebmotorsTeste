@reg
@telaListagem
Feature: Tela de listagem

  @CT01
  Scenario: Verificar se os campos do anuncio nao estao vazios
    Given que estou na tela de listagem
    Then verifico se os campos na tela de listagem nao estao vazios
    
  @CT02
  Scenario: Acessar a tela de detalhes do carro clicando na imagem do anuncio
    Given que estou na tela de listagem
    When clico na imagem do anuncio
    Then verifico se foi direcionado para a tela de detalhes do carro
    
  @CT03
  Scenario: Acessar a tela de detalhes do carro clicando no preco do anuncio
    Given que estou na tela de listagem
    When clico no preco do anuncio
    Then verifico se foi direcionado para a tela de detalhes do carro
    
  @CT04
  Scenario: Acessar a tela de detalhes do carro clicando no nome do anuncio
    Given que estou na tela de listagem
    When clico no nome do anuncio
    Then verifico se foi direcionado para a tela de detalhes do carro

  @CT05
  Scenario: Acessar a tela de detalhes do carro clicando no ano e km do anuncio
    Given que estou na tela de listagem
    When clico no ano e km do anuncio
    Then verifico se foi direcionado para a tela de detalhes do carro
    