# 📦 NA-SpringShop_API

![Status](https://img.shields.io/badge/Status-Finalizado-green?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring_Boot-4.1-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![License](https://img.shields.io/badge/Licença-MIT-green?style=for-the-badge)

Uma API RESTful para simulação de um sistema de e-commerce e gestão de pedidos, construída com boas práticas de engenharia de software e arquitetura em camadas.

---
## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java 21
* **Framework:** Spring Boot 3
* **Persistência:** Spring Data JPA / Hibernate
* **Banco de Dados:** Oracle Database
* **Testes:** Bruno
* **DevOps:** Docker & Docker Compose


## 📐 Modelo de Domínio
O sistema gerencia as seguintes entidades e seus respectivos relacionamentos:

* `User`: Representa o cliente do e-commerce (id, name, email, phone, password).

* `Order`: Pedido realizado, associado a um cliente e contendo o status de fluxo da compra (WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED).

* `Product`: Produtos disponíveis no catálogo de vendas.

* `Category`: Categorias dos produtos (Relacionamento Many-to-Many com Product).

* `OrderItem`: Classe de associação entre Order e Product, garantindo o histórico do preço e quantidade exata no momento em que a compra foi fechada.

* `Payment`: Registro de pagamento associado a um pedido (Relacionamento One-to-One).

### 🐳 Via Docker (Recomendado)
Certifique-se de ter o [Docker](https://www.docker.com/) instalado em sua máquina:

```bash
# 1. Clone o repositório
git https://github.com/JoseCarlos67/NA-SpringShop_API.git
cd NA-SpringShop_API

# 2. Suba o ambiente completo
docker compose up -d --build

A API estará disponível em http://localhost:8080
```

### 💻 Execução Local
Certifique-se de ter o JDK 21, Oracle Database e o Maven instalados.

Configure as variáveis de ambiente ou o application.properties com as credenciais do seu banco.

Execute: `mvn spring-boot:run`

## 📚 Documentação dos Endpoints

| Métod  | Endpoint                           | Descrição                  |
|--------|------------------------------------|----------------------------|
| GET    | http://localhost:8080/users        | Lista todos os usuários    |
| GET    | http://localhost:8080/users/1      | Lista o usuário de ID 1    |
| POST   | http://localhost:8080/users        | Adiciona um novo usuário   |
| DELETE | http://localhost:8080/users/1      | Deleta o usuário de ID 1   |
| POST   | http://localhost:8080/users/1      | Atualiza o usuário de ID 1 |
| GET    | http://localhost:8080/categories   | Lista todas as categorias  |
| GET    | http://localhost:8080/categories/1 | Lista a categoria de ID 1  |
| GET    | http://localhost:8080/products     | Lista todos os produtos    |
| GET    | http://localhost:8080/products/1   | Lista o produto de ID 1    |
| GET    | http://localhost:8080/orders       | Lista todos os pedidos     |
| GET    | http://localhost:8080/orders/1     | Lista o pedido de ID 1     |


Desenvolvido por José Carlos — [LinkedIn](linkedin.com/in/josecarlosesteves/)