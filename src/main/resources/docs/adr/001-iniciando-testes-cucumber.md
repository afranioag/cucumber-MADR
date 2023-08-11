# 001 - Testes usando Cucumber

Data: 2023-08-11
Status: Aceito

## Contexto
Queríamos implementar testes BDD, um padrão que está ganhando popularidade no mercado de trabalho. Para isso, decidimos adotar a ferramenta Cucumber a fim de criar testes para nossa aplicação.

## Opções Consideradas
Consideramos usar o JUnit 5, uma ferramenta amplamente difundida e de fácil aprendizado para testes. No entanto, optamos por explorar o Cucumber para complementar nossos testes, em vez de substituir o JUnit. Essa abordagem nos permitirá aproveitar o melhor de ambas as ferramentas.

## Decisão
Decidimos adotar o Cucumber como uma ferramenta adicional para nossos testes. Isso nos permitirá aproveitar os benefícios do BDD e criar cenários de teste mais legíveis para colaboradores não técnicos, enquanto ainda mantemos a eficácia dos testes unitários com o JUnit.

## Consequências
A principal consequência é que nossa equipe terá que aprender a usar o Cucumber. Isso exigirá algum tempo e esforço dedicado à familiarização com a ferramenta e suas práticas recomendadas. No entanto, acreditamos que os benefícios de ter testes BDD mais legíveis e abordagens complementares de teste valem o investimento.

## Notas de Implementação
- Serão criados documentos específicos e descritivos de cenários de teste usando a linguagem Gherkin, suportada pelo Cucumber.
- As classes de teste serão criadas para implementar esses cenários, combinando o uso do Cucumber com o JUnit.
- A equipe passará por um processo de treinamento para entender os conceitos do BDD e como usar efetivamente o Cucumber em nossos fluxos de desenvolvimento.