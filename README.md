# SmartBudget AI

API de assistente financeiro inteligente, desenvolvida com Java e Spring Boot. O objetivo do projeto é evoluir para uma aplicação capaz de interpretar comandos em linguagem natural e voz, executar operações financeiras por meio de ferramentas Java e responder em texto ou áudio.

## Estado atual

Esta é a **base inicial do projeto**. Nesta primeira versão estão implementados:

- Estrutura Maven com Java 21 e Spring Boot.
- Endpoint de boas-vindas (`GET /`).
- Endpoint de saúde (`GET /api/health`).
- Spring Boot Actuator.
- Testes automatizados iniciais.

As integrações com PostgreSQL, Spring Data JPA, Spring AI, OpenAI, transcrição e síntese de áudio serão adicionadas nas próximas etapas.

## Tecnologias

- Java 21
- Spring Boot 3.5.7
- Maven
- Spring Web
- Spring Boot Validation
- Spring Boot Actuator
- JUnit 5 / Spring Boot Test

## Pré-requisitos

- JDK 21 instalado e configurado.
- IntelliJ IDEA.
- Conexão com a internet na primeira importação para baixar as dependências Maven.

Confira as instalações no terminal:

```bash
java -version
javac -version
```

## Como abrir no IntelliJ IDEA

1. Extraia o arquivo ZIP.
2. Abra o IntelliJ IDEA.
3. Selecione **Open** e escolha a pasta `smartbudget-ai`.
4. Aguarde a importação e sincronização do Maven.
5. Abra `src/main/java/com/smartbudget/SmartbudgetAiApplication.java`.
6. Clique no botão verde **Run** ao lado do método `main`.

## Como executar pelo terminal

Na pasta raiz do projeto:

```bash
mvn spring-boot:run
```

No Windows, caso o Maven não esteja instalado globalmente, você pode executar pela janela Maven do IntelliJ. Também é possível instalar o Maven e usar o comando acima.

## Como testar

Com a aplicação em execução, acesse:

- `http://localhost:8080/`
- `http://localhost:8080/api/health`
- `http://localhost:8080/actuator/health`

Resposta esperada de `/api/health`:

```json
{
  "status": "UP",
  "application": "SmartBudget AI",
  "message": "API funcionando corretamente!"
}
```

## Executar os testes

```bash
mvn test
```

## Estrutura inicial

```text
smartbudget-ai/
├── src/
│   ├── main/
│   │   ├── java/com/smartbudget/
│   │   │   ├── controller/
│   │   │   │   ├── HealthController.java
│   │   │   │   └── WelcomeController.java
│   │   │   └── SmartbudgetAiApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/smartbudget/
├── .env.example
├── .gitignore
└── pom.xml
```

## Segurança

- Não versione chaves de API, senhas ou arquivos `.env`.
- Use variáveis de ambiente para credenciais nas próximas integrações.
- O arquivo `.env.example` contém somente nomes ilustrativos de variáveis.

## Roadmap

- [ ] Configurar PostgreSQL e Spring Data JPA.
- [ ] Criar cadastro e consulta de receitas e despesas.
- [ ] Implementar relatórios financeiros.
- [ ] Integrar Spring AI e ChatClient.
- [ ] Implementar Tool Calling para operações financeiras.
- [ ] Implementar transcrição de áudio (Speech-to-Text).
- [ ] Implementar síntese de voz (Text-to-Speech).
- [ ] Documentar endpoints com OpenAPI/Swagger.
- [ ] Ampliar testes unitários e de integração.
- [ ] Preparar publicação e demonstração do projeto.

---
Projeto desenvolvido para fins educacionais e de portfólio.
