# LAB 1 - Interruptores

## Introdução

O objetivo desse exercício é trabalharmos a construção de classes diferentes, relacionadas umas às outras e utilizarmos arrays de objetos.

É um exercício difícil que vai testar o conhecimento obtido em sala.

Nos commits do projeto você pode achar a solução, mas eu recomendo **fortemente** que você tente fazer antes de olhar.

Faça passo-a-passo.

## Criando as entidades

Vamos projetar um pequeno sistema que representa um cômodo com interruptores e lâmpadas conectadas. As classes abaixo representam esse sistema:

![comodo-lampada](https://cloud.githubusercontent.com/assets/20231710/24569614/4e5caae6-163d-11e7-898e-3c525d464c81.jpg)

### Passo 1
Implemente as classes e os métodos, seguindo o diagrama, sem que eles façam nada, por enquanto.

### Passo 2
Para a classe **Lampada**:
1. os métodos `acende` e `apaga`, setam o valor do atributo aceso como `true` ou `false`.
2. método `isAceso` retorna este atributo.
3. Crie um método construtor que faça a lâmpada nascer apagada.

### Passo 3 
Para a classe **Interruptor**:
1. o método `conecta`, recebe um objeto `Lampada` e coloca no atributo `lampada`
2. o método `aciona`, acende ou apaga a lâmpada dependendo do estado. Ele deve verificar se existe uma lâmpada conectada. Caso não exista, retorna `false`, indicando problema, senão retorna `true`.
3. implemente um método `getLampada()`.

### Passo 4
Para a classe **Comodo**, implemente os métodos da seguinte maneira:
1. o método `conecta` recebe um interruptor e adiciona no `ArrayList`.
2. os métodos `apagaTodos` e `acendeTodos` devem realizar essa ação em todos os interruptores
3. o método `obtemIluminacao` verifica quantos interruptores estão acessos e mostra o % de iluminação da sala ( `acesos / total interruptores * 100`)


## Colocando tudo para funcionar

Faça agora uma classe de controle que construa os objetos e conecte. Depois acenda e apague interruptores individuais e todos do comodo. Verifique a iluminação do ambiente.

Se quiser, utilize o código abaixo para testar.

```java
// Cria o comodo
        Comodo sala = new Comodo();
        
        // Cria os interruptores
        Interruptor i1 = new Interruptor();
        Interruptor i2 = new Interruptor();
        Interruptor i3 = new Interruptor();
        Interruptor i4 = new Interruptor();
        Interruptor i5 = new Interruptor();
        
        // Cria as lampadas, conectando nos interruptores
        i1.conecta(new Lampada());
        i2.conecta(new Lampada());
        i3.conecta(new Lampada());
        i4.conecta(new Lampada());
        i5.conecta(new Lampada());
        
        // Conecta os interruptores na sala
        sala.conecta(i1);
        sala.conecta(i2);
        sala.conecta(i3);
        sala.conecta(i4);
        sala.conecta(i5);
        
        // Acende todos
        sala.acendeTodos();
        // Deve estar em 100%
        JOptionPane.showMessageDialog(null, "A iluminação da sala está em "+ sala.obtemIluminacao() + "%");
        
        // Apaga dois interruptores
        i1.aciona();
        i2.aciona();
        // Deve estar em 60%
        JOptionPane.showMessageDialog(null, "A iluminação da sala está em "+ sala.obtemIluminacao() + "%");

        // Apaga todos
        sala.apagaTodos();
        // Deve estar em 0%
        JOptionPane.showMessageDialog(null, "A iluminação da sala está em "+ sala.obtemIluminacao() + "%");
```        


