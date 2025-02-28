# Programação Orientada a Eventos em Java 🚀

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
- [Como criar interfaces gráficas com Swing](#Swing.md)
- [Diferença entre Listeners e Observers](#)
- [Eventos personalizados em Java](#)
- [Programação Reativa com Java](#)

## Conclusão ✅
A Programação Orientada a Eventos é essencial para criar aplicações interativas e dinâmicas. Com Java, você pode implementar facilmente esse paradigma utilizando as ferramentas e interfaces fornecidas pela linguagem. Explore os exemplos e pratique para dominar o conceito! 🚀

