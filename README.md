# 🛒 Projeto A* – Navegação em Supermercado

## 📌 Descrição

Este projeto implementa o algoritmo **A\*** aplicado a um cenário de navegação em um supermercado.

O objetivo é simular um **carrinho de compras inteligente** que deve encontrar o melhor caminho entre uma posição inicial e um produto específico, evitando obstáculos (prateleiras) em uma grade bidimensional.

O problema é modelado como uma **busca em espaço de estados**, onde cada célula representa um estado possível.

---

## 👥 Integrantes

- (Matheus Ferreira)
- (Jheniffer Faria)
- (Otavio Duque)

---

## 💻 Linguagem utilizada

- Java

---

## 🚀 Como executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE (IntelliJ, Eclipse ou NetBeans) ou terminal

### Execução
```bash
javac Main.java
java Main
````

Ou execute diretamente pela IDE rodando a classe `Main`.

---

## 📂 Estrutura do projeto

```
src/
├── Main.java
├── busca/
│   └── AEstrela.java
├── heuristica/
│   ├── Manhattan.java
│   └── HeuristicaNaoAdmissivel.java
├── model/
│   ├── No.java
│   └── Posicao.java
├── ambiente/
│   └── MapaSupermercado.java
```

---

## 🎯 Problema resolvido

O sistema simula um carrinho de supermercado que deve ir da posição inicial até um produto localizado em um ponto específico do mapa, evitando obstáculos.

O objetivo é encontrar o **menor caminho possível** usando o algoritmo A*.

---

## 🧠 Heurística admissível

Utiliza a **Distância de Manhattan**:

```text
h(n) = |linha_atual - linha_objetivo| + |coluna_atual - coluna_objetivo|
```

✔ Não superestima o custo real
✔ Garante solução ótima

---

## ⚠️ Heurística não admissível

Utiliza uma versão modificada:

```text
h(n) = 2 × Manhattan
```

❌ Pode superestimar o custo
❌ Pode alterar a ordem de exploração dos nós

---

## 📊 Saída do sistema

O programa exibe:

* Estados expandidos
* Caminho encontrado
* Custo total da solução
* Lista CLOSED
* Comparação entre heurísticas

---

## 🔍 Observação sobre a comparação

A heurística admissível tende a produzir soluções ótimas com expansão mais eficiente de estados.

A heurística não admissível pode alterar o comportamento da busca, podendo explorar caminhos diferentes, embora nem sempre gere um resultado pior.

---

## 🏁 Objetivo acadêmico

Demonstrar a aplicação do algoritmo A* em um problema real simplificado, evidenciando:

* Espaço de estados
* Função heurística
* Função de custo (g, h, f)
* Lista OPEN e CLOSED
* Comparação de heurísticas