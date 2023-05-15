# DS LIST

## Intensivão Java Spring da Dev Superior


# Sobre o projeto

Esse é um projeto desenvolvido durante o **intensivão de Java Spring**, um evento gratuito da [DevSuperior](https://devsuperior.com.br "Site da DevSuperior"), onde desenvolvemos uma Rest API utilizando Spring Boot 3 e Java 17.

A aplicação consiste em uma base de dados de jogos que podem ser organizados em diversas listas. É possível também alterar a possição de cada jogo na lista, uma funcionlidade extra baseada na aplicação Front-end, onde possível manipular a possição dos jogos na lista.

A aplicação foi desenvolvida seguindo uma arquitetura de camadas onde foram separados os domínios de 
- Controller
- DTOs 
- Serviços 
- Entidades


## Modelo conceitual
![Modelo Conceitual](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

# Tecnologias utilizadas
## Back end
- Java 17
- Spring Boot 3
- JPA / Hibernate
- Maven 

## Implantação em produção
- Deploy: Railway
- Banco de dados de teste : H2
- Banco de homologação : Postgres local com Docker
- Banco de produção : Postgres no Railway 

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/EduardoSerafim/DSList-intensivao-Java-Spring.git

# entrar na pasta do projeto back end
cd DSList-intensivao-Java-Spring

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Eduardo Serafim

[Linkedin](https://www.linkedin.com/in/eduardo-fernando-serafim-santos-2a948a190/)
