# Questão 2

> Concatenar e Remover

## Compilando e executando 

1. Compilar o arquivo com o comando:

```
javac Questao2.java
```

2. Executar com o comando:

```
java Questao2
```

3. Foi utilizado o arquivo testes.txt com 11 testes para validar a solução. **É necessário que a última linha seja igual a "FIM"**, sem aspas, para que o programa encerre.
Para tal, execute o programa com o seguinte comando:

```
java Questao2 < testes.txt 
```

## Solução

A solução foi feita com atenção à clareza do código, a fim de que outras pessoas possam entender com mais facilidade o que está sendo executado.

---

O método main foi feito visando a facilidade em realizar vários testes em sequência e validar a solução, aceitando entradas no seguinte formato 

```
s: string inicial
t: string desejada
k: um número inteiro que representa o número de operações
```
e terminando em FIM, conforme o arquivo [testes.txt](https://github.com/markgomer/QuestoesProgramacaoESuporte/blob/main/Questao2/testes.txt).

--- 

Um método foi utilizado, composto por:

- um loop while para remover os últimos caracteres da string s até que fique idêntica aos caracteres iniciais da string t;

- um loop while para adicionar caracteres à string s, até que fique idêntica à string t;

- um teste if para avaliação do resultado.
