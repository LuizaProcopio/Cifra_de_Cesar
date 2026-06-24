# Cifra de César

A Cifra de César é um método de criptografia criado por Júlio César para proteger mensagens militares. Seu funcionamento é baseado no deslocamento das letras do alfabeto por uma quantidade fixa de posições, dificultando a leitura da mensagem por pessoas não autorizadas.

## Como funciona

Cada letra da mensagem original é substituída por outra letra que está um determinado número de posições à frente no alfabeto.

### Exemplo

Mensagem original:

```text
HELLO WORLD
```

Chave de deslocamento:

```text
5
```

Mensagem criptografada:

```text
MJQQT BTWQI
```

Neste exemplo, cada letra foi deslocada 5 posições no alfabeto.

## Tecnologias Utilizadas

* Java
* Scanner (entrada de dados)
* StringBuilder
* Estruturas de repetição (for-each)
* Manipulação de caracteres com a classe Character

## Funcionalidades

* Criptografia de textos utilizando a Cifra de César.
* Preservação de espaços e caracteres especiais.
* Suporte para letras maiúsculas e minúsculas.
* Definição da chave de deslocamento pelo usuário.

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/LuizaProcopio/Cifra_de_Cesar.git
```

2. Abra o projeto em sua IDE Java de preferência.

3. Execute a classe `Main.java`.

4. Digite o texto e a chave de deslocamento quando solicitado.
