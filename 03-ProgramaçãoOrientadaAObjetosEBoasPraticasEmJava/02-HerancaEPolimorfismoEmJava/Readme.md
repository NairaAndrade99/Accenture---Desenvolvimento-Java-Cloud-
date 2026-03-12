## Herança e Polimorfismo 

Em Programação Orientada a Objetos (POO), herança e polimorfismo são dois conceitos importantes usados para reutilizar código e tornar os programas mais flexíveis.

_Herança_

Herança acontece quando uma classe herda características de outra classe.

* A classe que fornece as características é chamada de classe pai (superclasse).
* A classe que herda é chamada de classe filha (subclasse).

Isso evita repetir código.

~~~JAVA 

public class Animal {

  public void fazerSom (){
      System.out.println("");
  }
}

public class Cachorro extends Animal {

         public void latir (){
             System.out.println("Cachoro late");
  }
}
~~~

~~~JAVA 
public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.fazerSom(); // herdado da classe Animal
        c.latir();    // método da classe Cachorro
    }
}
~~~

_Polimorfismo_

Polimorfismo significa “muitas formas”.

Ele permite que um método tenha comportamentos diferentes dependendo do objeto que o usa.
Isso acontece muito com sobrescrita de métodos (@Override).

~~~JAVA
class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O cachorro late");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O gato mia");
    }
}
~~~

~~~JAVA 
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.fazerSom();
        a2.fazerSom();
    }
}
~~~

| Conceito         | O que faz                                                 |
| ---------------- | --------------------------------------------------------- |
| **Herança**      | Permite que uma classe herde atributos e métodos de outra |
| **Polimorfismo** | Permite que um método tenha comportamentos diferentes     |

-------

Sealed 

Uma classe sealed permite definir quais classes podem estendê-la.
Ou seja, nem qualquer classe pode herdar dela.

~~~JAVA
public sealed class Animal permits Cachorro, Gato {
}
~~~

Classes que herdam

As classes filhas precisam declarar um modificador especial:

* final
* sealed
* non-sealed

~~~java 
sealed class Animal permits Cachorro, Gato {
    void fazerSom() {
        System.out.println("Animal faz som");
    }
}

final class Cachorro extends Animal {
}

non-sealed class Gato extends Animal {
}
~~~