Feature: Teste do endpoint GET "/breeds" da Cat Facts API

  Scenario 01: Verificar se o endpoint "/breeds" retorna uma lista de raças de gatos
    Given que a API Cat Facts está disponível
    When faço uma solicitação GET para "/breeds"
    Then o código de status da resposta deve ser 200
    And o corpo da resposta deve conter uma lista de raças de gatos

  Scenario 02: Verificar se o endpoint "/breeds" retorna um erro quando o limite é menor que o mínimo permitido
    Given que a API Cat Facts está disponível
    When faço uma solicitação GET para "/breeds" com um limite menor que o mínimo permitido
    Then o código de status da resposta deve ser 404
    And o corpo da resposta deve conter uma mensagem de erro indicando que o limite especificado é muito baixo