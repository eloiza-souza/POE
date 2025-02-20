/*
# Programação Orientada a Eventos em Java 🚀

## O que é Programação Orientada a Eventos? 🤔
A Programação Orientada a Eventos (POE) é um paradigma de programação onde o fluxo do programa é determinado por eventos, como cliques de mouse, pressionamento de teclas ou mensagens de sistemas. Em Java, esse paradigma é amplamente utilizado em interfaces gráficas (GUI) e sistemas reativos.

## Conceitos Fundamentais 📒

1) **Eventos**: São ações ou ocorrências que podem ser detectadas pelo programa. Exemplos incluem:
- Um clique em um botão.
- A chegada de uma mensagem em um sistema de mensagens.
- Uma alteração em um arquivo ou banco de dados.

2) **Listeners** (Ouvintes): São objetos ou métodos que "ouvem" os eventos e executam uma ação quando o evento ocorre. Eles são registrados para escutar eventos específicos.


3) **Disparadores de Eventos** (Event Emitters): São os componentes que geram ou disparam os eventos. 

    Por exemplo, um botão em uma interface gráfica pode disparar um evento de clique.


4) **Callback**: É o código que será executado quando o evento ocorrer. Geralmente, é uma função ou método que é passado como argumento para o listener.


5) **Loop de Eventos**: É um mecanismo que monitora continuamente os eventos e os despacha para os listeners apropriados.

## Como funciona? ⚙️
A POE em Java opera com base em três componentes principais:
1. **Fonte do Evento**: O objeto que gera o evento (ex.: um botão sendo clicado).
2. **Listener (Ouvinte)**: Uma interface ou classe que "escuta" os eventos gerados pela fonte.
3. **Manipulador de Eventos**: O código que será executado quando o evento ocorrer.

### Fluxo de Funcionamento:
1. Um evento é gerado por uma **fonte de evento**.
2. O evento é capturado por um **listener** registrado.
3. O **manipulador de eventos** executa a lógica associada ao evento.

## Exemplo Prático 🖥️
Vamos criar um exemplo simples de um botão que exibe uma mensagem ao ser clicado.

```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploPOE {
    public static void main(String[] args) {
        // Criando a janela
        JFrame frame = new JFrame("Exemplo POE");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando o botão
        JButton button = new JButton("Clique aqui!");
        frame.add(button);

        // Adicionando o listener ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Manipulador de evento
                JOptionPane.showMessageDialog(frame, "Botão clicado!");
            }
        });

        // Exibindo a janela
        frame.setVisible(true);
    }
}
```

### Exemplos de Listeners:
- `ActionListener`: Para ações como cliques de botão.
- `MouseListener`: Para eventos de mouse (ex.: clique, movimento).
- `KeyListener`: Para eventos de teclado.

## Links para Exploração Futura 🔗
- [Como criar interfaces gráficas com Swing](#)
- [Diferença entre Listeners e Observers](#)
- [Eventos personalizados em Java](#)
- [Programação Reativa com Java](#)

## Conclusão ✅
A Programação Orientada a Eventos é essencial para criar aplicações interativas e dinâmicas. Com Java, você pode implementar facilmente esse paradigma utilizando as ferramentas e interfaces fornecidas pela linguagem. Explore os exemplos e pratique para dominar o conceito! 🚀

