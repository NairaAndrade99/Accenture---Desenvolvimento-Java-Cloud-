## Introdução a Linguagem JAVA 

*__História da Linguagem Java__*

_Origem (1991 – 1995)_

#### * Java foi iniciado em 1991 pela equipe Green Team, liderada por James Gosling na Sun Microsystems.

#### * Inicialmente chamado de Oak, o projeto buscava criar uma linguagem para aparelhos eletrônicos domésticos.

#### * O nome foi alterado para Java em 1995, inspirado no café Java da Indonésia, porque “Oak” já era registrado.

_Primeira Versão Pública (1995)_

#### * Lançamento do Java 1.0, com o slogan: “Write Once, Run Anywhere” (WORA) — escrever uma vez, rodar em qualquer plataforma.

#### * Introduziu a Java Virtual Machine (JVM), que permite que programas Java sejam executados em diferentes sistemas operacionais sem alteração do código.

__Evolução e Popularização (1996 – 2000)__

#### * Java 1.1 (1997) trouxe inner classes, JDBC e melhorias na APIs.

#### * Java tornou-se a base para aplicações web, aplicativos corporativos e software de servidor.

_Java SE e Java EE_

#### * Java SE (Standard Edition): desenvolvimento de aplicações desktop e base para Java.

#### * Java EE (Enterprise Edition): usado em sistemas corporativos e aplicações web.

_Aquisição e Continuidade_

#### * Em 2010, a Sun Microsystems foi adquirida pela Oracle, que passou a gerenciar o desenvolvimento do Java.

#### * Java continuou evoluindo com novas versões anuais, adicionando recursos modernos como lambda expressions, streams, modules, e melhorias de performance.

_Java Hoje_

#### * Java é uma das linguagens mais populares do mundo.

#### * Usada em aplicações corporativas, web, mobile (Android), IoT e cloud computing.

#### * Mantém o princípio WORA, forte tipagem e grande portabilidade.


---------

### _Entendendo o que são Gerenciadores de Build_
#### O que é "Build"?
##### No contexto da programação, build é o processo de transformar o código-fonte de um programa em algo que possa ser executado ou distribuído. Esse processo geralmente inclui compilar os arquivos .java em .class, gerenciar e baixar bibliotecas externas (dependências), executar testes automatizados, empacotar o programa em um arquivo final (como um .jar ou .war) e preparar o projeto para distribuição.

###### Realizar todas essas tarefas manualmente pode ser demorado, repetitivo e sujeito a erros. Por isso, utilizamos ferramentas que automatizam esse fluxo: os gerenciadores de build.

#### O que é um Gerenciador de Build?
#### É uma ferramenta que automatiza e organiza todo o processo de build de um projeto Java (ou outros). Com ele, você define o que precisa ser feito e o gerenciador cuida da execução.

#### Principais Gerenciadores de Build em Java
#### Ao desenvolver projetos Java, é comum precisarmos compilar o código, rodar testes, empacotar o projeto em um arquivo .jar ou .war, e gerenciar bibliotecas externas (dependências). Fazer tudo isso manualmente seria trabalhoso e propenso a erros. Por isso, usamos gerenciadores de build.

#### Os dois principais gerenciadores de build no ecossistema Java são o Maven e o Gradle.

_Maven_
##### O Maven é uma ferramenta tradicional e muito usada no mercado corporativo. Ele segue o princípio da “convenção sobre configuração”, ou seja, usa uma estrutura de pastas padrão e arquivos XML para definir como o projeto deve ser construído.

_Gradle_
##### O Gradle é uma ferramenta mais moderna e flexível. Ele usa scripts escritos em Groovy (ou Kotlin) no arquivo build.gradle. Por ser baseado em scripts e não em XML, o Gradle permite uma configuração mais personalizada e expressiva.

-----------------------
#### Saída na tela 

~~~~JAVA 
        System.out.println("Hello, World!");
        System.out.println( "Bem-vindo a Accenture Brasil");
        System.out.println( "DIO");
~~~~