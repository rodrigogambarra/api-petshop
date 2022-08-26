<h3>Especificação:</h3>

Sistema de gerenciamento de produtos para um Petshop em API REST com Spring Boot

API desenvolvida com framework spring boot, utilizando banco de dados MySQL em ambiente de desenvolvimento e PostgreSQL em ambiente de produção 

Operações disponibilizadas pela API:

<h4>RequestMethod *GET* - Retorna lista de produtos</h4>
Url: http://localhost:8080/apipetshop/v1/item

<h4>RequestMethod *POST* - Cria um ítem</h4>
Url: http://localhost:8080/apipetshop/v1/item

<h4>RequestMethod *GET* - Retorna um ítem por ID</h4>
Url: http://localhost:8080/apipetshop/v1/item{id}

<h4>RequestMethod *PUT* - Atualiza os dados de um ítem apartir do Id</h4>
Url: http://localhost:8080/apipetshop/v1/item/{id}

<h4>RequestMethod *Delete* - Deleta um ítem apartir do Id</h4>
Url: http://localhost:8080/api/v1/people/{id}

<h4>API configurada com Swagger. Url para acesso:</h4>
http://localhost:8080/swagger-ui.html
