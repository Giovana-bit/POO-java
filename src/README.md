# 🐾 Programação Orientada a Objetos em Java

Este repositório reúne meus aprendizados no curso de **Programação Orientada a Objetos em Java** oferecido pela **Ada Tech**.
Aqui registro os conceitos principais de **POO (Programação Orientada a Objetos)** e minhas práticas de implementação em código.

---

## 📚 Conceitos aprendidos até agora

* **Conceitos básicos de Java**

    * Estrutura de um programa.
    * Criação de classes, pacotes e métodos.
    * Organização do código em arquivos.

* **Paradigma Orientado a Objetos (POO)**

    * **Classe**: molde/estrutura para criação de objetos.
    * **Objeto**: instância de uma classe.
    * **Atributos**: variáveis que representam características.
    * **Métodos**: funções que representam comportamentos.

* **Pilares da POO**

    * **Encapsulamento**: controle de acesso aos atributos com modificadores (`private`, `protected`, `public`) e uso de **getters e setters**.
    * **Herança**: criação de classes que herdam características e comportamentos de outras (`extends`).
    * **Polimorfismo**: uso de métodos com o mesmo nome, mas comportamentos diferentes em classes filhas (ex.: `soar()` em `Cachorro`, `Gato` e `Passaro`).
    * **Abstração**: uso de classes e métodos **abstratos** que servem como modelo para subclasses.

* **Modificadores de acesso**

    * `public`
    * `protected`
    * `private`
    * *default* (sem modificador)

* **Sobrescrita de métodos**

    * Uso da anotação `@Override` para redefinir comportamentos herdados.

* **Construtores**

    * Criação e uso de `super(...)` para reaproveitar inicialização da classe pai.

* **Métodos estáticos e atributos estáticos**

    * Contadores de objetos criados em memória (ex.: número de pássaros, número de gatos).

* **Classes abstratas**

    * Classe `Animal` foi definida como abstrata, impedindo instâncias diretas e forçando implementação de métodos obrigatórios (`soar()`).

* **Exemplo de hierarquia criada**

    * `Animal` (classe abstrata)

        * `Cachorro`
        * `Gato`
        * `Passaro`

---

## 🚀 Objetivo

Este repositório serve como **registro de estudos e anotações práticas** sobre **Programação Orientada a Objetos em Java**, acompanhando minha evolução desde os fundamentos até a construção de hierarquias de classes, uso de herança, polimorfismo e abstração.

Aqui aplico, na prática, os conceitos aprendidos no curso para estruturar um código mais organizado, reutilizável e escalável.

---

## 🛠️ Tecnologias utilizadas

* **Java**
* **IDE**: IntelliJ IDEA 
* **JDK** versão 17+
