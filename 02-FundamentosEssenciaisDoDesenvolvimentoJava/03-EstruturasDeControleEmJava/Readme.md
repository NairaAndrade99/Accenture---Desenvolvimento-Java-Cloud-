## Estruturas condicionais 

_if_

A estrutura condicional if é usada em programação para tomar decisões. Ela executa um bloco de código somente se uma condição for verdadeira.

~~~JAVA 
if (idade > 18){
    System.out.println("Maior de idade");
}
~~~

_if-else_

O else executa um bloco de código quando a condição do if é falsa.

~~~JAVA
if (idade >= 18){
    System.out.println("Maior de idade !");
}else {
    System.out.println("Menor de idade !");
}
~~~

_else-if_
O else if é usado quando você quer testar outra condição caso o if seja falso.

~~~JAVA 
if (idade >= 18){
    System.out.println("Adulto !");
}else if (idade > 13 && idade < 18 ){`
    System.out.println("Adolescente !");
}else {
     System.out.println("Criança !")
}
~~~

_Swictch-case_

O switch-case é uma estrutura de decisão usada quando você quer comparar uma variável com vários valores possíveis.
Ele é uma alternativa ao uso de vários if / else if.

~~~JAVA
 int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;

    case 2:
        System.out.println("Segunda-feira");
        break;

    case 3:
        System.out.println("Terça-feira");
        break;

    default:
        System.out.println("Dia inválido");
}
~~~

Estrutura de repetição 

_for_

A estrutura de repetição for é usada para executar um bloco de código várias vezes, geralmente quando você já sabe quantas vezes o loop deve repetir.

Sintaxe 

~~~JAVA 
for (inicialização; condição; incremento) {
    // código que será repetido
}
~~~

Exemplo 
~~~JAVA 
for (int i = 0; i < 5; i++){

     System.out.println(i);
}
~~~
~~~java
   1
   2
   3
   4
   5
   6
~~~
_while_

A estrutura de repetição while é usada para executar um bloco de código enquanto uma condição for verdadeira.

Ela é muito usada quando não sabemos exatamente quantas vezes o loop vai repetir.

sntaxe 
~~~JAVA 
while (condição) {
    // código que será repetido
}
~~~

Exemplo 

~~~JAVA 
int i = 1;

while (i <= 5) {
    System.out.println("%d\n", i);
    i++;
}
~~~

Saída 

~~~JAVA 
1
2
3
4
5
~~~

_Do-While_

A estrutura de repetição do-while é usada para executar um bloco de código pelo menos uma vez, e depois verificar a condição.

Sintaxe 
~~~JAVA 
do {
    // código que será executado
} while (condição);
~~~

Exemplo 
~~~JAVA 
int i = 1;

do {
    System.out.println("%d\n", i);
    i++;
} while (i <= 5);
~~~

Saída 
~~~JAVA 
1
2
3
4
5
~~~