# WorkShop

Este é um projeto de workshop que demonstra a construção de um serviço web RESTful utilizando o ecossistema Spring, incluindo Spring Boot, Spring Data JPA e um banco de dados H2.

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3.5.3**
* **Spring Web**: Para a criação de APIs REST.
* **Spring Data JPA**: Para a persistência de dados.
* **Maven**: Para gerenciamento de dependências e build do projeto.
* **H2 Database**: Banco de dados em memória para testes e desenvolvimento.

## ✨ Funcionalidades

O projeto simula um sistema de e-commerce simples com as seguintes entidades:

* **Usuário (User)**: Representa os clientes do sistema.
* **Produto (Product)**: Os itens que podem ser vendidos.
* **Categoria (Category)**: Categorias para organizar os produtos.
* **Pedido (Order)**: Representa os pedidos feitos pelos usuários.
* **Item de Pedido (OrderItem)**: Associa produtos a pedidos, com quantidade e preço.
* **Pagamento (Payment)**: Representa o pagamento associado a um pedido.

O projeto expõe uma API REST para interagir com essas entidades.

## ⚙️ Como Executar

### Pré-requisitos

* JDK 17 ou superior instalado.
* Maven instalado.

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone <url-do-seu-repositorio>
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd WorkShop
    ```

3.  **Execute a aplicação com o Maven:**
    ```bash
    mvn spring-boot:run
    ```

A aplicação será iniciada e estará disponível em `http://localhost:8080`.

### Banco de Dados

* O projeto está configurado para usar o perfil `test` por padrão.
* Ele utiliza um banco de dados H2 em memória, que é populado com dados de teste na inicialização, conforme definido no arquivo `TestConfig.java`.
* Você pode acessar o console do H2 para visualizar os dados em: `http://localhost:8080/h2-console`
    * **JDBC URL**: `jdbc:h2:mem:testdb`
    * **User Name**: `sa`
    * **Password**: (deixe em branco)

## ↔️ Endpoints da API

Abaixo estão os principais endpoints disponíveis:

### Usuários (`/users`)

* `GET /users`: Retorna todos os usuários.
* `GET /users/{id}`: Retorna um usuário específico pelo ID.
* `POST /users`: Cria um novo usuário.
* `PUT /users/{id}`: Atualiza um usuário existente.
* `DELETE /users/{id}`: Deleta um usuário.

### Produtos (`/products`)

* `GET /products`: Retorna todos os produtos.
* `GET /products/{id}`: Retorna um produto específico pelo ID.

### Categorias (`/categories`)

* `GET /categories`: Retorna todas as categorias.
* `GET /categories/{id}`: Retorna uma categoria específica pelo ID.

### Pedidos (`/orders`)

* `GET /orders`: Retorna todos os pedidos.
* `GET /orders/{id}`: Retorna um pedido específico pelo ID.

## 🗂️ Estrutura do Projeto

Muito obrigado pela correção e peço desculpa pela imprecisão anterior\! Você está absolutamente certo.

Com a estrutura correta que me forneceu, aqui está o `README.md` atualizado. Pode copiar e colar este conteúdo diretamente no seu ficheiro.

-----

# WorkShop

Este é um projeto de workshop que demonstra a construção de um serviço web RESTful utilizando o ecossistema Spring, incluindo Spring Boot, Spring Data JPA e um banco de dados H2.

## 🚀 Tecnologias Utilizadas

  * **Java 17**
  * **Spring Boot 3.5.3**
  * **Spring Web**: Para a criação de APIs REST.
  * **Spring Data JPA**: Para a persistência de dados.
  * **Maven**: Para gerenciamento de dependências e build do projeto.
  * **H2 Database**: Banco de dados em memória para testes e desenvolvimento.

## ✨ Funcionalidades

O projeto simula um sistema de e-commerce simples com as seguintes entidades:

  * **Usuário (User)**: Representa os clientes do sistema.
  * **Produto (Product)**: Os itens que podem ser vendidos.
  * **Categoria (Category)**: Categorias para organizar os produtos.
  * **Pedido (Order)**: Representa os pedidos feitos pelos usuários.
  * **Item de Pedido (OrderItem)**: Associa produtos a pedidos, com quantidade e preço.
  * **Pagamento (Payment)**: Representa o pagamento associado a um pedido.

O projeto expõe uma API REST para interagir com essas entidades.

## ⚙️ Como Executar

### Pré-requisitos

  * JDK 17 ou superior instalado.
  * Maven instalado.

### Passos

1.  **Clone o repositório:**

    ```bash
    git clone <url-do-seu-repositorio>
    ```

2.  **Navegue até o diretório do projeto:**

    ```bash
    cd WorkShop
    ```

3.  **Execute a aplicação com o Maven:**

    ```bash
    mvn spring-boot:run
    ```

A aplicação será iniciada e estará disponível em `http://localhost:8080`.

### Banco de Dados

  * O projeto está configurado para usar o perfil `test` por padrão.
  * Ele utiliza um banco de dados H2 em memória, que é populado com dados de teste na inicialização, conforme definido no arquivo `TestConfig.java`.
  * Você pode acessar o console do H2 para visualizar os dados em: `http://localhost:8080/h2-console`
      * **JDBC URL**: `jdbc:h2:mem:testdb`
      * **User Name**: `sa`
      * **Password**: (deixe em branco)

## ↔️ Endpoints da API

Abaixo estão os principais endpoints disponíveis:

### Usuários (`/users`)

  * `GET /users`: Retorna todos os usuários.
  * `GET /users/{id}`: Retorna um usuário específico pelo ID.
  * `POST /users`: Cria um novo usuário.
  * `PUT /users/{id}`: Atualiza um usuário existente.
  * `DELETE /users/{id}`: Deleta um usuário.

### Produtos (`/products`)

  * `GET /products`: Retorna todos os produtos.
  * `GET /products/{id}`: Retorna um produto específico pelo ID.

### Categorias (`/categories`)

  * `GET /categories`: Retorna todas as categorias.
  * `GET /categories/{id}`: Retorna uma categoria específica pelo ID.

### Pedidos (`/orders`)

  * `GET /orders`: Retorna todos os pedidos.
  * `GET /orders/{id}`: Retorna um pedido específico pelo ID.

## 🗂️ Estrutura do Projeto

```
WorkShop/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── org/
    │   │       └── projetospring/
    │   │           └── workshop/
    │   │               ├── WorkShopApplication.java
    │   │               ├── config/
    │   │               │   └── TestConfig.java
    │   │               ├── entities/
    │   │               │   ├── Category.java
    │   │               │   ├── Order.java
    │   │               │   ├── OrderItem.java
    │   │               │   ├── Payment.java
    │   │               │   ├── Product.java
    │   │               │   ├── User.java
    │   │               │   ├── enums/
    │   │               │   │   └── OrderStatus.java
    │   │               │   └── pk/
    │   │               │       └── OrderItemPK.java
    │   │               ├── repositories/
    │   │               │   ├── CategoryRepository.java
    │   │               │   ├── OrderItemRepository.java
    │   │               │   ├── OrderRepository.java
    │   │               │   ├── ProductRepository.java
    │   │               │   └── UserRepository.java
    │   │               ├── resources/
    │   │               │   ├── CategoryResource.java
    │   │               │   ├── OrderResource.java
    │   │               │   ├── ProductResource.java
    │   │               │   ├── UserResources.java
    │   │               │   └── exceptions/
    │   │               │       ├── ResourceExceptionHandler.java
    │   │               │       └── StandardError.java
    │   │               └── services/
    │   │                   ├── CategoryService.java
    │   │                   ├── OrderService.java
    │   │                   ├── ProductService.java
    │   │                   ├── UserServices.java
    │   │                   └── exceptions/
    │   │                       ├── DataBaseException.java
    │   │                       └── ResourceNotFoundException.java
    │   └── resources/
    │       ├── application.properties
    │       └── application-test.properties
    └── test/
        └── java/
            └── org/
                └── projetospring/
                    └── workshop/
                        └── WorkShopApplicationTests.java
```
