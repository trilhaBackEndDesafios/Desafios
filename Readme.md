<p align="center">
  <img width="400" height="200" src="https://ik.imagekit.io/f1uatti9kjv/Captura_de_tela_2021-12-18_180004_4PxATMOVWfW.png?updatedAt=1639861594987">
</p>

# 🏷Sobre

## ✔ **Desafio 1**

## **Primeiro Desafio criado  para trilhaBackEnd para o projeto Só Vamu.**

### ✔**Sistema para versionamento de código (VCS) GIT**

#### **a) Com suas palavras defina o que é um sistema de controle de versões(VCS)?**

O GIT é uma ferramenta criada para gerenciar versões de um projeto,controle de versões,permitindo que haja colaborações de outros desenvolvedores,
com repositorios remotos,mantendo vários fluxos de trabalho independentes uns dos outros, ajudando a acompamhar as mudanças feitas no codigo
base com a segurança do registro de quem fez alguma alteração.
Permitindo também a restauração do codigo removido ou modificado.

#### **b) Cite 5 vantagens em utilizar um VCS?**

- Controle de historicos
- Trabalho em equipe
- Organização 
- Segurança e Rastreabilidade
- Ramificações do projeto com trabalhos simultâneos

#### **c) Cite 3 exemplos de VCS?**

- Subversion do Apache (SVN)
- Sistema de Versões Concorrentes (CVS)
- Mercurial 

##### 📖Referencias Bibliográficas

- [https://www.youtube.com/watch?v=Gcb60rPbnKA&t=958s](https://www.youtube.com/watch?v=Gcb60rPbnKA&t=958s)
- [https://www.atlassian.com/br/git/tutorials/what-is-version-control](https://www.atlassian.com/br/git/tutorials/what-is-version-control)
- [https://www.youtube.com/watch?v=OuOb1_qADBQ](https://www.youtube.com/watch?v=OuOb1_qADBQ)
- [https://www.youtube.com/watch?v=UBAX-13g8OM](https://www.youtube.com/watch?v=UBAX-13g8OM)
- [https://www.youtube.com/watch?v=xEKo29OWILE&list=PLHz_AreHm4dm7ZULPAmadvNhH6vk9oNZA](https://www.youtube.com/watch?v=xEKo29OWILE&list=PLHz_AreHm4dm7ZULPAmadvNhH6vk9oNZA)


## ✔ **DESAFIO 2**

#### 🏷Sobre POO


#### **a) Com suas palavras defina o que é programação orientada a objetos?**

- O paradigma da POO(Programação Orientada a Objetos) é um modelo de análise, projeto e programação baseado na aproximação entre o mundo real e o mundo virtual, através da criação e interação entre objetos, atributos, códigos, métodos, entre outros.

#### **b) Exemlifique e explique um cenario de abstração;**

- Abstração: O processo de abstração em Java é usado para ocultar certos detalhes e mostram apenas os recursos essenciais do objeto. Em outras palavras,trata da visão externa de um objeto (interface).
Para exemplificar melhor, vamos tomar como exemplo a concessionária que realiza manutenções no seu carro. Você leva ele até lá com um problema e ele volta funcionando.
Em suma, pouco importa os detalhes do que aconteceu durante a manutenção do seu carro, o que importa é que ele voltou funcionando.


#### **C) Exemplifique e explique um cenario de emcapsulamento;**

- Encapsulamento vem de encapsular, que em programação orientada a objetos significa separar o programa em partes, o mais isolado possível. A idéia é tornar o software mais flexível, fácil de modificar e de criar novas implementações. O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe, solução de encapsulamento consiste em tornar os atributos privados, criando os métodos get e set.


#### **d) Exemplifique e explique um cenario de herança;**

- Herança é um mecanismo que permite que características comuns a diversas classes sejam fatoradas em uma classe base, ou superclasse. A partir de uma classe base, outras classes podem ser especificadas.Fazendo o reuso de codigo.

#### **e) Exemplifique e explique um cenario de polimorfismo;**

- Em relação ao polimorfismo, o principal conceito é a propriedade de duas ou mais classes derivadas de uma mesma superclasse responderem a mesma mensagem, cada uma de uma forma diferente. Ocorre quando uma subclasse redefine um método existente na superclasse, ou seja, quando temos os métodos sobrescritos (overriding).

#### **f) Cite 5 vantagens de POO;**

- Confiável: O isolamento entre as partes gera software seguro.Ao alterar uma parte ,nenhuma outra é afetada.

- Oportuno: Ao dividir tudo em partes,varias delas podem ser desenvolvidas em paralelo.

- Manutenível: atualizar um software é mais facil,uma pequena modificação vai beneficiar todas as partes que usarem o objeto.

- Extensivel: O Software não é estatico.Ele deve crescer para permanecer util.

- Reutilizavel: Podemos usar objetos de um sistema que criamos em outro sistema no futuro.

- Natural: Mais facil de entender.Preocupa-se mais na funcionalidade do que nos detalhes da implementação.


## ✔ **Desafio 3**

### 🏷 Sobre  CONTROLLER

### **a) Com suas palavras defina:**

#### - **I) O que é o protocolo de comunicação HTTP e como ele Funciona;**

Protocolo de requisição e resposta,utilizando os metodos HTTP para comunicação.

#### -  **II) O que é REST, equal é a sua relação com Com Protocolo HTTP;**

Rest é uma especificação que define s forma de comunicação entre componentes de software na web independente da linguagem de programação,um estilo aqrquitetural utilizando os protocolos HTTP seguindo algumas regras CONSTRAINTS.

#### - **III) O que é WEB API,e qual sua relação com REST:**

API REST, também chamada de API RESTful, é uma interface de programação de aplicações (API ou API web) que está em conformidade com as restrições do estilo de arquitetura REST, permitindo a interação com serviços web RESTful.

### **b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades**;

- GET
O método GET solicita a representação de um recurso específico. Requisições utilizando o método GET devem retornar apenas dados.
HEAD
 O método HEAD solicita uma resposta de forma idêntica ao método GET, porém sem conter o corpo da resposta.
- POST
O método POST é utilizado para submeter uma entidade a um recurso específico, frequentemente causando uma mudança no estado do recurso ou efeitos colaterais no servidor.
- PUT
O método PUT substitui todas as atuais representações do recurso de destino pela carga de dados da requisição.

- DELETE
O método DELETE remove um recurso específico.
CONNECT
O método CONNECT estabelece um túnel para o servidor identificado pelo recurso de destino.

- OPTIONS
O método OPTIONS é usado para descrever as opções de comunicação com o recurso de destino.

- TRACE
O método TRACE executa um teste de chamada loop-back junto com o caminho para o recurso de destino.

- PATCH
O método PATCH é utilizado para aplicar modificações parciais em um recurso.

### **i) O que é Swagger?**

O Swagger é um framework composto por diversas ferramentas que, independente da linguagem, auxilia a descrição, consumo e visualização de serviços de uma API REST. 
No framework Swagger, existem ferramentas para os seguintes tipos de tarefas a serem realizadas para o completo desenvolvimento da API de um serviço WEB


## ✔**Desafio 4**

### 🏷**Sobre Repository**

### **a) Com suas palavras conceitue**

* **O que é JDBC?**

È um componente de software que intermedia o acesso de uma aplicação com um banco de dados.

* **O que é ORM, cite 3 exemplos?**

Mapeamento Objeto Relacional, mapeamento de classes que representam entidades para tabela de uma banco de dados relacional.
Django (Python)
Laravel (PHP)
Hibernate (Java)

* **O que é JPA e qual é a sua relação com os ORM’s?**

È uma especificação JEE uma solução ORM para persistencia de dados que é padronizada para desenvolvimento de aplicaçãoes.

* **O que é Spring Data?**

O SpringData é um projeto da SpringSource com proposta de unificar e facilitar o acesso a diferentes tecnologias de armazenamento de dados, como bancos de dados relacionais e os NoSQL.


### **b) O que caracteriza um projeto “CRUD básico”?**

CRUD (Create, Read, Update, Delete) a qual representa as quatro principais operações com bancos de dados: Criar, Ler, Atualizar e Excluir dados.


## ✔**Desafio 5**


### 🏷**Sobre** 

   ## **Service**

### **a)  Defina  com  suas  palavras  qual  é  a  responsabilidade  das  camadas  vistas  até  agora:**


 * **Entity:**

 Representa as entidades que serão persistidas em um banco de dados no modelo ORM.

 * **Controller:**

 A camada Controller (controlador) lida com as requisições dos usuários. É responsável por retornar uma resposta com a ajuda das camadas Model e View.

 * **Repository:**
 
 Repository permite realizar o isolamento entre a camada de acesso a dados de sua aplicação e sua camada de apresentação e camada de negócios .

 * **Service:**

  A camada de serviço contém a lógica de negócios. Em particular, ele contém a lógica de validação.Operação sem estado que realiza uma tarefa de negócio.


## ✔**Desafio 6**


### 🏷**Sobre**

##  **DTO** 

       

### **a) O que significa DTO, e qual sua importância?**

Data transfer object: Objeto de Transferência de Dados, um padrão de projeto muito usado para transporte de dados em diferentes camadas do sistema .Um DTO agrupa um conjunto de propriedades de uma ou mais classes de entidades em uma classse de transferência mais simples apenas com as propriedades necessarias.



## ✔**Desafio 7**


### 🏷**Sobre**

##  **Tratamento de Dados** 


## ✔**Desafio 8**


### 🏷**Sobre**

##  **Tratamento de Exceptions** 

### **a) O que são exceptions?**

Exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.

### **b) Qual é o funcionamento do try, catch e finally?**

* Try:

  Contém o código que representa a execução normal do trecho de código que pode acarretar em uma exceção.

* Catch:

  Contém o código a ser executado caso uma exceção ocorra.Deve ser especificado o tipo da exceção a ser tratado.

* Finally:

  É um bloco que contém codigo a ser executado independentemente de ter ocorrido ou não uma exceção.


### **c) Qual a relação entre “try, catch e finally” e “throws”?**

Define bloco de tratamento de exceção e declara que um método pode levantar uma exceção.

### **d) Para que serve a annotation @ExceptionHandler?**

Tratamento de exceção baseado em controlador.Adicionar @ExceptionHandler métodos extras a qualquer controlador para lidar especificamente com exceções lançadas por @RequestMapping métodos de manipulação de solicitação no mesmo controlador

### **e) Para que serve o comando throw?**

A função do throw é lançar a exceção para o método chamador, ou seja, leva o erro adiante.

### **f) Para que serve a annotation @ControllerAdvice?**

Concentra o tratamento de exceçãoes  que são espalhados em todos os controllers.

### **VII. Realize novos testes, verifique o resultado final e escreva sua própria conclusão sobre exceptions**

Com o tratamento de exceções pode se devolver mensagem que especificam o motivo correto do erro no caso de uso da API de maneira incorreta que o estado da aplicação não permite devolvendo status Http corretos customizando as reposta e modelando com respostas pradonizadas.