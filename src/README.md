# Guess The Number Game em Java ☕

![Status](https://img.shields.io/static/v1?label=Status&message=CONCLU%C3%8DDO&color=%3CCOLOR%3E&style=%3CSTYLE%3E&logo=%3CLOGO%3E)

## Índice

* [1. Resumo do projeto](#1-resumo-do-projeto)
* [2. Ferramentas utilizadas](#2-ferramentas-utilizadas)
* [3. Funcionalidades](#3-funcionalidades)
* [4. Diagrama de classes](#4-diagrama-de-classes)
* [5. Considerações técnicas](#5-considerações-técnicas)
* [6. Tarefas](#6-tarefas)
* [7. Considerações finais](#7-considerações-finais)

***

## 1. Resumo do projeto

Atualmente, o Java é uma das linguagens de programação mais utilizadas no
mundo. Apesar da diversidade de plataformas e ferramentas disponíveis, é
fundamental ter uma base sólida nos conceitos fundamentais do Java e na
programação orientada a objetos (OOP). O objetivo deste projeto é introdução
ao mundo do Java através de um jogo simples e divertido.

## 2. Ferramentas utilizadas

### Preparo do PC para trabalhar

+ Git e Github
+ Intellij

### Linguagens

+ Java

### Testes

+ JUnit
+ Mockito

## 3. Funcionalidades

![Demonstração do Guess the number game](src/Assets/guess-the-number-game.gif)

- O jogo é realizado no terminal. 
- É sorteado um número aleatório entre 1 e 100 como número secreto.
- O jogador e o computador se revezam para dar um palpite e tentar adivinhar o número.
- Após cada turno, são oferecidas informações sobre o palpite feito, se é necessário tentar um número maior, ou menor,
- O jogo termina quando o número for adivinhado e é exibida uma lista de
  todas as tentativas do jogador vencedor.

## 4. Diagrama de Classes
O projeto utilizou do seguinte diagrama de classes:

![Diagrama de
Classes](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/class-diagram.png?alt=media)

#### `GuessTheNumberGame`

**Propósito:** Gerencia a lógica principal, decide qual jogador assume o
próximo turno.

**Atributos:**

- `random`
- `targetNumber`

**Métodos estáticos (`static`):**

- `main(String[] args)`
- `checkGuess(Player player)`

#### `Player`

**Propósito:** Representa um jogador genérico. É uma classe abstrata. Define os
atributos e métodos que todas as _classes_ de jogadores devem compartilhar:

**Atributos:**

- `name`
- `guesses`

**Métodos:**

- `makeGuess()`
- `getName()`
- `getGuesses()`

#### `HumanPlayer` e `ComputerPlayer` (herdam de `Player`)

**Propósito:** Representam os jogadores _Humano_ e _Computador_,
respectivamente.

**Métodos:**

- `makeGuess()`

**Relações:**

- A classe `GuessTheNumberGame` interage com as classes `HumanPlayer` e
  `ComputerPlayer` para gerenciar o jogo.
- Tanto a classe `HumanPlayer` como `Computer Player` são subclasses de
  `Player`, o que implica que herdam todas as suas propriedades e métodos, mas
  também têm algumas características adicionais próprias.

Este design de classes permite separar as responsabilidades, facilitando a
manutenção e possíveis extensões do jogo no futuro.

## 5. Considerações Técnicas

- O jogo é realizado no terminal usando Java.
- A lógica do jogo é baseada em estruturas de controle, incluindo loops,
  condicionais e coleções.
- O código é dividido e organizado para melhorar sua legibilidade e manutenção.
- Utiliza-se da funcionalidade da biblioteca de utilidades do Java para
  a geração de números aleatórios.
- Foram realizados **testes unitários** utilizando **JUnit** e **Mockito**.

## 6. Tarefas

 - ### Configuração do ambiente do ambiente de desenvolvimento integrado (IDE) com IntelliJ.

 - ### Familirização com od primeiros conceitos da linguagem. 



- O que são classes e como construí-las?
- O que são métodos e como utilizá-los?
- Quais tipos de dados existem na linguagem?
- Como criar um array usando Java?
- O que são modificadores de acesso como?
- O que são métodos construtores? Como fazê-los?
- O que é encapsulamento? Como fazê-lo?
- O que é herança? Como criá-la em Java?
- O que é programação orientada a objetos?

 - ### Compreensão do Diagrama de Classes

 - ### Início do jogo com o jogador humano.

 - ### Adicionar o jogador computador.

 - ### Criação dos testes unitários com JUnit e Mockito.

## 7. Considerações finais

A execução do projeto proporcionou a oportunidade de desenvolver muitas habilidades, técnicas e lifeskills. O conhecimento de linguagens, ferramentes e tecnologias, como também organização, planejamento, gestão de tempo, trabalho em equipe, comunicação e autoaprendizagem. Superar os desafios de um projeto trouxe satisfação e autoconfiança.

## Desenvolvedora


<table>
  <tr>
    <td align="center"><a href="https://github.com/camilasukhada"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/146760773?v=4" width="100px;" alt=""/><br /><sub><b>Camila Sukhada</b></sub></a><br /></td>
  </tr>
</table>


<table>
 <tr>
  <td> 

[![Linkedin Badge](https://img.shields.io/badge/-camilasukhada-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/camilasukhada/)](https://www.linkedin.com/in/camilasukhada/)

 </td>
 </tr> 
</table>

<table>
 <tr>
  <td> 

[![Gmail Badge](https://img.shields.io/badge/-camilasukhada-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:camilasukhada@gmail.com)](mailto:camilasukhada@gmail.com)

  </td>
 </tr> 
</table>






