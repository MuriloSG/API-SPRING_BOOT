# API USANDO SPRINGBOOT

## Dependências

- [spring-boot-starter-data-jpa](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
- [spring-boot-starter-security](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security)
- [spring-boot-starter-web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
- [spring-boot-devtools](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
- [lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok) (Opcional)
- [spring-boot-starter-test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test)
- [spring-security-test](https://mvnrepository.com/artifact/org.springframework.security/spring-security-test)
- [h2](https://mvnrepository.com/artifact/com.h2database/h2) (Escopo de tempo de execução)
- [java-jwt](https://mvnrepository.com/artifact/com.auth0/java-jwt/4.4.0)

## Entidade Usuários
| Atributo    | Tipo       |
|-------------|------------|
| id (uuid)   | string     |
| name        | string     |
| email       | string     |
| passaord    | string     |

## Endpoints de Autenticação:

## Register

- **URL**: `/auth/register`
- **Método**: POST
- **Respostas**:
  - **200**: Ok
  - **400**: Bad request

- **Corpo da Requisição**:
  ```json
  {
    "name": "string"
    "email": "string",
    "password": "string",
  }

- **Corpo da Resposta**:
  ```json
  {
    "name": "string"
    "email": "string",
    "token": "string"
  }
  ```
## Login

- **URL**: `/auth/login`
- **Método**: POST
- **Respostas**:
  - **200**: Ok
  - **400**: Bad request

- **Corpo da Requisição**:
  ```json
  {
    "email": "string",
    "password": "string"
  }
  ```

- **Corpo da Resposta**:
  ```json
  {
    "name": "string"
    "email": "string",
    "token": "string"
  }
  ```