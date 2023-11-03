# Bem-vindo ao PostoCombs - Backend

Bem-vindo ao meu projeto PostoCombs, um sistema de backend desenvolvido para gerenciar os abastecimentos e tanques de combustíveis do Posto ABCD. Este projeto faz parte de um sistema completo que inclui o frontend, que pode ser encontrado [aqui](https://github.com/rpablo30/PostoCombs).

## Requisitos

- Java 8 ou superior
- Spring Boot 2.5.4
- Banco de Dados MySQL (ou outro compatível)
- Maven 3.6.3

## Tecnologias Utilizadas
- Spring Boot: Framework utilizado para criar uma aplicação robusta e escalável.
- Spring Data JPA: Facilita o acesso aos dados do banco de dados.
- Spring Security: Utilizado para controle de autenticação e autorização.
- MySQL: Banco de dados relacional para armazenar os dados do posto de combustível.
- Maven: Gerenciador de dependências para construir o projeto.
- Java 8: A linguagem de programação principal para desenvolvimento.

## Instruções

Para iniciar o PostoCombs Backend no seu ambiente local, siga estas instruções:

1. Certifique-se de ter o Java 8 (ou superior) instalado.
2. Clone este repositório: `git clone https://github.com/rpablo30/ProjetoPostoCombustivel_Backend`
3. Navegue para o diretório do projeto: `cd ProjetoPostoCombustivel_Backend`
4. Configure as propriedades do banco de dados no arquivo `application.properties`.
5. Execute o projeto Spring Boot: `mvn spring-boot:run`

## Como Usar

- O backend fornece serviços de API RESTful para o frontend, permitindo o registro e recuperação de abastecimentos, tanques e bombas de combustível.
- O controle de acesso é garantido com o Spring Security.
- Conecta-se ao frontend mencionado [aqui](https://github.com/rpablo30/PostoCombs).
