---
<div align="center">

![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-brightgreen)
![Licença](https://img.shields.io/badge/Licença-MIT-red)
![Controle%20de%20Versão](https://img.shields.io/badge/Git-Github-blue)

</div>

---

# 📚 Prática em Grupo - Classe Disciplina (Grupo 2)
> Disciplina: Linguagem de Programação Orientada a Objetos (LPOO)  
> Curso: Licenciatura em Computação — **IFPE Campus Afogados da Ingazeira**  
> Professor: Pedro José Carneiro de Souza

Este repositório contém a implementação da classe `Disciplina`, responsável por representar uma disciplina acadêmica e gerenciar suas regras de aprovação baseadas em média mínima e limite de faltas.

---

## 🛠️ Especificações da Classe `Disciplina`

### 1. Atributos

| Atributo | Tipo Java | Inicialização |
| :--- | :--- | :--- |
| `nome` | `String` | Recebido no construtor |
| `cargaHoraria` | `int` | Recebido no construtor (em horas) |
| `mediaMinima` | `double` | Começa em `7.0` |
| `percentualFaltas` | `double` | Começa em `0.25` (25%) |

### 2. Construtor
* Recebe exatamente nesta ordem: `String nome` e `int cargaHoraria`.

### 3. Métodos
* `int limiteFaltas()`: Retorna a carga horária multiplicada pelo percentual de faltas (descartando a parte decimal).
* `boolean aprovadoPorNota(double media)`: Retorna `true` se a média for maior ou igual à `mediaMinima`.
* `boolean aprovadoPorFrequencia(int faltas)`: Retorna `true` se as faltas não passarem do `limiteFaltas()`.
* `void alterarMediaMinima(double novaMedia)`: Atualiza o valor da `mediaMinima`.
* `void exibir()`: Imprime as informações no formato exato:  
  `Nome - Xh - limite de faltas: Y`

---

## 🧪 Casos de Teste (Cenário de Validação)

Instanciando a disciplina **LPOO** com **60 horas**, o comportamento esperado no arquivo `Main.java` segue a tabela abaixo:

| Operação / Teste | Resultado Esperado |
| :--- | :--- |
| Exibir `mediaMinima` inicial | `7.0` |
| Exibir `limiteFaltas()` | `15` |
| `aprovadoPorNota(6.9)` | `false` |
| `aprovadoPorNota(7.0)` | `true` |
| `aprovadoPorFrequencia(15)` | `true` |
| `aprovadoPorFrequencia(16)` | `false` |
| Chamada do método `exibir()` | `LPOO - 60h - limite de faltas: 15` |
| `alterarMediaMinima(6.0)` ➡️ `aprovadoPorNota(6.5)` | `true` |

---

## 🚀 Checklist de Entrega
- [ ] Nome de atributos, métodos e assinatura do construtor seguem exatamente o enunciado (essencial para a integração com os outros grupos).
- [ ] O código compila sem erros no OnlineGDB.
- [ ] Todos os resultados da tabela de validação batem com o esperado.
