# 100 Questões de Programação Orientada a Objetos em Java – Universo Naruto

## Legenda de Níveis

- **Nível 1**: 1 Pilar (Encapsulamento)
- **Nível 2**: 2 Pilares (Encapsulamento + Herança)
- **Nível 3**: 3 Pilares (Encapsulamento + Herança + Polimorfismo)
- **Nível 4**: 4 Pilares (Encapsulamento + Herança + Polimorfismo + Abstração)

---

## **NÍVEL 1 – ENCAPSULAMENTO**

### **Questão 1** – Nível 1

**Enunciado**: Naruto acabou de entrar na Academia Ninja e quer registrar seus dados no sistema de ninjas. Crie uma classe `Ninja` com dois atributos privados: `nome` (String) e `idade` (int). Implemente métodos públicos `getNome`, `setNome`, `getIdade` e `setIdade` para acessar e modificar esses dados.

**Objetivos**:
- Criar classe com atributos privados
- Implementar métodos getter e setter

**Entrada Simulada**:
- Nome: "Naruto Uzumaki"
- Idade: 12

**Saída Esperada**:

```
Nome do ninja: Naruto Uzumaki
Idade do ninja: 12
```

**Exemplo de Código Esperado**:

```java
public class Ninja {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

---

### **Questão 2** – Nível 1

**Enunciado**: Sasuke quer registrar seus jutsus favoritos. Crie a classe `Jutsu` com dois atributos privados: `nome` (String) e `tipo` (String). Implemente os métodos públicos para acessar e alterar esses atributos.

**Objetivos**:
- Praticar encapsulamento com atributos privados
- Usar getters e setters

**Entrada Simulada**:
- Nome: "Chidori"
- Tipo: "Raiton"

**Saída Esperada**:

```
Nome do jutsu: Chidori
Tipo do jutsu: Raiton
```

**Exemplo de Código Esperado**:

```java
public class Jutsu {
    private String nome;
    private String tipo;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
```

---

### **Questão 3** – Nível 1

**Enunciado**: Sakura recebe uma missão de rank D. Crie a classe `Missao` com os atributos privados `descricao` (String) e `rank` (char). Implemente métodos para acessar e modificar esses atributos.

**Objetivos**:
- Praticar encapsulamento
- Usar métodos de acesso

**Entrada Simulada**:
- Descrição: "Buscar ervas medicinais"
- Rank: 'D'

**Saída Esperada**:

```
Missão: Buscar ervas medicinais
Rank: D
```

**Exemplo de Código Esperado**:

```java
public class Missao {
    private String descricao;
    private char rank;

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public char getRank() { return rank; }
    public void setRank(char rank) { this.rank = rank; }
}
```

---

### **Questão 4** – Nível 1

**Enunciado**: Kakashi é um sensei famoso em Konoha. Crie a classe `Sensei` com atributos privados `nome` (String) e `especialidade` (String). Implemente getters e setters para ambos.

**Objetivos**:
- Criar classe com atributos privados
- Implementar métodos de acesso

**Entrada Simulada**:
- Nome: "Kakashi Hatake"
- Especialidade: "Sharingan"

**Saída Esperada**:

```
Sensei: Kakashi Hatake
Especialidade: Sharingan
```

**Exemplo de Código Esperado**:

```java
public class Sensei {
    private String nome;
    private String especialidade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
}
```

---

### **Questão 5** – Nível 1

**Enunciado**: As aldeias escondidas são lideradas por grandes ninjas. Crie a classe `Aldeia` com os atributos privados `nome` (String) e `lider` (String). Implemente métodos públicos para acesso.

**Objetivos**:
- Praticar encapsulamento básico
- Usar métodos getter e setter

**Entrada Simulada**:
- Nome: "Konoha"
- Líder: "Hokage"

**Saída Esperada**:

```
Aldeia: Konoha
Líder: Hokage
```

**Exemplo de Código Esperado**:

```java
public class Aldeia {
    private String nome;
    private String lider;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLider() { return lider; }
    public void setLider(String lider) { this.lider = lider; }
}
```

---

### **Questão 6** – Nível 1

**Enunciado**: Gaara, de Suna, quer registrar seu título. Crie a classe `NinjaSuna` com atributos privados `nome` (String) e `titulo` (String). Implemente os métodos de acesso necessários.

**Objetivos**:
- Encapsular dados do ninja
- Usar métodos getter e setter

**Entrada Simulada**:
- Nome: "Gaara"
- Título: "Kazekage"

**Saída Esperada**:

```
Nome: Gaara
Título: Kazekage
```

**Exemplo de Código Esperado**:

```java
public class NinjaSuna {
    private String nome;
    private String titulo;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
}
```

---

### **Questão 7** – Nível 1

**Enunciado**: Hinata possui o Byakugan. Crie uma classe `NinjaHyuga` com atributos privados `nome` (String) e `habilidadeEspecial` (String). Implemente os métodos necessários.

**Objetivos**:
- Praticar encapsulamento de atributos
- Usar métodos de acesso

**Entrada Simulada**:
- Nome: "Hinata Hyuga"
- Habilidade Especial: "Byakugan"

**Saída Esperada**:

```
Nome: Hinata Hyuga
Habilidade Especial: Byakugan
```

**Exemplo de Código Esperado**:

```java
public class NinjaHyuga {
    private String nome;
    private String habilidadeEspecial;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getHabilidadeEspecial() { return habilidadeEspecial; }
    public void setHabilidadeEspecial(String habilidadeEspecial) { this.habilidadeEspecial = habilidadeEspecial; }
}
```

---

### **Questão 8** – Nível 1

**Enunciado**: Shikamaru é mestre em estratégias. Crie a classe `Estrategista` com os atributos privados `nome` (String) e `nivelEstrategia` (int). Implemente métodos públicos para acessar e modificar esses dados.

**Objetivos**:
- Praticar encapsulamento
- Usar métodos getter e setter

**Entrada Simulada**:
- Nome: "Shikamaru Nara"
- Nível de Estratégia: 10

**Saída Esperada**:

```
Nome: Shikamaru Nara
Nível de Estratégia: 10
```

**Exemplo de Código Esperado**:

```java
public class Estrategista {
    private String nome;
    private int nivelEstrategia;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNivelEstrategia() { return nivelEstrategia; }
    public void setNivelEstrategia(int nivelEstrategia) { this.nivelEstrategia = nivelEstrategia; }
}
```

---

### **Questão 9** – Nível 1

**Enunciado**: Tsunade é médica ninja. Crie a classe `MedicaNinja` com os atributos privados `nome` (String) e `nivelMedico` (int). Implemente métodos públicos para acesso.

**Objetivos**:
- Encapsular dados médicos
- Usar métodos getter e setter

**Entrada Simulada**:
- Nome: "Tsunade"
- Nível Médico: 10

**Saída Esperada**:

```
Nome: Tsunade
Nível Médico: 10
```

**Exemplo de Código Esperado**:

```java
public class MedicaNinja {
    private String nome;
    private int nivelMedico;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNivelMedico() { return nivelMedico; }
    public void setNivelMedico(int nivelMedico) { this.nivelMedico = nivelMedico; }
}
```

---

### **Questão 10** – Nível 1

**Enunciado**: Orochimaru gosta de criar técnicas proibidas. Crie a classe `JutsuProibido` com os atributos privados `nome` (String) e `nivelPerigo` (int). Implemente métodos de acesso.

**Objetivos**:
- Praticar encapsulamento com atributos privados
- Usar métodos getter e setter

**Entrada Simulada**:
- Nome: "Edo Tensei"
- Nível de Perigo: 10

**Saída Esperada**:

```
Nome do Jutsu Proibido: Edo Tensei
Nível de Perigo: 10
```

**Exemplo de Código Esperado**:

```java
public class JutsuProibido {
    private String nome;
    private int nivelPerigo;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNivelPerigo() { return nivelPerigo; }
    public void setNivelPerigo(int nivelPerigo) { this.nivelPerigo = nivelPerigo; }
}

---

### **Questão 11** – Nível 2

**Enunciado**: Naruto evoluiu e agora é um ninja especial. Crie a classe `Ninja` com atributos privados `nome` e `idade`. Implemente os métodos de acesso. Depois, crie a subclasse `NinjaEspecial` que herda de `Ninja` e adiciona o atributo privado `habilidadeEspecial` (String), com métodos de acesso.

**Objetivos**:
- Praticar encapsulamento
- Implementar herança entre classes

**Entrada Simulada**:
- Nome: "Naruto Uzumaki"
- Idade: 17
- Habilidade Especial: "Modo Sábio"

**Saída Esperada**:

```
Nome: Naruto Uzumaki
Idade: 17
Habilidade Especial: Modo Sábio
```

**Exemplo de Código Esperado**:

```java
public class Ninja {
    private String nome;
    private int idade;
    // getters e setters
}
public class NinjaEspecial extends Ninja {
    private String habilidadeEspecial;
    // getters e setters
}
```
---

### **Questão 12** – Nível 2

**Enunciado**: Sasuke é um ninja Uchiha com poderes únicos. Crie a classe `Ninja` e a subclasse `NinjaUchiha` que contém o atributo privado `poderKekkeiGenkai` (String). Implemente todos os métodos de acesso necessários.

**Objetivos**:
- Praticar encapsulamento
- Implementar herança

**Entrada Simulada**:
- Nome: "Sasuke"
- Idade: 16
- Poder Kekkei Genkai: "Sharingan"

**Saída Esperada**:

```
Nome: Sasuke
Idade: 16
Poder Kekkei Genkai: Sharingan
```

**Exemplo de Código Esperado**:

```java
public class Ninja {
    private String nome;
    private int idade;
    // getters e setters
}
public class NinjaUchiha extends Ninja {
    private String poderKekkeiGenkai;
    // getters e setters
}
```
---

### **Questão 13** – Nível 2

**Enunciado**: Crie a classe base `Jutsu` com atributos privados `nome` e `tipo`. Implemente a subclasse `JutsuAvancado`, que adiciona o atributo `nivel` (int). Implemente todos os métodos de acesso.

**Objetivos**:
- Encapsulamento
- Herança

**Entrada Simulada**:
- Nome: "Rasenshuriken"
- Tipo: "Fuuton"
- Nível: 10

**Saída Esperada**:

```
Nome do Jutsu: Rasenshuriken
Tipo: Fuuton
Nível: 10
```

**Exemplo de Código Esperado**:

```java
public class Jutsu {
    private String nome;
    private String tipo;
    // getters e setters
}
public class JutsuAvancado extends Jutsu {
    private int nivel;
    // getters e setters
}
```
---

### **Questão 14** – Nível 2

**Enunciado**: Sakura realiza missões médicas de alto nível. Crie a classe `Missao` com `descricao` e `rank`. Implemente a subclasse `MissaoMedica` com o atributo `nivelDificuldade` (int).

**Objetivos**:
- Encapsulamento
- Herança

**Entrada Simulada**:
- Descrição: "Salvar aldeia"
- Rank: 'A'
- Nível Dificuldade: 9

**Saída Esperada**:

```
Missão: Salvar aldeia
Rank: A
Nível de Dificuldade: 9
```

**Exemplo de Código Esperado**:

```java
public class Missao {
    private String descricao;
    private char rank;
    // getters e setters
}
public class MissaoMedica extends Missao {
    private int nivelDificuldade;
    // getters e setters
}
```
---

### **Questão 15** – Nível 2

**Enunciado**: Kakashi é um sensei com alunos especiais. Crie a classe `Sensei` e a subclasse `SenseiJounin`, que possui o atributo `alunoFavorito` (String).

**Objetivos**:
- Encapsulamento
- Herança

**Entrada Simulada**:
- Nome: "Kakashi"
- Especialidade: "Sharingan"
- Aluno Favorito: "Naruto"

**Saída Esperada**:

```
Sensei: Kakashi
Especialidade: Sharingan
Aluno Favorito: Naruto
```

**Exemplo de Código Esperado**:

```java
public class Sensei {
    private String nome;
    private String especialidade;
    // getters e setters
}
public class SenseiJounin extends Sensei {
    private String alunoFavorito;
    // getters e setters
}
```
---

### **Questão 16** – Nível 2

**Enunciado**: Crie a classe base `Aldeia` com atributos `nome` e `lider`. Implemente a subclasse `AldeiaOculta`, que possui o atributo `simbolo` (String).

**Objetivos**:
- Encapsulamento
- Herança

**Entrada Simulada**:
- Nome: "Kiri"
- Líder: "Mizukage"
- Símbolo: "Névoa"

**Saída Esperada**:

```
Aldeia: Kiri
Líder: Mizukage
Símbolo: Névoa
```

**Exemplo de Código Esperado**:

```java
public class Aldeia {
    private String nome;
    private String lider;
    // getters e setters
}
public class AldeiaOculta extends Aldeia {
    private String simbolo;
    // getters e setters
}
```
---

### **Questão 17** – Nível 2

**Enunciado**: Gaara é Kazekage e também ninja especial. Crie uma classe `Ninja` e uma subclasse `Kazekage` que adiciona o atributo `tempoMandato` (int).

**Objetivos**:
- Encapsulamento
- Herança

**Entrada Simulada**:
- Nome: "Gaara"
- Idade: 18
- Tempo de Mandato: 3

**Saída Esperada**:

```
Nome: Gaara
Idade: 18
Tempo de Mandato: 3
```

**Exemplo de Código Esperado**:

```java
public class Ninja {
    private String nome;
    private int idade;
    // getters e setters
}
public class Kazekage extends Ninja {
    private int tempoMandato;
    // getters e setters
}
```
---

### **Questão 18** – Nível 2

**Enunciado**: Hinata é uma ninja Hyuga com habilidades especiais. Crie a classe `Ninja` e uma subclasse `NinjaHyuga` com o atributo `clan` (String).

**Objetivos**:
- Encapsulamento
- Herança

**Entrada Simulada**:
- Nome: "Hinata"
- Idade: 16
- Clã: "Hyuga"

**Saída Esperada**:

```
Nome: Hinata
Idade: 16
Clã: Hyuga
```

**Exemplo de Código Esperado**:

```java
public class Ninja {
    private String nome;
    private int idade;
    // getters e setters
}
public class NinjaHyuga extends Ninja {
    private String clan;
    // getters e setters
}
```
---

### **Questão 19** – Nível 2

**Enunciado**: Orochimaru é conhecido por jutsus proibidos. Crie a classe `Jutsu` e uma subclasse `JutsuProibido` com o atributo `motivoProibicao` (String).

**Objetivos**:
- Encapsulamento
- Herança

**Entrada Simulada**:
- Nome: "Edo Tensei"
- Tipo: "Proibido"
- Motivo: "Necromancia"

**Saída Esperada**:

```
Nome do Jutsu: Edo Tensei
Tipo: Proibido
Motivo da Proibição: Necromancia
```

**Exemplo de Código Esperado**:

```java
public class Jutsu {
    private String nome;
    private String tipo;
    // getters e setters
}
public class JutsuProibido extends Jutsu {
    private String motivoProibicao;
    // getters e setters
}
```
---

### **Questão 20** – Nível 2

**Enunciado**: Tsunade é uma médica ninja e Hokage. Crie a classe `MedicaNinja` com atributos comuns e a subclasse `Hokage` com o atributo `mandato` (int).

**Objetivos**:
- Encapsulamento
- Herança

**Entrada Simulada**:
- Nome: "Tsunade"
- Nível Médico: 10
- Mandato: 5

**Saída Esperada**:

```
Nome: Tsunade
Nível Médico: 10
Mandato: 5
```

**Exemplo de Código Esperado**:

```java
public class MedicaNinja {
    private String nome;
    private int nivelMedico;
    // getters e setters
}
public class Hokage extends MedicaNinja {
    private int mandato;
    // getters e setters
}
```
---

### **Questão 21** – Nível 3

**Enunciado**: Naruto, Sasuke e Sakura possuem diferentes estilos de ataque. Crie a classe base `Ninja` com o método `atacar()`. Implemente as subclasses `Naruto`, `Sasuke` e `Sakura`, cada uma sobrescrevendo `atacar()` para imprimir seu jutsu especial.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo (sobrescrita de métodos)

**Entrada Simulada**:
- Chamar atacar() de cada ninja

**Saída Esperada**:

```
Naruto ataca com Rasengan!
Sasuke ataca com Chidori!
Sakura ataca com Soco Poderoso!
```

**Exemplo de Código Esperado**:

```java
public class Ninja {
    public void atacar() {
        System.out.println("Ninja ataca!");
    }
}
public class Naruto extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Naruto ataca com Rasengan!");
    }
}
public class Sasuke extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Sasuke ataca com Chidori!");
    }
}
public class Sakura extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Sakura ataca com Soco Poderoso!");
    }
}
```
---

### **Questão 22** – Nível 3

**Enunciado**: Crie a classe base `Jutsu` com o método `executar()`. Implemente as subclasses `KageBunshin`, `Katon` e `Suiton`, cada um executando seu jutsu de forma diferente.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo

**Entrada Simulada**:
- Chamar executar() de cada jutsu

**Saída Esperada**:

```
Naruto executa Kage Bunshin!
Sasuke executa Katon!
Kakashi executa Suiton!
```

**Exemplo de Código Esperado**:

```java
public class Jutsu {
    public void executar() {
        System.out.println("Executando jutsu!");
    }
}
public class KageBunshin extends Jutsu {
    @Override
    public void executar() {
        System.out.println("Naruto executa Kage Bunshin!");
    }
}
public class Katon extends Jutsu {
    @Override
    public void executar() {
        System.out.println("Sasuke executa Katon!");
    }
}
public class Suiton extends Jutsu {
    @Override
    public void executar() {
        System.out.println("Kakashi executa Suiton!");
    }
}
```
---

### **Questão 23** – Nível 3

**Enunciado**: Crie a classe base `Missao` com o método `realizar()`. Implemente as subclasses `MissaoD` e `MissaoS`, cada uma sobrescrevendo o método para imprimir sua dificuldade.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo

**Entrada Simulada**:
- Chamar realizar() de cada missão

**Saída Esperada**:

```
Missão D: Simples
Missão S: Perigosa!
```

**Exemplo de Código Esperado**:

```java
public class Missao {
    public void realizar() {
        System.out.println("Realizando missão!");
    }
}
public class MissaoD extends Missao {
    @Override
    public void realizar() {
        System.out.println("Missão D: Simples");
    }
}
public class MissaoS extends Missao {
    @Override
    public void realizar() {
        System.out.println("Missão S: Perigosa!");
    }
}
```
---

### **Questão 24** – Nível 3

**Enunciado**: Kakashi, Jiraiya e Orochimaru possuem diferentes estilos de ensino. Crie a classe base `Sensei` com o método `ensinar()`. Implemente as subclasses, cada uma sobrescrevendo o método.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo

**Entrada Simulada**:
- Chamar ensinar() de cada sensei

**Saída Esperada**:

```
Kakashi ensina com livros!
Jiraiya ensina viajando!
Orochimaru ensina experimentando!
```

**Exemplo de Código Esperado**:

```java
public class Sensei {
    public void ensinar() {
        System.out.println("Sensei ensina!");
    }
}
public class Kakashi extends Sensei {
    @Override
    public void ensinar() {
        System.out.println("Kakashi ensina com livros!");
    }
}
public class Jiraiya extends Sensei {
    @Override
    public void ensinar() {
        System.out.println("Jiraiya ensina viajando!");
    }
}
public class Orochimaru extends Sensei {
    @Override
    public void ensinar() {
        System.out.println("Orochimaru ensina experimentando!");
    }
}
```
---

### **Questão 25** – Nível 3

**Enunciado**: As aldeias possuem diferentes rituais de saudação. Crie a classe base `Aldeia` com o método `saudar()`. Implemente as subclasses `Konoha`, `Suna` e `Kiri` com saudações diferentes.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo

**Entrada Simulada**:
- Chamar saudar() de cada aldeia

**Saída Esperada**:

```
Bem-vindo à Folha!
Bem-vindo à Areia!
Bem-vindo à Névoa!
```

**Exemplo de Código Esperado**:

```java
public class Aldeia {
    public void saudar() {
        System.out.println("Bem-vindo!");
    }
}
public class Konoha extends Aldeia {
    @Override
    public void saudar() {
        System.out.println("Bem-vindo à Folha!");
    }
}
public class Suna extends Aldeia {
    @Override
    public void saudar() {
        System.out.println("Bem-vindo à Areia!");
    }
}
public class Kiri extends Aldeia {
    @Override
    public void saudar() {
        System.out.println("Bem-vindo à Névoa!");
    }
}
```
---

### **Questão 26** – Nível 4

**Enunciado**: Todos os jutsus devem ser executáveis. Crie a interface `Executavel` com método `executar()`. Implemente a classe `Jutsu` e suas subclasses `Rasengan` e `Chidori`, que implementam a interface.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar executar() de cada jutsu

**Saída Esperada**:

```
Executando Rasengan!
Executando Chidori!
```

**Exemplo de Código Esperado**:

```java
public interface Executavel {
    void executar();
}

public class Jutsu implements Executavel {
    public void executar() {
        System.out.println("Executando jutsu!");
    }
}

public class Rasengan extends Jutsu {
    @Override
    public void executar() {
        System.out.println("Executando Rasengan!");
    }
}

public class Chidori extends Jutsu {
    @Override
    public void executar() {
        System.out.println("Executando Chidori!");
    }
}
```
---

### **Questão 27** – Nível 4

**Enunciado**: Todo ninja pode atacar, mas cada um de forma diferente. Crie a classe abstrata `Ninja` com método abstrato `atacar()`. Implemente as subclasses `Naruto` e `Sasuke`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (classe abstrata)

**Entrada Simulada**:
- Chamar atacar() de cada ninja

**Saída Esperada**:

```
Naruto ataca com Rasengan!
Sasuke ataca com Chidori!
```

**Exemplo de Código Esperado**:

```java
public abstract class Ninja {
    public abstract void atacar();
}

public class Naruto extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Naruto ataca com Rasengan!");
    }
}

public class Sasuke extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Sasuke ataca com Chidori!");
    }
}
```
---

### **Questão 28** – Nível 4

**Enunciado**: Toda missão deve ser realizável. Crie a interface `Realizavel` com método `realizar()`. Implemente as classes `MissaoD` e `MissaoS` que realizam missões de diferentes níveis.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar realizar() de cada missão

**Saída Esperada**:

```
Realizando missão simples!
Realizando missão perigosa!
```

**Exemplo de Código Esperado**:

```java
public interface Realizavel {
    void realizar();
}

public class MissaoD implements Realizavel {
    public void realizar() {
        System.out.println("Realizando missão simples!");
    }
}

public class MissaoS implements Realizavel {
    public void realizar() {
        System.out.println("Realizando missão perigosa!");
    }
}
```
---

### **Questão 29** – Nível 4

**Enunciado**: Todos os senseis devem treinar os ninjas. Crie a interface `Treinavel` com método `treinar()`. Implemente as classes `Kakashi` e `Jiraiya`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar treinar() de cada sensei

**Saída Esperada**:

```
Kakashi treina com Sharingan!
Jiraiya treina com invocação!
```

**Exemplo de Código Esperado**:

```java
public interface Treinavel {
    void treinar();
}

public class Kakashi implements Treinavel {
    public void treinar() {
        System.out.println("Kakashi treina com Sharingan!");
    }
}

public class Jiraiya implements Treinavel {
    public void treinar() {
        System.out.println("Jiraiya treina com invocação!");
    }
}
```
---

### **Questão 30** – Nível 4

**Enunciado**: Toda aldeia tem um ritual especial. Crie a classe abstrata `Aldeia` com método abstrato `ritual()`. Implemente as classes `Konoha` e `Suna`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (classe abstrata)

**Entrada Simulada**:
- Chamar ritual() de cada aldeia

**Saída Esperada**:

```
Konoha faz ritual da Folha!
Suna faz ritual da Areia!
```

**Exemplo de Código Esperado**:

```java
public abstract class Aldeia {
    public abstract void ritual();
}

public class Konoha extends Aldeia {
    @Override
    public void ritual() {
        System.out.println("Konoha faz ritual da Folha!");
    }
}

public class Suna extends Aldeia {
    @Override
    public void ritual() {
        System.out.println("Suna faz ritual da Areia!");
    }
}
```
---

## **NÍVEL 4 – ENCAPSULAMENTO + HERANÇA + POLIMORFISMO + ABSTRAÇÃO** (Continuação)

### **Questão 31** – Nível 4

**Enunciado**: No universo ninja, existem diferentes tipos de times. Crie a interface `TimeNinja` com o método `formarTime()`. Implemente as classes `TimeSete` e `TimeDez`, que formam times com diferentes ninjas.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar formarTime() de cada time

**Saída Esperada**:

```
Time 7 formado por Naruto, Sasuke, Sakura e Kakashi!
Time 10 formado por Shikamaru, Ino, Choji e Asuma!
```

**Exemplo de Código Esperado**:

```java
public interface TimeNinja {
    void formarTime();
}

public class TimeSete implements TimeNinja {
    public void formarTime() {
        System.out.println("Time 7 formado por Naruto, Sasuke, Sakura e Kakashi!");
    }
}

public class TimeDez implements TimeNinja {
    public void formarTime() {
        System.out.println("Time 10 formado por Shikamaru, Ino, Choji e Asuma!");
    }
}
```

---

### **Questão 32** – Nível 4

**Enunciado**: Cada aldeia ninja possui uma especialidade. Crie a interface `EspecialidadeAldeia` com o método `mostrarEspecialidade()`. Implemente as classes `AldeiaFolha`, `AldeiaAreia` e `AldeiaNévoa`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar mostrarEspecialidade() de cada aldeia

**Saída Esperada**:

```
A especialidade da Folha é ninjutsu diversificado!
A especialidade da Areia é manipulação de areia!
A especialidade da Névoa é técnicas de água!
```

**Exemplo de Código Esperado**:

```java
public interface EspecialidadeAldeia {
    void mostrarEspecialidade();
}

public class AldeiaFolha implements EspecialidadeAldeia {
    public void mostrarEspecialidade() {
        System.out.println("A especialidade da Folha é ninjutsu diversificado!");
    }
}

public class AldeiaAreia implements EspecialidadeAldeia {
    public void mostrarEspecialidade() {
        System.out.println("A especialidade da Areia é manipulação de areia!");
    }
}

public class AldeiaNévoa implements EspecialidadeAldeia {
    public void mostrarEspecialidade() {
        System.out.println("A especialidade da Névoa é técnicas de água!");
    }
}
```

---

### **Questão 33** – Nível 4

**Enunciado**: Os ninjas podem possuir mais de uma habilidade especial. Crie a interface `MultiHabilidade` com o método `listarHabilidades()`. Implemente a classe `NinjaMulti`, que armazena uma lista de habilidades especiais.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)
- Uso de coleções (ArrayList)

**Entrada Simulada**:
- Nome: "Naruto"
- Habilidades: ["Rasengan", "Modo Sábio", "Kyuubi"]

**Saída Esperada**:

```
Habilidades do ninja Naruto: Rasengan, Modo Sábio, Kyuubi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public interface MultiHabilidade {
    void listarHabilidades();
}

public class NinjaMulti implements MultiHabilidade {
    private String nome;
    private ArrayList<String> habilidades = new ArrayList<>();

    public NinjaMulti(String nome) {
        this.nome = nome;
    }
    public void addHabilidade(String habilidade) {
        habilidades.add(habilidade);
    }
    public void listarHabilidades() {
        System.out.print("Habilidades do ninja " + nome + ": ");
        System.out.println(String.join(", ", habilidades));
    }
}
```

---

### **Questão 34** – Nível 4

**Enunciado**: As missões podem ser fracassadas ou bem-sucedidas. Crie a interface `StatusMissao` com o método `exibirStatus()`. Implemente as classes `MissaoCompleta` e `MissaoFracassada`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Missão Completa
- Missão Fracassada

**Saída Esperada**:

```
Status: Missão completa! Parabéns ninja!
Status: Missão fracassada. Tente novamente!
```

**Exemplo de Código Esperado**:

```java
public interface StatusMissao {
    void exibirStatus();
}

public class MissaoCompleta implements StatusMissao {
    public void exibirStatus() {
        System.out.println("Status: Missão completa! Parabéns ninja!");
    }
}

public class MissaoFracassada implements StatusMissao {
    public void exibirStatus() {
        System.out.println("Status: Missão fracassada. Tente novamente!");
    }
}
```

---

### **Questão 35** – Nível 4

**Enunciado**: Os senseis podem ser avaliados por seus alunos. Crie a interface `Avaliavel` com o método `avaliarSensei()`. Implemente a classe `SenseiAvaliado` que recebe o nome do sensei e a nota dada pelo aluno.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Sensei: "Kakashi"
- Nota: 10

**Saída Esperada**:

```
Sensei Kakashi recebeu nota: 10
```

**Exemplo de Código Esperado**:

```java
public interface Avaliavel {
    void avaliarSensei();
}

public class SenseiAvaliado implements Avaliavel {
    private String nome;
    private int nota;

    public SenseiAvaliado(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public void avaliarSensei() {
        System.out.println("Sensei " + nome + " recebeu nota: " + nota);
    }
}
```

---

### **Questão 36** – Nível 4

**Enunciado**: Cada jutsu pode ser classificado por poder. Crie a interface `Classificavel` com método `classificarPoder()`. Implemente a classe `JutsuClassificado` que recebe o nome do jutsu e seu nível de poder.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Jutsu: "Amaterasu"
- Poder: 10

**Saída Esperada**:

```
Jutsu Amaterasu classificado como poder 10!
```

**Exemplo de Código Esperado**:

```java
public interface Classificavel {
    void classificarPoder();
}

public class JutsuClassificado implements Classificavel {
    private String nome;
    private int poder;
    public JutsuClassificado(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }
    public void classificarPoder() {
        System.out.println("Jutsu " + nome + " classificado como poder " + poder + "!");
    }
}
```

---

### **Questão 37** – Nível 4

**Enunciado**: O sistema ninja deve permitir registrar e consultar missões. Crie a interface `RegistroMissao` com métodos `registrar()` e `consultar()`. Implemente a classe `SistemaMissao` que armazena missões em uma lista.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)
- Uso de coleções (ArrayList)

**Entrada Simulada**:
- Missões: "Salvar aldeia", "Resgatar refém"

**Saída Esperada**:

```
Missões registradas: Salvar aldeia, Resgatar refém
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public interface RegistroMissao {
    void registrar(String descricao);
    void consultar();
}

public class SistemaMissao implements RegistroMissao {
    private ArrayList<String> missoes = new ArrayList<>();
    public void registrar(String descricao) {
        missoes.add(descricao);
    }
    public void consultar() {
        System.out.print("Missões registradas: ");
        System.out.println(String.join(", ", missoes));
    }
}
```

---

### **Questão 38** – Nível 4

**Enunciado**: Os times podem realizar missões juntos. Crie a interface `TimeMissao` com o método `realizarMissao()`. Implemente a classe `TimeMissaoRealizada` que registra o nome do time e o nome da missão.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Time: "Time 7"
- Missão: "Derrotar Zabuza"

**Saída Esperada**:

```
Time 7 realizou a missão: Derrotar Zabuza
```

**Exemplo de Código Esperado**:

```java
public interface TimeMissao {
    void realizarMissao();
}

public class TimeMissaoRealizada implements TimeMissao {
    private String time;
    private String missao;
    public TimeMissaoRealizada(String time, String missao) {
        this.time = time;
        this.missao = missao;
    }
    public void realizarMissao() {
        System.out.println(time + " realizou a missão: " + missao);
    }
}
```

---

### **Questão 39** – Nível 4

**Enunciado**: Os ninjas podem receber títulos especiais. Crie a interface `RecebeTitulo` com método `concederTitulo()`. Implemente a classe `NinjaTitulado` que recebe nome do ninja e título.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Nome: "Gaara"
- Título: "Kazekage"

**Saída Esperada**:

```
Ninja Gaara recebeu o título: Kazekage
```

**Exemplo de Código Esperado**:

```java
public interface RecebeTitulo {
    void concederTitulo();
}

public class NinjaTitulado implements RecebeTitulo {
    private String nome;
    private String titulo;
    public NinjaTitulado(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }
    public void concederTitulo() {
        System.out.println("Ninja " + nome + " recebeu o título: " + titulo);
    }
}
```

---

### **Questão 40** – Nível 4

**Enunciado**: O sistema deve permitir promover ninjas para cargos de liderança. Crie a interface `Promovivel` com método `promover()`. Implemente a classe `NinjaPromovido` que registra nome, cargo anterior e novo cargo.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Nome: "Naruto"
- Cargo anterior: "Genin"
- Novo cargo: "Hokage"

**Saída Esperada**:

```
Naruto promovido de Genin para Hokage!
```

**Exemplo de Código Esperado**:

```java
public interface Promovivel {
    void promover();
}

public class NinjaPromovido implements Promovivel {
    private String nome;
    private String cargoAnterior;
    private String novoCargo;
    public NinjaPromovido(String nome, String cargoAnterior, String novoCargo) {
        this.nome = nome;
        this.cargoAnterior = cargoAnterior;
        this.novoCargo = novoCargo;
    }
    public void promover() {
        System.out.println(nome + " promovido de " + cargoAnterior + " para " + novoCargo + "!");
    }
}
```
# 100 Questões de Programação Orientada a Objetos em Java – Universo Naruto

## Legenda de Níveis

- **Nível 1**: 1 Pilar (Encapsulamento)
- **Nível 2**: 2 Pilares (Encapsulamento + Herança)
- **Nível 3**: 3 Pilares (Encapsulamento + Herança + Polimorfismo)
- **Nível 4**: 4 Pilares (Encapsulamento + Herança + Polimorfismo + Abstração)

---

## **NÍVEL 1 – ENCAPSULAMENTO**
<!-- Questões 1 a 10 já foram geradas acima. -->

### **Questão 1** – Nível 1

**Enunciado**: Naruto acabou de entrar na Academia Ninja e quer registrar seus dados no sistema de ninjas. Crie uma classe `Ninja` com dois atributos privados: `nome` (String) e `idade` (int). Implemente métodos públicos `getNome`, `setNome`, `getIdade` e `setIdade` para acessar e modificar esses dados.

**Objetivos**:
- Criar classe com atributos privados
- Implementar métodos getter e setter

**Entrada Simulada**:
- Nome: "Naruto Uzumaki"
- Idade: 12

**Saída Esperada**:

```
Nome do ninja: Naruto Uzumaki
Idade do ninja: 12
```

**Exemplo de Código Esperado**:

```java
public class Ninja {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```
---

<!-- ... Questões 2 a 10 idênticas à primeira resposta ... -->

## **NÍVEL 2 – ENCAPSULAMENTO + HERANÇA**
<!-- Questões 11 a 20 já foram geradas acima. -->

## **NÍVEL 3 – ENCAPSULAMENTO + HERANÇA + POLIMORFISMO**

### **Questão 21** – Nível 3

**Enunciado**: Naruto, Sasuke e Sakura possuem diferentes estilos de ataque. Crie a classe base `Ninja` com o método `atacar()`. Implemente as subclasses `Naruto`, `Sasuke` e `Sakura`, cada uma sobrescrevendo `atacar()` para imprimir seu jutsu especial.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo (sobrescrita de métodos)

**Entrada Simulada**:
- Chamar atacar() de cada ninja

**Saída Esperada**:

```
Naruto ataca com Rasengan!
Sasuke ataca com Chidori!
Sakura ataca com Soco Poderoso!
```

**Exemplo de Código Esperado**:

```java
public class Ninja {
    public void atacar() {
        System.out.println("Ninja ataca!");
    }
}
public class Naruto extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Naruto ataca com Rasengan!");
    }
}
public class Sasuke extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Sasuke ataca com Chidori!");
    }
}
public class Sakura extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Sakura ataca com Soco Poderoso!");
    }
}
```
---

<!-- ... Questões 22 a 25 idênticas à segunda resposta ... -->

## **NÍVEL 4 – ENCAPSULAMENTO + HERANÇA + POLIMORFISMO + ABSTRAÇÃO**

### **Questão 26** – Nível 4

**Enunciado**: Todos os jutsus devem ser executáveis. Crie a interface `Executavel` com método `executar()`. Implemente a classe `Jutsu` e suas subclasses `Rasengan` e `Chidori`, que implementam a interface.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar executar() de cada jutsu

**Saída Esperada**:

```
Executando Rasengan!
Executando Chidori!
```

**Exemplo de Código Esperado**:

```java
public interface Executavel {
    void executar();
}

public class Jutsu implements Executavel {
    public void executar() {
        System.out.println("Executando jutsu!");
    }
}

public class Rasengan extends Jutsu {
    @Override
    public void executar() {
        System.out.println("Executando Rasengan!");
    }
}

public class Chidori extends Jutsu {
    @Override
    public void executar() {
        System.out.println("Executando Chidori!");
    }
}
```
# Questões 27 a 40 – 100 Questões de Programação Orientada a Objetos em Java – Universo Naruto

---

## **Questões 27 a 40**

---

### **Questão 27** – Nível 4

**Enunciado**: Todo ninja pode atacar, mas cada um de forma diferente. Crie a classe abstrata `Ninja` com método abstrato `atacar()`. Implemente as subclasses `Naruto` e `Sasuke`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (classe abstrata)

**Entrada Simulada**:
- Chamar atacar() de cada ninja

**Saída Esperada**:

```
Naruto ataca com Rasengan!
Sasuke ataca com Chidori!
```

**Exemplo de Código Esperado**:

```java
public abstract class Ninja {
    public abstract void atacar();
}

public class Naruto extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Naruto ataca com Rasengan!");
    }
}

public class Sasuke extends Ninja {
    @Override
    public void atacar() {
        System.out.println("Sasuke ataca com Chidori!");
    }
}
```
---

### **Questão 28** – Nível 4

**Enunciado**: Toda missão deve ser realizável. Crie a interface `Realizavel` com método `realizar()`. Implemente as classes `MissaoD` e `MissaoS` que realizam missões de diferentes níveis.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar realizar() de cada missão

**Saída Esperada**:

```
Realizando missão simples!
Realizando missão perigosa!
```

**Exemplo de Código Esperado**:

```java
public interface Realizavel {
    void realizar();
}

public class MissaoD implements Realizavel {
    public void realizar() {
        System.out.println("Realizando missão simples!");
    }
}

public class MissaoS implements Realizavel {
    public void realizar() {
        System.out.println("Realizando missão perigosa!");
    }
}
```
---

### **Questão 29** – Nível 4

**Enunciado**: Todos os senseis devem treinar os ninjas. Crie a interface `Treinavel` com método `treinar()`. Implemente as classes `Kakashi` e `Jiraiya`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar treinar() de cada sensei

**Saída Esperada**:

```
Kakashi treina com Sharingan!
Jiraiya treina com invocação!
```

**Exemplo de Código Esperado**:

```java
public interface Treinavel {
    void treinar();
}

public class Kakashi implements Treinavel {
    public void treinar() {
        System.out.println("Kakashi treina com Sharingan!");
    }
}

public class Jiraiya implements Treinavel {
    public void treinar() {
        System.out.println("Jiraiya treina com invocação!");
    }
}
```
---

### **Questão 30** – Nível 4

**Enunciado**: Toda aldeia tem um ritual especial. Crie a classe abstrata `Aldeia` com método abstrato `ritual()`. Implemente as classes `Konoha` e `Suna`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (classe abstrata)

**Entrada Simulada**:
- Chamar ritual() de cada aldeia

**Saída Esperada**:

```
Konoha faz ritual da Folha!
Suna faz ritual da Areia!
```

**Exemplo de Código Esperado**:

```java
public abstract class Aldeia {
    public abstract void ritual();
}

public class Konoha extends Aldeia {
    @Override
    public void ritual() {
        System.out.println("Konoha faz ritual da Folha!");
    }
}

public class Suna extends Aldeia {
    @Override
    public void ritual() {
        System.out.println("Suna faz ritual da Areia!");
    }
}
```
---

### **Questão 31** – Nível 4

**Enunciado**: No universo ninja, existem diferentes tipos de times. Crie a interface `TimeNinja` com o método `formarTime()`. Implemente as classes `TimeSete` e `TimeDez`, que formam times com diferentes ninjas.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar formarTime() de cada time

**Saída Esperada**:

```
Time 7 formado por Naruto, Sasuke, Sakura e Kakashi!
Time 10 formado por Shikamaru, Ino, Choji e Asuma!
```

**Exemplo de Código Esperado**:

```java
public interface TimeNinja {
    void formarTime();
}

public class TimeSete implements TimeNinja {
    public void formarTime() {
        System.out.println("Time 7 formado por Naruto, Sasuke, Sakura e Kakashi!");
    }
}

public class TimeDez implements TimeNinja {
    public void formarTime() {
        System.out.println("Time 10 formado por Shikamaru, Ino, Choji e Asuma!");
    }
}
```
---

### **Questão 32** – Nível 4

**Enunciado**: Cada aldeia ninja possui uma especialidade. Crie a interface `EspecialidadeAldeia` com o método `mostrarEspecialidade()`. Implemente as classes `AldeiaFolha`, `AldeiaAreia` e `AldeiaNévoa`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Chamar mostrarEspecialidade() de cada aldeia

**Saída Esperada**:

```
A especialidade da Folha é ninjutsu diversificado!
A especialidade da Areia é manipulação de areia!
A especialidade da Névoa é técnicas de água!
```

**Exemplo de Código Esperado**:

```java
public interface EspecialidadeAldeia {
    void mostrarEspecialidade();
}

public class AldeiaFolha implements EspecialidadeAldeia {
    public void mostrarEspecialidade() {
        System.out.println("A especialidade da Folha é ninjutsu diversificado!");
    }
}

public class AldeiaAreia implements EspecialidadeAldeia {
    public void mostrarEspecialidade() {
        System.out.println("A especialidade da Areia é manipulação de areia!");
    }
}

public class AldeiaNévoa implements EspecialidadeAldeia {
    public void mostrarEspecialidade() {
        System.out.println("A especialidade da Névoa é técnicas de água!");
    }
}
```
---

### **Questão 33** – Nível 4

**Enunciado**: Os ninjas podem possuir mais de uma habilidade especial. Crie a interface `MultiHabilidade` com o método `listarHabilidades()`. Implemente a classe `NinjaMulti`, que armazena uma lista de habilidades especiais.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)
- Uso de coleções (ArrayList)

**Entrada Simulada**:
- Nome: "Naruto"
- Habilidades: ["Rasengan", "Modo Sábio", "Kyuubi"]

**Saída Esperada**:

```
Habilidades do ninja Naruto: Rasengan, Modo Sábio, Kyuubi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public interface MultiHabilidade {
    void listarHabilidades();
}

public class NinjaMulti implements MultiHabilidade {
    private String nome;
    private ArrayList<String> habilidades = new ArrayList<>();

    public NinjaMulti(String nome) {
        this.nome = nome;
    }
    public void addHabilidade(String habilidade) {
        habilidades.add(habilidade);
    }
    public void listarHabilidades() {
        System.out.print("Habilidades do ninja " + nome + ": ");
        System.out.println(String.join(", ", habilidades));
    }
}
```
---

### **Questão 34** – Nível 4

**Enunciado**: As missões podem ser fracassadas ou bem-sucedidas. Crie a interface `StatusMissao` com o método `exibirStatus()`. Implemente as classes `MissaoCompleta` e `MissaoFracassada`.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Missão Completa
- Missão Fracassada

**Saída Esperada**:

```
Status: Missão completa! Parabéns ninja!
Status: Missão fracassada. Tente novamente!
```

**Exemplo de Código Esperado**:

```java
public interface StatusMissao {
    void exibirStatus();
}

public class MissaoCompleta implements StatusMissao {
    public void exibirStatus() {
        System.out.println("Status: Missão completa! Parabéns ninja!");
    }
}

public class MissaoFracassada implements StatusMissao {
    public void exibirStatus() {
        System.out.println("Status: Missão fracassada. Tente novamente!");
    }
}
```
---

### **Questão 35** – Nível 4

**Enunciado**: Os senseis podem ser avaliados por seus alunos. Crie a interface `Avaliavel` com o método `avaliarSensei()`. Implemente a classe `SenseiAvaliado` que recebe o nome do sensei e a nota dada pelo aluno.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Sensei: "Kakashi"
- Nota: 10

**Saída Esperada**:

```
Sensei Kakashi recebeu nota: 10
```

**Exemplo de Código Esperado**:

```java
public interface Avaliavel {
    void avaliarSensei();
}

public class SenseiAvaliado implements Avaliavel {
    private String nome;
    private int nota;

    public SenseiAvaliado(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public void avaliarSensei() {
        System.out.println("Sensei " + nome + " recebeu nota: " + nota);
    }
}
```
---

### **Questão 36** – Nível 4

**Enunciado**: Cada jutsu pode ser classificado por poder. Crie a interface `Classificavel` com método `classificarPoder()`. Implemente a classe `JutsuClassificado` que recebe o nome do jutsu e seu nível de poder.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Jutsu: "Amaterasu"
- Poder: 10

**Saída Esperada**:

```
Jutsu Amaterasu classificado como poder 10!
```

**Exemplo de Código Esperado**:

```java
public interface Classificavel {
    void classificarPoder();
}

public class JutsuClassificado implements Classificavel {
    private String nome;
    private int poder;
    public JutsuClassificado(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }
    public void classificarPoder() {
        System.out.println("Jutsu " + nome + " classificado como poder " + poder + "!");
    }
}
```
---

### **Questão 37** – Nível 4

**Enunciado**: O sistema ninja deve permitir registrar e consultar missões. Crie a interface `RegistroMissao` com métodos `registrar()` e `consultar()`. Implemente a classe `SistemaMissao` que armazena missões em uma lista.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)
- Uso de coleções (ArrayList)

**Entrada Simulada**:
- Missões: "Salvar aldeia", "Resgatar refém"

**Saída Esperada**:

```
Missões registradas: Salvar aldeia, Resgatar refém
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public interface RegistroMissao {
    void registrar(String descricao);
    void consultar();
}

public class SistemaMissao implements RegistroMissao {
    private ArrayList<String> missoes = new ArrayList<>();
    public void registrar(String descricao) {
        missoes.add(descricao);
    }
    public void consultar() {
        System.out.print("Missões registradas: ");
        System.out.println(String.join(", ", missoes));
    }
}
```
---

### **Questão 38** – Nível 4

**Enunciado**: Os times podem realizar missões juntos. Crie a interface `TimeMissao` com o método `realizarMissao()`. Implemente a classe `TimeMissaoRealizada` que registra o nome do time e o nome da missão.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Time: "Time 7"
- Missão: "Derrotar Zabuza"

**Saída Esperada**:

```
Time 7 realizou a missão: Derrotar Zabuza
```

**Exemplo de Código Esperado**:

```java
public interface TimeMissao {
    void realizarMissao();
}

public class TimeMissaoRealizada implements TimeMissao {
    private String time;
    private String missao;
    public TimeMissaoRealizada(String time, String missao) {
        this.time = time;
        this.missao = missao;
    }
    public void realizarMissao() {
        System.out.println(time + " realizou a missão: " + missao);
    }
}
```
---

### **Questão 39** – Nível 4

**Enunciado**: Os ninjas podem receber títulos especiais. Crie a interface `RecebeTitulo` com método `concederTitulo()`. Implemente a classe `NinjaTitulado` que recebe nome do ninja e título.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Nome: "Gaara"
- Título: "Kazekage"

**Saída Esperada**:

```
Ninja Gaara recebeu o título: Kazekage
```

**Exemplo de Código Esperado**:

```java
public interface RecebeTitulo {
    void concederTitulo();
}

public class NinjaTitulado implements RecebeTitulo {
    private String nome;
    private String titulo;
    public NinjaTitulado(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }
    public void concederTitulo() {
        System.out.println("Ninja " + nome + " recebeu o título: " + titulo);
    }
}
```
---

### **Questão 40** – Nível 4

**Enunciado**: O sistema deve permitir promover ninjas para cargos de liderança. Crie a interface `Promovivel` com método `promover()`. Implemente a classe `NinjaPromovido` que registra nome, cargo anterior e novo cargo.

**Objetivos**:
- Encapsulamento
- Herança
- Polimorfismo
- Abstração (interface)

**Entrada Simulada**:
- Nome: "Naruto"
- Cargo anterior: "Genin"
- Novo cargo: "Hokage"

**Saída Esperada**:

```
Naruto promovido de Genin para Hokage!
```

**Exemplo de Código Esperado**:

```java
public interface Promovivel {
    void promover();
}

public class NinjaPromovido implements Promovivel {
    private String nome;
    private String cargoAnterior;
    private String novoCargo;
    public NinjaPromovido(String nome, String cargoAnterior, String novoCargo) {
        this.nome = nome;
        this.cargoAnterior = cargoAnterior;
        this.novoCargo = novoCargo;
    }
    public void promover() {
        System.out.println(nome + " promovido de " + cargoAnterior + " para " + novoCargo + "!");
    }
}
```
---


## **NÍVEL 4 – CONTINUAÇÃO**


### **Questão 41** – Nível 4

**Enunciado**: Ninjas podem ser classificados por rank. Crie uma enum chamada `RankNinja` com valores `GENIN`, `CHUNIN`, `JOUNIN`, `KAGE`. Crie a classe `NinjaRank` que recebe um nome e um rank.

**Objetivos**:
- Encapsulamento
- Enumeração

**Entrada Simulada**:
- Nome: "Shikamaru"
- Rank: "JOUNIN"

**Saída Esperada**:

```
Ninja Shikamaru tem o rank: JOUNIN
```

**Exemplo de Código Esperado**:

```java
public enum RankNinja {
    GENIN, CHUNIN, JOUNIN, KAGE
}

public class NinjaRank {
    private String nome;
    private RankNinja rank;
    public NinjaRank(String nome, RankNinja rank) {
        this.nome = nome;
        this.rank = rank;
    }
    public void mostrarRank() {
        System.out.println("Ninja " + nome + " tem o rank: " + rank);
    }
}
```
---

### **Questão 42** – Nível 4

**Enunciado**: O sistema ninja deve listar todos os ninjas de uma aldeia. Crie a classe `Aldeia` que armazena uma lista de nomes de ninjas e um método para exibir todos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Ninjas: ["Naruto", "Sasuke", "Sakura"]

**Saída Esperada**:

```
Ninjas da aldeia: Naruto, Sasuke, Sakura
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class Aldeia {
    private ArrayList<String> ninjas = new ArrayList<>();
    public void adicionarNinja(String nome) {
        ninjas.add(nome);
    }
    public void listarNinjas() {
        System.out.println("Ninjas da aldeia: " + String.join(", ", ninjas));
    }
}
```
---

### **Questão 43** – Nível 4

**Enunciado**: Cada missão pode ter vários participantes. Crie a classe `Missao` com uma lista de nomes de ninjas participantes e método para mostrar todos os participantes.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Participantes: ["Naruto", "Sasuke"]

**Saída Esperada**:

```
Participantes da missão: Naruto, Sasuke
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class Missao {
    private ArrayList<String> participantes = new ArrayList<>();
    public void adicionarParticipante(String nome) {
        participantes.add(nome);
    }
    public void listarParticipantes() {
        System.out.println("Participantes da missão: " + String.join(", ", participantes));
    }
}
```
---

### **Questão 44** – Nível 4

**Enunciado**: O sistema deve permitir registrar e consultar senseis de uma aldeia. Crie a classe `AldeiaSenseis` que armazena uma lista de senseis e métodos para adicionar e listar.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Senseis: ["Kakashi", "Asuma"]

**Saída Esperada**:

```
Senseis da aldeia: Kakashi, Asuma
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class AldeiaSenseis {
    private ArrayList<String> senseis = new ArrayList<>();
    public void adicionarSensei(String nome) {
        senseis.add(nome);
    }
    public void listarSenseis() {
        System.out.println("Senseis da aldeia: " + String.join(", ", senseis));
    }
}
```
---

### **Questão 45** – Nível 4

**Enunciado**: Cada ninja pode aprender múltiplos jutsus. Crie a classe `NinjaJutsus` com lista de jutsus e métodos para adicionar e mostrar todos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Jutsus: ["Rasengan", "Kage Bunshin"]

**Saída Esperada**:

```
Jutsus do ninja: Rasengan, Kage Bunshin
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class NinjaJutsus {
    private ArrayList<String> jutsus = new ArrayList<>();
    public void aprenderJutsu(String nome) {
        jutsus.add(nome);
    }
    public void listarJutsus() {
        System.out.println("Jutsus do ninja: " + String.join(", ", jutsus));
    }
}
```
---

### **Questão 46** – Nível 4

**Enunciado**: O sistema deve permitir registrar resultados de batalhas. Crie a classe `Batalha` com nomes dos participantes e resultado da batalha.

**Objetivos**:
- Encapsulamento

**Entrada Simulada**:
- Participantes: "Naruto" vs "Sasuke"
- Resultado: "Naruto venceu"

**Saída Esperada**:

```
Batalha: Naruto vs Sasuke
Resultado: Naruto venceu
```

**Exemplo de Código Esperado**:

```java
public class Batalha {
    private String participante1;
    private String participante2;
    private String resultado;
    public Batalha(String p1, String p2, String resultado) {
        this.participante1 = p1;
        this.participante2 = p2;
        this.resultado = resultado;
    }
    public void mostrarResultado() {
        System.out.println("Batalha: " + participante1 + " vs " + participante2);
        System.out.println("Resultado: " + resultado);
    }
}
```
---

### **Questão 47** – Nível 4

**Enunciado**: O sistema permite registrar times de ninjas com sensei responsável. Crie a classe `TimeNinjaCompleto` com lista de ninjas e nome do sensei.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Ninjas: ["Naruto", "Sasuke", "Sakura"]
- Sensei: "Kakashi"

**Saída Esperada**:

```
Time formado por: Naruto, Sasuke, Sakura
Sensei: Kakashi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class TimeNinjaCompleto {
    private ArrayList<String> ninjas = new ArrayList<>();
    private String sensei;
    public TimeNinjaCompleto(String sensei) {
        this.sensei = sensei;
    }
    public void adicionarNinja(String nome) {
        ninjas.add(nome);
    }
    public void mostrarTime() {
        System.out.println("Time formado por: " + String.join(", ", ninjas));
        System.out.println("Sensei: " + sensei);
    }
}
```
---

### **Questão 48** – Nível 4

**Enunciado**: O sistema permite registrar aldeias com líder e número de ninjas. Crie a classe `AldeiaInfo` com nome, líder e quantidade de ninjas.

**Objetivos**:
- Encapsulamento

**Entrada Simulada**:
- Nome: "Konoha"
- Líder: "Hokage"
- Ninjas: 100

**Saída Esperada**:

```
Aldeia: Konoha
Líder: Hokage
Quantidade de ninjas: 100
```

**Exemplo de Código Esperado**:

```java
public class AldeiaInfo {
    private String nome;
    private String lider;
    private int ninjas;
    public AldeiaInfo(String nome, String lider, int ninjas) {
        this.nome = nome;
        this.lider = lider;
        this.ninjas = ninjas;
    }
    public void mostrarInfo() {
        System.out.println("Aldeia: " + nome);
        System.out.println("Líder: " + lider);
        System.out.println("Quantidade de ninjas: " + ninjas);
    }
}
```
---

### **Questão 49** – Nível 4

**Enunciado**: O sistema permite registrar jutsus proibidos com quem os criou. Crie a classe `JutsuProibidoCriador` com nome do jutsu e nome do criador.

**Objetivos**:
- Encapsulamento

**Entrada Simulada**:
- Jutsu: "Edo Tensei"
- Criador: "Orochimaru"

**Saída Esperada**:

```
Jutsu proibido: Edo Tensei
Criador: Orochimaru
```

**Exemplo de Código Esperado**:

```java
public class JutsuProibidoCriador {
    private String nomeJutsu;
    private String criador;
    public JutsuProibidoCriador(String nomeJutsu, String criador) {
        this.nomeJutsu = nomeJutsu;
        this.criador = criador;
    }
    public void mostrarInfo() {
        System.out.println("Jutsu proibido: " + nomeJutsu);
        System.out.println("Criador: " + criador);
    }
}
```
---

### **Questão 50** – Nível 4

**Enunciado**: O sistema ninja deve permitir comparar o poder de dois ninjas. Crie a classe `ComparadorPoderNinja` com nomes e poder de cada ninja, e método para comparar quem é mais forte.

**Objetivos**:
- Encapsulamento
- Métodos de comparação

**Entrada Simulada**:
- Ninja1: "Naruto", Poder: 10
- Ninja2: "Sasuke", Poder: 9

**Saída Esperada**:

```
Naruto é mais forte que Sasuke
```

**Exemplo de Código Esperado**:

```java
public class ComparadorPoderNinja {
    private String ninja1;
    private int poder1;
    private String ninja2;
    private int poder2;
    public ComparadorPoderNinja(String ninja1, int poder1, String ninja2, int poder2) {
        this.ninja1 = ninja1;
        this.poder1 = poder1;
        this.ninja2 = ninja2;
        this.poder2 = poder2;
    }
    public void comparar() {
        if (poder1 > poder2)
            System.out.println(ninja1 + " é mais forte que " + ninja2);
        else if (poder2 > poder1)
            System.out.println(ninja2 + " é mais forte que " + ninja1);
        else
            System.out.println(ninja1 + " e " + ninja2 + " têm o mesmo poder");
    }
}
```
---

<!-- As próximas questões (51 a 100) seguem o padrão de contexto, entrada, saída e código, abordando: times múltiplos, batalhas em grupo, sistema de ranking, especialidades, uso de interfaces e classes abstratas, coleções, enums, herança múltipla (via interfaces), desafios combinados, etc. -->

---

### **Questão 51** – Nível 4

**Enunciado**: Os times podem participar de torneios. Crie a classe `Torneio` que recebe o nome do torneio e lista de times participantes. Implemente método para exibir todos os times.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Torneio: "Exame Chunin"
- Times: ["Time 7", "Time 10"]

**Saída Esperada**:

```
Torneio: Exame Chunin
Times participantes: Time 7, Time 10
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class Torneio {
    private String nome;
    private ArrayList<String> times = new ArrayList<>();
    public Torneio(String nome) {
        this.nome = nome;
    }
    public void adicionarTime(String time) {
        times.add(time);
    }
    public void mostrarTimes() {
        System.out.println("Torneio: " + nome);
        System.out.println("Times participantes: " + String.join(", ", times));
    }
}
```
---

### **Questão 52** – Nível 4

**Enunciado**: Senseis podem liderar mais de um time. Crie a classe `SenseiTimes` que recebe nome do sensei e lista de times liderados.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Sensei: "Kakashi"
- Times: ["Time 7", "Time 11"]

**Saída Esperada**:

```
Sensei Kakashi lidera os times: Time 7, Time 11
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class SenseiTimes {
    private String nome;
    private ArrayList<String> times = new ArrayList<>();
    public SenseiTimes(String nome) {
        this.nome = nome;
    }
    public void adicionarTime(String time) {
        times.add(time);
    }
    public void mostrarTimes() {
        System.out.println("Sensei " + nome + " lidera os times: " + String.join(", ", times));
    }
}
```
---

### **Questão 53** – Nível 4

**Enunciado**: Uma missão pode ser dividida em tarefas. Crie a classe `MissaoTarefas` que recebe descrição da missão e lista de tarefas.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Missão: "Proteger aldeia"
- Tarefas: ["Patrulhar muro", "Monitorar entrada"]

**Saída Esperada**:

```
Missão: Proteger aldeia
Tarefas: Patrulhar muro, Monitorar entrada
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class MissaoTarefas {
    private String descricao;
    private ArrayList<String> tarefas = new ArrayList<>();
    public MissaoTarefas(String descricao) {
        this.descricao = descricao;
    }
    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }
    public void mostrarTarefas() {
        System.out.println("Missão: " + descricao);
        System.out.println("Tarefas: " + String.join(", ", tarefas));
    }
}
```
---

### **Questão 54** – Nível 4

**Enunciado**: Cada ninja pode registrar seu histórico de missões. Crie a classe `NinjaHistorico` com nome do ninja e lista de missões realizadas.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Naruto"
- Missões: ["Resgatar gato", "Salvar aldeia"]

**Saída Esperada**:

```
Histórico de missões de Naruto: Resgatar gato, Salvar aldeia
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class NinjaHistorico {
    private String nome;
    private ArrayList<String> missoes = new ArrayList<>();
    public NinjaHistorico(String nome) {
        this.nome = nome;
    }
    public void adicionarMissao(String missao) {
        missoes.add(missao);
    }
    public void mostrarHistorico() {
        System.out.println("Histórico de missões de " + nome + ": " + String.join(", ", missoes));
    }
}
```
---

### **Questão 55** – Nível 4

**Enunciado**: O sistema deve permitir registrar especialidades dos ninjas. Crie a classe `NinjaEspecialidades` com nome do ninja e lista de especialidades.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Sasuke"
- Especialidades: ["Sharingan", "Chidori"]

**Saída Esperada**:

```
Especialidades de Sasuke: Sharingan, Chidori
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class NinjaEspecialidades {
    private String nome;
    private ArrayList<String> especialidades = new ArrayList<>();
    public NinjaEspecialidades(String nome) {
        this.nome = nome;
    }
    public void adicionarEspecialidade(String esp) {
        especialidades.add(esp);
    }
    public void mostrarEspecialidades() {
        System.out.println("Especialidades de " + nome + ": " + String.join(", ", especialidades));
    }
}
```
---

### **Questão 56** – Nível 4

**Enunciado**: O sistema deve registrar os títulos já recebidos pelos ninjas. Crie a classe `NinjaTitulos` com nome do ninja e lista de títulos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Gaara"
- Títulos: ["Kazekage", "Salvador de Suna"]

**Saída Esperada**:

```
Títulos de Gaara: Kazekage, Salvador de Suna
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class NinjaTitulos {
    private String nome;
    private ArrayList<String> titulos = new ArrayList<>();
    public NinjaTitulos(String nome) {
        this.nome = nome;
    }
    public void adicionarTitulo(String titulo) {
        titulos.add(titulo);
    }
    public void mostrarTitulos() {
        System.out.println("Títulos de " + nome + ": " + String.join(", ", titulos));
    }
}
```
---

### **Questão 57** – Nível 4

**Enunciado**: O sistema deve permitir que senseis avaliem o desempenho de seus alunos. Crie a classe `SenseiAvaliador` com nome do sensei e método para avaliar alunos.

**Objetivos**:
- Encapsulamento
- Métodos de avaliação

**Entrada Simulada**:
- Sensei: "Kakashi"
- Aluno: "Naruto", Nota: 9

**Saída Esperada**:

```
Sensei Kakashi avaliou Naruto com nota 9
```

**Exemplo de Código Esperado**:

```java
public class SenseiAvaliador {
    private String nome;
    public SenseiAvaliador(String nome) {
        this.nome = nome;
    }
    public void avaliarAluno(String aluno, int nota) {
        System.out.println("Sensei " + nome + " avaliou " + aluno + " com nota " + nota);
    }
}
```
---

### **Questão 58** – Nível 4

**Enunciado**: O sistema deve registrar o histórico de batalhas de cada ninja. Crie a classe `NinjaBatalhas` com nome do ninja e lista de batalhas.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Naruto"
- Batalhas: ["Naruto vs Pain", "Naruto vs Sasuke"]

**Saída Esperada**:

```
Batalhas de Naruto: Naruto vs Pain, Naruto vs Sasuke
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class NinjaBatalhas {
    private String nome;
    private ArrayList<String> batalhas = new ArrayList<>();
    public NinjaBatalhas(String nome) {
        this.nome = nome;
    }
    public void adicionarBatalha(String batalha) {
        batalhas.add(batalha);
    }
    public void mostrarBatalhas() {
        System.out.println("Batalhas de " + nome + ": " + String.join(", ", batalhas));
    }
}
```
---

### **Questão 59** – Nível 4

**Enunciado**: O sistema deve permitir registrar a pontuação dos ninjas em torneios. Crie a classe `NinjaPontuacao` com nome do ninja e pontuação.

**Objetivos**:
- Encapsulamento

**Entrada Simulada**:
- Nome: "Rock Lee"
- Pontuação: 87

**Saída Esperada**:

```
Rock Lee tem pontuação 87 no torneio
```

**Exemplo de Código Esperado**:

```java
public class NinjaPontuacao {
    private String nome;
    private int pontuacao;
    public NinjaPontuacao(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
    public void mostrarPontuacao() {
        System.out.println(nome + " tem pontuação " + pontuacao + " no torneio");
    }
}
```
---

### **Questão 60** – Nível 4

**Enunciado**: O sistema deve registrar os times vencedores dos torneios. Crie a classe `TorneioVencedores` com nome do torneio e lista de times vencedores.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Torneio: "Exame Chunin"
- Times vencedores: ["Time 10", "Time 7"]

**Saída Esperada**:

```
Vencedores do Exame Chunin: Time 10, Time 7
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;

public class TorneioVencedores {
    private String nome;
    private ArrayList<String> vencedores = new ArrayList<>();
    public TorneioVencedores(String nome) {
        this.nome = nome;
    }
    public void adicionarVencedor(String time) {
        vencedores.add(time);
    }
    public void mostrarVencedores() {
        System.out.println("Vencedores do " + nome + ": " + String.join(", ", vencedores));
    }
}
```

### **Questão 61** – Nível 4

**Enunciado**: O sistema deve registrar os exames que cada ninja participou. Crie a classe `NinjaExames` com nome do ninja e lista de exames.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Naruto"
- Exames: ["Genin", "Chunin"]

**Saída Esperada**:

```
Exames de Naruto: Genin, Chunin
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class NinjaExames {
    private String nome;
    private ArrayList<String> exames = new ArrayList<>();
    public NinjaExames(String nome) {
        this.nome = nome;
    }
    public void adicionarExame(String exame) {
        exames.add(exame);
    }
    public void mostrarExames() {
        System.out.println("Exames de " + nome + ": " + String.join(", ", exames));
    }
}
```
---

### **Questão 62** – Nível 4

**Enunciado**: O sistema deve registrar os treinamentos recebidos por cada ninja. Crie a classe `NinjaTreinamentos` com nome do ninja e lista de treinamentos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Sakura"
- Treinamentos: ["Força", "Medicina"]

**Saída Esperada**:

```
Treinamentos de Sakura: Força, Medicina
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class NinjaTreinamentos {
    private String nome;
    private ArrayList<String> treinamentos = new ArrayList<>();
    public NinjaTreinamentos(String nome) {
        this.nome = nome;
    }
    public void adicionarTreinamento(String treinamento) {
        treinamentos.add(treinamento);
    }
    public void mostrarTreinamentos() {
        System.out.println("Treinamentos de " + nome + ": " + String.join(", ", treinamentos));
    }
}
```
---

### **Questão 63** – Nível 4

**Enunciado**: O sistema deve registrar os rivais de cada ninja. Crie a classe `NinjaRivais` com nome do ninja e lista de rivais.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Naruto"
- Rivais: ["Sasuke", "Neji"]

**Saída Esperada**:

```
Rivais de Naruto: Sasuke, Neji
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class NinjaRivais {
    private String nome;
    private ArrayList<String> rivais = new ArrayList<>();
    public NinjaRivais(String nome) {
        this.nome = nome;
    }
    public void adicionarRival(String rival) {
        rivais.add(rival);
    }
    public void mostrarRivais() {
        System.out.println("Rivais de " + nome + ": " + String.join(", ", rivais));
    }
}
```
---

### **Questão 64** – Nível 4

**Enunciado**: O sistema deve registrar os times adversários em torneios. Crie a classe `TorneioAdversarios` com nome do torneio e lista de times adversários.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Torneio: "Exame Chunin"
- Adversários: ["Time 8", "Time 10"]

**Saída Esperada**:

```
Adversários do Exame Chunin: Time 8, Time 10
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class TorneioAdversarios {
    private String nome;
    private ArrayList<String> adversarios = new ArrayList<>();
    public TorneioAdversarios(String nome) {
        this.nome = nome;
    }
    public void adicionarAdversario(String adversario) {
        adversarios.add(adversario);
    }
    public void mostrarAdversarios() {
        System.out.println("Adversários do " + nome + ": " + String.join(", ", adversarios));
    }
}
```
---

### **Questão 65** – Nível 4

**Enunciado**: O sistema deve registrar as especialidades médicas dos ninjas médicos. Crie a classe `MedicoEspecialidades` com nome do ninja e lista de especialidades.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Tsunade"
- Especialidades: ["Cirurgia", "Regeneração"]

**Saída Esperada**:

```
Especialidades médicas de Tsunade: Cirurgia, Regeneração
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class MedicoEspecialidades {
    private String nome;
    private ArrayList<String> especialidades = new ArrayList<>();
    public MedicoEspecialidades(String nome) {
        this.nome = nome;
    }
    public void adicionarEspecialidade(String especialidade) {
        especialidades.add(especialidade);
    }
    public void mostrarEspecialidades() {
        System.out.println("Especialidades médicas de " + nome + ": " + String.join(", ", especialidades));
    }
}
```
---

### **Questão 66** – Nível 4

**Enunciado**: O sistema deve registrar os jutsus usados em cada batalha. Crie a classe `BatalhaJutsus` com nome da batalha e lista de jutsus utilizados.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Batalha: "Naruto vs Pain"
- Jutsus: ["Rasengan", "Chibaku Tensei"]

**Saída Esperada**:

```
Jutsus usados na batalha Naruto vs Pain: Rasengan, Chibaku Tensei
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class BatalhaJutsus {
    private String nomeBatalha;
    private ArrayList<String> jutsus = new ArrayList<>();
    public BatalhaJutsus(String nomeBatalha) {
        this.nomeBatalha = nomeBatalha;
    }
    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }
    public void mostrarJutsus() {
        System.out.println("Jutsus usados na batalha " + nomeBatalha + ": " + String.join(", ", jutsus));
    }
}
```
---

### **Questão 67** – Nível 4

**Enunciado**: O sistema deve registrar os times formados por senseis lendários. Crie a classe `SenseiLendarioTimes` com nome do sensei e lista de times.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Sensei: "Jiraiya"
- Times: ["Time Sannin", "Time Minato"]

**Saída Esperada**:

```
Times treinados por Jiraiya: Time Sannin, Time Minato
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class SenseiLendarioTimes {
    private String nome;
    private ArrayList<String> times = new ArrayList<>();
    public SenseiLendarioTimes(String nome) {
        this.nome = nome;
    }
    public void adicionarTime(String time) {
        times.add(time);
    }
    public void mostrarTimes() {
        System.out.println("Times treinados por " + nome + ": " + String.join(", ", times));
    }
}
```
---

### **Questão 68** – Nível 4

**Enunciado**: O sistema deve registrar os líderes das aldeias ao longo do tempo. Crie a classe `AldeiaLideres` com nome da aldeia e lista de líderes.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Líderes: ["Hashirama", "Tobirama", "Hiruzen", "Minato", "Tsunade", "Kakashi", "Naruto"]

**Saída Esperada**:

```
Líderes da aldeia Konoha: Hashirama, Tobirama, Hiruzen, Minato, Tsunade, Kakashi, Naruto
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaLideres {
    private String nomeAldeia;
    private ArrayList<String> lideres = new ArrayList<>();
    public AldeiaLideres(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarLider(String lider) {
        lideres.add(lider);
    }
    public void mostrarLideres() {
        System.out.println("Líderes da aldeia " + nomeAldeia + ": " + String.join(", ", lideres));
    }
}
```
---

### **Questão 69** – Nível 4

**Enunciado**: O sistema deve registrar os clãs presentes em cada aldeia. Crie a classe `AldeiaClas` com nome da aldeia e lista de clãs.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Clãs: ["Uchiha", "Hyuga", "Nara"]

**Saída Esperada**:

```
Clãs de Konoha: Uchiha, Hyuga, Nara
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaClas {
    private String nomeAldeia;
    private ArrayList<String> clas = new ArrayList<>();
    public AldeiaClas(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarCla(String cla) {
        clas.add(cla);
    }
    public void mostrarClas() {
        System.out.println("Clãs de " + nomeAldeia + ": " + String.join(", ", clas));
    }
}
```
---

### **Questão 70** – Nível 4

**Enunciado**: O sistema deve registrar os ninjas exilados de cada aldeia. Crie a classe `AldeiaExilados` com nome da aldeia e lista de exilados.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Exilados: ["Orochimaru", "Itachi"]

**Saída Esperada**:

```
Exilados de Konoha: Orochimaru, Itachi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaExilados {
    private String nomeAldeia;
    private ArrayList<String> exilados = new ArrayList<>();
    public AldeiaExilados(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarExilado(String exilado) {
        exilados.add(exilado);
    }
    public void mostrarExilados() {
        System.out.println("Exilados de " + nomeAldeia + ": " + String.join(", ", exilados));
    }
}
```
---

### **Questão 71** – Nível 4

**Enunciado**: O sistema deve registrar os jutsus lendários de cada aldeia. Crie a classe `AldeiaJutsusLendarios` com nome da aldeia e lista de jutsus lendários.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Jutsus: ["Rasengan", "Chidori"]

**Saída Esperada**:

```
Jutsus lendários de Konoha: Rasengan, Chidori
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaJutsusLendarios {
    private String nomeAldeia;
    private ArrayList<String> jutsus = new ArrayList<>();
    public AldeiaJutsusLendarios(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }
    public void mostrarJutsus() {
        System.out.println("Jutsus lendários de " + nomeAldeia + ": " + String.join(", ", jutsus));
    }
}
```
---

### **Questão 72** – Nível 4

**Enunciado**: O sistema deve registrar os cargos já ocupados por cada ninja. Crie a classe `NinjaCargos` com nome do ninja e lista de cargos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Naruto"
- Cargos: ["Genin", "Chunin", "Hokage"]

**Saída Esperada**:

```
Cargos de Naruto: Genin, Chunin, Hokage
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class NinjaCargos {
    private String nome;
    private ArrayList<String> cargos = new ArrayList<>();
    public NinjaCargos(String nome) {
        this.nome = nome;
    }
    public void adicionarCargo(String cargo) {
        cargos.add(cargo);
    }
    public void mostrarCargos() {
        System.out.println("Cargos de " + nome + ": " + String.join(", ", cargos));
    }
}
```
---

### **Questão 73** – Nível 4

**Enunciado**: O sistema deve registrar os alunos treinados por cada sensei. Crie a classe `SenseiAlunos` com nome do sensei e lista de alunos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Sensei: "Kakashi"
- Alunos: ["Naruto", "Sasuke", "Sakura"]

**Saída Esperada**:

```
Alunos treinados por Kakashi: Naruto, Sasuke, Sakura
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class SenseiAlunos {
    private String nome;
    private ArrayList<String> alunos = new ArrayList<>();
    public SenseiAlunos(String nome) {
        this.nome = nome;
    }
    public void adicionarAluno(String aluno) {
        alunos.add(aluno);
    }
    public void mostrarAlunos() {
        System.out.println("Alunos treinados por " + nome + ": " + String.join(", ", alunos));
    }
}
```
---

### **Questão 74** – Nível 4

**Enunciado**: O sistema deve registrar as técnicas proibidas de cada aldeia. Crie a classe `AldeiaTecnicasProibidas` com nome da aldeia e lista de técnicas proibidas.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Técnicas: ["Edo Tensei", "Kuchiyose"]

**Saída Esperada**:

```
Técnicas proibidas de Konoha: Edo Tensei, Kuchiyose
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaTecnicasProibidas {
    private String nomeAldeia;
    private ArrayList<String> tecnicas = new ArrayList<>();
    public AldeiaTecnicasProibidas(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarTecnica(String tecnica) {
        tecnicas.add(tecnica);
    }
    public void mostrarTecnicas() {
        System.out.println("Técnicas proibidas de " + nomeAldeia + ": " + String.join(", ", tecnicas));
    }
}
```
---

### **Questão 75** – Nível 4

**Enunciado**: O sistema deve registrar os times de elite de cada aldeia. Crie a classe `AldeiaTimesElite` com nome da aldeia e lista de times de elite.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Times: ["ANBU", "Time Sannin"]

**Saída Esperada**:

```
Times de elite de Konoha: ANBU, Time Sannin
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaTimesElite {
    private String nomeAldeia;
    private ArrayList<String> times = new ArrayList<>();
    public AldeiaTimesElite(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarTime(String time) {
        times.add(time);
    }
    public void mostrarTimes() {
        System.out.println("Times de elite de " + nomeAldeia + ": " + String.join(", ", times));
    }
}
```
---

### **Questão 76** – Nível 4

**Enunciado**: O sistema deve registrar os ninjas que participaram do grupo Akatsuki. Crie a classe `AkatsukiMembros` com lista de nomes dos membros.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Membros: ["Itachi", "Pain", "Kisame"]

**Saída Esperada**:

```
Membros da Akatsuki: Itachi, Pain, Kisame
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AkatsukiMembros {
    private ArrayList<String> membros = new ArrayList<>();
    public void adicionarMembro(String membro) {
        membros.add(membro);
    }
    public void mostrarMembros() {
        System.out.println("Membros da Akatsuki: " + String.join(", ", membros));
    }
}
```
---

### **Questão 77** – Nível 4

**Enunciado**: O sistema deve registrar os jutsus únicos de cada clã. Crie a classe `ClaJutsusUnicos` com nome do clã e lista de jutsus únicos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Clã: "Uchiha"
- Jutsus: ["Amaterasu", "Tsukuyomi"]

**Saída Esperada**:

```
Jutsus únicos do clã Uchiha: Amaterasu, Tsukuyomi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class ClaJutsusUnicos {
    private String nomeCla;
    private ArrayList<String> jutsus = new ArrayList<>();
    public ClaJutsusUnicos(String nomeCla) {
        this.nomeCla = nomeCla;
    }
    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }
    public void mostrarJutsus() {
        System.out.println("Jutsus únicos do clã " + nomeCla + ": " + String.join(", ", jutsus));
    }
}
```
---

### **Questão 78** – Nível 4

**Enunciado**: O sistema deve registrar as transformações de cada ninja. Crie a classe `NinjaTransformacoes` com nome do ninja e lista de transformações.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Naruto"
- Transformações: ["Modo Sábio", "Kyuubi"]

**Saída Esperada**:

```
Transformações de Naruto: Modo Sábio, Kyuubi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class NinjaTransformacoes {
    private String nome;
    private ArrayList<String> transformacoes = new ArrayList<>();
    public NinjaTransformacoes(String nome) {
        this.nome = nome;
    }
    public void adicionarTransformacao(String transformacao) {
        transformacoes.add(transformacao);
    }
    public void mostrarTransformacoes() {
        System.out.println("Transformações de " + nome + ": " + String.join(", ", transformacoes));
    }
}
```
---

### **Questão 79** – Nível 4

**Enunciado**: O sistema deve registrar os ataques especiais usados em batalhas importantes. Crie a classe `BatalhaAtaquesEspeciais` com nome da batalha e lista de ataques especiais.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Batalha: "Naruto vs Sasuke"
- Ataques: ["Rasengan", "Chidori"]

**Saída Esperada**:

```
Ataques especiais na batalha Naruto vs Sasuke: Rasengan, Chidori
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class BatalhaAtaquesEspeciais {
    private String nomeBatalha;
    private ArrayList<String> ataques = new ArrayList<>();
    public BatalhaAtaquesEspeciais(String nomeBatalha) {
        this.nomeBatalha = nomeBatalha;
    }
    public void adicionarAtaque(String ataque) {
        ataques.add(ataque);
    }
    public void mostrarAtaques() {
        System.out.println("Ataques especiais na batalha " + nomeBatalha + ": " + String.join(", ", ataques));
    }
}
```
---

### **Questão 80** – Nível 4

**Enunciado**: O sistema deve registrar os eventos especiais realizados nas aldeias. Crie a classe `AldeiaEventosEspeciais` com nome da aldeia e lista de eventos especiais.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Eventos: ["Festival da Folha", "Cerimônia do Hokage"]

**Saída Esperada**:

```
Eventos especiais em Konoha: Festival da Folha, Cerimônia do Hokage
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaEventosEspeciais {
    private String nomeAldeia;
    private ArrayList<String> eventos = new ArrayList<>();
    public AldeiaEventosEspeciais(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarEvento(String evento) {
        eventos.add(evento);
    }
    public void mostrarEventos() {
        System.out.println("Eventos especiais em " + nomeAldeia + ": " + String.join(", ", eventos));
    }
}
```


### **Questão 81** – Nível 4

**Enunciado**: O sistema deve registrar os scrolls de técnicas secretas de cada aldeia. Crie a classe `AldeiaScrollsSecretos` com nome da aldeia e lista de scrolls.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Scrolls: ["Scroll de Invocação", "Scroll de Técnicas Proibidas"]

**Saída Esperada**:

```
Scrolls secretos de Konoha: Scroll de Invocação, Scroll de Técnicas Proibidas
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaScrollsSecretos {
    private String nomeAldeia;
    private ArrayList<String> scrolls = new ArrayList<>();
    public AldeiaScrollsSecretos(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarScroll(String scroll) {
        scrolls.add(scroll);
    }
    public void mostrarScrolls() {
        System.out.println("Scrolls secretos de " + nomeAldeia + ": " + String.join(", ", scrolls));
    }
}
```
---

### **Questão 82** – Nível 4

**Enunciado**: O sistema deve registrar as técnicas de cura usadas por cada ninja médico. Crie a classe `MedicoTecnicasCura` com nome do ninja e lista de técnicas de cura.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Tsunade"
- Técnicas: ["Cura Celular", "Regeneração Avançada"]

**Saída Esperada**:

```
Técnicas de cura de Tsunade: Cura Celular, Regeneração Avançada
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class MedicoTecnicasCura {
    private String nome;
    private ArrayList<String> tecnicas = new ArrayList<>();
    public MedicoTecnicasCura(String nome) {
        this.nome = nome;
    }
    public void adicionarTecnica(String tecnica) {
        tecnicas.add(tecnica);
    }
    public void mostrarTecnicas() {
        System.out.println("Técnicas de cura de " + nome + ": " + String.join(", ", tecnicas));
    }
}
```
---

### **Questão 83** – Nível 4

**Enunciado**: O sistema deve registrar as armas especiais usadas em batalhas. Crie a classe `BatalhaArmasEspeciais` com nome da batalha e lista de armas.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Batalha: "Naruto vs Sasuke"
- Armas: ["Kunai", "Espada Kusanagi"]

**Saída Esperada**:

```
Armas especiais na batalha Naruto vs Sasuke: Kunai, Espada Kusanagi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class BatalhaArmasEspeciais {
    private String nomeBatalha;
    private ArrayList<String> armas = new ArrayList<>();
    public BatalhaArmasEspeciais(String nomeBatalha) {
        this.nomeBatalha = nomeBatalha;
    }
    public void adicionarArma(String arma) {
        armas.add(arma);
    }
    public void mostrarArmas() {
        System.out.println("Armas especiais na batalha " + nomeBatalha + ": " + String.join(", ", armas));
    }
}
```
---

### **Questão 84** – Nível 4

**Enunciado**: O sistema deve registrar os chefes invocados em cada batalha. Crie a classe `BatalhaChefesInvocados` com nome da batalha e lista de chefes.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Batalha: "Jiraiya vs Pain"
- Chefes: ["Gamabunta", "Rei dos Seis Caminhos"]

**Saída Esperada**:

```
Chefes invocados na batalha Jiraiya vs Pain: Gamabunta, Rei dos Seis Caminhos
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class BatalhaChefesInvocados {
    private String nomeBatalha;
    private ArrayList<String> chefes = new ArrayList<>();
    public BatalhaChefesInvocados(String nomeBatalha) {
        this.nomeBatalha = nomeBatalha;
    }
    public void adicionarChefe(String chefe) {
        chefes.add(chefe);
    }
    public void mostrarChefes() {
        System.out.println("Chefes invocados na batalha " + nomeBatalha + ": " + String.join(", ", chefes));
    }
}
```
---

### **Questão 85** – Nível 4

**Enunciado**: O sistema deve registrar as alianças entre aldeias. Crie a classe `AliançasAldeias` com nome da aldeia e lista de aldeias aliadas.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Aliadas: ["Suna", "Kiri"]

**Saída Esperada**:

```
Aldeias aliadas de Konoha: Suna, Kiri
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AliancasAldeias {
    private String nomeAldeia;
    private ArrayList<String> aliadas = new ArrayList<>();
    public AliancasAldeias(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarAliada(String aliada) {
        aliadas.add(aliada);
    }
    public void mostrarAliadas() {
        System.out.println("Aldeias aliadas de " + nomeAldeia + ": " + String.join(", ", aliadas));
    }
}
```
---

### **Questão 86** – Nível 4

**Enunciado**: O sistema deve registrar os troféus conquistados pelos ninjas. Crie a classe `NinjaTrofeus` com nome do ninja e lista de troféus.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Naruto"
- Troféus: ["Campeão Exame Chunin", "Herói de Konoha"]

**Saída Esperada**:

```
Troféus de Naruto: Campeão Exame Chunin, Herói de Konoha
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class NinjaTrofeus {
    private String nome;
    private ArrayList<String> trofeus = new ArrayList<>();
    public NinjaTrofeus(String nome) {
        this.nome = nome;
    }
    public void adicionarTrofeu(String trofeu) {
        trofeus.add(trofeu);
    }
    public void mostrarTrofeus() {
        System.out.println("Troféus de " + nome + ": " + String.join(", ", trofeus));
    }
}
```
---

### **Questão 87** – Nível 4

**Enunciado**: O sistema deve registrar os ninjas que já foram Hokage. Crie a classe `HokagesKonoha` com lista de nomes.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Hokages: ["Hashirama", "Tobirama", "Hiruzen", "Minato", "Tsunade", "Kakashi", "Naruto"]

**Saída Esperada**:

```
Hokages de Konoha: Hashirama, Tobirama, Hiruzen, Minato, Tsunade, Kakashi, Naruto
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class HokagesKonoha {
    private ArrayList<String> hokages = new ArrayList<>();
    public void adicionarHokage(String hokage) {
        hokages.add(hokage);
    }
    public void mostrarHokages() {
        System.out.println("Hokages de Konoha: " + String.join(", ", hokages));
    }
}
```
---

### **Questão 88** – Nível 4

**Enunciado**: O sistema deve registrar os ninjas que já foram Kazekage. Crie a classe `KazekagesSuna` com lista de nomes.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Kazekages: ["Rasa", "Gaara"]

**Saída Esperada**:

```
Kazekages de Suna: Rasa, Gaara
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class KazekagesSuna {
    private ArrayList<String> kazekages = new ArrayList<>();
    public void adicionarKazekage(String kazekage) {
        kazekages.add(kazekage);
    }
    public void mostrarKazekages() {
        System.out.println("Kazekages de Suna: " + String.join(", ", kazekages));
    }
}
```
---

### **Questão 89** – Nível 4

**Enunciado**: O sistema deve registrar os membros lendários de cada clã. Crie a classe `ClaMembrosLendarios` com nome do clã e lista de membros.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Clã: "Uchiha"
- Membros: ["Madara", "Itachi", "Sasuke"]

**Saída Esperada**:

```
Membros lendários do clã Uchiha: Madara, Itachi, Sasuke
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class ClaMembrosLendarios {
    private String nomeCla;
    private ArrayList<String> membros = new ArrayList<>();
    public ClaMembrosLendarios(String nomeCla) {
        this.nomeCla = nomeCla;
    }
    public void adicionarMembro(String membro) {
        membros.add(membro);
    }
    public void mostrarMembros() {
        System.out.println("Membros lendários do clã " + nomeCla + ": " + String.join(", ", membros));
    }
}
```
---

### **Questão 90** – Nível 4

**Enunciado**: O sistema deve registrar os jutsus proibidos de cada clã. Crie a classe `ClaJutsusProibidos` com nome do clã e lista de jutsus.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Clã: "Uchiha"
- Jutsus: ["Izanagi", "Izanami"]

**Saída Esperada**:

```
Jutsus proibidos do clã Uchiha: Izanagi, Izanami
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class ClaJutsusProibidos {
    private String nomeCla;
    private ArrayList<String> jutsus = new ArrayList<>();
    public ClaJutsusProibidos(String nomeCla) {
        this.nomeCla = nomeCla;
    }
    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }
    public void mostrarJutsus() {
        System.out.println("Jutsus proibidos do clã " + nomeCla + ": " + String.join(", ", jutsus));
    }
}
```
---

### **Questão 91** – Nível 4

**Enunciado**: O sistema deve registrar os times que participaram do exame Chunin. Crie a classe `ExameChuninTimes` com lista de times.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Times: ["Time 7", "Time 10", "Time 8"]

**Saída Esperada**:

```
Times do Exame Chunin: Time 7, Time 10, Time 8
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class ExameChuninTimes {
    private ArrayList<String> times = new ArrayList<>();
    public void adicionarTime(String time) {
        times.add(time);
    }
    public void mostrarTimes() {
        System.out.println("Times do Exame Chunin: " + String.join(", ", times));
    }
}
```
---

### **Questão 92** – Nível 4

**Enunciado**: O sistema deve registrar os times que venceram o exame Chunin. Crie a classe `ExameChuninVencedores` com lista de times vencedores.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Vencedores: ["Time 7", "Time 10"]

**Saída Esperada**:

```
Vencedores do Exame Chunin: Time 7, Time 10
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class ExameChuninVencedores {
    private ArrayList<String> vencedores = new ArrayList<>();
    public void adicionarVencedor(String vencedor) {
        vencedores.add(vencedor);
    }
    public void mostrarVencedores() {
        System.out.println("Vencedores do Exame Chunin: " + String.join(", ", vencedores));
    }
}
```
---

### **Questão 93** – Nível 4

**Enunciado**: O sistema deve registrar os clãs extintos de cada aldeia. Crie a classe `AldeiaClasExtintos` com nome da aldeia e lista de clãs extintos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Clãs extintos: ["Senju", "Kurama"]

**Saída Esperada**:

```
Clãs extintos de Konoha: Senju, Kurama
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaClasExtintos {
    private String nomeAldeia;
    private ArrayList<String> clasExtintos = new ArrayList<>();
    public AldeiaClasExtintos(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarClaExtinto(String cla) {
        clasExtintos.add(cla);
    }
    public void mostrarClasExtintos() {
        System.out.println("Clãs extintos de " + nomeAldeia + ": " + String.join(", ", clasExtintos));
    }
}
```
---

### **Questão 94** – Nível 4

**Enunciado**: O sistema deve registrar as invocações especiais feitas por ninjas. Crie a classe `NinjaInvocacoesEspeciais` com nome do ninja e lista de invocações.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Nome: "Naruto"
- Invocações: ["Gamabunta", "Gamakichi"]

**Saída Esperada**:

```
Invocações especiais de Naruto: Gamabunta, Gamakichi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class NinjaInvocacoesEspeciais {
    private String nome;
    private ArrayList<String> invocacoes = new ArrayList<>();
    public NinjaInvocacoesEspeciais(String nome) {
        this.nome = nome;
    }
    public void adicionarInvocacao(String invocacao) {
        invocacoes.add(invocacao);
    }
    public void mostrarInvocacoes() {
        System.out.println("Invocações especiais de " + nome + ": " + String.join(", ", invocacoes));
    }
}
```
---

### **Questão 95** – Nível 4

**Enunciado**: O sistema deve registrar os eventos históricos de cada aldeia. Crie a classe `AldeiaEventosHistoricos` com nome da aldeia e lista de eventos históricos.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Aldeia: "Konoha"
- Eventos: ["Fundação", "Ataque da Kyuubi"]

**Saída Esperada**:

```
Eventos históricos de Konoha: Fundação, Ataque da Kyuubi
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AldeiaEventosHistoricos {
    private String nomeAldeia;
    private ArrayList<String> eventos = new ArrayList<>();
    public AldeiaEventosHistoricos(String nomeAldeia) {
        this.nomeAldeia = nomeAldeia;
    }
    public void adicionarEvento(String evento) {
        eventos.add(evento);
    }
    public void mostrarEventos() {
        System.out.println("Eventos históricos de " + nomeAldeia + ": " + String.join(", ", eventos));
    }
}
```
---

### **Questão 96** – Nível 4

**Enunciado**: O sistema deve registrar as técnicas de fuga usadas por ninjas em missões. Crie a classe `MissaoTecnicasFuga` com nome da missão e lista de técnicas de fuga.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Missão: "Espionar Akatsuki"
- Técnicas: ["Henge no Jutsu", "Shunshin"]

**Saída Esperada**:

```
Técnicas de fuga na missão Espionar Akatsuki: Henge no Jutsu, Shunshin
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class MissaoTecnicasFuga {
    private String nomeMissao;
    private ArrayList<String> tecnicas = new ArrayList<>();
    public MissaoTecnicasFuga(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }
    public void adicionarTecnica(String tecnica) {
        tecnicas.add(tecnica);
    }
    public void mostrarTecnicas() {
        System.out.println("Técnicas de fuga na missão " + nomeMissao + ": " + String.join(", ", tecnicas));
    }
}
```
---

### **Questão 97** – Nível 4

**Enunciado**: O sistema deve registrar os times que derrotaram a Akatsuki. Crie a classe `AkatsukiDerrotadaPor` com lista de times.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Times: ["Time 7", "Time Sannin"]

**Saída Esperada**:

```
Times que derrotaram a Akatsuki: Time 7, Time Sannin
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AkatsukiDerrotadaPor {
    private ArrayList<String> times = new ArrayList<>();
    public void adicionarTime(String time) {
        times.add(time);
    }
    public void mostrarTimes() {
        System.out.println("Times que derrotaram a Akatsuki: " + String.join(", ", times));
    }
}
```
---

### **Questão 98** – Nível 4

**Enunciado**: O sistema deve registrar os senseis que participaram da guerra ninja. Crie a classe `GuerraNinjaSenseis` com lista de senseis.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Senseis: ["Kakashi", "Guy", "Orochimaru"]

**Saída Esperada**:

```
Senseis que participaram da guerra ninja: Kakashi, Guy, Orochimaru
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class GuerraNinjaSenseis {
    private ArrayList<String> senseis = new ArrayList<>();
    public void adicionarSensei(String sensei) {
        senseis.add(sensei);
    }
    public void mostrarSenseis() {
        System.out.println("Senseis que participaram da guerra ninja: " + String.join(", ", senseis));
    }
}
```
---

### **Questão 99** – Nível 4

**Enunciado**: O sistema deve registrar os ninjas que participaram da guerra ninja. Crie a classe `GuerraNinjaNinjas` com lista de ninjas.

**Objetivos**:
- Encapsulamento
- Uso de coleções

**Entrada Simulada**:
- Ninjas: ["Naruto", "Sasuke", "Sakura"]

**Saída Esperada**:

```
Ninjas que participaram da guerra ninja: Naruto, Sasuke, Sakura
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class GuerraNinjaNinjas {
    private ArrayList<String> ninjas = new ArrayList<>();
    public void adicionarNinja(String ninja) {
        ninjas.add(ninja);
    }
    public void mostrarNinjas() {
        System.out.println("Ninjas que participaram da guerra ninja: " + String.join(", ", ninjas));
    }
}
```
---

### **Questão 100** – Nível 4

**Enunciado**: O sistema deve registrar os clãs e aldeias que formaram a aliança para derrotar Kaguya. Crie a classe `AliancaContraKaguya` com lista de clãs e lista de aldeias.

**Objetivos**:
- Encapsulamento
- Uso de coleções
- Composição de listas

**Entrada Simulada**:
- Clãs: ["Uchiha", "Senju", "Hyuga"]
- Aldeias: ["Konoha", "Suna", "Kiri"]

**Saída Esperada**:

```
Clãs que formaram a aliança contra Kaguya: Uchiha, Senju, Hyuga
Aldeias que formaram a aliança contra Kaguya: Konoha, Suna, Kiri
```

**Exemplo de Código Esperado**:

```java
import java.util.ArrayList;
public class AliancaContraKaguya {
    private ArrayList<String> clas = new ArrayList<>();
    private ArrayList<String> aldeias = new ArrayList<>();
    public void adicionarCla(String cla) {
        clas.add(cla);
    }
    public void adicionarAldeia(String aldeia) {
        aldeias.add(aldeia);
    }
    public void mostrarAlianca() {
        System.out.println("Clãs que formaram a aliança contra Kaguya: " + String.join(", ", clas));
        System.out.println("Aldeias que formaram a aliança contra Kaguya: " + String.join(", ", aldeias));
    }
}
```
