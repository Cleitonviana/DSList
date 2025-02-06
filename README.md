🎮 DSList - API de Listagem de Jogos

DSList é uma API desenvolvida em Java Spring Boot que permite listar jogos cadastrados em um banco de dados PostgreSQL, buscar jogos por ID e organizar listas de jogos por categoria.
************************************************************************************************************************************************************************************************************************************
🚀 Funcionalidades

✅ Listar todos os jogos cadastrados no banco de dados.
✅ Buscar um jogo por ID.
✅ Gerenciar listas de jogos por categorias.
✅ Reordenar jogos em uma lista → Se um jogo está na posição 4 e precisa ir para a posição 1, a API faz essa reorganização automaticamente, ajustando as demais posições.
************************************************************************************************************************************************************************************************************************************
🛠️ Tecnologias Utilizadas

Spring Boot - Framework principal

JPA - Persistência de dados

H2 Database - Banco de dados em memória para testes

PostgreSQL - Banco de dados relacional

Spring Boot DevTools - Ferramentas para desenvolvimento

Docker - Utilizado para aprendizado no gerenciamento de containers
************************************************************************************************************************************************************************************************************************************
📌 Estrutura da API

A API conta com dois controllers principais:
************************************************************************************************************************************************************************************************************************************
🎮 GameListController

GET /lists → Lista todas as categorias de jogos.

GET /{listId}/games → Busca uma lista específica pelo ID.

PUT /{listId}/replacement→ Move um jogo dentro da lista para uma nova posição.

🕹️ GameController

GET /games → Retorna todos os jogos cadastrados.

GET /games/{id} → Retorna um jogo específico pelo ID.
************************************************************************************************************************************************************************************************************************************
🌐 Futuro do Projeto

📌 Um frontend em JavaScript será desenvolvido para consumir essa API, permitindo que os jogos sejam visualizados com suas respectivas imagens (cujos links já estão armazenados no banco de dados).
************************************************************************************************************************************************************************************************************************************
🎯 Experiência no Desenvolvimento

Este projeto foi criado durante a Semana Intensiva de Java Spring Boot com o professor Nélio Alves. Foi uma excelente oportunidade para:

✅ Aprimorar boas práticas de código limpo e organizado.
✅ Desenvolver APIs eficientes e bem estruturadas.
✅ Compreender ambientes de desenvolvimento (testes, dev e produção).
✅ Explorar ferramentas como Docker para aprendizado.

🚀 O processo foi do zero até o deploy, porém, não finalizei o deploy completo devido a custos elevados na hospedagem.
************************************************************************************************************************************************************************************************************************************
🛠️ Como Executar o Projeto

Clone o repositório:

git clone https://github.com/seu-usuario/dslist.git

Configure o banco de dados no application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/dslist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

Execute a aplicação:

mvn spring-boot:run
************************************************************************************************************************************************************************************************************************************
📧 Contato: cleiton_inacio@outlook.com | LinkedIn: www.linkedin.com/in/cleitoninacio
