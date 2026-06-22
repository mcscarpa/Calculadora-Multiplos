#  Calculadora de Múltiplos e Fatorial

## Visão Geral

O projeto **Calculadora de Múltiplos** é um aplicativo Android desenvolvido em **Java**, com o objetivo de realizar operações matemáticas relacionadas à verificação de múltiplos e ao cálculo de fatorial. O projeto foi desenvolvido como atividade prática em sala de aula, permitindo a aplicação de conceitos fundamentais de programação orientada a objetos, organização de código e separação de responsabilidades.

---

# Conceitos de Orientação a Objetos Aplicados

## Encapsulamento

O encapsulamento está presente na organização das classes do projeto, permitindo que cada classe seja responsável pelo gerenciamento de seus próprios dados e comportamentos.

As informações manipuladas pelas classes são acessadas por meio de métodos específicos, garantindo maior segurança e controle sobre o funcionamento da aplicação.

### Exemplo

```java
public class Validacao {
    public Integer num;
    public String mensagem;

    public void validarNumero(String numero) {
        mensagem = "";
        try {
            num = Integer.parseInt(numero);
        } catch (Exception e) {
            mensagem = "Digite valores válidos";
        }
    }
}
```

---

## Responsabilidade Única

Cada classe possui uma única responsabilidade dentro da aplicação:

* **Validacao** → Responsável por validar os dados inseridos pelo usuário.
* **Calculos** → Responsável pelas operações matemáticas.
* **Controle** → Atua como intermediário entre a interface e as classes de negócio.

Essa divisão torna o código mais organizado, reutilizável e fácil de manter.

---

## Instanciação e Composição

O projeto utiliza composição por meio da criação e utilização de objetos de outras classes para executar tarefas específicas.

### Exemplo

```java
Validacao validacao = new Validacao();
validacao.validarNumero(numero);

Calculos calculos = new Calculos();
mensagem = calculos.calcular(validacao.num, op);
```

---

## Reutilização de Código

As funcionalidades principais ficam centralizadas em métodos específicos, evitando duplicação de código e facilitando futuras expansões do sistema.

Caso novas operações matemáticas sejam adicionadas futuramente, será possível reutilizar a estrutura já existente de validação e controle.

---

# Organização em Pacotes

O projeto segue a estrutura padrão utilizada em aplicações Android:

```text
com.example.multiplos
│
├── modelo
│   ├── Calculos.java
│   ├── Controle.java
│   └── Validacao.java
│
├── actFatorial.java
└── actMultiplos.java
```

### Estrutura

* **Pacote principal:** contém as Activities responsáveis pela interação com o usuário.
* **Pacote modelo:** contém as regras de negócio e processamento dos dados.

Essa organização melhora a legibilidade e facilita a manutenção do projeto.

---


## MVC Simplificado

O projeto segue uma estrutura semelhante ao padrão MVC:

* **Model:** Calculos e Validacao
* **Controller:** Controle
* **View:** Activities

---

# Lógica de Funcionamento

1. **Entrada de Dados:** o usuário informa um número.
2. **Validação:** a entrada é validada pela classe `Validacao`.
3. **Processamento:** a classe `Calculos` realiza a operação escolhida.
4. **Saída:** o resultado é exibido na tela.

### Verificação de Múltiplos

```java
if (num % multiplo == 0) {
    mensagem = "É múltiplo";
} else {
    mensagem = "Não é múltiplo";
}
```

### Cálculo de Fatorial

```java
Integer resultado = num;

for (int i = 2; i < num; i++) {
    resultado *= i;
}

mensagem = resultado.toString();
```

---

# Conclusão

O projeto **Calculadora de Múltiplos** permitiu aplicar conceitos fundamentais de programação orientada a objetos e desenvolvimento Android, reforçando a importância da organização, modularização e separação de responsabilidades no código.
