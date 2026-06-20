# NA-SpringShop_API

Uma API RESTful completa para simulação de um sistema de e-commerce e gestão de pedidos.

## 🎯 Objetivos do Projeto
* Criar um projeto Spring Boot em Java.
* Implementar um modelo de domínio.
* Estruturar as camadas lógicas da aplicação: `Resource` (controladores REST), `Service` e `Repository` (acesso a dados).
* Configurar o banco de dados H2 Oracle Database para testes e produção respectivamente.
* Povoar o banco de dados (Database Seeding).
* Implementar operações de CRUD (Create, Retrieve, Update, Delete).
* Realizar o tratamento de exceções de forma personalizada.

## 🚀 Tecnologias Utilizadas
* **Java** * **Spring Boot** * **Maven** * **JPA / Hibernate** * **Oracle Database**
* **Apache Tomcat** (Servidor embutido)
* **Bruno** (API Client para testes de requisições)
* **Heroku** (Plataforma de Deploy)

## 🏗️ Modelo de Domínio
O sistema gerencia as seguintes entidades e relacionamentos:
* **User:** Representa o cliente (id, name, email, phone, password).
* **Order:** Representa o pedido, associado a um cliente e contendo o status do pedido (WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED).
* **Product:** Representa os produtos disponíveis para venda.
* **Category:** Categoria dos produtos (relacionamento *Many-to-Many* com Product).
* **OrderItem:** Item de pedido, que funciona como classe de associação entre `Order` e `Product`, registrando quantidade e preço no momento da compra.
* **Payment:** Pagamento associado a um pedido (relacionamento *One-to-One*).

---

