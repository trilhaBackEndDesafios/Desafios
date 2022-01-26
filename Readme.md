<p align="center">
  <img width="400" height="200" src="https://ik.imagekit.io/f1uatti9kjv/Captura_de_tela_2021-12-18_180004_4PxATMOVWfW.png?updatedAt=1639861594987">
</p>

---

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

---
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

---
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

---
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

---
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
---

## ✔**Desafio 6**


### 🏷**Sobre**

##  **DTO** 

       

### **a) O que significa DTO, e qual sua importância?**

Data transfer object: Objeto de Transferência de Dados, um padrão de projeto muito usado para transporte de dados em diferentes camadas do sistema .Um DTO agrupa um conjunto de propriedades de uma ou mais classes de entidades em uma classse de transferência mais simples apenas com as propriedades necessarias.

---

## ✔**Desafio 7**


### 🏷**Sobre**

##  **Tratamento de Dados** 

---
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

--- 

## ✔**Desafio 9**

### 🏷**Sobre**

##  **Arquitetura** 

### **a) O que é um padrão de projeto e por que nós os utilizamos?**
Padrões de projeto são soluções típicas para problemas comuns em projeto de software. Eles são como plantas de obra pré fabricadas que você pode customizar para resolver um problema de projeto recorrente em seu código.

### **b) Cite e explique com suas palavras:**

* **I. Um dos padrões de criação;**
O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados

* **II. Um dos padrões estruturais;**
O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.

* **II. Um dos padrões comportamentais;**
O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis

### **c) Explique o conceito de arquitetura de software e seu proposito;** 
Arquitetura de software, é possível entender as diferenças entre as linguagens, sistemas operacionais e ambientes da computação. Ou seja, qualquer componente tecnológico pode ser usado para integrar uma solução arquitetural. Essa parte é essencial porque otimiza o trabalho dos designers e desenvolvedores, permitindo que uma aplicação esteja dentro dos padrões básicos necessários para funcionar de forma assertiva.

### **I. Qual arquitetura estamos seguindo até o momento? Justifique sua resposta**
Utilizado no projeto ate o momento arquitetura em camadas e cada uma com suas responsabilidades.

### **g) O que significa a sigla SOLID?**
São 5 principios da programção orientada a objetos que facilitam no desenvolvimento de software tornando facil de montar e estender.

### **h) Quais princípios foram utilizados no projeto até o momento? Explique**
S = Classes do projeto com uma unica responsabilidade.
O = Classes abertas para extenções e fechada para modeificações.
D = Inversão de dependencia. 

---
## ✔**Desafio 10**


### 🏷**Sobre**

##  **Spring** 

### **a) O que você entende por Spring Framework?**

Tecnologia de backend com conjunto de projetos para resolver varios problemas cria aplicações Java  com facilidade e flexibilidade.Eco sistema Spring.

### **b) Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades**

- **Spring Web**

 Como muitos outros frameworks da web, é projetado em torno do padrão de controlador frontal, onde um Servlet, o DispatcherServlet, fornece um algoritmo compartilhado para processamento de solicitações, enquanto o trabalho real é realizado por componentes delegados configuráveis. Este modelo é flexível e suporta diversos fluxos de trabalho.

- **Spring Data** 

 Fornecer um modelo de programação familiar e consistente baseado em Spring para acesso a dados, mantendo as características especiais do armazenamento de dados subjacente facilita o uso de tecnologias de acesso a dados, bancos de dados relacionais e não relacionais, estruturas de redução de mapa e serviços de dados baseados em nuvem.

- **Spring Boot** 

Spring Boot facilita a criação de aplicativos independentes baseados em Spring de nível de produção que você pode "apenas executar"incorpora o Tomcat, Jetty ou Undertow diretamente,fornece dependências 'iniciais' opinativas para simplificar sua configuração de compilação

### **c) Quais ferramentas do Spring foram utilizadas na trilha até o momento?**

- Spring Web
- Spring Data JPA
- Spring Boot Dev Tools

### **d) Cite 5 vantagens em utilizar Spring**

- Canivete suiço para desenvolvedores Java.
- Simplicidade
- Maturidade
- Modularidade
- Evolução constantes

### **e) Descreva os passos de criação de uma Web API Spring boot, com conexão com SQL Server**

1) Primeiro passo é criar um projeto Spring Boot no Spring Initializr e adicionar as dependencias necessaria para o projeto configurando as dependencias.

2) Com o projeto criado, criamos os pacotes  CONFIG / CONTROLLER / MODEL / REPOSITORY / SERVICE 

3) Com as models criadas, criamos APPLICATION PROPERTIES parâmetros para acesso ao banco de dados, a porta http que a API deverá utilizar, e diversos outros parâmetro

4) Com as funcionalidades criadas, faremos agora as rotas nas controllers.

5)configurar o Lombok para construção de encapsulamentos (Getters e Setters), criação de construtores, hashcode e equals, etc.

### **f) Qual a funcionalidade do pom.xml?**

Um POM contém as configurações do mavem no projeto.

### **g) Qual a funcionalidades do applications.properties?**

Arquivo padrão de configuração utilizando chave e valor para evitar configurações misturados no códigos.

### **h) Qual o propósito das Annotations?**

Fornecer recursos  em como configuramos os comportamentos do Spring Framework  fornecem muito contexto em sua declaração.

### **i) Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização**

@RequestMapping – mapeia requisições REST.

@Controller – define uma classe que contém métodos para estrutura Spring MVC.

@RestController – define uma classe que contém métodos para uma API RESTful.

@RequestBody – mapeia o corpo da solicitação HTTP para um objeto.

@PathVariable – define o recebimento de parâmetros de uma requisição.

@RequestParam – com essa anotação, podemos acessar parâmetros da solicitação HTTP.

@ExcepetionHandler – lida com exceções. A configuração do Spring detecta essa anotação e registra o método como manipulador de exceções para a classe de exceção do argumento e suas interfaces.

@ResponseStatus – com essa anotação, podemos especificar o status HTTP desejado da resposta.

@Entity – especifica que a classe representa uma entidade no banco de dados. O estado da classe anotada com essa annotation é gerenciado pelo contexto de persistência subjacente.

@GeneratedValue – especifica que o valor do identificador de entidade é gerado automaticamente utilizando a coluna de identidade, uma sequência de banco de dados ou um gerador de tabelas.

### **j) O que é um advice em Spring? Quais os tipos de advice para o Spring?**

Advice  é uma ação realizada por um aspecto em um ponto de junção específico. Diferentes tipos de conselhos incluem conselhos “around,” “before” and “after” advice.
### **k) O que é Spring IoC Container?**

Injeção de dependencias do framework responsável por instanciar,configurar e injetar  os objetos em outros objetos.Gerenciados pelo container do Spring(Bean)

### **l) Como adicionamos segurança à nossa aplicação Spring?**

Adicionando ao projeto Spring Security

### **m) Qual é o pacote Spring responsável pelas conexões com os bancos de dados?**

Spring Data 

### **n) Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade;**

Precisamos indicar ao Spring que ele tenha esse tipo de comportamento.A primeira delas é fazer com que a classe que esteja utilizando a @Scheduled seja gerenciada pelo Spring. A forma mais fácil de fazer isso é basicamente tornando-a um Component por meio da annotation @Component, precisamos apenas informar ao Spring que queremos habilitar o agendamento para ela por meio da annotation @EnableScheduling,As regras simples que precisamos seguir para anotar um método com @Scheduled são:
o método normalmente deve ter um tipo de retorno void (se não, o valor retornado será ignorado)
o método não deve esperar nenhum parâmetro.

Ex: Relatorios de um  fluxo de vendas por um determinado período, por exemplo, a cada hora, ou então, a cada dia.

---

## ✔**Desafio 11**


### 🏷**Sobre**

##  **Libs/Drivers** 


### **a) O que são libs quando se trata de código?**

Lib (ou biblioteca) é um conjunto de funcionalidades (no caso do Java, classes úteis ou funções úteis encapsuladas em classes) que podem ser reaproveitadas pelos seus projetos

### **b) Cite 2 libs populares no Java e seu objetivo**

Jackson - é o formato de troca de dados de fato no desenvolvimento de software moderno.

Mockito - Uma maneira de escrever o teste Unit/Integrationcom  operações de banco de dados, operações de E/S.

### **c) Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo pom.xml?**

Ferramenta de gerenciamento de dependencias  e automação de build e o pom.xml é onde ficam as configurações do mavem no projeto.

### **d) Qual é a diferença do Maven para o Grandle?**

Gradle é baseado em um gráfico de dependências de tarefas – em que as tarefas são as coisas que fazem o trabalho. Gradle possui o JCenter.

Maven é baseado em um modelo fixo e linear de fases.O Maven possui o Maven Central

### **e) Com os conhecimentos adquiridos até o agora, realize uma conexão com o desafio 3 onde falamos sobre JDBC, os drivers de comunicação com os bancos de dados.**

- I. Qual a relação entre os termos lib, driver e JDBC? 

São um conjunto de classes e interfaces ( API )com classes ou funções úteis encapsuladas em classes .

- II. Como é adicionado uma lib no projeto?  

Adicionando a dependencia no pom.xml.

- III.  Escolha  um  banco  de  dados  (menos  o  H2)  e  explique  como  utilizar  o  driver  de  comunicação.

Primeiro adicionamos o driver mysql no pom.xml com os JARs,configurando o datasource e uma das maneiras  que é no aplication properties  com a url de conexção onde o driver JDBC MYSQL ira interpretar o codigo com uma senha e um usúario. 

---
## ✔**Desafio 12**


### 🏷**Sobre**

##  **Testes** 

### **a) Explique o conceito de teste unitário?**

O teste unitário consiste em verificar o comportamento das menores unidades em sua aplicação, podendo ser esse componente uma função, procedimento, método, classe, objeto.. Garantindo que sua aplicação continue funcionando após alguma alteração em sua base de código.

### **b) Descreva como fazer um código de teste.**

1 - Criar a classe de teste.
2 - Criar um metodo que não retorna valor.
3 - Usar a anotação @Test para se tornar um teste gerenciado pelo Junit.
4 - Fazer injeção da classe de serviço para o método a ser testado.
5 - Mockar o Repository para utilizar uma simulação do banco de dados.
6 - Usar as assertivas para comparação dos resultados.


### **c) Qual o intuito do teste unitário?**

Validar que cada unidade de trabalho se comporta como projetada, esperada ou pretendida, fornecendo feedback quase instantâneo sobre o projeto e a implementação de seu código.

### **d)  Quais  são  as  ferramentas  que  utilizamos  para  realizar  testes  unitários(2  pelo  menos).**

- JUnit 
- Mockito.



- testaLancamentosDependentesNull_NotFound(testes.TrilhaBackTestes) - Testes para campos nulos.

- testaEntrygetLancamentosDependentes_OK(testes.TrilhaBackTestes) - Testes para registros ok. 

- testaLancamentosDependentesEmpty_NoCotent(testes.TrilhaBackTestes) - Teste para campos vazios.

--- 

## ✔**Desafio 13**

---
### 🏷**Sobre**


##  **Integração** 

---
### **Disponibilizando aplicação Angular para integração com a API.**
```
C:\Users\William_Cardoso\Documents\controle-financeiro>ng serve
Your global Angular CLI version (10.0.5) is greater than your local version (10.0.5). The local Angular CLI version is used.


√ Browser application bundle generation complete.

Initial Chunk Files                                                                | Names                                                                           |      Size
vendor.js                                                                          | vendor                                                                          |   3.08 MB
scripts.js                                                                         | scripts                                                                         | 667.48 kB
styles.css, styles.js                                                              | styles                                                                          | 559.27 kB
polyfills.js                                                                       | polyfills                                                                       | 467.37 kB
main.js                                                                            | main                                                                            |  15.48 kB
runtime.js                                                                         | runtime                                                                         |   9.27 kB

                                                                                   | Initial Total                                                                   |   4.76 MB

Lazy Chunk Files                                                                   | Names                                                                           |      Size
default~pages-categorias-categorias-module~pages-lancamentos-lancamentos-module.js | default~pages-categorias-categorias-module~pages-lancamentos-lancamentos-module |   1.29 MB
pages-lancamentos-lancamentos-module.js                                            | pages-lancamentos-lancamentos-module                                            | 125.25 kB
pages-categorias-categorias-module.js                                              | pages-categorias-categorias-module                                              |  32.78 kB

Build at: 2022-01-25T11:39:15.299Z - Hash: 51ea015210025736ad1c - Time: 75670ms


** Angular Live Development Server is listening on localhost:4200, open your browser on http://localhost:4200/ **

```
---
### **Configuração das Variáveis de Ambiente**

![variaveldeambiente](https://ik.imagekit.io/f1uatti9kjv/VariavelDeAmbiente_Tclm131G6.png?ik-sdk-version=javascript-1.4.3&updatedAt=1643125356576)


---
### ** ✔Aplicação integrada com a API**
---
### **Lista de Lançamentos**

![Lançamentos](https://ik.imagekit.io/f1uatti9kjv/lancamento_Q6jpcUJIh.png?ik-sdk-version=javascript-1.4.3&updatedAt=1643109741862)



### **Lista de Categorias**
![Categorias](https://ik.imagekit.io/f1uatti9kjv/Categoria_ndxvwMRxh.png?ik-sdk-version=javascript-1.4.3&updatedAt=1643109711285)



### **Editar Lançamento**
![Editando Lançamentos](https://ik.imagekit.io/f1uatti9kjv/EditandoLan%C3%A7amentos_DDw73shc4Jp.png?ik-sdk-version=javascript-1.4.3&updatedAt=1643109987016)


### **Editar Categoria**
![Editando Lançamentos](https://ik.imagekit.io/f1uatti9kjv/EditandoCategorias_nivjHYcxg.png?ik-sdk-version=javascript-1.4.3&updatedAt=1643109975074)


### **Cadastro de Novo Lançamento**
![Cadastro de lancamentos](https://ik.imagekit.io/f1uatti9kjv/Lancamentocadastro_ACiprkPAf.png?ik-sdk-version=javascript-1.4.3&updatedAt=1643109752955)


### **Cadastro de Nova Categoria**
![alt](https://ik.imagekit.io/f1uatti9kjv/CadastroNovaCategoria_2d6w5tQu7xN.png?ik-sdk-version=javascript-1.4.3&updatedAt=1643112767821)

---
---


## ✔**Desafio 14**

---
### 🏷**Sobre**


##  **Final** 


### **a) Desafio 1 - Git:**

**I. Dê 2 exemplos de situações onde é necessário utilizar merge:**

Quando fundimos duas branchs com a main e também quando se esta desenvolvendo projetos em equipe e precisamos fazer a fusão das branches coma as modificações de cada desenvolvedor.


**II. Com qual objetivo realizamos o commit?**

Quando trabalhando em um  projeto  precisamos guardar as alterações, e o commit salva  uma cópia no repositório local.

**III. Qual a diferença entre:** 

- git add -all: Insere todas as modificações dos arquivos modificados.
- git add  -u: Prepara as mudanças realizadas nos arquivos deletados e modificados 
- git add -A: Prepara todas as mudanças realizadas no diretório local. 
- git add: realiza a inclusão ou modificação do arquivo no diretório local  é utilizado para sinalizar que houve interação no diretório local,mantém o histórico de todas as ações realizadas no código, permitindo que, se algum problema ocorrer na aplicação, o comando de desfazer alteração possa ser acionado.

**I V.Qual  é  a  ordem  dos  comandos  para  subir  novas  atualizações,  verificando  se existem alterações a serem recebidas?**

Git status.
Git add (.,-all,-u,-A)
Git commit.
Git push
 
**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 1? Se não, justifique;**

Sim.
 ---

### **b) Desafio 2 - POO e Entity:**

**I. Qual é a finalidade da camada Entity?**

Uma camada onde ficam entidades de domínio para encapsular o comportamento e as regras do domínio.

**II. Para você, por que acha que seguimos a programação orientada a objetos?**

Entre os motivos dessa preferência, estão a possibilidade de reutilização de código e a capacidade da representação do sistema ser muito mais próximo do que vivenciamos no mundo real.

**III. Qual é o ideal por trás de utilizar os métodos getters e setters?**

Para se utilizar um dos pilares da POO,o encapsulamento e  provendo acessos ao objeto somente pelos metos getters e setters.

***I V. Qual o propósito de um construtor em uma classe? Podemos criar uma classe sem construtor?**

Construtores são basicamente funções de inicialização de uma classe, as quais são invocadas no momento em que objetos desta classe são criadas.
Sem um construror não seria possivel criar um objeto desta classe.


**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 2? Se não, justifique;**
Sim

---

### **c) Desafio 3 - HTTP, REST e Controller:**

**I. Qual é o objetivo da camada Controller?**

O controlador serve como um intermediário que organiza os eventos da interface com usuário e os direciona para a camada de modelo, assim, torna-se possível um reaproveitamento da camada de modelo em outros sistemas já que não existe dependência entre a visualização e o modelo

**II. No que os padrões REST nos auxiliam?**

Para desenvolver uma aplicação no modelo arquetutural utilizando os protocolos Http adequadamente ,seguindo algumas regras(constraints).

**III. Quais métodos HTTP utilizamos para montar um CRUD?**
Get,
Post,
Put,
Delete.

**IV.    Qual    a    diferença    entre    as    annotations    @PathVariable, @RequestParam, @RequestBody?  E  com  quais  métodos  HTTP  elas  podem  ser  utilizadas respectivamente?**


@PathVariable:serve para pegar um trecho da url que geralmente é dinâmico 
@RequestParam:é utilizado para pegar uma parâmetro de query da url
@RequestBody:corpo da requisição, é onde geralmente enviamos dados que queremos gravar no servidor.

**V. Para que serve ResponseEntity?**

Serve para manipular as resposta HTTP com códigos de status adequados.

**VI. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 3? Se não,justifique**

Sim.

---
### **d) Desafio 4 - JPA e Repository:**

**I. Qual é o propósito da camada Repository?**

Adicionar uma camada de abstração para acesso a dados,sem saber o mecanismo de persistencia que esta sendo utilizado.

**II. De maneira prática como funciona a injeção do Repository? E qual a sua relação com @Autowired?**

Com a Anotação @Repository na interface, o Spring tem um bean gerenciado e utilizamos a anotação @autowired para que o Spring injete fica a cargo do Spring uma isntancia da classe Repository. 


**III. Quais são as facilidades em utilizar JPA?**

Fornecer uma implementação em tempo de execução com uma interface com varios metodos implementados de acsso ao banco de dados.

**IV. Quais são os passos para configurar um banco de dados em um projeto Spring?**

Configurando o aqrquivo APPLICATION PROPERTIES passando parâmetros para o acesso ao banco de dados, a porta http que a API deverá utilizar, e diversos outros parâmetro.


**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 4? Se não, justifique;**
Sim.

---
### **e) Desafio 5 - Service:**

**I. Qual é a finalidade da camada Service?**

Realizar uma tarefa especifica do dominio,quando um processo não é responsabilidade do dominio.

**II. Qual o sentido de um método ter apenas um propósito?**

O metodo so deve existir para um unico propósito uma unica tarefa evitando mais de uma responsabilidade.

**III. Qual a diferença entre um método void e métodos tipados?**

O método void não retorna valores e um método tipado devolve um objeto do tipo declarado.

***IV. É normal um serviço chamar outro?**

Sim, os services podem interagim com outros services.

**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 5? Se não, justifique;**
Sim

---

### **f) Desafio 6 - DTO:**

**I. Quais problemas conseguimos resolver utilizando a camada DTO?**

Isolando o Domain Model do Representation Model com o padrão DTO evitando compartilhar a mesma classe.

**II.  Qual  a  diferença  de  realizarmos  o  “de  para”  utilizando  constructor  ou  getters  e  setters?**

Os contrutores são iniciados quando a classe é instanciada, e os getter e setters são para encapsular os dados.

**III. No que a utilização do Mapper nos auxilia? Achou fácil a implementação?**

 Auxilia eliminar codigos repetitivos com getters e setters e automatizando com a biblioteca Mapper para mapear os objetos em transformação em outro objeto foi façil e rapido..


**IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 6? Se não, justifique.**
Sim.

---

### **g) Desafio 7 - Manipulação de dados:**

**I. Qual é a forma de validar os dados de uma requisição sem utilizar @Valid?**

Podemos utilizar o Bean Validator.

**II. Para que serve um ENUM? Cite exemplos;**

São tipos de campos que consistem em um conjunto fixo de constantes, sendo como uma lista de valores pré-definidos.


**III. Como criamos um custom validator? E qual o objetivo de criar um?**

Criamos uma interface para criar uma validação coma as anotações de @Constraint,@Target,@Retention em nivel de classe.
Usamos a criação de um custom validator primeiro por questao de semantica, para uma validação que se repete em varios lugares no código e outra se for preciso mudar alguma regra de validação fica facil a manutenção alterando somente as regras contidas na validação.

**IV. Qual foi a diferença entre utilizar for e streams no desafio 6?**

Teve uma redução significativa do código e a interpretação de um Stream ficou mais clara o entendimento.

**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 7? Se não, justifique;**
Sim.

---
### **h) Desafio 8 - Tratamento de exceptions:**

**I. Qual a finalidade de trata-las?**

Para evitarmos um erro por  usuarios que usam a API de maneira errada ou erro que um estado da aplicação não permite, repassando um status correto e uma mensagem do erro.

**II. Como as descobrimos?**

Quando a aplicação recebe algum dado que a aplicação não permite.

**III. Como fazemos para estourar um exception em uma determinada linha?**

Lançando uma excecao no ponto desejado utilizando (throw new).

**IV. Qual é a melhor forma de implementarmos nosso controle de exceções?**

Utilizando uma classe, um ponto central para conter todas as execções lançadas com anotação @ControleAdvice.

**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 8? Se não, justifique;**
Sim

---
### **i) Desafio 9 - Patterns, SOLID e Arquitetura:**

**I. O que é Singleton Pattern?**

Um padrão de projeto criacional, que garante que apenas um objeto desse tipo exista e forneça um único ponto de acesso a ele para qualquer outro código

**II. O que significa a letra D de SOLID e como se aplica na camada de Repository?**

D:Princípio de Inversão de Dependência.
A camada Repository é uma interface sendo assim devemos depender de abstrações e não de classes concretas.

**III. Qual o objetivo das camadas?**

O padrão determina a organização do software,uma boa forma de organizar as responsabilidades

**IV. Qual arquitetura é melhor DDD, Hexagonal ou Clean?**

O Padrão DDD.

**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 9? Se não, justifique;**
Sim.

---

### **j) Desafio 10 - Spring:**


**I. Qual a diferença entre Java e Spring?**

Java é uma linguagem de programação.
Spring é um fremework para desenvolver aplicações Java com varios  projetos que facilitam o desenvolvimento.

**II. É possível utilizar Spring Data sozinho?**

Não.Spring Data Framework para acesso e manipulação de dados, precisa de um subprojeto que fornece um repositório genérico para sua utilização.

**III. É possível utilizar Spring Boot, Spring Data e Spring Security em apenas um projeto? Se sim, como é feito a integração?** 

 Sim.A integração se da com as injeções das dependencias de cada projeto.

**IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 10? Se não, justifique**

Sim

---
### **k) Desafio 11 - Libs:**

**I. Cite 5 libs que utilizou durante a trilha e suas respectivas funcionalidades;**

Jackson - é o formato de troca de dados de fato no desenvolvimento de software moderno.

Mockito - Uma maneira de escrever o teste Unit/Integration com  operações de banco de dados, operações de E/S.

Lombok - reduçao de codigos repetidos utilizando anotações paraconstrutores e getters e setters.

JUnit- utilizado para testes da aplicação.

ModelMapper - Utilizado para transformações de um objeto em outro evitando repetições de códigos.


**II. Qual a diferença entre uma lib e um driver?**

Ambos são biliotecas,um conjunto de classes e interfaces.

**III. Existe limite de libs por projeto?**

Não.

**IV. Por que utilizar um gerenciador de dependências?**

Para se ter um ponto central onde ficam as configurações do projeto.

**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 11? Se não, justifique;**
Sim

---

### **L) Desafio 12 - Testes unitários:**

**I. Por que DEVOPS exige uma porcentagem de cobertura mínima nos projetos?**

Para poderem assim criar, testar e liberar software de maneira mais rápida e confiável  a metodologia devops compartilhar responsabilidade de segurança da aplicação, sendo assim a parte de desenvolvimentos e teste é imprescindível para a garantia de que o software esta em bom estado de funcionamento antes de subir a aplicação.

**II. Qual o objetivo de utilizar Mockito? Dê um exemplo;**

O seu principal objetivo é simular a instancia de classes e comportamento de métodos.
Uma classe de serviço possui um método que precise acessar um BD.

**III. O que é o Sonar? E qual é o seu papel?**

O sonar é um projeto open source que visa justamente, avaliar a qualidade de seu código. Para isso ele avalia a arquitetura e design, número de comentários, regras do java, alto nível de complexidade, código duplicado, cobertura de testes no código, etc. Além de possuir um número bastante extenso de plugins.

**IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 12? Se não, justifique.**
 Sim.

 ---

 ### **m) Desafio 13 - Integração:**

 **I. Como foi o processo de integração?**

 Com as orientações no desafio e estudos voltados para o assunto não foi complicado fazer a integração .

 **II. Quais foram as principais dificuldades?**

  O entendimento das requisições de origens diferentes para o funcionamento da integração.

 **III. Obteve algum erro de CORS?**

 Sim.

 **IV. O que é CORS?**

Uma politica de mesma origem implemenmtadas pelos navegadores para requisições de origens diferentes.

**V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 13? Se não, justifique.**
 Sim.

 ---