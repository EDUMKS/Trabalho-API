<h1 align="center"># API-individual</h1>
<p>Voces foram convidados para desenvolver um sistema de biblioteca e precisam criar uma entidade livro contendo as informações, id, titulo

O livro tambem deve ter informações da publicacao contendo autor, data da publicacao, e editora

(Livro, InformacaoPublicacao) (@Embedded, @Embeddable)

Deve-se criar:
entidade
interface do repositorio
o controller contendo um CRUD (GET, POST, PUT, DELETE) do recurso (Inserir as anotações necessárias para que esta classe funcione como um controlador.)

ATUALIZAÇÂO: Validar somente titulo
Inserir as validações para tratamento dos campos obrigatórios na classe Livro (titulo) 
Inserir a classe de ControllerExceptionHandler e ErroResposta para tratamento das exceções

OBS:
- usar o banco H2
- Adicionar no readme o caminho para cada endpoint da API

Dependencias:
spring-boot-starter-data-jpa
spring-boot-starter-web
spring-boot-devtools
h2
spring-boot-starter-validation</p>

<h1 align="center"># Endpoints</h1> 
<p>
  findall: localhost:8080/Livro <br>
  findById:localhost:8080/Livro/6 <br>
  findById:localhost:8080/Livro/7 <br>
  findById:localhost:8080/Livro/8 <br>
  Put: localhost:8080/Livro/6 <br>
  Post: localhost:8080/Livro <br>
  delete: localhost:8080/Livro/6 <br>
</p>
    
 <h1 align="center"> Autor </h1>

-   Eduardo Manoel Kappaun da Silva 
-  (https://github.com/EDUMKS/TrabalhoIND-API.git)

<div align="center">
