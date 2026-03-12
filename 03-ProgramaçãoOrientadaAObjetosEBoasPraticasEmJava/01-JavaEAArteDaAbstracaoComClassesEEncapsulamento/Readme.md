### Classes 
Uma classe em Programação Orientada a Objetos (POO) é como uma "fôrma" ou "molde" para criar objetos. Ela define um tipo de dado personalizado, agrupando:

* Atributos (também chamados de propriedades ou campos): que representam as características ou estado do objeto.

* Métodos (funções dentro da classe): que representam o comportamento ou as ações que o objeto pode realizar.

| Conceito  | O que é                      |
| --------- | ---------------------------- |
| Classe    | Molde para criar objetos     |
| Objeto    | Instância concreta da classe |
| Atributos | Dados/características        |
| Métodos   | Comportamentos/funções       |

~~~JAVA 
// Pessoa é a classe
public class Pessoa{

// nome e idade são os atributos
    String nome;
    int idade;

//falar são os metodos 
public void falar (){
     System.out.println("Olá, meu nome é " + nome);
 }
}
~~~

criando o objeto 

~~~JAVA 
Pessoa pessoa = new Pessoa ();

pessoa.nome = "Naira";
pessoa.idade =  26;

pessoa.falr();
~~~

-----

Getters e Setters 

Em Programação Orientada a Objetos (POO), os getters e setters são métodos usados para acessar e modificar os atributos de uma classe de forma segura, mantendo o encapsulamento.

Eles permitem controlar como os dados internos de um objeto são lidos ou alterados, em vez de acessar diretamente os atributos.

_Conceito_

* Getter (get): retorna o valor de um atributo.

* Setter (set): altera o valor de um atributo.

~~~Java 
public class Pessoa{
     
     private String nome;
     private int idade;

public void falar(){
     System.out.println("Olá, meu nome é " + nome);
} 
public String getNome(){
      return nome;
} 
public void setNome(String nome){
     this.nome = nome;
}
public int getIdade(){
      return idade;
}
public void setIdade(int idade){
       this.idade = idade
}
}
~~~

~~~Java 
Pessoa pessoa = new Pessoa();

pessoa.setNome("Naira");
pessoa.setIdade(26);

System.out.printf("Meu nome é %s e tenho %d ", pesso.getNome(), pessoa.getIdade());
~~~
------
Construtores 

Em Java, um construtor é um método especial de uma classe usado para inicializar objetos quando eles são criados.

Ele tem algumas características importantes:

* Tem o mesmo nome da classe.

* Não possui tipo de retorno, nem mesmo void.

* Pode receber parâmetros para inicializar os atributos do objeto.

_Construtor sem parametros_

~~~JAVA
public Pessoa(){

}
~~~
_Construtor com parametros_

~~~JAVA 
public Pessoa(String nome,int idade){
      this.nome = nome;
      this.idade = idade;
}
~~~

| Conceito             | Descrição                                         |
| -------------------- | ------------------------------------------------- |
| Construtor           | Inicializa objetos da classe                      |
| Mesmo nome da classe | Obrigatório                                       |
| Sem tipo de retorno  | Sempre                                            |
| Pode ter parâmetros  | Sim, para inicializar atributos                   |
| Construtor padrão    | Existe só se não houver outro construtor definido |

--------------------

_Public_

Define visibilidade: quem pode acessar a classe, método ou atributo.
public significa que qualquer outra classe pode acessar.

~~~JAVA 
public class Pessoa {
    public String nome;  // qualquer classe pode acessar
}
~~~

_Private_

Também define visibilidade, mas mais restritiva.
private significa que somente a própria classe pode acessar.
Geralmente usado com atributos, junto com getters e setters.

~~~JAVA 
public class Pessoa {
    private int idade;  // só esta classe pode acessar diretamente

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        
            this.idade = idade;
    }
}
~~~

_Void_

Define que um método não retorna nenhum valor.
Se um método precisa devolver algo, usamos outro tipo (int, String, etc.).

~~~JAVA 
public void dizerOla() {
    System.out.println("Olá!");
}
~~~

_Static_

Pertence à classe, não ao objeto.
Significa que você não precisa criar um objeto para usar esse método ou atributo.

~~~JAVA 
public class Matematica {
    public static int somar(int a, int b) {
        return a + b;
    }
}

// Uso:
int resultado = Matematica.somar(5, 3);
~~~

_Final_

Pode ser usado em variáveis, métodos ou classes.
Indica imutabilidade ou não herança.

Variavel 
~~~Java 
final double PI = 3.14159;  // valor não pode mudar
~~~

Metodo
~~~JAVA 
public final void metodoSeguro() {
    System.out.println("Não pode ser sobrescrito!");
}
~~~

Classe 
~~~JAVA 
public final void metodoSeguro() {
    System.out.println("Não pode ser sobrescrito!");
}
~~~

| Palavra-chave | Onde usar                | Significado                                            |
| ------------- | ------------------------ | ------------------------------------------------------ |
| `public`      | classe, método, atributo | acessível de qualquer lugar                            |
| `private`     | atributo ou método       | acessível apenas dentro da própria classe              |
| `void`        | método                   | não retorna valor                                      |
| `static`      | método ou atributo       | pertence à classe, não ao objeto                       |
| `final`       | variável, método, classe | constante / não pode ser sobrescrito / não pode herdar |
------------------

Record 

Em Java, um record é um tipo especial de classe imutável e concisa, usado para representar dados simples, como “modelos” ou “registros” de informações.
Ele foi introduzido no Java 14 (preview) e se tornou oficial no Java 16.

O objetivo é reduzir o código boilerplate (construtores, getters, toString, equals, hashCode) quando você só precisa de uma classe para armazenar dados.

Características principais dos records:

* Imutabilidade: os atributos são final por padrão.

* Construtor automático: o compilador gera um construtor com todos os campos.

* Getters automáticos: os métodos para acessar os campos são criados automaticamente, com o nome do campo.

toString(), hashCode() e equals() já são implementados automaticamente

~~~JAVA 
public record Pessoa(String nome, int idade) {
}
~~~~
~~~~jAVA
        Pessoa p = new Pessoa("Maria", 30);

        // Acessando os campos
        System.out.println("Nome: " + p.nome());
        System.out.println("Idade: " + p.idade());

        // toString automático
        System.out.println(p);
~~~