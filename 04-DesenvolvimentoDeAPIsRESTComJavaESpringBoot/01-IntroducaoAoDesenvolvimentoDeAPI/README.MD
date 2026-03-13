## O que é uma API ? 

Uma API (do inglês Application Programming Interface) é um conjunto de regras e ferramentas que permite que diferentes programas conversem entre si.

Programação de aplicativos -> Criar uma aplicação que sirva para resolver problemas de negócio
Interface -> contrato 

* API -> Aplicação que foi programada para sevir dados para um negócio, seguindo padronização de um tipo de contrato de programção 

_Resumo_
Aplicação para servir dados de maneira padronizada seguindo algum protocolo de comunicação


![alt text](image.png)

Padrões de arquiteturas -> REST

O padrão de arquitetura REST (Representational State Transfer) é um estilo de arquitetura usado para criar APIs na web, permitindo que sistemas diferentes se comuniquem de forma simples usando protocolos da internet, principalmente HTTP.

REST não é uma linguagem nem um protocolo.
Ele é um conjunto de princípios e regras para construir APIs.

Uma API REST usa:
HTTP para comunicação
URLs para identificar recursos
métodos HTTP para realizar operações

Caracteristicas 
* 1 Ter arquitetura Cliente X servidor 
* 2 Comunicação stateless
* 3 cache 
* 4 interface uniforme 
* 5 Sistemas de camadas 

 Voce pode implementar algumas dessas caracteristicas, sendo assim, não é necessario usar todas as caracteristicas da REST 

 RESTFUL 
 É quando voce implementa todas as caracteristicas da REST, sendo assim, chamamos de RESTFUL
     
| Método     | Função          | Exemplo                 |
| ---------- | --------------- | ----------------------- |
| **GET**    | Buscar dados    | obter lista de usuários |
| **POST**   | Criar dados     | criar um novo usuário   |
| **PUT**    | Atualizar dados | atualizar um usuário    |
| **DELETE** | Remover dados   | excluir um usuário      |
