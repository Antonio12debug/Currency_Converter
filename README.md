# Conversor de Moedas

Este projeto é um **Conversor de Moedas** desenvolvido em **Java**, que utiliza a API de câmbio para converter valores entre diferentes moedas. Ele permite ao usuário escolher entre várias moedas e consultar o histórico de conversões realizadas.

## Funcionalidades

* Conversão entre diferentes moedas, como:

  * **BRL para USD**
  * **USD para BRL**
  * **BRL para ARS**
  * **ARS para BRL**
  * **BRL para CLP**
  * **CLP para BRL**
* Exibição do histórico de conversões realizadas.

## Estrutura do Projeto

O projeto é estruturado da seguinte forma:

1. **Main.java**: Classe principal que executa o programa, oferecendo ao usuário o menu de opções.
2. **CurrencyConverter.java**: Gerencia a lógica do menu de conversão de moedas.
3. **CurrencyService.java**: Responsável pela comunicação com a API de taxas de câmbio e realização da conversão.
4. **ExchangeRateApiClient.java**: Faz a requisição à API de taxas de câmbio para obter as taxas de conversão.
5. **ConversionHistory.java**: Mantém e exibe o histórico das conversões realizadas.

## Dependências

O projeto utiliza a biblioteca **Gson** para o tratamento de dados JSON. A requisição HTTP para a API é feita utilizando as classes do pacote `java.net.http`.

Certifique-se de adicionar a dependência **Gson** no seu arquivo `pom.xml` caso ainda não tenha feito isso:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
```

## Como Rodar o Projeto

### Requisitos

* JDK 11 ou superior.
* Maven (caso queira usar o sistema de build).
* A API de câmbio requer uma chave de API válida. Para obter a chave, registre-se em [ExchangeRate-API](https://www.exchangerate-api.com/).

### Passos

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/seu_usuario/conversor-de-moedas.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd conversor-de-moedas
   ```

3. **Compile o projeto** (caso esteja utilizando Maven):

   ```bash
   mvn clean install
   ```

4. **Execute o programa**:
   Caso tenha um arquivo `.jar` gerado, execute com o comando:

   ```bash
   java -jar conversor-de-moedas.jar
   ```

   Ou diretamente pelo IntelliJ IDEA, clicando no botão de execução na classe `Main`.

### Utilização

1. **Escolha uma opção do menu**:
   Após rodar o programa, o menu será exibido no console. Você poderá escolher a opção desejada para realizar a conversão.

2. **Digite o valor**:
   Após selecionar a opção de conversão, o programa solicitará que você informe o valor que deseja converter.

3. **Visualização do histórico**:
   Se você quiser ver o histórico das conversões realizadas, basta escolher a opção "7" do menu.

4. **Finalizar o programa**:
   Para encerrar o programa, basta selecionar a opção "8" do menu.

## Exemplo de Execução

```
=== CONVERSOR DE MOEDAS ===
1. BRL para USD
2. USD para BRL
3. BRL para ARS
4. ARS para BRL
5. BRL para CLP
6. CLP para BRL
7. Ver Histórico
8. Sair
Escolha uma opção: 1
Informe o valor: 100
100.00 BRL = 20.00 USD
```

## Contribuição

Se desejar contribuir para este projeto, fique à vontade para realizar **fork**, **pull requests** ou **issues** com sugestões de melhorias ou correções.

---

Esse README descreve as funcionalidades do projeto, a estrutura do código, as dependências e como executar o programa. Fique à vontade para ajustar conforme necessário!
