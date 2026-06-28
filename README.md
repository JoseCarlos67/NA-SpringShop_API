# NA-SpringShop_API

Uma API RESTful completa para simulação de um sistema de e-commerce e gestão de pedidos, construída com boas práticas de engenharia de software e arquitetura em camadas.

---
## 🐳 Executando com Docker (Recomendado)

Este projeto está totalmente containerizado. Para testá-lo localmente, **você não precisa ter o Java, o Maven ou o Oracle Database instalados na sua máquina**. Basta possuir o [Docker](https://www.docker.com/) e rodar o comando abaixo na raiz do repositório:

```bash
# 1. Clone o repositório
git clone [https://github.com/JoseCarlos67/NA-SpringShop_API.git](https://github.com/JoseCarlos67/NA-SpringShop_API.git)
cd NA-SpringShop_API

# 2. Suba o ambiente completo (API + Banco de Dados Oracle)
docker compose up -d --build
```

🛠️ Tecnologias Utilizadas
* Java 21
* Spring Boot 3
* Maven
* JPA / Hibernate
* Oracle Database (gvenzl/oracle-free container image)
* Docker 
* Bruno (API Client para testes de endpoints)

📐 Modelo de Domínio
O sistema gerencia as seguintes entidades e seus respectivos relacionamentos:

User: Representa o cliente do e-commerce (id, name, email, phone, password).

Order: Pedido realizado, associado a um cliente e contendo o status de fluxo da compra (WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED).

Product: Produtos disponíveis no catálogo de vendas.

Category: Categorias dos produtos (Relacionamento Many-to-Many com Product).

OrderItem: Classe de associação entre Order e Product, garantindo o histórico do preço e quantidade exata no momento em que a compra foi fechada.

Payment: Registro de pagamento associado a um pedido (Relacionamento One-to-One).

Desenvolvido por José Carlos como parte do portfólio de Engenharia de Software.