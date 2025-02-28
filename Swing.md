# Como criar interfaces gráficas com Swing 🎨

## Descrição do programa
Este repositório contém exemplos e explicações sobre como criar interfaces gráficas (GUIs) utilizando o Swing, uma biblioteca nativa do Java. O Swing permite criar aplicações desktop com componentes como botões, caixas de texto, tabelas e muito mais. É ideal para quem deseja desenvolver aplicações com interfaces amigáveis e interativas.

## Explicação do funcionamento
O Swing é baseado no paradigma de programação orientada a eventos, onde as interações do usuário (como cliques ou digitação) disparam eventos que podem ser tratados por ouvintes (listeners). A biblioteca fornece uma ampla gama de componentes, como `JFrame`, `JButton`, `JLabel`, entre outros, que podem ser combinados para criar GUIs completas.

### Estrutura básica de uma aplicação Swing
1. Criação de uma janela principal: Utiliza-se a classe `JFrame`.
2. Adição de componentes: Componentes como botões (`JButton`) e rótulos (`JLabel`) são adicionados ao `JFrame`.
3. Tratamento de eventos: Listeners são usados para reagir às ações do usuário.

Exemplo básico:
```java
import javax.swing.;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwing {
    public static void main(String[] args) {
        // Criando a janela principal
        JFrame frame = new JFrame("Exemplo Swing");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando um botão
        JButton button = new JButton("Clique aqui!");
        button.setBounds(150, 80, 120, 30);

        // Adicionando um evento ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Olá, Swing!");
            }
        });

        // Adicionando o botão à janela
        frame.setLayout(null);
        frame.add(button);

        // Tornando a janela visível
        frame.setVisible(true);
    }
}
````

 ## Instruções para executar o código
      
### Dependências necessárias
- Java 17 ou superior instalado no sistema.
- Um editor de texto ou IDE (como IntelliJ IDEA, Eclipse ou VS Code).

### Passos para execução

1. Clone o repositório:
 ```bash
 git clone https://github.com/seu-usuario/swing-examples.git
 cd swing-examples
 ```

2. Compile o código:
 No terminal, navegue até o diretório do arquivo `.java` e execute:
 ```bash
 javac HelloSwing.java
 ```

3. Execute o programa:
 Após a compilação, execute o seguinte comando:
 ```bash
 java HelloSwing
 ```

4. Interaja com a interface:
 Uma janela será exibida com um botão. Clique no botão para ver a mensagem "Olá, Swing!".

## Exemplos de entrada e saída

### Entrada
- Clique no botão "Clique aqui!".

### Saída
- Uma caixa de diálogo será exibida com a mensagem: "Olá, Swing!".

## Componentes adicionais

Além do exemplo básico, você pode explorar outros componentes do Swing, como:

- JTextField: Para entrada de texto.
- JTable: Para exibição de tabelas.
- JCheckBox: Para opções de seleção.

Exemplo com `JTextField`:

```java
JTextField textField = new JTextField();
textField.setBounds(50, 50, 200, 30);
frame.add(textField);
```
