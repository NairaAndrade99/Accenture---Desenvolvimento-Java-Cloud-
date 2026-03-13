### SpringBoo Framework 
Spring Framework é um framework open source para desenvolvimento de aplicações em Java. Ele fornece um conjunto de ferramentas e bibliotecas que ajudam a criar aplicações web, APIs, sistemas empresariais e microserviços de forma organizada e escalável.

### Inversão de controle 

Inversion of Control (IoC) é um princípio de design de software em que o controle da criação e gerenciamento de objetos é invertido: em vez de a aplicação criar e controlar tudo diretamente, um framework faz isso por você.

No ecossistema Java, esse conceito é muito usado no Spring Framework e no Spring Boot.

### Injeção de dependencia 
Dependency Injection (Injeção de Dependência) é um padrão de design em que um objeto recebe suas dependências de fora, em vez de criá-las sozinho.

Esse conceito é muito usado no Spring Framework e no Spring Boot para deixar o código mais organizado, desacoplado e fácil de testar.

### Beans 
No Spring Framework, um Bean é um objeto que é criado, configurado e gerenciado pelo container do Spring.

Em outras palavras:
um Bean é uma classe Java que o Spring controla automaticamente.

Esse gerenciamento acontece dentro do IoC Container, que usa o princípio de Inversion of Control e Dependency Injection.

### Escopes 
No Spring Framework, Scopes (escopos) definem o ciclo de vida e a visibilidade de um Bean dentro da aplicação.

Ou seja, o scope determina quantas instâncias de um Bean serão criadas e quando elas serão usadas.

### Singleton 
Singleton é um padrão de design que garante que uma classe tenha apenas uma única instância durante toda a execução da aplicação.

No ecossistema do Spring Framework, Singleton é o scope padrão dos Beans.

### Prototype 
Prototype é um scope de Bean no Spring Framework que faz com que uma nova instância do objeto seja criada toda vez que ele for solicitado.

Ele é o oposto do Singleton, que cria apenas uma instância para toda a aplicação.

### HTTP Request 
Uma HTTP Request (Requisição HTTP) é uma mensagem enviada por um cliente para um servidor na web para solicitar algum recurso ou ação.

Esse processo faz parte do protocolo HTTP, usado para comunicação entre navegadores, aplicativos e servidores.

### HTTP Session 
Uma HTTP Session é um mecanismo usado para manter o estado de um usuário entre múltiplas requisições HTTP.

Isso é necessário porque o protocolo HTTP é stateless (sem estado), ou seja, cada requisição é independente e o servidor, por padrão, não lembra quem você é.

### Autowired 
@Autowired é uma anotação do Spring Framework usada para fazer a injeção automática de dependências em um Bean.

-----------------------------------------

### SpringBoot
Ele é considerado um dos frameworks mais importantes do ecossistema Java.
Spring Boot é um framework Java usado para criar aplicações web, APIs e microserviços de forma rápida e simples. Ele faz parte do ecossistema do Spring Framework, mas foi criado para reduzir a configuração complexa que o Spring tradicional exigia.

### Starters 
No Spring Boot, os Starters são pacotes prontos de dependências Maven ou Gradle que facilitam a configuração de projetos.

Eles agregam várias bibliotecas necessárias para um tipo específico de aplicação, sem que você precise adicionar cada dependência manualmente

Starters mais comuns

| Starter                         | Para que serve                             |
| ------------------------------- | ------------------------------------------ |
| `spring-boot-starter-web`       | APIs REST e aplicações web                 |
| `spring-boot-starter-data-jpa`  | Acesso a bancos de dados com JPA/Hibernate |
| `spring-boot-starter-security`  | Autenticação e segurança                   |
| `spring-boot-starter-test`      | Testes unitários e de integração           |
| `spring-boot-starter-thymeleaf` | Templates HTML com Thymeleaf               |

### Beans Vs Components 

Beans 
No Spring Framework, Beans são objetos que são criados, configurados e gerenciados pelo container do Spring.

Ou seja, um Bean é uma classe Java cujo ciclo de vida é controlado pelo Spring.

Em Java normal, você cria objetos assim:

~~~JAVA 
UserService service = new UserService();
~~~

Exemplo de Bean
~~~java 
@Service
public class UserService {
}
~~~

Quando a aplicação inicia, o Spring cria um Bean da classe UserService.
Depois ele pode ser injetado em outras classes usando Dependency Injection.

~~~JAVA 
@Service
public class OrderService {

    private final UserService userService;

    public OrderService(UserService userService) {
        this.userService = userService;
    }
}
~~~