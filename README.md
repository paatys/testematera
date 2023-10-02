# testematera
Este projeto visa automatizar testes de qualidade de software para o desafio da matera

# Testes de API com Rest Assured e Cucumber

Este é um projeto de exemplo que demonstra como realizar testes de API usando Rest Assured e Cucumber para a API Cat Facts. O projeto inclui cenários de teste e uma estrutura básica para você começar a escrever e executar testes de API.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- [Java](https://www.java.com/pt-BR/download/)
- [Maven](https://maven.apache.org/)

## Configuração do Projeto

Clone este repositório para o seu ambiente de desenvolvimento:

<pre>git clone https://github.com/paatys/testematera.git</pre>

## Passo a passo

Navegar até o diretório do projeto

<pre>cd desafio</pre>

Execute o seguinte comando para baixar todas as dependências do projeto

<pre>mvn clean install</pre>


### Executando os Testes
Para executar os testes de API, você pode usar o seguinte comando:

<pre>mvn test</pre>

Isso iniciará a execução dos cenários de teste definidos nos arquivos de feature do Cucumber.

### Estrutura do Projeto
A estrutura do projeto é organizada da seguinte forma:

src/main/java: Contém as classes de código de produção, como a classe CatFactsAPI que faz chamadas à API Cat Facts.

src/test/java: Contém as classes de teste Cucumber, como a classe CatFactsTest, que define os passos dos cenários.

src/test/resources: Contém os arquivos de feature do Cucumber, onde os cenários de teste são definidos.

### Personalizando os Cenários de Teste
Você pode personalizar os cenários de teste editando os arquivos de feature na pasta src/test/resources/features. Certifique-se de que os passos definidos nos arquivos de feature correspondam aos métodos nas classes de passos em src/test/java.

### Relatórios de Teste
Os resultados dos testes podem ser visualizados em relatórios HTML gerados automaticamente. Você encontrará os relatórios na pasta 'target/cucumber-reports' após a execução dos testes.
