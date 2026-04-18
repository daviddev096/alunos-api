# 📚 Alunos API - Gestão Escolar

### 🎯 Objetivos de Aprendizado
O desenvolvimento desta aplicação permitiu a aplicação prática de diversos conceitos:
* **Fundamentos de Java 17:** Uso de recursos modernos da linguagem e tipagem.
* **Spring Boot:** Estruturação de uma aplicação web robusta e escalável.
* **Padrão REST:** Implementação de endpoints seguindo as boas práticas do protocolo HTTP.
* **Operações CRUD:** Domínio das lógicas de Criação, Leitura, Atualização e Deleção.
* **Persistência de Dados:** Uso do Spring Data JPA integrado ao banco de dados H2 (em memória), ideal para ambientes de teste e desenvolvimento ágil.
* **Maven:** Gerenciamento de dependências e automação do build.

### 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java 17
* **Framework:** Spring Boot 3+
* **Banco de Dados:** H2 Database
* **Gerenciador de Dependências:** Maven

### 📖 Documentação (Swagger)
A API utiliza o Swagger UI para que você possa testar os endpoints diretamente do navegador sem precisar de ferramentas como Postman ou Insomnia.
* **Com o projeto rodando, acesse:** 👉 http://localhost:8080/swagger-ui/index.html
* **Como testar:** Dentro do Swagger, escolha um endpoint (ex: POST /alunos), clique em "Try it out", preencha o JSON de exemplo e clique em "Execute". Verifique a resposta logo abaixo no campo Response Body.

### 🗄️ Banco de Dados
O projeto utiliza o banco H2 para facilitar o teste imediato.
* **Console H2:** http://localhost:8080/h2-console
* **JDBC URL:** jdbc:h2:mem:alunosdb
* **User:** sa
* **Password:** (em branco)

### 🚀 Atualizações Futuras
* **Implementação de DTOs (Data Transfer Objects):** Melhorar a segurança e a performance da API, controlando quais dados são expostos nas requisições e respostas.
* **Tratamento de Exceções Personalizado:** Refinar as respostas de erro da API (como 404 Not Found ou 400 Bad Request) para retornar mensagens mais claras e amigáveis ao invés de stack traces genéricos.
