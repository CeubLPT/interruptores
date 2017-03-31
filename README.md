# LAB 1 - Interruptores

## Introdução

O objetivo desse exercício é trabalharmos a construção de classes diferentes, relacionadas umas às outras e utilizarmos arrays de objetos.

É um exerício difícil que vai testar o conhecimento obtido em sala.

Nos commits do projeto você pode achar a solução, mas eu recomendo **fortemente** que você tente fazer antes de olhar.

Faça passo-a-passo.

## Criando as entidades

Vamos projetar um pequeno sistema que representa um cômodo com interruptores e lâmpadas conectadas. As classes abaixo representam esse sistema:

![comodo-lampada](https://cloud.githubusercontent.com/assets/20231710/24569614/4e5caae6-163d-11e7-898e-3c525d464c81.jpg)

### Passo 1
Implementa as classes e os métodos, seguindo o diagrama, sem eles façam nada, por enquanto.

### Passo 2
Para a classe **Lampada**:
1. os métodos acende e apaga, setam o valor do atributo aceso.
2. método `isAceso` retorna este atributo.
3. Crie um método construtor que faça a lâmpada nascer apagada.

### Passo 3 
Para a classe **Interruptor**:
1. o método `conecta`, recebe um objeto `Lampada` e coloca no atributo `lampada`
2. o método `aciona`, acende ou apaga a lâmpada dependendo do estado. Ele deve verificar se existe uma lâmpada conectada. Caso não exista, retorna false, indicando problema, senão retorna true.
3. implemente um método `getLampada()`.

### Passo 4
Para a classe **Comodo**, implemente os métodos da seguinte maneira:
1. o método `conecta` recebe um interruptor e adiciona no array.
2. os métodos `apagaTodos` e `acendeTodos` devem realizar essa ação em todos os interruptores
3. o método `obtemIluminacao` verifica quantos interruptores estão acessos e mostra o % de iluminação da sala ( acesos / total interruptores * 100)


## Colocando tudo para funcionar

Faça agora uma classe de controle  que construa os objetos e conecte. Depois acenda e apague interruptores individuais e todos do comodo. Verifique a iluminação do ambiente.



