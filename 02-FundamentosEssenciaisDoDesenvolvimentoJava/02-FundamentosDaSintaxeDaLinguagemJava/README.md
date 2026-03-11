### Sintaxe da linguagem JAVA 

_Declarando uma variavel_

~~~JAVA 
 tipo nomeVarivel;
 ~~~

 Exemplo

 ~~~JAVA 
int idade;
~~~
------
_Comentario em Java_

Uma linha 
~~~JAVA 
//comentario de uma linha 
~~~

Mais linhas 
~~~JAVA 
/*Comentario com mais linhas*/
~~~
-----
_Scanner_

Scanner é uma classe que facilita a leitura de dados fornecidos pelo usuário ou de outras fontes de entrada, como arquivos ou strings. Ele pertence ao pacote java.util

~~~JAVA 
Scanner nome = new Scanner(System.in);
~~~

Obter valor do atributo infrmado pelo usuario 

~~~JAVA 
String nome = sc.next();
~~~
-----
_Saída na tela_

Exibir mensagem 
~~~JAVA 
System.out.print("Olá, mundo !");
~~~

Exibir valor de uma variavel 
~~~JAVA 
System.out.print(nome);
~~~
----
*Print X Println*

_Print não pula linha, já o println pula uma linha._

----
_Declaração de constantes_ 

Em Java, constantes são valores que não podem ser alterados depois de definidos. Elas são declaradas usando a palavra-chave final.

Em Java, por convenção, constantes são escritas em letras maiúsculas e palavras separadas por underscore

~~~JAVA 

final int IDADE = 15;
~~~

Constantes estáticas (mais comum em classes)
Quando queremos que a constante pertença à classe inteira, usamos static final

~~~JAVA 
public class Config {
    public static final int MAX_TENTATIVAS = 3;
}
~~~

Exibir o valor de uma constante 
~~~JAVA 
System.out.print(MAX_TENTATIVAS);
~~~
----
_Keyswords_ 

Em Java, keywords (palavras-chave) são palavras reservadas da linguagem que possuem um significado especial para o compilador. Elas não podem ser usadas como nomes de variáveis, classes ou métodos.

_Tipos primitivos_

nome| descrição    | exemplo
----| --------------|---------
int | numeros inteiros| int idade = 12
float| números decimais| float preco = 15.254
boolean| condicional | boolean pergunta = 'true'
byte | números inteiros pequenos| byte idade = 20;
char  | um unico caractere| char letra = 'A';
double| decimais mais precisos| double salario = 3500.75;
long | inteiros grandes| long populacao = 9000000000L;
short | inteiros menores| short ano = 2024;

----

Operadores de atribuição e lógicos 

Atribuir valores às variáveis.

operador| descricao | exemplo
----|-------| -----------
= | atribução| String nome = "Naira"
+= | soma e atribução| int soma += 2;
-= | subtração e atrubuição |  int sub -= 2;
*= | multiplicação e atribuição| int mult *= 2;
/= | divisão e atribuição | int div /= 2;
%= | resto da divisão| int soma %= 2 

Operadores Lógicos

operador| descrição | exemplo 
----|-----|------
&& | AND (E)| arroz e feijao - as duas condicoes tem que ser atendida
_||_ | OR (OU) | cafe ou cha - uma das condicoes tem que ser atendida
! | NOT (NÃO) |  nega a condição

Operadores relacionais do Java

operador| descrição| exemplo 
-------|-------|------
== | igual |  int idade == 18;
(>=) | maior ou igual | idade >= 18;
(<=) | menor ou igual | idade <= 18;
(>) | maior | idade >  18;
(<) | menor | idade < 18;
!= | diferente | idade != 18; 

-------------
Operadores Aritméticos em Java

operador| descrição| exemplo
----|----|----
+ | subtração | 2 + 2
- | subtração | 4 - 2
* | multiplicação | 4 * 9
/ | divisão | 4 / 2
% | resto da divisão | 8 % 4

------
Operadores bit-a-bit 

Em Java, os operadores bit a bit (bitwise) são usados para manipular bits individuais de números inteiros (byte, short, int, long). Eles trabalham diretamente na representação binária dos números.


Operador| Nome |	Função
----|-------|------
& | AND |retorna 1 se ambos os bits forem 1
' |  ' | OR
^ |	XOR |	retorna 1 se os bits forem diferentes
~	| NOT	|inverte os bits
(<<) |	Shift left |	desloca bits para a esquerda
(>>)	| Shift right	| desloca bits para a direita
(>>>)	| Shift right | sem sinal	desloca para direita preenchendo com 0

--------------------------

Buscar ano atual do servidor 

~~~JAVA 
var baseYear = OffsetDateTime.now().getYear();
~~~

