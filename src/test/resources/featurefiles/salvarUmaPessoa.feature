# language: pt
#cucumber --order defined
Funcionalidade: Endpoint de salvar uma pessoa

Cenário: salvar uma pessoa com sucesso
  Quando Um pedido de cadastrar uma pessoa é enviado
  Então  Uma pessoa é salva com sucesso
  Então o cliente recebe o código de status 201
